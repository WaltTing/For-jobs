# 随机打乱数组
    function randomsort(a, b) {
    	//用Math.random()函数生成0~1之间的随机数与0.5比较，返回-1或1
    	return Math.random() > .5 ? -1 : 1;
    }
    
    var arr = [1, 2, 3, 4, 5];
    arr.sort(randomsort);

# 字符串和数组互转
数组转字符串  

    var a, b;
    a = new Array(0,1,2,3,4);
    b = a.join(' ');
    console.log(b); //01234

字符串转数组

	var s = "abc,abcd,aaa";
	ss = s.split(",");// 在每个逗号(,)处进行分解。

参考文献：  
[1] [http://www.jb51.net/article/52038.htm](http://www.jb51.net/article/52038.htm)   
[2] [http://www.jianshu.com/p/7de1b7103e3e](http://www.jianshu.com/p/7de1b7103e3e)