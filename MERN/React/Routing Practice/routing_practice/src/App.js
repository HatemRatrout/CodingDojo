import logo from './logo.svg';
import { Router } from '@reach/router';
import './App.css';
import PersonCard from './components/PersonCard';

function App() {
  return (
    <div className = "App">
      <Router>
            <PersonCard path="/:variable"/>
            <PersonCard path="/:variable/:color/:backgroundColor"/>

        </Router>

    </div>
  );
}

export default App;
