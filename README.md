# spring-boot-assembly

> 1. mybatis-generator-custom  是根据表生成实体类和mapper的工程，只需要修改generatorConfig.xml文件，然后运行MybatisGeneratorCustomApplication即可
> 2. generatorConfig.xml  是mybatis-generator-custom工程中的配置文件;这里面
重点是     <!--jdbcConnection：指定连接的目标数据库-->
        <jdbcConnection driverClass="com.mysql.cj.jdbc.Driver"
                        connectionURL="jdbc:mysql://localhost:3306/mydb?useUnicode=true&amp;characterEncoding=UTF-8&amp;serverTimezone=Asia/Shanghai&amp;useSSL=false"
                        userId="root"
                        password="xxxx19232506">
        </jdbcConnection>

