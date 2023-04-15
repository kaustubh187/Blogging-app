import React, { useState, useEffect } from 'react';
import "./App.css";
import Header from "./mycomponents/Header";
import Footer from "./mycomponents/Footer";
import Tronso from "./mycomponents/Tronso";
import { Posts } from "./mycomponents/Posts";
import { Horrorpage } from "./mycomponents/Horrorpage";
import {
  // BrowserRouter as Router,
  Routes,
  Route,
} from "react-router-dom";
import { Bloglist } from "./config/data";
import BlogPage from "./mycomponents/BlogPage";


function App() {
  const [posts, setPosts] = useState([]);
   useEffect(() => {
      fetch('http://localhost:8585/api/v1/post/all')
         .then((response) => response.json())
         .then((data) => {
            // console.log(data);
            setPosts(data);
         })
         .catch((err) => {
            // console.log(err.message);
         });
   }, []);
  return (
    <div className="App">
      <Routes>
        <Route
          path="/"
          element={[
            <Header />,
            <Tronso />,
            <Posts bloglist={posts} />,
            <Footer />,
          ]}
        >
        </Route>
        <Route path="/blog/:id" element={[<BlogPage bloglist={Bloglist} />, <Footer />]} />
        <Route
          path="/horror"
          element={[<Header />, <Horrorpage bloglist={Bloglist} />, <Footer />]}
        ></Route>
      </Routes>
    </div>
  );
}

export default App;
