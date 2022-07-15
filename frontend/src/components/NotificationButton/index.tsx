import axios from "axios";
//import { toast } from "react-toastify";
import { BASE_URL } from "../../utils/request";
import icon from "../../assets/img/notification-icon.svg";
import iconsend from "../../assets/img/icon-send.png";
import './styles.css';
import { useState } from "react";

type Props = {
    saleId: number;
}

function NotificationButton({saleId} : Props) {

    const [theicon, setTheIcon]  = useState(icon);
    
    const [classEffect, setclassEffect]  = useState("dsmeta-red-btn");



    function handleClick(id : number){

        setTheIcon(iconsend)
        setclassEffect("dsmeta-green-btn")
        axios(`${BASE_URL}/sales/${id}/notification`)
            // .then( response => {
            //     // toast.info("Sent SMS with success");
                
            // });

            // toast.success("Sent SMS with success");
            setTimeout(() => { setTheIcon(icon); setclassEffect("dsmeta-red-btn")}, 5000);
    }

    return (
        <div className={classEffect} onClick={() => handleClick(saleId)}>
            <img src={theicon} alt="Notification" />
        </div>
    )
}

export default NotificationButton