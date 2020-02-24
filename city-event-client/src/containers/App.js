import React from 'react';
import './App.css';
import TopLine from '../components/TopLineComponents/TopLine'
import Events from "../components/EventsComponents/Events/Events";
import Layout from "../commonElements/Layout/Layout"

class App extends React.Component {


    constructor() {
        super();
    }

    render() {
        return (
            <div>
                <TopLine/>
                <Layout>
                    <Events/>
                </Layout>
            </div>
        );
    }
}

export default App;




