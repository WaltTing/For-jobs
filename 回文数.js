function isPalindrome(str){
	str += "";  //如果输入的是数字型，要将其先转换为字符串
	for(var i=0,j=str.length-1;i<j;i++,j--){  
        if(str.charAt(i) !== str.charAt(j)){  
            return false;  
        }  
    }  
    return true;  
}