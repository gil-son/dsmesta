import logo from '../../assets/img/logo.svg';
import './styles.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>&nbsp;
                    Developed by
                    <a href="https://gil-son.github.io" target="_blank"> <u>Gilson Vieira de Souza</u></a>&nbsp;
                     and <a href="https://devsuperior.com.br/" target="_blank"> <u>DevSuperior</u></a>
                </p>
            </div>
        </header>
    )
}


export default Header;


