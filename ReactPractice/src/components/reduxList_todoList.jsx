// TodoList.js
import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { toggleTodo, deleteTodo } from './reduxList_actions';

const TodoList = () => {
  const todos = useSelector((state) => state.todos);
  const dispatch = useDispatch();

  return (
    <ul>
      {todos.map((todo) => (
        <li key={todo.id} style={{ textDecoration: todo.completed ? 'line-through' : 'none' }}>
          {todo.text}
          <button onClick={() => dispatch(/*toggleTodo(todo.id)*/ {type: 'TOGGLE_TODO', payload: todo.id})}>
            {todo.completed ? 'Undo' : 'Complete'}
          </button>
          <button onClick={() => dispatch(/*deleteTodo(todo.id)*/ {type: 'DELETE_TODO', payload: todo.id})}>Delete</button>
        </li>
      ))}
    </ul>
  );
};

export default TodoList;