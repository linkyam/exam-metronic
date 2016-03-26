package com.fb.exam.common.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created by Administrator on 15-10-6.
 */
public class SpringBeanUtil  implements BeanFactoryAware {

    private static BeanFactory beanFactory;


    public void setBeanFactory(BeanFactory factory) throws BeansException {
        this.beanFactory = factory;
    }

    /**
     * 根据beanName名字取得bean
     *
     * @param beanName
     * @return
     */
    public static <T> T getBean(String beanName) {
        if (null != beanFactory) {
            return (T) beanFactory.getBean(beanName);
        }
        return null;
    }

}
