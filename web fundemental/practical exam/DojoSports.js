var element = document.querySelector(".box3")

function remove(){
    element.remove();
}

arr = [314 , 159];
newarr = [document.querySelector(".number1"),document.querySelector(".number2")];

function increment(i){
    if(i==0){
        arr[0]++ ;
        newarr[0].innerHTML=arr[0];
    }
else if(i==1){
    arr[1]++;
    newarr[1].innerHTML=arr[1];
}
}

function message() {
    alert("The Ninjas have won!");
}
setTimeout(message, 13000);
