import React from 'react'
import { Link } from 'react-router-dom'
function Header() {
  return (
    <div>
       <nav className="navbar navbar-expand-lg navbar-light bg-light">
  <Link className="navbar-brand" to="/">Blogging App</Link>
  <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span className="navbar-toggler-icon"></span>
  </button>

  <div className="collapse navbar-collapse" id="navbarSupportedContent">
    <ul className="navbar-nav mr-auto">
      <li className="nav-item active">
        <Link className="nav-link" to="/">Home<span className="sr-only">(current)</span></Link>
      </li>
      <li className="nav-item">
        <Link className="nav-link" to={`/horror`}>Horror</Link>
      </li>
      <li className="nav-item">
        <a className="nav-link" href="#">Action</a>
      </li>
      <li className="nav-item">
        <a className="nav-link" href="#">Thriller</a>
      </li>
    </ul>
    <form className="form-inline my-2 my-lg-0">
      <input className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"/>
      <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

    </div>
  )
}

export default Header