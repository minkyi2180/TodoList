import React from "react";
import './TodoItem.css';

class TodoItem extends React.Component{
    // shouldComponentUpdate(nextProps, nextState){
    //     return this.props.isComplete !== nextProps.isComplete;
    // }
    render(){
        const{content, isComplete , id, onToggle, onRemove}= this.props;
        console.log(id);

        return(
            <div className="todo-item" onClick={()=>onToggle(id)}>
                <div className="todo-item-remove" onClick={(e)=>{
                    e.stopPropagation();
                    onRemove(id) 
                }}> 
                    &times;
                </div>
                <div className={`todo-item-text ${isComplete && 'isComplete'}`}>
                    <div>
                        {content}
                    </div>
                </div>
                
                {
                    isComplete && (<div className="isComplete-mark"></div>)
                }   
            </div>
        )
    }
}
export default TodoItem;