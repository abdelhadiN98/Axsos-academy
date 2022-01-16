function pizzaOven( crustType , sauseType , chesses , toppings){
    var pizza ={};
    pizza.crustType = crustType;
    pizza.sauseType = sauseType;
    pizza.chesses = chesses;
    pizza.toppings = toppings;
    return pizza;
}
y=pizzaOven( "deep dish" , "traditional" , ["Mozzarella"] , ["pepperoni" , "sausage"]);
console.log(y);

x=pizzaOven( "hand tossed" , "marinara" , ["Mozzarella" , "feta"] , ["mushrooms" , "olives" , "onions"]);
console.log(x);

z=pizzaOven ( "tomato sause" , "cheese" , "fried onion");
console.log(z);

var crustType =[
    "deep dish",
    "hand tossed",
    "thin",
    "gluten free"
]
var sauceType =[
    "traditional",
    "marinara",
    "bbq",
    "meyo"
];
var cheese =[
    "mozzarella",
    "cheddar",
    "feta",
    "swiss cheese",
    "parmesan"
];
var toppings =[
    "pepperoni",
    "sausage",
    "corn",
    "bell peppers",
    "mushrooms"
];
function randomRange(max, min) {
    return Math.floor(Math.random() * max - min) + min;
}

function randomPick(arr) {
    var i = Math.floor(arr.length * Math.random());
    return arr[i];
}

function randomPizza() {
    var pizza = {};
    pizza.crustType = randomPick(crustType);
    pizza.sauceType = randomPick(sauceType);
    pizza.cheeses = [];
    pizza.toppings = [];
    for(var i=0; i<randomRange(4, 1); i++) {
        pizza.cheeses.push(randomPick(cheese));
    }
    for(var i=0; i<randomRange(4, 0); i++) {
        pizza.toppings.push(randomPick(toppings));
    }
    return pizza;
}

console.log(randomPizza());