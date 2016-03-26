package com.fb.exam.common.Handler;

import com.fb.exam.common.code.ResCode;
import com.fb.exam.common.myException.BusinessException;
import com.fb.exam.common.myException.NoRightException;
import com.fb.exam.common.myException.NotLoginException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 16-1-5.
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    private static final Logger log = LoggerFactory.getLogger("MyExceptionHandler");

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        log.error("异常捕获", getTrace(ex));
        if (isAjax(request)) {
            try {
                PrintWriter writer = response.getWriter();
                writer.write(ex.getMessage());
                if (ex instanceof NotLoginException) {
                    response.setStatus(ResCode.NOT_LOGIN.getCode());
                } else if (ex instanceof NoRightException) {
                    response.setStatus(ResCode.NOT_JURISDICTION.getCode());
                } else if (ex instanceof BusinessException) {
                    response.setStatus(ResCode.ERR.getCode());
                } else {
                    response.setStatus(404);
                }
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // 不进行页面跳转
            return null;
        } else {
            Map<String, Object> model = new HashMap<>();
            model.put("ex", ex);
            // 根据不同错误转向不同页面
            if (ex instanceof BusinessException) {
                return new ModelAndView("/business", model);
            } else if (ex instanceof NotLoginException) {
                return new ModelAndView("/login2", model);
            } else if (ex instanceof NoRightException) {
                return new ModelAndView("/noRight", model);
            } else {
                return new ModelAndView("/err", model);
            }
        }
    }

    public static String getTrace(Throwable t) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        t.printStackTrace(writer);
        StringBuffer buffer = stringWriter.getBuffer();
        return buffer.toString();
    }

    private boolean isAjax(HttpServletRequest request) {
        return request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with")
                .equalsIgnoreCase("XMLHttpRequest");
    }
}
