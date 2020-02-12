import React, {Component} from 'react';
import './AppNavbar.css'

export default class AppNavbar extends Component {
    constructor(props) {
        super(props);
        this.state = {isOpen: false};
        this.toggle = this.toggle.bind(this);
    }

    toggle() {
        this.setState({
            isOpen: !this.state.isOpen
        });
    }

    render() {
        return (
            <div className='AppNavbar'>
                <div className='container'>
                    <div className='row'>
                        <div className="col">
                            <ul className='menu'>
                                <li className='menu_item'><a href="#">Home</a></li>
                                <li className='menu_item'><a href="#">Events</a></li>
                                <li className='menu_item'><a href="#">Account</a></li>
                            </ul>
                        </div>
                        <div className="col">
                            <ul className='menu menu-right-align'>
                                <li className='menu_item'><a href="#">Log out</a></li>
                            </ul>
                        </div>

                    </div>
                </div>


            </div>

        )

    }
}