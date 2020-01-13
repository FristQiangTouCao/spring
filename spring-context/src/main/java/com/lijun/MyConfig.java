package com.lijun;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 我的配置类
 */
@Configuration
@Import(MyImportSelect.class)
public class MyConfig {
}
