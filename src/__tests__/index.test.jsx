import '@testing-library/jest-dom/extend-expect'; // for additional matchers
import App from './App';
// Mock ReactDOM.createRoot and ReactDOM.createRoot().render
jest.mock('react-dom/client', () => {
  return {
    createRoot: jest.fn(() => ({
      render: jest.fn(),
    })),
  };
});
describe('Index Component', () => {
  it('renders the App component inside StrictMode', () => {
    // Render the component
    require('./index'); // This will execute the code in index.jsx
    // Verify that ReactDOM.createRoot has been called with the correct element
    expect(React.createRoot).toHaveBeenCalledWith(document.getElementById('root'));
    // Verify that ReactDOM.createRoot().render has been called with the App component inside StrictMode
    const strictModeElement = document.createElement('div');
    strictModeElement.innerHTML = `<div id="root"></div>`;
    const appElement = strictModeElement.querySelector('#root > div');
    expect(React.createRoot().render).toHaveBeenCalledWith(
      <React.StrictMode>
        <App />
      </React.StrictMode>,
      appElement
    );
  });
});