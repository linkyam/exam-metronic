package com.fb.exam.common.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ques134z-erete on 2015/5/16.
 */
public class PropertyUtil extends PropertyPlaceholderConfigurer {
    private static Map<String, String> ctxPropertiesMap;
    private static String webPath;
    private static final Logger log = LoggerFactory.getLogger(PropertyUtil.class);

    @Override
    protected void processProperties(
            ConfigurableListableBeanFactory beanFactoryToProcess,
            Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        ctxPropertiesMap = new HashMap<String,String>();
        //log.debug("####读取资源文件####");
        for (Object key : props.keySet()) {
            String keyStr = key.toString();
            String value = props.getProperty(keyStr);
            //log.debug("####数据 key = {}  value = {}",keyStr,value);
            ctxPropertiesMap.put(keyStr, value);
        }
        String webPath=this.getClass().getResource("/").getPath();
        int index=webPath.indexOf("/WEB-INF");
        this.webPath=webPath.substring(0,index);
    }

    public static String getContextProperty(String name) {
        String result=ctxPropertiesMap.get(name);
        if(StringUtils.isEmpty(result)){
            return null;
        }
        return result.trim();
    }

    public static String getWebPath(){
        log.debug("####webPath=={}####",webPath);
        return webPath;
    }
}
