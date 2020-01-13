package com.lijun;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 实现了ImportBeanDefinitionRegistrar接口
 * 手动注入bean
 */
public class MyImportSelect implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// 1、首先需要获得一个beanDefinition的构建器 - - 传入的是需要构建的bean的class
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(MyDao.class);
		//2、通过构建器 构建出一个bean
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();
		//3、将这个bean注入到spring的容器中
		registry.registerBeanDefinition("myDao",genericBeanDefinition);
	}
}
