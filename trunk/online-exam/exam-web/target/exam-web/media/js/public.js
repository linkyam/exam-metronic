// ====================================================================================================
// 常用函数
// ====================================================================================================
//跨域访问设置,如果没有跨域，设置jsonpUrl为""即可;
//
function getContextPath() {
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var result = index == -1 ? pathName : pathName.substr(0, index + 1);
    return result;
}

var jsonpUrl = getContextPath() + "/";

//var jsonpUrl = "http://192.168.1.161:8080/srts/";

// 去掉左右两边的空格
String.prototype.trim = function () {
    return this.replace(/(^\s*)|(\s*$)/g, '');
};

// 格式化字符串输出，如:var str = String.format('{0} - {1} -> {2}[{1}]', 1, 3, 'abc');
String.format = function () {
    if (arguments.length == 0) {
        return null;
    }
    var str = arguments[0];
    for (var i = 1; i < arguments.length; i++) {
        var re = new RegExp('\\{' + (i - 1) + '\\}', 'gm');
        str = str.replace(re, arguments[i]);
    }
    return str;
};

// 字符串未赋值、空或空字符串
String.isNullOrEmpty = function (source) {
    return (source == undefined || source == null || (source != null && source == ''));
};

// 字符串未赋值、空、空字符串或者只包含空格的字符串
String.isNullOrWhiteSpace = function (source) {
    return (source == undefined || source == null || (source != null && source == '') || (source != null && source.trim() == ''));
};

