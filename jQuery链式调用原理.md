# jQuery的链式调用原理
链式调用：

> $('div').show().hide().css('height','300px').toggle()

原理：

> jQuery节点在调用api后都会返回节点自身。

比如：

    var Obj = {
    	a: 1,
   		func: function(){
   			 this.a += 1;
    		 return this
    	}
    }

    Obj.func().func();
    console.log(Obj.a);//3

参考：[https://segmentfault.com/a/1190000008724608](https://segmentfault.com/a/1190000008724608)