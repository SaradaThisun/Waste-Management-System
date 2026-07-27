function Dashboard() {

  return (

    <div>

      {/* Page Header */}
      <div className="mb-4">

        <h2
          className="fw-bold"
          style={{
            color: "##F3F4F6"
          }}
        >
          Dashboard
        </h2>

        <p className="text-muted">
          Welcome to Smart Waste Management Admin Portal
        </p>

      </div>



      {/* Summary Cards */}
      <div className="row g-4">


        <div className="col-md-3">

          <div className="card shadow-sm border-0">

            <div className="card-body">

              <h6 className="text-muted">
                Total Users
              </h6>

              <h2 className="fw-bold">
                1,250
              </h2>

            </div>

          </div>

        </div>



        <div className="col-md-3">

          <div className="card shadow-sm border-0">

            <div className="card-body">

              <h6 className="text-muted">
                Active Vehicles
              </h6>

              <h2 className="fw-bold">
                25
              </h2>

            </div>

          </div>

        </div>




        <div className="col-md-3">

          <div className="card shadow-sm border-0">

            <div className="card-body">

              <h6 className="text-muted">
                Complaints
              </h6>

              <h2 className="fw-bold">
                45
              </h2>

            </div>

          </div>

        </div>




        <div className="col-md-3">

          <div className="card shadow-sm border-0">

            <div className="card-body">

              <h6 className="text-muted">
                Collections Today
              </h6>

              <h2 className="fw-bold">
                180
              </h2>

            </div>

          </div>

        </div>


      </div>



      {/* Bottom Dashboard Section */}

      <div className="row g-4 mt-2">


        {/* Recent Activities */}

        <div className="col-md-7">

          <div className="card shadow-sm border-0">

            <div className="card-body">


              <h5 className="fw-bold mb-3">
                Recent Activities
              </h5>



              <div className="border-bottom py-2">

                <i className="bi bi-person-plus text-success me-2"></i>

                New user registered

              </div>



              <div className="border-bottom py-2">

                <i className="bi bi-truck text-primary me-2"></i>

                Vehicle completed waste collection

              </div>



              <div className="border-bottom py-2">

                <i className="bi bi-exclamation-circle text-danger me-2"></i>

                New complaint submitted

              </div>



              <div className="py-2">

                <i className="bi bi-recycle text-success me-2"></i>

                Recycling process updated

              </div>


            </div>

          </div>

        </div>




        {/* Vehicle Tracking Preview */}

        <div className="col-md-5">

          <div className="card shadow-sm border-0">


            <div className="card-body text-center">


              <i
                className="bi bi-geo-alt-fill"
                style={{
                  fontSize: "45px",
                  color: "#198754"
                }}
              ></i>



              <h5 className="fw-bold mt-3">

                Live Vehicle Tracking

              </h5>



              <p className="text-muted">

                Monitor waste collection vehicles in real time

              </p>



              <button
                className="btn btn-success"
              >

                View Tracking

              </button>


            </div>


          </div>

        </div>


      </div>


    </div>


  );

}


export default Dashboard;