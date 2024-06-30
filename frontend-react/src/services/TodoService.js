import axios from "axios";

const BASE_REST_API_URL = 'http://localhost:8000/api/todos';

export const getAllTodos = () => axios.get(BASE_REST_API_URL)