var element =document.querySelector("#end");

function remove(){
    element.remove();
}

temp=[24,18,27,19,21,16,26,21];
function change(temperature){
    if(temperature.value=="cel"){
        for(var i=0 ; i<temp.length ; i++){
            document.getElementById(`temp${i}`).innerText=temp[i]+"°";
        }

    }
    else{(temperature.value=="feh")
        for(var i=0 ; i<temp.length ; i++){
            document.getElementById(`temp${i}`).innerText=
            Math.floor(temp[i]*(9/5)+32)+"°" ;
    }
    }
}