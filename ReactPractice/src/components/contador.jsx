import { useState,useEffect } from 'react'

function contador() {

  const[numCount, setNumCount] = useState(0)
  const[running, setRunning] = useState(true);

  useEffect(() => {
    if (running) {
      const interval = setInterval(() => {
        setNumCount(prevCount => prevCount + 1);
      }, 1000);
      return () => clearInterval(interval);
    }
  }, [running]);

  /*
  return () => clearInterval(interval);

  Esta línea de código es una función de limpieza (cleanup function) en el hook useEffect. La función de limpieza se ejecuta en dos momentos específicos:

  1) Cuando el componente se desmonta: Esto ocurre cuando el componente deja de ser renderizado, por ejemplo, cuando el usuario navega a otra página.
  2) Antes de ejecutar el useEffect de nuevo: Esto ocurre si alguna de las dependencias del useEffect cambia antes de que el componente se desmonte.

  clearInterval es una función de JavaScript que se usa para detener un intervalo que fue previamente configurado con setInterval.
  */


  /*
  //Esta es otra forma mas sencilla en la cual podriamos hacer el ejercicio
  setTimeout(() => {
    if (running) {
        setNumCount(prevCount => prevCount + 1);
    }
  }, 1000);
  */


  const stopCounter = () => {
    console.log("se detiene contador");
    setRunning(false)
  }

  return (
    <>
      <div>
        <a >Numero: {numCount}</a>

        <button onClick={(e) => {stopCounter()}}> 
          Stop Counter
        </button>

      </div>
    </>
  )
}

export default contador

