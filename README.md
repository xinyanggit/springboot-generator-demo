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
