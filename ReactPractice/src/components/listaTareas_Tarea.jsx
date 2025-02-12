import { useState } from 'react'

function listaTarea_Tarea({tareaProp,deleteTareaProp,editTareaProp}) {

    const {idTarea,nombre,price} = tareaProp

  return (
    <>
      <div style={{color: 'red', padding: '10px 20px', width: '10%', display: 'flex'}}>

          <span style={{whiteSpace: 'pre' }}>
          | id: {idTarea}  | nombre: {nombre}  | price: {price}  | 
          </span>
          <button onClick={() => editTareaProp(idTarea)}> 
            Editar
          </button>
          <button onClick={() => deleteTareaProp(idTarea)}> 
            Eliminar
          </button>
      </div>
    </>
  )
}

export default listaTarea_Tarea