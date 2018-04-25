安装的maven版本为3.5.1;并添加到环境变量中

mvn -v 				查看maven版本号 
    compile 			编译
    test    			测试
    package 			打包
    
    clean			删除target
    install			安装jar包到本地仓库中


maven02项目引入了maven01的包，需要先将maven01通过mvn install的方法，将其加入到本地仓库