import React from 'react';
import './App.css';
import Person from './Person/Person'
import AppNavbar from "./AppNavbar/AppNavbar";

class App extends React.Component {

    state = {
        persons: [
            {name: 'Alex', age: 18},
            {name: 'Den', age: 23},
            {name: 'Ben', age: 14}
        ]
    }

    switchNameHandler = (newName) =>{
        // console.log('Was clicked!');
        // WON`T WORK !!!  this.state.persons[0].name = 'Maximilian;'

        this.setState({
            persons: [
                {name: newName, age: 38},
                {name: 'Den', age: 23},
                {name: 'Anna', age: 22}
            ]
        })
    }

    togglePersonsHandler = () => {

    }

    nameChangedHandler = (event) => {
        this.setState({
            persons: [
                {name: 'Alex', age: 38},
                {name: event.target.value, age: 23},
                {name: 'Anna', age: 22}
            ]
        })
    }

    render() {
        return (
            <div className="App">
                <AppNavbar/>
                <header className="App-header">
                    <h1>Hi everyone Guys</h1>
                    <button onClick={ (event) => this.switchNameHandler('yep')} className='btn, button'>Switch Name</button>

                    <Person name={this.state.persons[0].name} age={this.state.persons[0].age} />

                    <Person name={this.state.persons[1].name} age={this.state.persons[1].age} click={this.switchNameHandler.bind(this, 'Korish')} changed = {this.nameChangedHandler}/>
                    <Person name={this.state.persons[2].name} age={this.state.persons[2].age}/>
                </header>
            </div>
        );
        // return React.createElement("div", {className : "App"}, "h2", "sdjknvjksdnvsdnv");
    }

}

export default App;
