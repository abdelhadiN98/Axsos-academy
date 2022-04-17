import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter,
  Switch,
  Route,
  Link 
} from "react-router-dom";
import Display from './components/Display';
import { useState } from 'react';
import Information from './components/Information';

function App() {
  const [recieveoption , setRecieveoption] = useState("");
  const [recievrid , setRecievrid] = useState("");
  const handleSearch=(newOption)=>{
    setRecieveoption(newOption)
  }
  const handleSearch2=(newId)=>{
    setRecievrid(newId)
  }
  return (
    <BrowserRouter>
    <Switch>
      <Route exact path="/">
        <Display myFun={handleSearch} myFun2={handleSearch2} />
      </Route>
      <Route exact path="/information">
        <Information category={recieveoption} id={recievrid} />
      </Route>
    </Switch>
  </BrowserRouter>
  );
}

export default App;
