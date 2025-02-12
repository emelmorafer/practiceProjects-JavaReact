import { useState } from 'react'

function searchProduct_Product({productProp}) {

    const {id,name,price} = productProp

  return (
    <>
      <div style={{color: 'red', padding: '10px 20px', width: '10%'}}>
        <a >{id}____{name}</a>
        <p>{price}</p> 
      </div>
    </>
  )
}

export default searchProduct_Product