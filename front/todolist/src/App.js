import React from 'react';
import TodoListTemplate from "./components/js/TodoListTemplate";
import Form from './components/js/Form'
import TodoItemList from "./components/js/TodoItemList";

class App extends React.Component {
    render() {
        return (
            <TodoListTemplate form={<Form />}>
                <TodoItemList/>
            </TodoListTemplate>
        );
    }
}

export default App;