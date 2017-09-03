function bubbleSort(arr) {
    for(var j=arr.length-1; j>0; j--){
        for(var i=0; i<j; i++){
            if(arr[i+1]<arr[i]){
                var temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
             }
        }
    }
    console.log(arr);
}

bubbleSort([4,5,2,1,7,3,2]);
