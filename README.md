<h1>miscrosvc</h1>

![license](https://img.shields.io/github/license/alibaba/dubbo.svg)

## 简介
> microsvc To build micro-service with Latest version of Spring Cloud

由于Spring Cloud 2.X比1.X更新了很多地方。 比如弃用Eureka, 用Spring Cloud Consul代替它。 用Spring Cloud Gateway取代ZUUL。
(Netflix也在边缘化Hystrix等).  目前看到网上代码大多基于Spring Cloud 1.X。  我们需要紧跟Spring Cloud官方的步伐。于是，我启动
了<code>servicesvc</code>项目。

<br/>

| 序号 | module | 功能 |
| :------: | :------: | :------ |
| 1 | [gateway](gateway) | 网关，基于Spring Cloud Gateway |
| 2 | [mall-app](mall-app) | 主应用程序 |
| 3 | [mall-service](mall-service) | 服务，基于Spring Cloud Consul |
| 4 | [spring-cloud-sleuth](https://github.com/liushaoming/svctracer) | sleuth+zipkin 微服务调用链跟踪 |

<br/>

**欢迎广大程序员加入开源软件的开发**，无论你是一个小白，菜鸟，还是一个大佬，甚至大神。这里都
能找到，或者新建一个难易程度适合你的项目。

提高广大程序员的技术水平是我们开源的初衷和目的！


## 联系作者
|  联系方式 |  |
| :-------- | :-------- |
| **Leader** | liushaoming |
| email | [liushaomingdev@163.com](mailto:liushaomingdev@163.com) |
| QQ | 944147540 |


## 联系我们
加QQ群讨论 
<br/>
![](doc/image/group-qrcode.png)

微信公众号

![](doc/image/public-account.jpg)
