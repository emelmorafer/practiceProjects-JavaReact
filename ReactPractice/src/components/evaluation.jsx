import { useState,useEffect } from 'react'

function contador2() {

  const[numCount, setNumCount] = useState(42)

  const incrementCounter = () => {
      setNumCount(numCount + 1)
  } 

  return (
      <>
          <div>
              <h2 className="counter">{numCount}</h2>
          </div>
          <button className="counter-button" onClick={(e) => {incrementCounter()}}>
              Click
          </button>
          <style>{`
              .counter-button {
                  font-size: 1rem;
                  padding: 5px 10px;
                  color:  #585858;
              }
          `}</style>
      </>
  );
}

export default contador2

