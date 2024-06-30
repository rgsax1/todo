import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ListTodoComponent from "./components/ListTodoComponent.jsx";
import HeaderComponent from "./components/HeaderComponent.jsx";
import FooterComponent from "./components/FooterComponent.jsx";

function App() {

  return (
    <>
      <div>
          <HeaderComponent></HeaderComponent>
          <ListTodoComponent></ListTodoComponent>
          <FooterComponent></FooterComponent>
      </div>
    </>
  )
}

export default App
