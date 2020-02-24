import React from "react";
import {Component} from "react";
import './TopLine.css'

class TopLine extends Component{
    render() {
        return(
            <div className='TopLineComponent'>
                <div className='container'>
                    <div className='row'>

                        {/*HARDCODED */}

                        <div className='col-6'>
                            <ul className='Menu'>
                                <a href="" className='Menu_Item'><li>Home</li></a>
                                <a href="" className='Menu_Item'><li>Events</li></a>
                                <a href="" className='Menu_Item'><li>Saved</li></a>
                                <a href="" className='Menu_Item'><li>Account</li></a>
                            </ul>
                        </div>

                        <div className='col-6'>
                            <a href="#" >Log out</a>
                        </div>
                    </div>
                </div>
            </div>

        );
    }
}

export default TopLine;