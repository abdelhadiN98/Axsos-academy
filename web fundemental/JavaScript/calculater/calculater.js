var element=document.querySelector("#display")
var arr=[]
var newarr1=[]
var newarr2=[]

var operation=""
function press(a){
    if(operation==""){
    newarr1.push(a)
    var c=newarr1.join('')
    element.innerText=c
}
else {
    newarr2.push(a)
    var o=newarr2.join('')
    element.innerText=o
}
}
function setOP(operations){
    var b=document.querySelector("#display")
    operation=operations
}

function calculate(){
    if(operation=="*"){
        total= parseInt(newarr1.join(''))*parseInt(newarr2.join(''))
        element.innerText=total
    }
    else if(operation=="/"){
        total=parseInt(newarr1.join(''))/parseInt(newarr2.join(''))
        element.innerText=total
    }
    else if(operation=="+"){
        total=parseInt(newarr1.join(''))+parseInt(newarr2.join(''))
        console.log(newarr1,newarr2)
        element.innerText=total
    }
    else if(operation=="-"){
        total=parseInt(newarr1.join(''))-parseInt(newarr2.join(''))
        element.innerText=total
    }
}
function clr(){
    newarr1=[]
    newarr2=[]
    operation=""
    element.innerText=0
}