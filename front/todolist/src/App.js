import React from 'react';
import TodoListTemplate from "./components/js/TodoListTemplate";
import Form from './components/js/Form'
import TodoItemList from "./components/js/TodoItemList";

class App extends React.Component {
    constructor(props) {
        super(props);
        const id = 2;
        this.state = {
            input: "",
            todos: [
                {id: 0, content: '리액트를 공부하자0', isComplete: false },
                {id: 1, content: '리액트를 공부하자1', isComplete: true },
            ]
        }
    }

    render() {
        return (
            <TodoListTemplate form={<Form />}>
                <TodoItemList/>
            </TodoListTemplate>
        );
    }
}

export default App;