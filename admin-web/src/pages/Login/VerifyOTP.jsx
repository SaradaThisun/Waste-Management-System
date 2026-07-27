import { useState, useEffect } from "react";
import { Link , useNavigate } from "react-router-dom";

import logo from "../../assets/images/logo.jpg";
import background from "../../assets/images/background.png";


function VerifyOTP() {

  const navigate = useNavigate();

  const [otp, setOtp] = useState(["", "", "", "", "", ""]);


  // Timer states for OTP resend countdown
  const [timer, setTimer] = useState(30);
  const [canResend, setCanResend] = useState(false);



  // OTP resend countdown timer
  useEffect(() => {


    if (timer === 0) {

      setCanResend(true);
      return;

    }


    const countdown = setInterval(() => {

      setTimer((previous) => previous - 1);

    }, 1000);



    return () => clearInterval(countdown);


  }, [timer]);






  const handleChange = (value, index) => {


    if (value.length > 1) return;


    const updatedOTP = [...otp];

    updatedOTP[index] = value;


    setOtp(updatedOTP);


  };






  const handleVerify = (e) => {

    e.preventDefault();


    const enteredOTP = otp.join("");


    console.log("Entered OTP:", enteredOTP);

    navigate("/reset-password");


  };







  // Reset timer when user requests a new OTP
  const handleResend = () => {


    console.log("OTP resent");


    setTimer(30);

    setCanResend(false);


  };







  return (

    <div
      className="container-fluid vh-100 d-flex justify-content-center align-items-center"
      style={{
        backgroundImage: `url(${background})`,
        backgroundSize: "cover",
        backgroundPosition: "center",
      }}
    >


      <div
        className="card shadow-lg p-4"
        style={{
          width: "400px",
          borderRadius: "15px",
          backgroundColor: "rgba(255,255,255,0.95)"
        }}
      >



        <div className="text-center mb-3">

          <img
            src={logo}
            alt="Government Logo"
            style={{
              width:"90px",
              height:"90px",
              objectFit:"contain"
            }}
          />

        </div>




        <h3 className="text-center mb-3">
          Verify OTP
        </h3>



        <p className="text-center text-muted">
          Enter the 6-digit code sent to your email.
        </p>




        <form onSubmit={handleVerify}>


          <div className="d-flex justify-content-between mb-4">


            {
              otp.map((digit,index)=>(

                <input

                  key={index}

                  type="text"

                  maxLength="1"

                  value={digit}

                  onChange={(e)=>handleChange(e.target.value,index)}

                  className="form-control text-center"

                  style={{
                    width:"45px",
                    height:"45px",
                    fontSize:"20px",
                    fontWeight:"600"
                  }}

                />

              ))
            }


          </div>




          <button

            type="submit"

            className="btn w-100"

            style={{
              background:"#198754",
              color:"white",
              fontWeight:"600"
            }}

          >

            Verify

          </button>



        </form>






        <div className="text-center mt-3">


          {
            canResend ? (


              <button

                onClick={handleResend}

                className="btn btn-link"

                style={{
                  color:"#198754",
                  textDecoration:"none",
                  fontWeight:"600",
                  fontSize:"14px"
                }}

              >

                Resend OTP

              </button>



            ) : (


              <span

                style={{
                  color:"#6c757d",
                  fontWeight:"600",
                  fontSize:"14px"
                }}

              >

                Resend OTP ({timer}s)

              </span>


            )

          }



        </div>







        <div className="text-center mt-2">


          <Link

            to="/forgot-password"

            style={{
              color:"#198754",
              textDecoration:"none"
            }}

          >

            Back

          </Link>


        </div>







        <div className="text-center mt-4">


          <small className="text-muted">

            © Municipality Management System

          </small>


        </div>



      </div>


    </div>

  );


}


export default VerifyOTP;