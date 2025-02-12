import { useState } from 'react'
import Tarea from './listaTareas_Tarea'

function listaTareas() {

  const [listaTareas, setListaTareas] = useState([])

  const[idTarea, setIdTarea] = useState(0)
  const[nombreForm, setNombreForm] = useState("")
  const[priceForm, setPriceForm] = useState(0)

  const[idTareaEdit, setIdTareaEdit] = useState(null)

  const handleSubmit = (e) => {
    e.preventDefault();
    const idObjetonuevo = idTarea + 1
    setIdTarea(idObjetonuevo)
    const objetoTarea = {idTarea: idObjetonuevo, nombre: nombreForm, price: priceForm}

    setListaTareas([...listaTareas, objetoTarea])
    console.log(listaTareas);
  }

  const editTarea = (idTarea) => {
    const editTarea = listaTareas.find(tarea => tarea.idTarea === idTarea)
    setNombreForm(editTarea.nombre)
    setPriceForm(editTarea.price) 
    setIdTareaEdit(idTarea)
  }   

  const updateTarea = () => {
    const tareaUpdated = {idTarea: idTareaEdit, nombre: nombreForm, price: priceForm}

    const newListaTareas = listaTareas.map(tarea => 
      tarea.idTarea === idTareaEdit ? { ...tarea, ...tareaUpdated } : tarea
    );
    setListaTareas(newListaTareas);
    setNombreForm('')
    setPriceForm(0)
    setIdTareaEdit(null)
  }  

  const deleteTarea = (idTarea) => {
    setListaTareas(prevLista => 
      prevLista.filter(tarea => tarea.idTarea !== idTarea)
    );
  } 

  return (
    <>
      <div>
        <form onSubmit={handleSubmit}>
          <label>
            Nombre
          </label>
          <input id="nombre" placeholder="Nombre" type='text'
            value={nombreForm} onChange={(e) => setNombreForm(e.target.value)}/>
          <br/>
          <label>
            Price
          </label>
          <input id="price" placeholder="price" type='number'
            value={priceForm} onChange={(e) => setPriceForm(e.target.value)}/>
          <br/>
          
          { 
            idTareaEdit==null ? (
              <button type="submit">Añadir Tarea</button>
            ) : (
              <button onClick={(e) => {e.preventDefault(); updateTarea();}}>Update Tarea</button>
            )
          }
          
        </form>
        <br/><br/>

        {listaTareas.map((tarea) => (
          <Tarea key={tarea.idTarea} tareaProp={tarea} deleteTareaProp={deleteTarea} editTareaProp={editTarea}/>
        ))}

      </div>
    </>
  )
}

export default listaTareas