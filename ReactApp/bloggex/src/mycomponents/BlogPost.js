import React from "react";
import { Link } from "react-router-dom";
import "./css/BlogPost.css";
export default function BlogPost({ Blot }) {
  return (
    <div className="cardcon">
      <div class="card">
        <img src="https://nu.aeon.co/images/8b2ea138-4f8f-48b3-aeee-807de302c95e/card_essay-final-nyc19477.jpg"  class="card-img"></img>
        <div class="card-info">
          <p class="text-title">The space between us</p>
          <p class="text-body">{Blot.desc}</p>
        </div>
        <div class="card-footer">
          <div class="text-title">{Blot.author}</div>
        </div>
      </div>
    </div>
  );
}
