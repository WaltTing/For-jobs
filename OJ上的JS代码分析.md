题目描述：数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。

### 例如：

输入：

> 81 4

输出：

> 94.73

代码如下（通过率100%）：

    while(line = readline()){
    	var lines = line.split(' ');
    	var sum = parseInt(lines[0]);
    	var val = sum;
    	for(var i=1; i<lines[1]; i++){
    		val = Math.pow(val,0.5);
    		sum = sum + val;
    	}
    	sum = sum.toFixed(2);
    	print(sum);
    }

readline()接收输入值

> print(line);   //814，814事实上是一条字符串

因此我们要首先将字符串转化成字符数组：

> print(lines);  //["81"，"4"]

再将字符数组转化成Number类型。

最后，将得到的无限循环小数转化成只有小数点保留两位的数。用toFixed()方法。