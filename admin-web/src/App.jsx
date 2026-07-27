import { Routes, Route, Navigate } from "react-router-dom";

import Login from "./pages/Login/Login";
import ForgotPassword from "./pages/Login/ForgotPassword";
import VerifyOTP from "./pages/Login/VerifyOTP";
import ResetPassword from "./pages/Login/ResetPassword";
import ResetSuccess from "./pages/Login/ResetSuccess";

import AdminLayout from "./layouts/AdminLayout";
import Dashboard from "./pages/Dashboard/Dashboard";

import Vehicles from "./pages/Vehicles/Vehicles";


function App() {

  return (

<Routes>


  <Route 
    path="/login" 
    element={<Login />} 
  />

  <Route 
    path="/forgot-password" 
    element={<ForgotPassword />} 
  />

  <Route 
    path="/verify-otp" 
    element={<VerifyOTP />} 
  />

  <Route 
    path="/reset-password" 
    element={<ResetPassword />} 
  />

  <Route 
    path="/reset-success" 
    element={<ResetSuccess />} 
  />



  <Route element={<AdminLayout />}>

    <Route
      path="/dashboard"
      element={<Dashboard />}
    />

    <Route
      path="/vehicles"
      element={<Vehicles />}
    />

  </Route>


</Routes>

  );

}


export default App;