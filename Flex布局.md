# Flex布局教程

本文来自[阮一峰老师的博客](http://www.ruanyifeng.com/blog/2015/07/flex-grammar.html)

布局的传统解决方案，是依赖`display+position+float` 来实现，对于一些特殊的布局，十分不方便。2009年，W3C提出了一中新的方案——flex布局，它将成为未来布局的首选方案。

## 兼容性

Chrome 21+ (更新到60)  
Opera 12.1+ (目前更新到47)   
FireFox 22+（目前更新到55）  
Safari 6.1+ (目前更新到V10)  
IE 10+ (目前更新到IE edge及11)

时间：8/23/2017 4:58:36 PM 

## 定义
flex布局意为“弹性布局”，用来为盒状模型提供最大的灵活性。

不管是块级元素还是行内元素，都可以为元素指定flex布局属性值：   

    .box{
    	display: flex;
    }
    
如果是Webkit内核的浏览器，必须加上`-Webkit`前缀。

	.box{  
		display: -webkit-flex;  /* Safari */
	}  

值得注意的是，设置flex之后，子元素的float、clear、vertical属性都将失效。

## 容器的属性

- flex-direction 
- flex-wrap
- flex-flow
- justify-content
- align-items
- align-content

### 1.flex-direction属性决定元素的排列方向    
它有四个值：   

- row(默认)   
水平方向排列，从左到右
- row-reverse  
水平方向排列，从右到做
- colomn  
垂直方向，从上往下
- colomn-reverse   
垂直方向，从下往上

### 2.flex-wrap属性规定如果元素无法在一行中排下，如何换行。
它有三个值：  

- nowrap（默认）  
不换行
- wrap  
换行，第一行在上方  
- wrapreverse  
换行，第一行在下方

### 3.flex-flow属性是flex-direction属性和flex-wrap属性的简写方式。它的默认值是row nowrap。

	.box{   
		flex-flow: <flex-direction> <flex-wrap> ;
	}

### 4.justify-content属性规定了元素的对齐方式    
它有五个值：

- flex-start（默认值）  
左对齐
- flex-end  
右对齐    
- center   
居中
- space-between  
两端对齐，元素之间的间隔都相等  
- space-around  
每个项目两侧的间隔相等。所以，项目之间的间隔比项目与边框的间隔大一倍。

### 5.align-items属性规定了垂直方向上如何对齐

它有五个值：

- flex-start  
紧贴顶部对齐
- flex-end   
紧贴底部对齐  
- center  
交叉轴的终点对齐
- baseline  
按照项目的第一行文字的基线对齐
- stretch(默认值)  
如果项目未设置高度或设为auto，将占满整个容器的高度。

### 6.align-content属性规定了多行元素的对齐方式，如果只有一行，则不起作用
它的值存在六个：

- flex-start  
紧贴左边对齐
- flex-end   
紧贴右边对齐  
- center  
居中对齐
- space-between  
垂直两端对齐，水平的间隔平均分布。 
- space-around  
每个项目两侧的间隔相等。所以，项目之间的间隔比项目与边框的间隔大一倍。     
- stretch(默认值)  
轴线占满整个交叉轴。

## 元素的属性
元素的属性有6个：

- order   
规定了元素的排列顺序。数值越小，排列越靠前，默认为0。
- flex-grow  
定义了元素的放大比例，默认为0；
- flex-shrink  
定义了元素的缩小比例，默认值是1。
- flex-basis  
定义了在分配多余空间之前，元素占据的空间，浏览器根据这个计算浏览器是否还有多余空间，它的默认值为auto,即项目的本来大小。
- flex   
flex属性是`flex-grow`、`flex-shrink`和`flex-basis`的简写，默认值为0 1 auto。后两个属性可选。
- align-self  
`align-self`属性允许单个元素有与其他元素不一样的对齐方式，可覆盖`align-items`属性。默认值为auto，表示继承父元素的align-items属性，如果没有父元素，则等同于`stretch`。
