import React, {Component} from 'react';
import Table from './Table'
import './App.css';
import Form from "./Form";

class App extends Component {
    state = {
        characters: [],
        data: []
    }

    componentDidMount() {
        const url = 'http://localhost:8082/api/events'

        fetch(url)
            .then(result => result.json())
            .then(result => {
                this.setState({
                    data: result,
                })
            })
    }

    removeCharacter = index => {
        const { characters } = this.state

        this.setState({
            characters: characters.filter((character, i) => {
                return i !== index
            }),
        })
    }

    handleSubmit = character => {
        this.setState({ characters: [...this.state.characters, character] })
    }

    render() {

        const { characters } = this.state

        return (
            <div className="container">
                <div className="row">
                    <Table characterData={characters} removeCharacter={this.removeCharacter}  />
                    <Form handleSubmit={this.handleSubmit} />
                </div>
            </div>
        )
    }
}

export default App;
