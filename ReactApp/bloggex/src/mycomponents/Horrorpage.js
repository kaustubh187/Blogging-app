import React from 'react'
import BlogPost from './BlogPost'

export const Horrorpage = (props) => {
  let cardarrangement={
    display: "flex"
  }
//   props.bloglist = props.bloglist.filter(function(i){return i.category==="Horror"})
let blogglis = props.bloglist
let horrorlist = blogglis.filter(function(i){return i.category==="Horror"})
 let colarr = {
  display: "inline-block"
 }
  return (
    <div className="container" style={cardarrangement}>
      <div className="card-columns" style = {colarr}>
        {horrorlist.map((Blot)=>{
            return <BlogPost Blot = {Blot} key={Blot.sno}/>
        })}
        </div>
        {/* <BlogPost/> */}
        
    </div>
  )
}
