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