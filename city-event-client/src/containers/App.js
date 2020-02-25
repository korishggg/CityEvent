import React from 'react'
import {BrowserRouter as Router, NavLink, Route, Switch} from "react-router-dom";
import Users from "./users";
import Contact from "./contact";
import Notfound from "./notfound";
import AppHeader from "../components/commonComponents/appHeader/AppHeader";
import Saved from "../components/savedCompnents/Saved";
import Events from "../components/eventComponents/Events/Events";
import Account from "../components/accountCompnents/Saved";
import Login from "../components/commonComponents/login/Login";
import Registration from "../components/commonComponents/signUp/Registration";
import InfoAndPostsComponents from "../components/InfoAndPostsComponents/InfoAndPostsComponents";

class App extends React.Component {

    render() {
        return (
            <div>

                <Router>
                    <AppHeader/>
                    <div className='container'>
                        <div className='row'>
                            <Switch>
                                <Route exact path="/" component={InfoAndPostsComponents}/>
                                <Route path="/events" component={Events}/>
                                <Route path="/saved" component={Saved}/>
                                <Route path="/users" component={Users}/>
                                <Route path="/account" component={Account}/>
                                <Route path="/contact" component={Contact}/>
                                <Route path="/login" component={Login}/>
                                <Route path="/registration" component={Registration}/>
                                <Route component={Notfound}/>
                            </Switch>
                        </div>
                    </div>

                </Router>
            </div>
        )
    }
}

export default App;

// const routing = (
//     <Router>
//         <div>
//             <ul>
//                 <li>
//                     <NavLink exact activeClassName="active" to="/">
//                         Home
//                     </NavLink>
//                 </li>
//                 <li>
//                     <NavLink activeClassName="active" to="/users">
//                         Users
//                     </NavLink>
//                 </li>
//                 <li>
//                     <NavLink activeClassName="active" to="/contact">
//                         Contact
//                     </NavLink>
//                 </li>
//             </ul>
//             <hr />
//             <Switch>
//                 <Route exact path="/" component={App} />
//                 <Route path="/users" component={Users} />
//                 <Route path="/contact" component={Contact} />
//                 <Route component={Notfound} />
//             </Switch>
//         </div>
//     </Router>
// )




