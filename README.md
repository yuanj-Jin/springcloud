# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#build-image)



FIRST:
    下载安装nacos服务端：
        https://github.com/alibaba/nacos/releases
     linux:
        wget https://github.com/alibaba/nacos/releases/download/1.2.0/nacos-server-1.2.0.tar.gz
        tar -zxvf nacos-server-1.2.0.tar.gz
        cd nacos
        bin/startup.sh -m standalone(单例启动)
SECOND:
    创建聚合spingcloud工程,删除src目录
    右击该工程，new=>module，新建一个配置中心项目nacos-configuration
    右击该工程，new=>module，新建一个服务提供项目nacos-producer
    右击该工程，new=>module，新建一个服务消费项目nacos-consumer
    
    
    