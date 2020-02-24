import React from "react";

let layout = (props)=> {

    return (

        <div className="container">
            <div className="row">
                {props.children}
            </div>
        </div>
    )

}
export default layout;