// 时间格式化
Date.prototype.format = function (format) {
    var o = {
        "M+": this.getMonth() + 1,  // month
        "d+": this.getDate(),       // day
        "h+": this.getHours(),      // hour
        "m+": this.getMinutes(),    // minute
        "s+": this.getSeconds(),    // second
        "q+": Math.floor((this.getMonth() + 3) / 3),  // quarter
        "S": this.getMilliseconds() // millisecond
    };

    if (/(y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }

    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
};

// ====================================================================================================
// 命名空间以及路径
// ====================================================================================================

var com;
if (!com) com = {};

// 配置类
com.Config = function () {
    var appRootUrl = '';
    var scriptRootUrl = '';
    var currentUrl = '';

    // currentPath : 当前页面所在路径
    // scriptSrc : 脚本所在路径
    var getScriptUrl = function (currentPath, scriptSrc) {
        // 相对url可以以 ./ ../ / 和不带前面三者开头
        if ((scriptSrc.length > 7 && scriptSrc.substring(0, 7) == 'http://') ||
            (scriptSrc.length > 8 && scriptSrc.substring(0, 8) == 'https://')) {
            return scriptSrc;
        } else if (scriptSrc.length > 1 && scriptSrc.substring(0, 1) == '/') {
            var str = '';
            if (currentPath.length > 7 && currentPath.substring(0, 7) == 'http://') {
                var endIndex = currentPath.indexOf('/', 7);
                str = currentPath.substring(0, endIndex);
                return str + scriptSrc;
            }
            if (currentPath.length > 8 && currentPath.substring(0, 8) == 'https://') {
                var endIndex = currentPath.indexOf('/', 8);
                if (endIndex == -1) {
                    endIndex = currentPath.length;
                }
                str = currentPath.substring(0, endIndex);
                return str + scriptSrc;
            }
        } else if (scriptSrc.length > 2 && scriptSrc.substring(0, 2) == './') {
            return getScriptUrl(currentPath, scriptSrc.substring(2));
        } else if (scriptSrc.length > 3 && scriptSrc.substring(0, 3) == '../') {
            var index = currentPath.lastIndexOf('/');
            index = currentPath.substring(0, index).lastIndexOf('/');
            return getScriptUrl(currentPath.substring(0, index + 1), scriptSrc.substring(3));
        } else {
            return currentPath + scriptSrc;
        }
    };

    // 构造函数代码
    var init = function () {
        // 获得public.js路径
        var __scriptName = 'media/js';
        var __publicScriptName = 'public.js';
        var __header = document.getElementsByTagName('HEAD').item(0);
        var __items = __header.childNodes;
        var __scriptSrc = '';
        for (var item in __items) {
            var node = __items[item];
            if (node.nodeName != undefined && node.nodeName.toLowerCase() == 'script') {
                if (node.attributes['src'] == null) continue;
                var src = node.attributes['src'].value.toLowerCase();
                if (src.indexOf(__publicScriptName) != -1) {
                    __scriptSrc = src;
                }
            }
        }
        var __locationHref = window.location.href.toLowerCase();
        // URL肯定是一个以http://或者https://开头的字符串
        var __endIndex = __locationHref.lastIndexOf('/');
        if (__endIndex != -1) {
            if (__locationHref.length > 7 && __locationHref.substring(0, 7) == 'http://') {
                if (__endIndex < 7) {
                    __endIndex = url.length;
                }
            }
            if (__locationHref.length > 8 && __locationHref.substring(0, 8) == 'https://') {
                if (__endIndex < 8) {
                    __endIndex = url.length;
                }
            }
        }
        var __tempUrl = __locationHref.substring(0, __endIndex);
        if (__tempUrl.substring(__tempUrl.length - 1) != '/') {
            __tempUrl += '/';
        }
        currentUrl = __tempUrl;
        // 通过script路径来判断，有几种情况 / ./ ../ http:// https://
        var scriptUrl = getScriptUrl(currentUrl, __scriptSrc);
        var scriptsIndex = scriptUrl.toLocaleLowerCase().lastIndexOf(__scriptName);
        appRootUrl = scriptUrl.substring(0, scriptsIndex-1);
        scriptRootUrl = appRootUrl + __scriptName;
    };

    init();

    // 对外的公共接口
    this.appRootUrl = appRootUrl;
    this.scriptRootUrl = scriptRootUrl;
    this.currentUrl = currentUrl;
};
com.config = new com.Config();
com.currentUrl = com.config.currentUrl;
com.appRootUrl = com.config.appRootUrl;
com.scriptRootUrl = com.config.scriptRootUrl;

// 动态加载Javascript
com.loadjs = function (url) {
    document.write('<' + 'script type="text/javascript" src="' + url + '"></' + 'script>');
};

// 动态加载CSS
com.loadcss = function (url) {
    document.write('<' + 'link type="text/css" href="' + url + '" rel="stylesheet" />');
};

// 动态加载JavaScript，推荐使用这种方法（据说YUI也使用这种方式），但经过测试，无法使用
com.loadScript = function (url, callback) {
    var script = document.createElement("script");
    script.setAttribute('type', 'text/javascript');
    if (script.readyState) {
        // IE
        script.onreadystatechange = function () {
            if (script.readyState == "loaded" || script.readyState == "complete") {
                script.onreadystatechange = null;
                if (callback != undefined && callback != null) {
                    callback();
                }
            }
        };
    } else {
        // Others
        script.onload = function () {
            if (callback != undefined && callback != null) {
                callback();
            }
        };
    }
    script.setAttribute('src', url);
    document.getElementsByTagName('HEAD').item(0).appendChild(script);
};

// ====================================================================================================
// com
// ====================================================================================================

// 记录日志
com.log = function () {
    var paras = '';
    var messageId = 'show_message_id';
    for (var x = 0; x < arguments.length; x++) {
        if (paras != '') paras += '; ';
        var obj = arguments[x];
        if (typeof obj === 'string' || typeof obj === 'number' || typeof obj === 'boolean' ||
            (typeof obj === 'object' && obj == null)) {
            paras += arguments[x];
        } else if (typeof obj === 'object' && obj.constructor === Date) {
            paras += arguments[x].format('yyyy-MM-dd hh:mm:ss');
        } else if (typeof obj === 'object' && obj.constructor === Array) {
            paras += '[' + arguments[x] + ']';
        } else if (typeof obj === 'object' && obj.constructor != undefined) {
            var temp = '';
            for (var property in obj) {
                if (temp.length > 0) temp += ',';
                temp += property + ":" + obj[property];
            }
            paras += '{' + temp + '}';
        }
    }

    if (top.location != window.location.href) {
        var objMsgDiv = top.document.getElementById(messageId);
        if (objMsgDiv != undefined && objMsgDiv != null) {
            objMsgDiv.innerHTML = paras;
        } else {
            writeMessageDIV(top.document, paras);
        }
    } else {
        var objMsgDiv1 = document.getElementById(messageId);
        if (objMsgDiv1 != undefined && objMsgDiv1 != null) {
            objMsgDiv1.innerHTML = paras;
        } else {
            writeMessageDIV(document, paras);
        }
    }

    // 创建显示消息的DIV
    function writeMessageDIV(doc, content) {
        // 动态创建style
        var style = doc.createElement('style');
        style.setAttribute('type', 'text/css');
        var def = '#' + messageId + ' {display:block;position:fixed;bottom:0px;right:18px;right:1px!important;width:100%;line-height:30px;';
        def += 'border:1px solid #fff;text-align:center;color:red;background:#000;font-family:arial,tahoma,"\5b8b\4f53",sans-serif;}';
        def += '*html #' + messageId + ' {position:absolute;_width:expression((document.compatMode && document.compatMode=="CSS1Compat") ? ';
        def += '                    document.documentElement.clientWidth : document.body.clientWidth);';
        def += '                    _top:expression(Math.max(document.documentElement.scrollTop,document.body.scrollTop) + ';
        def += '                    ((document.compatMode && document.compatMode=="CSS1Compat") ? document.documentElement.clientHeight : ';
        def += '                    document.body.clientHeight) - 32);}';
        if (style.styleSheet) {
            // IE  
            style.styleSheet.cssText = def;
        } else {
            // Other Browser  
            var tt = doc.createTextNode(def);
            style.appendChild(tt);
        }
        doc.getElementsByTagName('HEAD').item(0).appendChild(style);
        var div = doc.createElement('div');
        div.setAttribute('id', messageId);
        if (doc.body != null) {
            doc.body.appendChild(div);
            div.innerHTML = paras;
        }
    };
};

// 获取客户端时区
com.zone = function () {
    var d = new Date();
    var tz = d.getTimezoneOffset();
    tz = tz * (-1);
    var s = '';
    if (tz < 0) {
        s = s + 'GMT-';
        tz = tz * (-1);
    } else {
        s = s + 'GMT+';
    }
    if (tz >= 0) {
        var hour = Math.floor(tz / 60);
        var minute = tz - Math.floor(tz / 60) * 60;
        if (hour < 10) {
            s = s + '0' + hour;
        } else {
            s = s + hour;
        }
        s = s + ':';
        if (minute < 10) {
            s = s + "0" + minute;
        } else {
            s = s + minute;
        }
    } else {
        s += '0';
    }
    return s;
};

// URL相关的处理类
com.URL = function () {
    // 向URL中增加参数
    this.addParam = function (url, name, value) {
        return __urlParameter(1, url, name, value);
    };
    // 向URL中删除参数
    this.removeParam = function (url, name) {
        return __urlParameter(0, url, name);
    };
    // 向URL中Data增加参数
    this.addData = function (data, name, value) {
        return __urlData(1, data, name, value);
    };
    // 向URL中Data删除参数
    this.removeData = function (data, name) {
        return __urlData(0, data, name);
    };
    // 处理URL中参数的增加删除，type=1表示增加参数，type=0表示删除参数
    var __urlParameter = function (type, url, name, value) {
        if (url != undefined) url = url.replace(/(^\s*)|(\s*$)/g, '');
        if (name != undefined) name = name.replace(/(^\s*)|(\s*$)/g, '');
        if (value != undefined && typeof (value) == 'string') value = value.replace(/(^\s*)|(\s*$)/g, '');
        var urladdr = '';
        var urldata = '';
        var sindex = url.indexOf('?');
        if (sindex == -1) {
            urladdr = url;
            urldata = '';
        } else {
            urladdr = url.substring(0, sindex);
            urldata = url.substring(sindex + 1);
        }
        var newps = __urlData(type, urldata, name, value);
        return newps == '' ? urladdr : (urladdr + '?' + newps);
    };
    // 处理URL中Data参数的增加删除，type=1表示增加参数，type=0表示删除参数
    var __urlData = function (type, data, name, value) {
        var ss = data.split('&');
        var tempstr = '';
        var tempkeyvalue;
        var tempkey = '';
        var tempvalue = '';
        var isexist = false;
        var newps = '';
        for (var i = 0; i < ss.length; i++) {
            tempstr = ss[i].replace(/(^\s*)|(\s*$)/g, '');
            if (tempstr != '') {
                tempkeyvalue = tempstr.split('=');
                if (tempkeyvalue.length == 2) {
                    tempkey = tempkeyvalue[0];
                    tempvalue = tempkeyvalue[1];
                } else {
                    tempkey = tempkeyvalue[0];
                    tempvalue = '';
                }
                if (tempkey == name) {
                    if (type == 1) {
                        isexist = true;
                        tempvalue = value;
                    } else {
                        continue;
                    }
                }
                if (newps.length > 0) newps += '&';
                newps += tempkey + '=' + encodeURIComponent(tempvalue);
            }
        }
        if (type == 1 && !isexist) {
            if (newps.length > 0) newps += '&';
            newps += name + '=' + encodeURIComponent(value);
        }
        return newps;
    };
};
// URL相关的处理类实例
com.url = new com.URL();

// HTML相关处理类
com.HTML = function () {
    this.encode = function (html) {
        var temp = document.createElement("div");
        (temp.textContent != null) ? (temp.textContent = html) : (temp.innerText = html);
        var output = temp.innerHTML;
        temp = null;
        return output;
    };
};
// HTML相关处理类实例
com.html = new com.HTML();

// Cookie管理
com.Cookie = function () {
    var _p = com.Cookie.prototype;
    _p.getCookieVal = function (offset) {
        var endstr = document.cookie.indexOf(";", offset);
        if (endstr == -1) {
            endstr = document.cookie.length;
        }
        return unescape(document.cookie.substring(offset, endstr));
    };
    _p.set = function (name, value) {
        var expdate = new Date();
        var argv = arguments;
        var argc = arguments.length;
        var expires = (argc > 2) ? argv[2] : null;
        var path = (argc > 3) ? argv[3] : null;
        var domain = (argc > 4) ? argv[4] : null;
        var secure = (argc > 5) ? argv[5] : false;
        if (expires != null) {
            var temp = 0;
            var rdigit = /\d/;
            if (rdigit.test(expires) && !isNaN(expires)) {
                temp = parseInt(expires);
            }
            expdate.setTime(expdate.getTime() + (temp * 1000 * 60));
        }
        document.cookie = name
            + "="
            + escape(value)
            + ((expires == null) ? "" : ("; expires=" + expdate.toGMTString()))
            + ((path == null) ? "" : ("; path=" + path))
            + ((domain == null) ? "" : ("; domain=" + domain))
            + ((secure == true) ? "; secure" : "");
    };
    _p.remove = function (name) {
        var exp = new Date();
        exp.setTime(exp.getTime() - 1);
        var cval = this.get(name);
        document.cookie = name + "=" + cval + "; expires=" + exp.toGMTString();
    };
    _p.get = function (name) {
        var arg = name + "=";
        var alen = arg.length;
        var clen = document.cookie.length;
        var i = 0;
        while (i < clen) {
            var j = i + alen;
            if (document.cookie.substring(i, j) == arg) {
                return this.getCookieVal(j);
            }
            i = document.cookie.indexOf(" ", i) + 1;
            if (i == 0) {
                break;
            }
        }
        return null;
    };
};
// cookie实例
com.cookie = new com.Cookie();

// ====================================================================================================
// com.utils
// ====================================================================================================
if (!com.utils) com.utils = {};

// 数字处理类
com.utils.Number = function () {
    var isInt = function (source) {
        var rtn = false;
        try {
            var i = parseInt(source);
            rtn = !isNaN(i);
        } catch (e) {
        }
        return rtn;
    };
};

// 普通方法
com.utils.Number.prototype.isInt = function (source) {
    var rtn = false;
    try {
        var i = parseInt(source);
        rtn = !isNaN(i);
    } catch (e) {
    }
    return rtn;
};

// 静态方法
com.utils.Number.isInt = function (source) {
    var rtn = false;
    try {
        var i = parseInt(source);
        rtn = !isNaN(i);
    } catch (e) {
    }
    return rtn;
};
com.utils.number = new com.utils.Number();

// ====================================================================================================
// 封装Ajax方法
// ====================================================================================================
com.Ajax = function () {
    var _p = com.Ajax.prototype;

    _p.jsonResult = {
        error: -1,                   // 错误
        success: 200,                  // 成功
        timeout: 1,                  // 超时
        sessiontimeout: 302,          // 会话过期
        false: 500                  // 失败
    };

    // JAAX超时时间
    _p.timeout = 600000;

    // 处理AJAX返回的
    _p. doJsonResult = function (msg, fun) {
        try {
            //var rtn = JSON.parse(msg);
            var rtn = msg;
            if (rtn.code == _p.jsonResult.sessiontimeout) {
                var href = rtn.href;
                if (rtn.url != undefined && rtn.url != null) {
                    href = com.url.addParam(href, 'url', rtn.url);
                }
                top.window.location.href = href;
                rtn = { code: 2, msg: 'timeout' };
            } else if (rtn.code == _p.jsonResult.false) {
                //rtn = { code: 0, msg: '' };
            }
            if (rtn != null && fun != undefined && typeof (fun) == 'function') {
                fun(rtn);
            }
        } catch (e) {
            alert(msg + e.message);
        }
    };

    // AJAX出现错误的处理
    _p.doAjaxErrorByJson = function (XMLHttpRequest, fun) {
        var readyState = XMLHttpRequest.readyState;
        var msg = '';
        if (readyState == 4) {
            var status = XMLHttpRequest.status;
            if (status == 12007 || status == 12029) {
                msg = '{"code":-1,"msg":"请检查网络或网址是否存在！"}';
            } else {
                msg = '{"code":-1,"msg":"' + status + '错误，你知道的！"}';
            }
        } else {
            msg = '{"code":-1,"msg":"请求超时[' + readyState + ']."}';
        }
        _p.doJsonResult(msg, fun);
    };

    // AJAX出现错误的处理
    _p.doAjaxErrorByTxt = function (XMLHttpRequest, func) {
        var readyState = XMLHttpRequest.readyState;
        var msg = '';
        if (readyState == 4) {
            var status = XMLHttpRequest.status;
            if (status == 12007 || status == 12029) {
                msg = '请检查网络或网址是否存在！';
            } else {
                msg = status + '错误，你知道的！';
            }
        } else {
            msg = '请求超时[' + readyState + '].';
        }
        if (func != undefined && typeof (func) == 'function') {
            func(msg);
        }
    };

    // 发送POST请求
    // url为请求的URL
    // data为请求的数据
    // func为回调函数
    _p.jsonPost = function (url, data, func) {
        url = com.appRootUrl + url;
        $.ajax({
            type: 'POST',
            url: url,
            data: JSON.stringify(data),
            contentType: 'application/json',
            timeout: _p.timeout,
            success: function (msg) {
                _p.doJsonResult(msg, func);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                _p.doAjaxErrorByJson(XMLHttpRequest, func);
            }
        });
    };

    // 发送GET请求
    // url为请求的URL
    // data为请求的数据
    // func为回调函数
    _p.jsonGet = function (url, data, func) {
        url = com.appRootUrl + url;
        url = com.url.addParam(url, 'rnd', Math.random().toString());
        $.ajax({
            type: 'GET',
            url: url,
            data: data,
            contentType: 'application/json',
            timeout: _p.timeout,
            success: function (msg) {
                _p.doJsonResult(msg, func);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                _p.doAjaxErrorByJson(XMLHttpRequest, func);
            }
        });
    };

    // 发送POST请求
    // url为请求的URL
    // data为请求的数据
    // func为回调函数
    _p.txtPost = function (url, data, func) {
        if ((url.length > 7 && url.substring(0, 7).toLowerCase() != 'http://') &&
            (url.length > 8 && url.substring(0, 8).toLowerCase() != 'https://') &&
            (url.length > 0 && url.substring(0, 1) != '/')) {
            if (jsonpUrl == "" || typeof (jsonpUrl) == 'undefined') {
                url = com.appRootUrl + url;
            } else {
                url = jsonpUrl + url;
            }
        }
        $.ajax({
            type: 'POST', url: url, data: data, timeout: _p.timeout,
            success: function (msg) {
                if (func != undefined && typeof (func) == 'function') {
                    func(msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                _p.doAjaxErrorByTxt(XMLHttpRequest, func);
            }
        });
    };

    // 发送GET请求
    // url为请求的URL
    // data为请求的数据
    // func为回调函数
    _p.txtGet = function (url, data, func) {
        if ((url.length > 7 && url.substring(0, 7).toLowerCase() != 'http://') &&
            (url.length > 8 && url.substring(0, 8).toLowerCase() != 'https://') &&
            (url.length > 0 && url.substring(0, 1) != '/')) {
            if (jsonpUrl == "" || typeof (jsonpUrl) == 'undefined') {
                url = com.appRootUrl + url;
            } else {
                url = jsonpUrl + url;
            }
        }
        url = com.url.addParam(url, 'rnd', Math.random().toString());
        $.ajax({
            type: 'GET', url: url, data: data, timeout: _p.timeout,
            success: function (msg) {
                if (func != undefined && typeof (func) == 'function') {
                    func(msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                _p.doAjaxErrorByTxt(XMLHttpRequest, func);
            }
        });
    };

    // 发送POST请求
    // url为请求的URL
    // data为请求的数据
    // func为回调函数
    _p.post = function (url, data, func) {
        if ((url.length > 7 && url.substring(0, 7).toLowerCase() != 'http://') &&
            (url.length > 8 && url.substring(0, 8).toLowerCase() != 'https://') &&
            (url.length > 0 && url.substring(0, 1) != '/')) {
            if (jsonpUrl == "" || typeof (jsonpUrl) == 'undefined') {
                url = com.appRootUrl + url;
            } else {
                url = jsonpUrl + url;
            }
        }
        $.ajax({
            type: 'POST', url: url, data: data, timeout: _p.timeout,
            success: function (msg) {
                if (func != undefined && typeof (func) == 'function') {
                    func(msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                _p.doAjaxErrorByTxt(XMLHttpRequest, func);
            }
        });
    };

    // 发送GET请求
    // url为请求的URL
    // data为请求的数据
    // func为回调函数
    _p.get = function (url, data, func) {
        if ((url.length > 7 && url.substring(0, 7).toLowerCase() != 'http://') &&
            (url.length > 8 && url.substring(0, 8).toLowerCase() != 'https://') &&
            (url.length > 0 && url.substring(0, 1) != '/')) {
            if (jsonpUrl == "" || typeof (jsonpUrl) == 'undefined') {
                url = com.appRootUrl + url;
            } else {
                url = jsonpUrl + url;
            }
        }
        url = com.url.addParam(url, 'rnd', Math.random().toString());
        $.ajax({
            type: 'GET', url: url, data: data, timeout: _p.timeout,
            success: function (msg) {
                if (func != undefined && typeof (func) == 'function') {
                    func(msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                _p.doAjaxErrorByTxt(XMLHttpRequest, func);
            }
        });
    };

    // 发送JSONP GET请求
    // url为请求的URL
    // data为请求的数据
    // func为回调函数
    _p.jsonpGet = function (url, data, func) {
        if ((url.length > 7 && url.substring(0, 7).toLowerCase() != 'http://') &&
            (url.length > 8 && url.substring(0, 8).toLowerCase() != 'https://') &&
            (url.length > 0 && url.substring(0, 1) != '/')) {
            if (jsonpUrl == "" || typeof (jsonpUrl) == 'undefined') {
                url = com.appRootUrl + url;
            } else {
                url = jsonpUrl + url;
            }
        }
        url = com.url.addParam(url, 'rnd', Math.random().toString());
        data = data + "&callback=jsonpcallback";
        $.ajax({
            type: 'GET', url: url, data: data, timeout: _p.timeout,
            dataType: 'jsonp',
            jsonp: "jsonpcallback",
            success: function (msg) {
                if (func != undefined && typeof (func) == 'function') {
                    func(msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                _p.doAjaxErrorByTxt(XMLHttpRequest, func);
            }
        });
    };
    // 发送JSONP GET请求
    // url为请求的URL
    // data为请求的数据
    // func为回调函数
    _p.jsonpPost = function (url, data, func) {
        if ((url.length > 7 && url.substring(0, 7).toLowerCase() != 'http://') &&
            (url.length > 8 && url.substring(0, 8).toLowerCase() != 'https://') &&
            (url.length > 0 && url.substring(0, 1) != '/')) {
            if (jsonpUrl == "" || typeof (jsonpUrl) == 'undefined') {
                url = com.appRootUrl + url;
            } else {
                url = jsonpUrl + url;
            }
        }
        url = com.url.addParam(url + "&callback=jsonpcallback", 'rnd', Math.random().toString());
        $.ajax({
            type: 'Post', url: url, data: data, timeout: _p.timeout,
            dataType: 'jsonp',
            jsonp: "jsonpcallback",
            success: function (msg) {
                if (func != undefined && typeof (func) == 'function') {
                    func(msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                _p.doAjaxErrorByTxt(XMLHttpRequest, func);
            }
        });
    };
};
// ajax实例
com.ajax = new com.Ajax();

// ====================================================================================================
// 封装Form方法
// ====================================================================================================
com.Form = function () {
    var _p = com.Form.prototype;

    // Ajax时获得FORM或容器中的值的组合，返回值如：n=test&p=test&v=china&time=2009-9-9
    // elementId为FORM的ID或者容器（DIV）的ID
    _p.data = function (elementId) {
        var obj = eval("document." + elementId);
        if (obj == null) {
            obj = document.getElementById(elementId);
        }
        if (obj == null) {
            return "";
        }
        var i, queryString = "", and = "";
        // for each form's object
        var item;
        // store each form object's value
        var itemValue;
        var frmtype = obj.nodeName.toUpperCase();
        if (frmtype == "FORM") {
            for (i = 0; i < obj.length; i++) {
                // get form's each object
                item = obj.elements[i];
                if (item != null && item.name != undefined && item.name != '') {
                    if (item.type == 'image') {
                        continue;
                    } else if (item.type == 'select-one') {
                        itemValue = item.options[item.selectedIndex].value;
                    } else if (item.type == 'checkbox' || item.type == 'radio') {
                        if (item.checked == false) {
                            continue;
                        }
                        itemValue = item.value;
                    } else {
                        itemValue = item.value;
                    }
                    itemValue = encodeURIComponent(itemValue);
                    queryString += and + item.name + '=' + itemValue;
                    and = "&";
                }
            }
        } else if (frmtype == "DIV") {
            queryString = _p.getElementValues(obj);
        }
        return queryString;
    };

    // 递归获得容器（DIV）中值得组合
    _p.getElementValues = function (obj) {
        var item = null;
        var itemValue = null;
        var str = '';
        var checkNodeNames = '|INPUT|SELECT|BUTTON|TEXTAREA|';
        for (var i = 0; i < obj.childNodes.length; i++) {
            item = obj.childNodes[i];
            if (item == null || item == undefined) {
                continue;
            }
            var itemName = item.name;
            var itemNodeName = '';
            if (item.nodeName != undefined && item.nodeName != null) {
                itemNodeName = '|' + item.nodeName.toUpperCase() + '|';
            }
            if (itemNodeName != '' && checkNodeNames.indexOf(itemNodeName) != -1 && itemName != undefined && itemName != null && itemName != '') {
                if (item.type == 'image') {
                    continue;
                } else if (item.type == 'select-one') {
                    itemValue = item.options[item.selectedIndex].value;
                } else if (item.type == 'checkbox' || item.type == 'radio') {
                    if (item.checked == false) {
                        continue;
                    }
                    itemValue = item.value;
                } else {
                    itemValue = item.value;
                }
                itemValue = encodeURIComponent(itemValue);
                if (str != "") {
                    str += "&";
                }
                str += itemName + '=' + itemValue;
            }
            if (item.childNodes.length > 0) {
                var temp = _p.getElementValues(item);
                if (temp != "") {
                    if (str != "") {
                        str += "&";
                    }
                    str += temp;
                }
            }
        }
        return str;
    };
};
// form实例
com.form = new com.Form();

//将form中的值转换为键值对。
function getFormJson(frm) {
    var o = {};
    var a = $(frm).serializeArray();
    $.each(a, function () {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
}

// ====================================================================================================
// 封装UI界面方法
// ====================================================================================================
com.UI = function () {
    var _p = com.UI.prototype;

    // 统一错误/提示输出，目前只同意打印错误和jQuery.validator的输出错误
    /**
     * 清除提示框
     * @param id jquery式ID
     */
    _p.clearInfo = function (id) {
        $(id).html('');
        $(id).removeClass();
    };

    /**
     * 统一提示输出
     * @param id jquery式ID
     * @param message 提示信息
     */
    _p.showSuccess = function (id, message) {
        $(id).html('');
        $(id).removeClass();
        var lbl = $('<label generated="false"></label>');
        lbl.html(message);
        $(id).append(lbl);
        $(id).slideDown(1000);
        $(id).addClass('infosucess');
        $(id).slideUp(1000);
    };

    /**
     * 统一警告输出
     * @param id jquery式ID
     * @param message 错误信息
     */
    _p.showWarn = function (id, message) {
        $(id).html('');
        $(id).removeClass();
        var lbl = $('<label generated="false"></label>');
        lbl.html(message);
        $(id).append(lbl);
        $(id).slideDown(1000);
        $(id).addClass('infowarn');
        $(id).slideUp(1000);
    };

    /**
     * 统一错误输出
     * @param id jquery式ID
     * @param message 错误信息
     */
    _p.showError = function (id, message) {
        $(id).html('');
        $(id).removeClass();
        var lbl = $('<label generated="false" class="error"></label>');
        lbl.html(message);
        $(id).append(lbl);
        $(id).slideDown(1000);
        $(id).addClass('infoerror');
        $(id).slideUp(1000);
    };

    function setOver(id,time){
        setTimeout(function(){
            $(id).hide("slow");
        },time)
    }

    /**
     * 统一错误等待
     * @param id jquery式ID
     * @param message 错误信息
     */
    _p.showWait = function (id, message) {
        $(id).html('');
        $(id).removeClass();
        var lbl = $('<label generated="false"></label>');
        lbl.html(message);
        $(id).append(lbl);
        $(id).show();
        $(id).addClass('infowait');
    };

    /**
     * 统一错误输出 id jquery式ID，带# error jQuery.validator检测到错误时，显示错误的Label
     */
    _p.jqValError = function (id, error) {
        $('label[generated="false"]', id).remove();
        $(id).addClass('infoerror');
        error.appendTo(id);
    };

    /**
     * 统一错误移除 id jquery式ID，带# error jQuery.validator检测到错误排除时，需移除的Label
     */
    _p.jqValSuccess = function (id, label) {
        label.remove();
        if ($('label', id).length == 0) $(id).removeClass();
    };
};
// UI实例
com.ui = new com.UI();

// ====================================================================================================
// 封装分页方法
// ====================================================================================================
com.Page = function () {
    var _p = com.Page.prototype;

    _p.go = function (pager, pageNo, pageSize) {
        pageNo = _p.getInt(pageNo);
        pageSize = _p.getInt(pageSize);
        var strUrl = window.location.href;
        var strPage = "";
        var istart = strUrl.indexOf("?") + 1;
        if (istart > 0) {
            var i1 = strUrl.indexOf(pager + "=", istart);
            if (i1 != -1) {
                var i2 = (strUrl.indexOf("&", i1) == -1) ? (strUrl.length) : strUrl
                    .indexOf("&", i1);
                strPage = strUrl.substring(i1, i2);
            }
        }
        if (strPage.length > 0) {
            strUrl = strUrl.replace(strPage, pager + "=" + pageNo + "p" + pageSize);
        } else {
            if (strUrl.indexOf("?") != -1) {
                strUrl += "&";
            } else {
                strUrl += "?";
            }
            strUrl += pager + "=" + pageNo + "p" + pageSize;
        }
        window.location.href = strUrl;
    };

    _p.getInt = function (ipage) {
        var str = ipage.toString();
        if (!/^\d+$/.test(str) && !/^\d+\.?\d*$/.test(str)) {
            str = '0';
        }
        try {
            return parseInt(str);
        } catch (e) {
            return 0;
        }
    };

    // AJAX分页，注意pg + 'load()'为页面需要实现的函数，如：pgload()
    _p.ajaxGo = function (pg, pageNo, pageSize) {
        $('#' + pg + 'pageno').val(pageNo);
        $('#' + pg + 'pagesize').val(pageSize);
        eval(pg + 'load()');
    };

    // 获得分页信息，格式：页码p页大小，如1p20
    _p.getPager = function (pg) {
        var pn = $('#' + pg + 'pageno').val();
        var ps = $('#' + pg + 'pagesize').val();
        if (pn == undefined) pn = '';
        if (ps == undefined) ps = '';
        return pg + '=' + pn + 'p' + ps;
    };
};
// Page实例
com.page = new com.Page();

/*// ====================================================================================================
// 封装对话框方法
// ====================================================================================================
com.Dialog = function () {
    var _p = com.Dialog.prototype;

    _p.show = function (title, url, callbacks, width, height) {
        // 随机生成一个DIV并在DIV中生成一个iframe
        var rnd = Math.random().toString();
        var id = 'jq_' + rnd.substring(2);
        var jqid = '#' + id;
        var div = $('<div></div>');
        div.attr('id', id);
        div.attr('name', id);
        div.attr('style', 'padding:0;margin:0;display:none;overflow:hidden;');
        $(document.body).append(div);
        var dialogHeight = 0;
        if (height != undefined && !isNaN(height) && height > 0) {
            dialogHeight = height;
        }
        var iframeid = id + '_iframe';
        var htmiframe = '<iframe id=' + iframeid + ' name=' + iframeid + ' src="" style="clear:both;margin:0;padding:0;border-width:0;width:100%;';
        if (dialogHeight > 0) {
            htmiframe += 'height:' + (dialogHeight) + 'px;';
        }
        htmiframe += '" frameborder="0" scrolling="no"></iframe>';
        // htmiframe += '<div style="clear:both;border-top:solid 1px #f00;width:100%;height:1px;overflow:hidden;"></div>';
        div.append(htmiframe);
        // 打开窗口参数
        var options = { title: title, autoOpen: false, bgiframe: true, closeOnEscape: false, modal: true, overlay: { opacity: 0.1} };
        if (width == undefined || width < 388) {
            options.width = 388;
        } else {
            options.width = width;
        }
        if (dialogHeight > 0) {
            options.minHeight = dialogHeight;
        }
        var obj = $(jqid).dialog(options);
        $(jqid).dialog('open');
        var iframe = document.getElementById(iframeid);
        if (iframe != null) {
            $(iframe).attr('src', url);
            var handler = function () {
                if (window.frames[iframeid] != undefined) {
                    window.frames[iframeid].callbacks = callbacks;
                }
            };
            *//* 弹出窗口包含一个iframe，要让iframe没有滚动条，在onload事件中加入css样式html {overflow:hidden;} *//*
            if (iframe.attachEvent) { // IE => iframe.attachEvent('onload', handler);
                iframe.attachEvent("onload", function () {
                    if (window.frames[iframeid] != undefined) {
                        var ifrdom = $(window.frames[iframeid].document.body);
                        ifrdom.append('<style type="text/css">html, body {overflow:hidden;}</style>');
                        ifrdom.append('<input type="hidden" id="__nvdialog" name="__nvdialog" value="' + id + '"/>');
                        ifrdom.append('<input type="hidden" id="__nvdialog_status" name="__nvdialog_status" value=""/>');
                    }
                });
                iframe.attachEvent("onload", handler);
            } else if (iframe.addEventListener) { // Mozilla => iframe.addEventListener('load', handler, false);
                iframe.addEventListener('load', function () {
                    if (window.frames[iframeid] != undefined) {
                        var ifrdom = $(window.frames[iframeid].document.body);
                        ifrdom.append('<style type="text/css">html, body {overflow:hidden;}</style>');
                        ifrdom.append('<input type="hidden" id="__nvdialog" name="__nvdialog" value="' + id + '"/>');
                        ifrdom.append('<input type="hidden" id="__nvdialog_status" name="__nvdialog_status" value=""/>');
                    }
                }, false);
                iframe.addEventListener('load', handler, false);
            }
            *//* 重写关闭事件 *//*
            var close = $('.ui-dialog-titlebar-close', $(jqid).parent());
            close.unbind("click");
            close.bind('click', function () {
                top.com.dialog.hide(id);
            });
        }
        return id;
    };

    // 释放窗口
    _p.hide = function (id) {
        var jqid = '#' + id;
        if ($(jqid).length > 0) {
            // 释放iframe，避免内存泄露
            var iframeId = jqid.substring(1) + '_iframe';
            var obj = document.getElementById(iframeId);
            if (obj != null) {
                // 设置窗口状态
                $('#__nvdialog_status', obj.document).val('close');
                obj.src = "about:blank";
                obj.parentNode.removeChild(obj);
                delete obj;
                obj = null;
                $(jqid + '_iframe').remove();
            }
            // 下面这种方式和上面的功能是一样的
            $("iframe", $(jqid).parent()).each(function (i) {
                // this.src = "abort:blank";
                this.parentNode.removeChild(this);
                $(this).remove();
            });
            $(jqid).dialog('destroy');
            $(jqid).remove();
            if (typeof CollectGarbage == 'function') {
                CollectGarbage();
            }
        }
    };

    // 大概10秒
    var checkDialogTimes = 250;
    _p.getDialogIdTimer = function () {
        var isDialog = false;
        try {
            if ($('#__nvdialog').length > 0) {
                var str = $('#__nvdialog').val();
                if (!String.isNullOrWhiteSpace(str)) {
                    isDialog = true;
                    com.dialog.fitHeightTimer(str);
                }
            }
            checkDialogTimes--;
        } catch (err) {
        }
        if (!isDialog && checkDialogTimes > 0) {
            setTimeout("com.dialog.getDialogIdTimer()", 40);
        }
    };

    var _____dlgsize = { width: 0, height: 0 };
    // 弹出窗口自适应高度
    _p.fitHeightTimer = function (id) {
        var stopFit = false;
        try {
            // offsetHeight可以兼容所有浏览器，scrollHeight属性chrome不兼容同时弹出窗体不能使用CSS:html, body { height: 100%; }
            var h = document.body.offsetHeight;
            if (h != _____dlgsize.height) {
                var pifid = id;
                var piframediv = $("#" + pifid, parent.document);
                if (piframediv.length > 0) {
                    var piframe = $("#" + pifid + "_iframe", parent.document);
                    // com.log(new Date(), h, piframe.height(), piframediv.height(), $('#__nvdialog').position());
                    // if (/msie/.test(navigator.userAgent.toLowerCase())) {
                    piframe.height(h);
                    piframediv.css({ "overflow": "hidden" });
                    piframediv.css("min-height", h + "px");
                    piframediv.height(h);
                    _____dlgsize.height = h;
                } else {
                    stopFit = true;
                }
            }
        } catch (err) {
        }
        // 窗口状态
        var status = $('#__nvdialog_status').val();
        if (!stopFit && status != 'close') {
            setTimeout("com.dialog.fitHeightTimer('" + id + "')", 40);
        }
    };
};
// Dialog实例
com.dialog = new com.Dialog();
// 如果需要弹出窗口的高度随内容的变化而变化，下面的方法不能少
$(document).ready(function () {
    com.dialog.getDialogIdTimer();
    initDialogTitle();
    $(document).keydown(function (event) {
        if (event.keyCode == "27") {
            //回车执行查询
            $('.theme-popover-mask1').hide();
            $('.theme-popover1').slideUp(200);
        }
    });
});*/

$(window).unload(function () {
    // alert("Goodbye!");
});

//====================================================================================================
//jQuery扩展，禁用启用input按钮
//====================================================================================================

(function ($) {
    $.fn.btndisabled = function () {
        var i = this.each(function () {
            $(this).attr('disabled', 'disabled');
            $(this).addClass('buttondisabled');
        });
    };
    $.fn.btnenabled = function () {
        var i = this.each(function () {
            $(this).removeAttr('disabled');
            $(this).removeClass('buttondisabled');
        });
    };
})(jQuery);

//设置系统名称颜色以及样式
function colorTitle(id, title, url) {
    var from = [ 16, 144, 206 ];
    var to = [ 13, 67, 103 ];
    var href = '#';
    if (url != undefined && url != null && url != '') {
        href = url;
    }
    var boxObj = document.getElementById(id);
    boxObj.innerHTML = "<a href='" + href + "'>" + title + "</a>";
    var num = boxObj.getElementsByTagName("a")[0].scrollWidth;
    boxObj.innerHTML = "";
    for (var i = 0; i <= num; i++) {
        var j = i + 1;
        var r = from[0] + Math.round((to[0] - from[0]) / num * i);
        var g = from[1] + Math.round((to[1] - from[1]) / num * i);
        var b = from[2] + Math.round((to[2] - from[2]) / num * i);
        var iObj = document.createElement("A");
        iObj.innerHTML = title;
        iObj.style.clip = "rect(auto " + j + "px auto " + i + "px)";
        try {
            iObj.style.color = "rgb(" + r + "," + g + "," + b + ")";
        } catch (e) {

        }
        iObj.href = "#";
        boxObj.appendChild(iObj);
    }
}

//特殊字符过滤
function replaceInvalidChar(e) {
    if (!e.shiftKey && (e.keyCode == 220 || e.keyCode == 222)) {
        if (window.event)//windows
        {
            e.returnValue = false;
        }
        else //firefox
        {
            e.preventDefault();
        }

    }
    else if (e.shiftKey && (e.keyCode == 188 || e.keyCode == 190 || e.keyCode == 55 || e.keyCode == 222)) {
        if (window.event) {
            e.returnValue = false;
        }
        else {
            e.preventDefault();
        }

    }
}

//====================================================================================================
//封装消息返回打印处理方法
//====================================================================================================
com.MSG = function () {
    var _p = com.MSG.prototype;

    _p.alert = function (title, msg) {
        GenerateHtml("alert", title, msg);
        btnOk();  //alert只是弹出消息，因此没必要用到回调函数callback
        btnNo();
    }
    _p.confirm = function (title, msg, callback) {
        GenerateHtml("confirm", title, msg);
        btnOk(callback);
        btnNo();
    }

    //生成Html
    var GenerateHtml = function (type, title, msg) {

        var _html = "";

        _html += '<div id="mb_box"></div><div id="mb_con"><span id="mb_tit">' + title + '</span>';
        _html += '<a id="mb_ico">x</a><div id="mb_msg">' + msg + '</div><div id="mb_btnbox">';

        if (type == "alert") {
            _html += '<input id="mb_btn_ok" type="button" value="确定" />';
        }
        if (type == "confirm") {
            _html += '<input id="mb_btn_ok" type="button" value="确定" />';
            _html += '<input id="mb_btn_no" type="button" value="取消" />';
        }
        _html += '</div></div>';

        //必须先将_html添加到body，再设置Css样式
        $("body").append(_html);
        GenerateCss();
    }
    //生成Css
    var GenerateCss = function () {

        $("#mb_box").css({ width: '100%', height: '100%', zIndex: '99999', position: 'fixed',
            filter: 'Alpha(opacity=60)', backgroundColor: 'black', top: '0', left: '0', opacity: '0.6'
        });

        $("#mb_con").css({ zIndex: '999999', width: '400px', position: 'fixed',
            backgroundColor: 'White', borderRadius: '15px'
        });

        $("#mb_tit").css({ display: 'block', fontSize: '14px', color: '#444', padding: '10px 15px',
            backgroundColor: '#DDD', borderRadius: '15px 15px 0 0',
            borderBottom: '3px solid #009BFE', fontWeight: 'bold'
        });

        $("#mb_msg").css({ padding: '20px', lineHeight: '20px',
            borderBottom: '1px dashed #DDD', fontSize: '13px'
        });

        $("#mb_ico").css({ display: 'block', position: 'absolute', right: '10px', top: '9px',
            border: '1px solid Gray', width: '18px', height: '18px', textAlign: 'center',
            lineHeight: '16px', cursor: 'pointer', borderRadius: '12px', fontFamily: '微软雅黑'
        });

        $("#mb_btnbox").css({ margin: '15px 0 10px 0', textAlign: 'center' });
        $("#mb_btn_ok,#mb_btn_no").css({ width: '85px', height: '30px', color: 'white', border: 'none' });
        $("#mb_btn_ok").css({ backgroundColor: '#168bbb' });
        $("#mb_btn_no").css({ backgroundColor: 'gray', marginLeft: '20px' });


        //右上角关闭按钮hover样式
        $("#mb_ico").hover(function () {
            $(this).css({ backgroundColor: 'Red', color: 'White' });
        }, function () {
            $(this).css({ backgroundColor: '#DDD', color: 'black' });
        });

        var _widht = document.documentElement.clientWidth;  //屏幕宽
        var _height = document.documentElement.clientHeight; //屏幕高

        var boxWidth = $("#mb_con").width();
        var boxHeight = $("#mb_con").height();

        //让提示框居中
        $("#mb_con").css({ top: (_height - boxHeight) / 2 + "px", left: (_widht - boxWidth) / 2 + "px" });
    }

    //确定按钮事件
    var btnOk = function (callback) {
        $("#mb_btn_ok").click(function () {
            $("#mb_box,#mb_con").remove();
            if (typeof (callback) == 'function') {
                callback();
            }
        });
    }

    //取消按钮事件
    var btnNo = function () {
        $("#mb_btn_no,#mb_ico").click(function () {
            $("#mb_box,#mb_con").remove();
        });
    }


};
//UI实例
com.msg = new com.MSG();

function ctoUTF8(key) {
    return encodeURIComponent(encodeURIComponent(key));
}

function getParam(paramName) {
    var paramValue = "";
    var isFound = false;
    var url = window.location.search;
    if (url.indexOf("?") == 0 && url.indexOf("=") > 1) {
        arrSource = unescape(this.location.search).substring(1, this.location.search.length).split("&");
        var i = 0;
        while (i < arrSource.length && !isFound) {
            if (arrSource[i].indexOf("=") > 0) {
                if (arrSource[i].split("=")[0].toLowerCase() == paramName.toLowerCase()) {
                    paramValue = arrSource[i].split("=")[1];
                    isFound = true;
                }
            }
            i++;
        }
    }
    return paramValue;
}

function setCSS(batchid) {
    $("ul.menu").find("li").removeClass("liclicked");
    $("#pic_" + batchid).addClass("liclicked");
}

//date类型转成string
/**
* 对Date的扩展，将 Date 转化为指定格式的String
* 月(M)、日(d)、12小时(h)、24小时(H)、分(m)、秒(s)、周(E)、季度(q) 可以用 1-2 个占位符
* 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)
* eg:
* (new Date()).pattern("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423
* (new Date()).pattern("yyyy-MM-dd E HH:mm:ss") ==> 2009-03-10 二 20:09:04
* (new Date()).pattern("yyyy-MM-dd EE hh:mm:ss") ==> 2009-03-10 周二 08:09:04
* (new Date()).pattern("yyyy-MM-dd EEE hh:mm:ss") ==> 2009-03-10 星期二 08:09:04
* (new Date()).pattern("yyyy-M-d h:m:s.S") ==> 2006-7-2 8:9:4.18
*/
//var date = new Date();
//window.alert(date.pattern("yyyy-MM-dd hh:mm:ss"));

Date.prototype.pattern=function(fmt) {
    var o = {
    "M+" : this.getMonth()+1, //月份
    "d+" : this.getDate(), //日
    "h+" : this.getHours()%12 == 0 ? 12 : this.getHours()%12, //小时
    "H+" : this.getHours(), //小时
    "m+" : this.getMinutes(), //分
    "s+" : this.getSeconds(), //秒
    "q+" : Math.floor((this.getMonth()+3)/3), //季度
    "S" : this.getMilliseconds() //毫秒
    };
    var week = {
        "0" : "\u65e5",
        "1" : "\u4e00",
        "2" : "\u4e8c",
        "3" : "\u4e09",
        "4" : "\u56db",
        "5" : "\u4e94",
        "6" : "\u516d"
        };
    if(/(y+)/.test(fmt)){
        fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
        }
    if(/(E+)/.test(fmt)){
        fmt=fmt.replace(RegExp.$1, ((RegExp.$1.length>1) ? (RegExp.$1.length>2 ? "\u661f\u671f" : "\u5468") : "")+week[this.getDay()+""]);
        }
    for(var k in o){
        if(new RegExp("("+ k +")").test(fmt)){
        fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        }
    }
    return fmt;
}