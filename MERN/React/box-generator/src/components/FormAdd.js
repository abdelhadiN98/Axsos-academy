import React,{useState} from 'react'

const FormAdd = (props) => {
    const [add,setAdd]=useState("");
    // var array=[];
    const createBox=(e)=>{
        e.preventDefault();
        // array.push(add);
        props.onAddBox(add);
    }
    const handleAdd=(e)=>{
        setAdd(e.target.value)
    }

  return (
    <div>
        <h1>color</h1>
        <form onSubmit={createBox}>
        <input type="text" onChange={handleAdd} />
        <input type="submit" value="Add"/>
        </form>
    </div>
  )
}

export default FormAdd