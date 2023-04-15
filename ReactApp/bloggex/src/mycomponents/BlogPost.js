import React from "react";
import { Link } from "react-router-dom";
import "./css/BlogPost.css";
export default function BlogPost({ Blot }) {
  return (
    <div className="cardcon">
      <Link to={`/blog/${Blot.postid}`} style={{ textDecoration: 'none' }}>
      <div className="card">
        <img src={Blot.imgurl} className="card-img"></img>
        <div className="card-info">
          <p className="text-title">{Blot.title}</p>
          <p className="text-body">{Blot.description}</p>
        </div>
        <div className="card-footer">
          <div className="text-title">{Blot.authorname}</div>
        </div>
      </div>
      </Link>
    </div>
  );
}
