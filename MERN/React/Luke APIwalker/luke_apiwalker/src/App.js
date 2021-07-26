import logo from './logo.svg';
import { Router } from '@reach/router';
import './App.css';
import Search from './components/Search';

function App() {
  return (
    <div className = "App">
      <div className="search"> 
      Search for : 
      <select name="starwars" id="starwars">
        <option value="people">People</option>
        <option value="planets">Planets</option>
      </select>
      ID : 
      <input size="6"></input>
      <button className="button">Search</button>
      </div>
    </div>
  );
}

export default App;
