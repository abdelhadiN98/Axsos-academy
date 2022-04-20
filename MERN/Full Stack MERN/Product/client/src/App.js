import React, { useState } from 'react';
import {
  BrowserRouter,
  Switch,
  Route
} from "react-router-dom";
import Main from './views/Main';
import Detail from './views/Detail';
    
function App() {
  return (
    <BrowserRouter>
    <Switch>
        <div className="App">
          <Route exact path="/product">
            <Main />
          </Route>
          <Route path="/product/:id">
            <Detail />
          </Route>
        </div>
      </Switch>
    </BrowserRouter>
  );
}
    
export default App;
