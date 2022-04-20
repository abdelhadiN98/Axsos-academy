import React from 'react'
// import axios from 'axios';
    
const ProductList = (props) => {
    return (
        <div>
            <h1>All Products :</h1>
            {props.people.map( (person, i) =>
                <p key={i}>{person.title}</p>
            )}
        </div>
    )
}
    
export default ProductList;
