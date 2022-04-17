import React, { useState } from 'react'
import { useHistory } from "react-router-dom";


const Display = (props) => {
    const [option,setOption] = useState("");
    const [id,setId] = useState("");
    const history = useHistory();
    

    const sendInfo = (e) => {
        e.preventDefault();
        props.myFun(option)
        props.myFun2(id)

        // do something with the data
        history.push("/information");
      }
  return (
    <div>
        <form onSubmit={ sendInfo }>
        <label>Search for : 
            <select value={option} onChange={e => setOption(e.target.value)}>
                <option value="People">People </option>
                <option value="Planets">Planets </option>
                <option value="Starships">Starships </option>
            </select>
        </label>
        <label>ID : 
            <input type="text" placeholder='id' onChange={ (e) => setId(e.target.value) } value={id }/>
        </label>
        <input type="submit" value="Search"/>
        </form>
    </div>
  )
}

export default Display