# CSS实现一个三角形

今天面试被问到如何用CSS画一个三角形的问题，回来特别了解了一下。

废话不多说，show me your code!

## 1.左边框
HTML:

    <div class="triangle1"></div>

CSS:

	    .triangle1{
            width:100px;
            height:100px;
            border-left:100px solid blueviolet;
        }

效果：   
![](http://i.imgur.com/OXEj5ff.png)	



## 2.左边框和底边框
HTML:
    
    <div class="triangle2"></div>

CSS:

	.triangle2{
       width:100px;
       height:100px;
       border-left:100px solid blueviolet;
       border-bottom: 100px solid red;
     }

效果：  
![](http://i.imgur.com/WkbPko8.png)

## 3.左边框、底边框和顶边框
HTML:

    <div class="triangle3"></div>

CSS:

	.triangle3{
        width:100px;
        height:100px;
        border-left:100px solid blueviolet;
        border-bottom: 100px solid red;
        border-top:100px solid yellow;
     }

效果：   
![](http://i.imgur.com/aawSVM9.png)

## 4.全边框
HTML:

    <div class="triangle4"></div>

CSS:

	.triangle4{
            width:100px;
            height:100px;
            border-left:100px solid blueviolet;
            border-bottom: 100px solid red;
            border-top:100px solid yellow;
            border-right: 100px solid green;
     }

效果：   
![](http://i.imgur.com/1XHrSJO.png)

如果将中间的内容区域设置为0,又会怎样呢？
## 5.内容区长宽为0
HTML:
    
    <div class="triangle5"></div>

CSS：

    .triangle5{
    	width:0px;
    	height:0px;
    	border-left:100px solid blueviolet;
    	border-bottom: 100px solid red;
    	border-top:100px solid yellow;
    	border-right: 100px solid green;
    }

效果：    
![](http://i.imgur.com/iBXFw7k.png)

## 6.真正的三角形
现在我们保留底边框的颜色，其他边框的颜色设置为透明(tranparent)。  
HTML:

    <div class="triangle6"></div>

CSS:

    .triangle6{
	    width:0px;
	    height:0px;
	    border-left:100px solid transparent;
	    border-bottom: 100px solid red;
	    border-top:100px solid transparent;
	    border-right: 100px solid transparent;
    }

效果：  
![](http://i.imgur.com/0RdBiRL.png)

## 7.得到我们要的三角形形状
### 7.1 直角等腰三角形
HTML:

    <div class="triangle7"></div>

CSS:

    .triangle7{
	    width:0px;
	    height:0px;
	    border-left:100px solid red;
	    border-bottom: 100px solid red;
	    border-top:100px solid transparent;
	    border-right: 100px solid transparent;
    }

效果：

![](http://i.imgur.com/P6piipE.png)

### 7.2 等腰三角形

HTML:

    <div class="triangle8"></div>

CSS:

    .triangle8{
	    width:0px;
	    height:0px;
	    border-left:100px solid transparent;
	    border-bottom: 50px solid red;
	    border-top:50px solid transparent;
	    border-right:100px solid transparent;
    }

效果：    
![](http://i.imgur.com/4Tlxoae.png)


## 原理

由此我们可以推测：

> 1.当初设计边框的时候，四个边框既能独立成一个矩形，又要在组合使用的时候表现自然，所以在拼接的时候事实上添加了一部分，比如图一和图二，明显可以发现图二的左边框多出来了。   
> 2.将其中某些边框设置为透明属性，就可以画出三角形


