import { useState } from 'react'
import Tarea from './listaTareas_Tarea'

function filtroTareas() {

  const [listaTareas, setListaTareas] = useState([])

  const[idTarea, setIdTarea] = useState(0)
  const[nombreForm, setNombreForm] = useState("")
  const[priceForm, setPriceForm] = useState(0)

  const[filterText, setFilterText] = useState("")

  const handleSubmit = (e) => {
    e.preventDefault();
    setIdTarea(idTarea + 1)

    const objetoTarea = {idTarea: idTarea, nombre: nombreForm, price: priceForm}

    setListaTareas([...listaTareas, objetoTarea])

    console.log(listaTareas);

  }

  const deleteTarea = (idTarea) => {
    setListaTareas(prevLista => 
      prevLista.filter(tarea => tarea.idTarea !== idTarea)
    );

  } 

  const filteredTasks = listaTareas.filter(tarea => tarea.nombre.includes(filterText));

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
          <button type="submit"> 
            Añadir Tarea 
          </button>
        </form>
        <br/><br/>

        <label>
          Filtro
        </label>
        <input id="filtro" placeholder="Filtro" type='text'
          value={filterText} onChange={(e) => setFilterText(e.target.value)}/>
        <br/><br/>

        {filteredTasks.map((tarea) => (
          <Tarea key={tarea.idTarea} tareaProp={tarea} deleteTareaProp={deleteTarea}/>
        ))}

      </div>
    </>
  )
}

export default filtroTareas

