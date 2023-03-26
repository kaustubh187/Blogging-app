import React from 'react'
import BlogPost from './BlogPost'
import './css/Posts.css'
export const Posts = (props) => {
  let cardarrangement={
    display: "flex"
  }
  

  return (
    <div>
      <div className="card-col">
        {props.bloglist.map((Blot)=>{
            return <BlogPost Blot = {Blot} key={Blot.sno}/>
        })}
        </div>
        {/* <BlogPost/> */}
        
    </div>
  )
}
