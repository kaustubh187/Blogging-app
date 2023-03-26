import React , { useEffect, useState }  from 'react'
import Header from './Header'
import { useParams } from 'react-router';
export default function BlogPage({bloglist}) {
    let titlestyle={
        position:"relative",
        top:"10vh",
        backgroundColor:"red",
        width:"80vh",
        left:"65vh",
        height:"15vh",
    }
    const { id } = useParams();
    const [blog, setBlog] = useState({});

    useEffect(() => {
        let blog = bloglist.find((blog) => blog.sno === parseInt(id));
        if (blog) {
          setBlog(blog);
        }
      }, [bloglist,id]);

  return (
    <div>
        <Header/>
        
        <div className="title" style ={titlestyle}>
            <h1>{blog.title}</h1>
            <h4>{blog.author}</h4>
            <h4>Date created</h4>
        </div>
        <div className="bod" style={{position:"relative",top:"100px",alignContent:"left" ,width:"140vh",margin:"auto"}}>
            <p>{blog.desc}</p>
        </div>
    
    </div>
  )
}
