// App.js
import React from 'react';
import { Provider } from 'react-redux';
import store from './reduxList_store';
import TodoList from './reduxList_todoList';
import AddTodo from './reduxList_addTodo';

const App = () => {
  return (
    <Provider store={store}>
      <div>
        <h1>To-Do List</h1>
        <AddTodo />
        <TodoList />
      </div>
    </Provider>
  );
};

export default App;