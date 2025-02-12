import { useState,useEffect } from 'react'

const Message = () => {
  useEffect(() => {
    const timer = setTimeout(() => {
      console.log('Se ejecuta timeout de Message');
    }, 5000);
  
    // Función de limpieza que se ejecuta cuando el componente se desmonta
    return () => {
      clearTimeout(timer);
      console.log('Se ejecuta funcion de limpieza de Message');
    };
  }, []); // Dependencias vacías para ejecutar solo una vez
  
  return <p>This message will disappear in 5 seconds.</p>;
};

function unmount() { 
  const [showMessage, setShowMessage] = useState(true)
  
  useEffect(() => {
    const timer = setTimeout(() => {
      console.log('Se ejecuta timeout');
      setShowMessage(false);
    }, 5000);
  
    return () => {
      console.log('Se ejecuta funcion de limpieza');
      clearTimeout(timer);
      
    };
  }, []);
  
  return (
    /* Si showMessage es true, se renderiza el componente Message */
    <div>
      {showMessage && <Message />}  
    </div>
  );
}    
export default unmount