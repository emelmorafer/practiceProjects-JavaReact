import React, { Component } from 'react';

class classComponent extends Component {
  constructor() {
    super();
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState((prevState) => ({
      count: prevState.count + 1
    }));
  };

  decrement = () => {
    this.setState(prevState => ({
      count: prevState.count - 1
    }));
  };

  render() {
    return (
      <div>
        <p>Count: {this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        {/*     
        Hacerlo de esta manera es incorrecto. Están modificando directamente el estado, lo cual no dispara una re-renderización del componente. 
        React necesita que uses this.setState para saber que debe actualizar el componente.
        
        <button onClick={() => this.state.count++}>Increment</button>
        <button onClick={() => this.state.count--}>Decrement</button>
        */}

      </div>
    );
  }
}

export default classComponent;

