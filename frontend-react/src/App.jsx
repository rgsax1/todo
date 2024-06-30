import './App.css'
import ListTodoComponent from "./components/ListTodoComponent.jsx";
import HeaderComponent from "./components/HeaderComponent.jsx";
import FooterComponent from "./components/FooterComponent.jsx";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import TodoComponent from "./components/TodoComponent.jsx";

function App() {

    return (
        <>

            <BrowserRouter>
                <HeaderComponent/>
                <Routes>
                    <Route path="/" element={<ListTodoComponent/>}/>
                    <Route path="/todos" element={<ListTodoComponent/>}/>
                    <Route path='/add-todo' element={<TodoComponent/>}></Route>
                </Routes>
                <FooterComponent/>
            </BrowserRouter>

        </>
    )
}

export default App
