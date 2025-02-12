import { useState,useEffect } from 'react'
import SearchProduct_Product from './searchProduct_Product'

function promise() {

/*__________________________________________________________________________________________________________
Ejercicio 1: Simulación de una Llamada a una API
Descripción: Escribe una función fetchData que simule una llamada a una API. 
La función debe devolver una promesa que se resuelve después de 2 segundos con 
un objeto de datos simulado. Luego, usa esta función para imprimir los datos recibidos en la consola.
*/

  function fetchData() {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        const data = { id: 1, name: 'John Doe', age: 25 };
        resolve(data);
      }, 2000);
    });
  }
  
  fetchData()
    .then(data => {
      console.log('Datos recibidos:', data);
    })
    .catch(error => {
      console.error('Error:', error);
    });


/*__________________________________________________________________________________________________________
Ejercicio 3: Promesas en Paralelo con Promise.all
Descripción: Escribe una función fetchMultipleData que simule la obtención de datos desde tres fuentes diferentes. 
Cada llamada a la API debe resolverse en diferentes tiempos (por ejemplo, 1 segundo, 2 segundos y 3 segundos). 
Usa Promise.all para esperar a que todas las promesas se resuelvan y luego imprime los resultados en la consola.
*/

function fetchDataFromSource1() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ source: 1, data: 'Data from source 1' });
    }, 1000);
  });
}

function fetchDataFromSource2() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ source: 2, data: 'Data from source 2' });
    }, 2000);
  });
}

function fetchDataFromSource3() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ source: 3, data: 'Data from source 3' });
    }, 3000);
  });
}

function fetchMultipleData() {
  return Promise.all([fetchDataFromSource1(), fetchDataFromSource2(), fetchDataFromSource3()]);
}

fetchMultipleData()
  .then(results => {
    console.log('Datos recibidos:', results);
  })
  .catch(error => {
    console.error('Error:', error);
  });


/*__________________________________________________________________________________________________________
Ejercicio 4: Encadenamiento de Promesas con Manejo de Errores
Descripción: Escribe una función getDataAndProcess que primero obtenga datos simulando una llamada a una API, 
luego procese esos datos y finalmente maneje cualquier error que pueda ocurrir en cualquier etapa del proceso.
*/

function fetchData() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ id: 1, name: 'Jane Doe' });
    }, 1000);
  });
}

function processData(data) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (data.id === 1) {
        resolve({ ...data, processed: true });
      } else {
        reject(new Error('Invalid data'));
      }
    }, 1000);
  });
}

function getDataAndProcess() {
  fetchData()
    .then(data => {
      console.log('Datos recibidos:', data);
      return processData(data);
    })
    .then(processedData => {
      console.log('Datos procesados:', processedData);
    })
    .catch(error => {
      console.error('Error:', error);
    });
}

getDataAndProcess();




  return (
    <>
      <div style={{color: 'red', padding: '10px 20px', width: '10%'}}>
        <a >ejecucion promesa</a>
      </div>
    </>
  )
}

export default promise

