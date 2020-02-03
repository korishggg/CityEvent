import React, { Component } from 'react'

class Form extends Component {

    handleChange = event => {
        const { name, value } = event.target

        this.setState({
            [name]: value,
        })
    }

    submitForm = () => {
        this.props.handleSubmit(this.state)
        this.setState(this.initialState)
    }

    constructor(props) {
        super(props)
        this.initialState = {
            name: '',
            job: '',
        }

        this.state = this.initialState
    }

    render() {
        const { name, job } = this.state;

        return (
            <form>
                <br/>
                <label htmlFor="name">Name</label>
                <br/>
                <input type="text" name="name" id="name" value={name} onChange={this.handleChange} />
                <br/>
                <label htmlFor="job">Job</label>
                <br/>
                <input type="text" name="job" id="job" value={job} onChange={this.handleChange} />
                <br/>
                <input type="button" value="Submit" onClick={this.submitForm} />
            </form>
        );
    }
}

export default Form;