import React, { useState } from 'react'
import { useEffect } from 'react';
import axios from 'axios';

const Information = (props) => {
    const [peoples, setPeople] = useState([]);

    useEffect(() => {
        console.log("hiiiii");
        axios.get('https://swapi.dev/api/people/1')
            // .then(response => console.log(response))
            console.log(axios)
            .then(response => setPeople(response.data.results))
            
    }, []);
  return (
    <div>
        <h1>{peoples.name}</h1>
        <p></p>
        <p></p>
        <p></p>
        <p></p>
    </div>
  )
}

export default Information