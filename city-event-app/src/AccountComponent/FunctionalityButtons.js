import React from 'react';
import TopLine from "./TopLineComponent/TopLine";

class FunctionalityButtons extends React.Component {
    render() {
        return (

            <div>
                <ul>
                    <li><button type="button" className="btn btn-secondary btn-lg btn-block">Create Event</button></li>
                    <li><button type="button" className="btn btn-secondary btn-lg btn-block">Edit {UserName}</button></li>
                    <li><button type="button" className="btn btn-secondary btn-lg btn-block">Check Booked Tickets</button></li>
                    <li><button type="button" className="btn btn-secondary btn-lg btn-block">Check Booked Tickets</button></li>
                </ul>
            </div>

        )
    }
}

export default FunctionalityButtons;
