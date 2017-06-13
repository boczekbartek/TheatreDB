'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom')
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {productions: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/productions'}).done(response => {
            console.log(response.entity._embedded.productions);
            this.setState({productions: response.entity._embedded.productions});
        });
    }

    render() {
        console.log(this.state);
        return (
            <div>
                <ProductionList productions={this.state.productions}/>
            </div>
        )
    }
}
// end::app[]

// tag::production-list[]
class ProductionList extends React.Component {
    render() {
        console.log(this.props.productions);
        var productions = this.props.productions.map(production =>
            <Production production={production}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Description</th>
                </tr>
                {productions}
                </tbody>
            </table>
        )
    }
}
// end::production-list[]

// tag::production[]
class Production extends React.Component {
    render() {
        console.log(this.props);
        return (

            <tr>
                <td>{this.props.production.description}</td>
                <td>{this.props.production.name}</td>
                <td>{this.props.production.playwright}</td>
            </tr>
        )
    }
}
// end::production[]

// tag::render[]
ReactDOM.render(
    <App />,
    document.getElementById('react')
)
// end::render[]

