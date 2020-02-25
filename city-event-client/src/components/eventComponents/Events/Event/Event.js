import React from "react";

const event = (props) => {

    return (
        <div className="card">
            <img src="..." className="card-img-top" alt="Some Photo"/>
            <div className="card-body">
                <h5 className="card-title">{props.eventData.eventName}</h5>
                <p className="card-text">{props.eventData.description}</p>
            </div>
            <div className="card-body">
                <a href="#" className="card-link">Go to the Event</a>
            </div>
        </div>

    );
}

export default event;