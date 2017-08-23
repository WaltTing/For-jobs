# 输入url到加载完成发生了什么

一般会经历以下过程：

1.在浏览器中输入url。  
2.浏览器先查看**浏览器缓存--系统缓存--路由器缓存**，如果缓存中存在页面内容，就会直接在屏幕中显示。  
3.在发送http请求前，浏览器开启一个线程来解析域名([DNS解析](https://github.com/WaltTing/For-jobs/blob/master/DNS%E8%A7%A3%E6%9E%90%E5%8E%9F%E7%90%86.md))，获取相应的IP地址。   
4.浏览器向服务器发起TCP连接，与浏览器通过TCP三次握手建立连接；	   
5.握手成功后，浏览器向服务器发送HTTP请求，请求数据包。  
6.服务器处理收到的请求，将数据返回给浏览器。   
7.浏览器收到HTTP响应。   
8.接下来就是[页面渲染](https://github.com/WaltTing/For-jobs/blob/master/%E9%A1%B5%E9%9D%A2%E6%B8%B2%E6%9F%93%E5%8E%9F%E7%90%86.md)的内容了。

参考：[http://www.cnblogs.com/WaTa/p/5477374.html ](http://www.cnblogs.com/WaTa/p/5477374.html)    

