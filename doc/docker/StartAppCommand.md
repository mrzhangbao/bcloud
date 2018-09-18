#部署启动项目的常用命令

1、编译打包命令
    
    $clean package docker:build -DskipTests
    
2、运行bcloud-discovery 镜像命令

    $ docker run --name eureka-server -d -p 8081:8081 zhangbao/bcloud-discovery
    
3、查看container日志
    
    $ docker logs -f [container ID]
    $ docker logs -f [container name]
    
4、运行bcloud-config 镜像
    
    $ docker run --name bcloud-config --link eureka-server:eureka-server --link mqserver:mqserver  -d -p 8085:8085 zhangbao/bcloud-config

5、运行 bcloud-gateway 镜像

    $ docker run --name bcloud-gateway --link eureka-server:eureka-server --link mqserver:mqserver  -d -p 8082:8082 zhangbao/bcloud-gateway
    
6、运行 bcloud-provider-user-web 镜像

    $ docker run --name bcloud-provider-user-web --link eureka-server:eureka-server   -d -p 8086:8086 zhangbao/bcloud-provider-user-web