import { useState,useEffect } from 'react'
import SearchProduct_Product from './searchProduct_Product'

function searchProduct() {

  const[productList, setProductList] = useState([
    {id: 1, name: "leche", price: 20}, {id: 2, name: "carne", price: 30}, {id: 3, name: "arroz", price: 10}, {id: 4, name: "pan", price: 25}
  ])

  const[filterText, setFilterText] = useState("")


  const filterProductList = productList.filter(product => product.name.includes(filterText))


  return (
    <>
      <div>
      <input id="filtro" placeholder="Filtro" type='text'
          value={filterText} onChange={(e) => setFilterText(e.target.value)}/>
        <br/><br/>
      </div>

      {filterProductList.map((product) => (
        <SearchProduct_Product key={product.id} productProp={product}/>
      ))}
    </>
  )
}

export default searchProduct

