import { MapContainer, TileLayer, Marker, Popup } from "react-leaflet";
import "leaflet/dist/leaflet.css";

import L from "leaflet";
import truckIcon from "../../assets/images/truck.png";

function LiveTracking() {

    const vehicleIcon = L.icon({
  iconUrl: truckIcon,
  iconSize: [40, 40],
  iconAnchor: [20, 40],
  popupAnchor: [0, -35],
});

  // Temporary vehicle location (later from backend/GPS)
  const vehiclePosition = [
    7.2906,
    80.6337
  ];

  return (
    <div>

      {/* Header */}
      <div className="mb-4">

        <h5
          className="fw-bold"
          style={{
            marginTop:"15px", 
            color: "#1e2126" }}
        >
          Live GPS Tracking
        </h5>

        <p className="text-muted">
          Monitor waste collection vehicles in real-time.
        </p>

      </div>


      {/* Vehicle Info Card */}
      <div className="row g-4 mb-4">

        <div className="col-md-3">
          <div className="card shadow-sm border-0">
            <div className="card-body">

              <h6 className="text-muted">
                Vehicle
              </h6>

              <h5 className="fw-bold">
                WP CAB-1234
              </h5>

            </div>
          </div>
        </div>


        <div className="col-md-3">
          <div className="card shadow-sm border-0">
            <div className="card-body">

              <h6 className="text-muted">
                Driver
              </h6>

              <h5 className="fw-bold">
                Kasun Perera
              </h5>

            </div>
          </div>
        </div>


        <div className="col-md-3">
          <div className="card shadow-sm border-0">
            <div className="card-body">

              <h6 className="text-muted">
                Status
              </h6>

              <span className="badge bg-success">
                Active
              </span>

            </div>
          </div>
        </div>


        <div className="col-md-3">
          <div className="card shadow-sm border-0">
            <div className="card-body">

              <h6 className="text-muted">
                Speed
              </h6>

              <h5 className="fw-bold">
                35 km/h
              </h5>

            </div>
          </div>
        </div>

      </div>


      {/* Map */}
      <div className="card shadow-sm border-0">

        {/* <div className="card-header bg-white">
          <h5 className="fw-bold mb-0">
            Vehicle Location
          </h5>
        </div> */}


        <div className="card-body p-0">

          <MapContainer
            center={vehiclePosition}
            zoom={13}
            style={{
              height: "500px",
              width: "100%"
            }}
          >

            <TileLayer
              url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
            />


            <Marker position={vehiclePosition}
                    icon={vehicleIcon}
            >

              <Popup>

                <b>
                  WP CAB-1234
                </b>

                <br />

                Driver:
                Kasun Perera

                <br />

                Status:
                Active

              </Popup>

            </Marker>


          </MapContainer>

        </div>

      </div>


    </div>
  );
}

export default LiveTracking;