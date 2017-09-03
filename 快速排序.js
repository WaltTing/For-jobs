function quickSort(arr) {
    if(arr.length <= 1) return arr;
    var flag = Math.floor(arr.length/2);   //找到中间的那个基准点
    var middle = arr.splice(flag,1);       //取出基准点
    var left = [];                         //比基准小的放左边
    var right = [];                        //比基准大的放右边
    for(var i=0; i<arr.length; i++){
        if(arr[i] > middle){
            right.push(arr[i]);
        }else left.push(arr[i]);
    }
    return quickSort(left).concat(middle,quickSort(right));
}

console.log(quickSort([2,8,3,5,4,7,1,6]));
