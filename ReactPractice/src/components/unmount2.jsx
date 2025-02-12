import { useState,useEffect } from 'react'

function MyComponent() {
  useEffect(() => {
    console.log('Componente montado');
    
    return () => {
      console.log('Componente desmontado');
    };
  }, []); // Dependencias vacías para ejecutar solo una vez
  
  return <div>My Component</div>;
};

function unmount2() { 
  const [showComponent, setShowComponent] = useState(true)
  
  return (
    <div>
      <button onClick={() => setShowComponent(!showComponent)}>
        Component
      </button>
      {showComponent && <MyComponent />}  
    </div>
  );
}    
export default unmount2