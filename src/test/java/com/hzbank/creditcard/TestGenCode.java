//package com.hzbank.creditcard;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
//import java.io.IOException;
//
//public class TestGenCode {
//    public static void main(String[] args) throws IOException {
//        //创建generator对象
//        AutoGenerator autoGenerator = new AutoGenerator();
//
//        //数据源
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.MYSQL);
//        dataSourceConfig.setUrl("jdbc:mysql://8.136.199.219:3306/db_credit?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8");
//        dataSourceConfig.setUsername("root");
//        dataSourceConfig.setPassword("!qwe&123");
//        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
//        autoGenerator.setDataSource(dataSourceConfig);
//
//
//        //全局配置
//        GlobalConfig globalConfig = new GlobalConfig();
//        // 工程的绝对路径+下面的目录,根据自己的路径修改
//        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
//        globalConfig.setOpen(false);
//        globalConfig.setAuthor("md");
//        globalConfig.setServiceName("%sService");
//        autoGenerator.setGlobalConfig(globalConfig);
//
//
//        //包信息
//        PackageConfig packageConfig = new PackageConfig();
//        packageConfig.setParent("com.hzbank");
//        // 生成的module
//        packageConfig.setModuleName("creditcard");
//
//        packageConfig.setController("controller");
//        packageConfig.setService("service");
//        packageConfig.setServiceImpl("service.impl");
//        packageConfig.setMapper("mapper");
//        packageConfig.setEntity("entity");
//        autoGenerator.setPackageInfo(packageConfig);
//
//
//        //配置策略
//        StrategyConfig strategyConfig = new StrategyConfig();
//        // 自动添加Lombok注解
//        strategyConfig.setEntityLombokModel(true);
//        // 数据库中的下划线改驼峰
//        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
//        // 可以指定表名
//        strategyConfig.setInclude("associate_card,consum_flow,credit_card,repay_flow,special_merchant".split(","));
//        autoGenerator.setStrategy(strategyConfig);
//
//
//        autoGenerator.execute();
//    }
//}
