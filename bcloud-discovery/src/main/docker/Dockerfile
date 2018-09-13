#指定基础镜像
FROM frolvlad/alpine-oraclejdk8:slim
#实现挂载功能，可以将内地文件夹或者其他容器种得文件夹挂在到这个容器种
VOLUME /home/docker/logs
#一个复制命令，把文件复制到镜像中
ADD bcloud-discovery-1.0-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#暴漏容器运行时的监听端口给外部
EXPOSE 8081