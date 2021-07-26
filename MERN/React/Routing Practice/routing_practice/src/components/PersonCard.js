import React from 'react'

function PersonCard({variable, color, backgroundColor}) {
    return (
        <h1 style={{color: color, backgroundColor: backgroundColor}}>
            {isNaN(variable) ? 
                variable==="home"?
                    "Welcome" : "The word is: " + variable
            :  "The number is : " + variable
            }
        </h1>
    )
}

export default PersonCard
