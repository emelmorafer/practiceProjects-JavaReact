// store.js
import { createStore } from 'redux';
import todoReducer from './reduxList_reducers';

const store = createStore(todoReducer);

export default store;