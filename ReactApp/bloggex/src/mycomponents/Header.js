import React from 'react'
import { Link } from 'react-router-dom'
import './css/Header.css'
function Header() {
  return (
    <nav className="navbar">
    
    <ul className="navbar-links">
      <li><a href="#">Menu</a></li>
      {/* <li><a href="#">Genres</a></li>
      <li><a href="#">Contact</a></li> */}
    </ul>
    <div className="navbar-title">LIGHTS OUT!</div>
    <div className="tagline">DISCOVER A WORLD OF IDEAS</div>
  </nav>
  )
}

export default Header