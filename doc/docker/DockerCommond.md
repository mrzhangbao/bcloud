#Docker 的常用命令

1、docker的启动、停止、重启
    
    service docker start    
    $service docker stop
    $service docker restart

2、查看当前镜像

    $ docker images
    
3、docker启动的容器列表
    
    $ docker ps 
    
4、docker运行一个镜像
    
    $docker run --name pcloud-config --link eureka-server:eureka-server --link mqserver:mqserver  -d -p 8085:8085 zhangbao/pcloud-config

    
