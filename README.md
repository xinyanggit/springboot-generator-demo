# springboot-demo
最基础的实验版本，由于后续学习和实验其他框架使用，基于当前版本建立对应的。
包含：
- swagger-ui 配置
- actuator 相关监控节点暴漏

actuaotr:
Actuator 2.x 的大多数端点默认被禁掉。Actuator 2.x 中的默认端点增加了/actuator前缀。
默认暴露的两个端点为/actuator/health和 /actuator/info
访问需要携带前缀 **/actuator**  eg: `http://localhost:8081/actuator/env`
查看全部url:
`http://localhost:8081/actuator`

**generator-code:**
根据表生成对应的代码(mybatis、DAO、Service、Controller) 
有几种方式：
-  调用方法(mybais-plus 提供的接口-可以定制)
- idea插件 EasyCode(可以idea中修改配置)
- idea插件 MyBatisCodeHelper-Pro(可以图形化UI修改定制，收费(很便宜，可以体验一下，EasyCode升级版本))


按着要求触发对应的方法、修改db连接方式：
程序入口：
com.yx.generator.CodeGenerator.main 
- 修改数据库连接方式
- 如果有其他的特别的要求可以修改配置、官网地址: <a>https://mp.baomidou.com/guide/generator.html
