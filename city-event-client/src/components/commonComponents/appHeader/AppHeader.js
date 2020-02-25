import React from "react";
import {Component} from "react";
import './AppHeader.css'
import {NavLink} from "react-router-dom";

class AppHeader extends Component{

    render() {
        return(
            <div className='AppHeaderComponent'>
                <div className='container'>
                    <div className='row'>

                        <div className='col-8'>
                            <ul className='Menu'>
                                <li>
                                    <NavLink exact activeClassName="active" to="/">
                                        Home
                                    </NavLink>
                                </li>
                                <li>
                                    <NavLink exact activeClassName="active" to="/events">
                                        Events
                                    </NavLink>
                                </li>
                                <li>
                                    <NavLink exact activeClassName="active" to="/saved">
                                        Saved
                                    </NavLink>
                                </li>
                                <li>
                                    <NavLink exact activeClassName="active" to="/account">
                                        Account
                                    </NavLink>
                                </li>
                                <li>
                                    <NavLink exact activeClassName="active" to="/contact">
                                        Contact
                                    </NavLink>
                                </li>
                            </ul>
                        </div>

                        <div className='col-4'>

                            <a href="#" >Log out</a>
                        </div>
                    </div>
                </div>
            </div>

        );
    }
}

export default AppHeader;