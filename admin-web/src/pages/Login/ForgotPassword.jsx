import { useState } from "react";
import logo from "../../assets/images/logo.jpg";
import background from "../../assets/images/background.png";

function ForgotPassword() {

  const [email, setEmail] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    console.log("OTP sent to:", email);

    // Later connect backend API here
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
              width: "90px",
              height: "90px",
              objectFit: "contain"
            }}
          />

        </div>


        <h3 className="text-center mb-3">
          Forgot Password
        </h3>


        <p className="text-center text-muted">
          Enter your registered email address.
          <br/>
          We'll send you a verification code.
        </p>



        <form onSubmit={handleSubmit}>


          <div className="mb-3">

            <label className="form-label">
              Email
            </label>

            <input
              type="email"
              className="form-control"
              placeholder="Enter Email"
              value={email}
              onChange={(e)=>setEmail(e.target.value)}
              required
            />

          </div>



          <button
          style={{background:"#198754"}}
            type="submit"
            className="btn btn-primary w-100"
            
          >
            Send OTP
          </button>


        </form>



        <div className="text-center mt-3">

          <a href="/login"
             style={{
              color:"#198754",  
              textDecoration:"none"
             }}
          >
             Back to Login
          </a>

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

export default ForgotPassword;