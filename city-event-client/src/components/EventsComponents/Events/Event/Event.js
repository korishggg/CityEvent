import React from "react";

const event = (props) => {



    // console.log(props.eventData)


    return (
        <div className="card">
            <img src="..." className="card-img-top" alt="Some Photo"/>
            <div className="card-body">
                <h5 className="card-title">{props.eventData.eventName}</h5>
                <p className="card-text">{props.eventData.description}</p>
            </div>
            {/*<ul className="list-group list-group-flush">*/}
            {/*    <li className="list-group-item">Cras justo odio</li>*/}
            {/*    <li className="list-group-item">Dapibus ac facilisis in</li>*/}
            {/*    <li className="list-group-item">Vestibulum at eros</li>*/}
            {/*</ul>*/}
            <div className="card-body">
                <a href="#" className="card-link">Go to the Event</a>
            </div>
        </div>

    );
}

export default event;