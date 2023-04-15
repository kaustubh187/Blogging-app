import React , { useEffect, useState }  from 'react'
import { useParams } from 'react-router';
import './css/BlogPage.css'
export default function BlogPage({bloglist}) {
    const { id } = useParams();
    window.onbeforeunload = function () {
      window.scrollTo(0, 0);
    }
    const [blog, setBlog] = useState([]);
   useEffect(() => {
      fetch(`http://localhost:8585/api/v1/post/get-post-by-id/${id}`)
         .then((response) => response.json())
         .then((data) => {
            console.log(data);
            setBlog(data);
         })
         .catch((err) => {
            console.log(err.message);
         });
   }, [id]);
   const cvpage={
    backgroundImage: `url(${blog.imgurl})` 
   };
  return (
    <div className='wholepage'>
      <div className="cover-page" style = {cvpage}>
            <div className="heading">
              <h1>{blog.title}</h1>
              <p>{blog.description}</p>
            </div>
      
      </div>
      <div className="content">
      <p>{blog.content}</p>
      </div>
    </div>
  )
}
