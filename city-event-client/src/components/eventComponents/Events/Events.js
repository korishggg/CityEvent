import React from "react";
import {Component} from "react";
import EventAPIService from "../../../services/EventAPIService";
import './Events.css'
import Event from "./Event/Event";


class Events extends Component{

    state = {
        events: this.loadEvents(),
        isEventsLoaded: false,
    }

    constructor(props) {
        super(props);
    }

    loadEvents() {
        console.log("loading events")
        let events = null;
        EventAPIService.fetchEvents()
            .then(response => {
                events = response.data._embedded.events
                this.setState({
                    events: events,
                    isEventsLoaded: true
                })
            })
    }

    render(){

        let events = null;
        if (this.state.isEventsLoaded){
            events = this.state.events.map((event, index )=> {
                return <Event key={index} eventData={event}/>
            })
        }else {
            events = <h1>Event`s cannot be loaded</h1>
        }

        return(
            <div>
                {events}
            </div>
        );
    }
}

export default Events;