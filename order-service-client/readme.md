#### 1 使用随机端口

> * 设置server.port =0 
> * 修改实例ID定义 
    eureka.instance.instance-id=${spring.application.name}:${random.int}
    
####     
    