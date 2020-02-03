import React from 'react';

function TopLine() {
    return (
        <div>
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">

                <div className="container">
                    <div className="row">

                        <div className="collapse navbar-collapse">
                            <ul className="navbar-nav mr-auto">
                                <li className="nav-item active">
                                    <a className="nav-link" href="#">Home <span className="sr-only">(current)</span></a>
                                </li>

                                <li className="nav-item">
                                    <a className="nav-link" href="#">Events</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#">Log in</a>
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>

            </nav>
        </div>

    );
}

export default TopLine;
