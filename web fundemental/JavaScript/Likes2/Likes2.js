var element1 = document.querySelector("#first");
var element2 = document.querySelector("#second");
var element3 = document.querySelector("#third");
var btn1 = document.getElementById("btn1");
var btn2 = document.getElementById("btn2");
var btn3 = document.getElementById("btn3");
var counter1 = 0;
var counter2 = 0;
var counter3 = 0;
btn1.onclick=function(){
    counter1++;
    element1.innerText=counter1;
}
btn2.onclick=function(){
    counter2++;
    element2.innerText=counter2;
}
btn3.onclick=function(){
    counter3++;
    element3.innerText=counter3;
}



