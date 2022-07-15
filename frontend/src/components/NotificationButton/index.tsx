import axios from "axios";
import { toast } from "react-toastify";
import { BASE_URL } from "../../utils/request";
import icon from "../../assets/img/notification-icon.svg";
import './styles.css';

type Props = {
    saleId: number;
}

function NotificationButton({saleId} : Props) {

    function handleClick(id : number){
        axios(`${BASE_URL}/sales/${id}/notification`)
            .then( response => {
                toast.info("Sent SMS with success");
            });
    }

    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
            <img src={icon} alt="Notification" />
        </div>
    )
}

export default NotificationButton