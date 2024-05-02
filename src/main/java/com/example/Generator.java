package com.example;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static void main(String[] args) throws InterruptedException, SQLException, IOException, XMLParserException, InvalidConfigurationException, InvalidConfigurationException, IOException, XMLParserException {
        List<String> warnings = new ArrayList<>();    // 执行过程中的警告信息
        boolean overwrite = true;    // 生成的代码重复时，覆盖原代码
        // 指定配置文件位置
        String projectPath = System.getProperty("user.dir"); // 获取当前项目路径
        String configFilePath = projectPath + "/src/main/resources/generatorConfig.xml"; //需修改
        File configFile = new File(configFilePath);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        // mybatis-generator-core依赖 1.3.6 后才有MyBatisGenerator类,需要jre1.8才能运行
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);        // 执行生成代码
        warnings.forEach(System.out::println);    // 输出警告信息
        System.out.println("生成结束>>>");

    }
}
