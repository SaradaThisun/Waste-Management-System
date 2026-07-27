import { useState } from "react";
import LiveTracking from "../../components/vehicles/LiveTracking";

function Vehicles() {
  const [showAddModal, setShowAddModal] = useState(false);
  const [showViewModal, setShowViewModal] = useState(false);
  const [showEditModal, setShowEditModal] = useState(false);
  const [showDeleteModal, setShowDeleteModal] = useState(false);
  const [activeTab, setActiveTab] = useState("list");

  return (
    <div>
      <div className="d-flex justify-content-between align-items-center mb-4">
        <div>
          <h2
            className="fw-bold"
            style={{ color: "##F3F4F6" }}
          >
            Vehicle Management
          </h2>

          <p className="text-muted mb-0">
            Manage waste collection vehicles and monitor their status.
          </p>
        </div>
      </div>

      <div className="row g-4 mb-4">
        <div className="col-md-3">
          <div className="card shadow-sm border-0">
            <div className="card-body">
              <h6 className="text-muted">Total Vehicles</h6>
              <h2 className="fw-bold">25</h2>
            </div>
          </div>
        </div>

        <div className="col-md-3">
          <div className="card shadow-sm border-0">
            <div className="card-body">
              <h6 className="text-muted">Active Vehicles</h6>
              <h2 className="fw-bold text-success">20</h2>
            </div>
          </div>
        </div>

        <div className="col-md-3">
          <div className="card shadow-sm border-0">
            <div className="card-body">
              <h6 className="text-muted">Maintenance</h6>
              <h2 className="fw-bold text-warning">3</h2>
            </div>
          </div>
        </div>

        <div className="col-md-3">
          <div className="card shadow-sm border-0">
            <div className="card-body">
              <h6 className="text-muted">Offline Vehicles</h6>
              <h2 className="fw-bold text-danger">2</h2>
            </div>
          </div>
        </div>
      </div>




      {/* Vehicle Tabs */}

<div className="mb-4">

    <button
        className={`btn me-2 ${
        activeTab === "list"
        ? "btn-success"
        : "btn-outline-success"
        }`}
        onClick={() => setActiveTab("list")}
    >
        <i className="bi bi-truck me-2"></i>
        Vehicle List
    </button>


    <button
        className={`btn ${
        activeTab === "tracking"
        ? "btn-success"
        : "btn-outline-success"
        }`}
        onClick={() => setActiveTab("tracking")}
    >
        <i className="bi bi-geo-alt me-2"></i>
        Live Tracking
    </button>


    {/*Show Map*/}
    {activeTab === "tracking" && (
        <LiveTracking />
    )}


</div>
    {activeTab === "list" && (
      <div className="card shadow-sm border-0">
        <div className="card-header bg-white border-0 d-flex justify-content-between align-items-center flex-wrap gap-3">
          <h5 className="fw-bold mb-0">Vehicle List</h5>

          <div className="d-flex align-items-center gap-2 flex-wrap">
            <input
              type="text"
              className="form-control"
              placeholder="Search vehicle..."
              style={{ width: "250px" }}
            />

            <select
              className="form-select"
              style={{ width: "170px" }}
            >
              <option>All Status</option>
              <option>Active</option>
              <option>Maintenance</option>
              <option>Offline</option>
            </select>
            

            <button
              className="btn btn-success"
              onClick={() => setShowAddModal(true)}
            >
              <i className="bi bi-plus-circle me-2"></i>
              Add Vehicle
            </button>
          </div>
        </div>

        <div className="card-body p-0">
          <div className="table-responsive">
            <table className="table table-hover align-middle mb-0">
              <thead className="table-light">
                <tr>
                  <th>Vehicle ID</th>
                  <th>Vehicle Number</th>
                  <th>Driver</th>
                  <th>Status</th>
                  <th>Actions</th>
                </tr>
              </thead>

              <tbody>
                <tr>
                  <td>V001</td>
                  <td>WP CAB-1234</td>
                  <td>Kasun Perera</td>

                  <td>
                    <span className="badge bg-success">
                      Active
                    </span>
                  </td>

                  <td>
                    <button
                        className="btn btn-sm btn-primary me-2"
                        onClick={() => setShowViewModal(true)}
                        >
                        <i className="bi bi-eye"></i>
                    </button>

                    <button
                        className="btn btn-sm btn-warning me-2"
                        onClick={() => setShowEditModal(true)}
                        >
                        <i className="bi bi-pencil"></i>
                        </button>

                    <button
                        className="btn btn-sm btn-danger"
                        onClick={() => setShowDeleteModal(true)}
                        >
                        <i className="bi bi-trash"></i>
                    </button>
                  </td>
                </tr>

                <tr>
                  <td>V002</td>
                  <td>WP CAD-5678</td>
                  <td>Nimal Silva</td>

                  <td>
                    <span className="badge bg-secondary">
                      Offline
                    </span>
                  </td>

                  <td>
                    <button className="btn btn-sm btn-primary me-2">
                      <i className="bi bi-eye"></i>
                    </button>

                    <button className="btn btn-sm btn-warning me-2">
                      <i className="bi bi-pencil"></i>
                    </button>

                    <button className="btn btn-sm btn-danger">
                      <i className="bi bi-trash"></i>
                    </button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>

    )}
      {showAddModal && (
        <div
          className="modal d-block"
          tabIndex="-1"
          style={{
            backgroundColor: "rgba(0,0,0,0.5)",
          }}
        >
          <div className="modal-dialog modal-lg">
            <div className="modal-content">

              <div className="modal-header">
                <h5 className="modal-title">
                  Add New Vehicle
                </h5>

                <button
                  type="button"
                  className="btn-close"
                  onClick={() => setShowAddModal(false)}
                ></button>
              </div>

              <div className="modal-body">

              <div className="row">

                    <div className="col-md-6 mb-3">
                    <label className="form-label fw-semibold">
                        Vehicle Number
                    </label>

                    <input
                        type="text"
                        className="form-control"
                        placeholder="e.g. WP CAB-1234"
                    />
                    </div>

                    <div className="col-md-6 mb-3">
                    <label className="form-label fw-semibold">
                        Vehicle Type
                    </label>
                        <select className="form-select">
                        <option>Select Vehicle Type</option>
                        <option>Garbage Collection Truck</option>
                        <option>Compactor Truck</option>
                        <option>Water Bowser</option>
                        <option>Road Sweeper</option>
                        <option>Tractor with Trailer</option>
                        </select>
                    </div>

                    <div className="col-md-6 mb-3">
                    <label className="form-label fw-semibold">
                        Assigned Driver
                    </label>

                    <select className="form-select">
                        <option>Select Driver</option>
                        <option>Kasun Perera</option>
                        <option>Nimal Silva</option>
                        <option>Amila Fernando</option>
                    </select>
                    </div>

                    <div className="col-md-6 mb-3">
                    <label className="form-label fw-semibold">
                        Capacity (kg)
                    </label>

                    <input
                        type="number"
                        className="form-control"
                        placeholder="Enter Capacity"
                    />
                    </div>

                    <div className="col-md-6 mb-3">
                    <label className="form-label fw-semibold">
                        GPS Device ID
                    </label>

                    <input
                        type="text"
                        className="form-control"
                        placeholder="GPS-001"
                    />
                    </div>

                    <div className="col-md-6 mb-3">
                    <label className="form-label fw-semibold">
                        Status
                    </label>

                    <select className="form-select">
                        <option>Active</option>
                        <option>Maintenance</option>
                        <option>Offline</option>
                    </select>
                    </div>

                </div>

                </div>

              <div className="modal-footer">
                <button
                  className="btn btn-secondary"
                  onClick={() => setShowAddModal(false)}
                >
                  Cancel
                </button>

                <button className="btn btn-success">
                  Save Vehicle
                </button>
              </div>

            </div>
          </div>
        </div>
      )}

    {/* View Vehicle Modal */}
{showViewModal && (
  <div
    className="modal d-block"
    tabIndex="-1"
    style={{
      backgroundColor: "rgba(0,0,0,0.5)",
    }}
  >
    <div className="modal-dialog">
      <div className="modal-content">

        <div className="modal-header">
          <h5 className="modal-title">
            Vehicle Details
          </h5>

          <button
            type="button"
            className="btn-close"
            onClick={() => setShowViewModal(false)}
          ></button>
        </div>

        <div className="modal-body">

          <div className="mb-2">
            <strong>Vehicle ID:</strong> V001
          </div>

          <div className="mb-2">
            <strong>Vehicle Number:</strong> WP CAB-1234
          </div>

          <div className="mb-2">
            <strong>Vehicle Type:</strong> Garbage Collection Truck
          </div>

          <div className="mb-2">
            <strong>Assigned Driver:</strong> Kasun Perera
          </div>

          <div className="mb-2">
            <strong>Capacity:</strong> 5000 kg
          </div>

          <div className="mb-2">
            <strong>GPS Device ID:</strong> GPS-001
          </div>

          <div className="mb-2">
            <strong>Status:</strong>
            <span className="badge bg-success ms-2">
              Active
            </span>
          </div>

        </div>

        <div className="modal-footer">
          <button
            className="btn btn-secondary"
            onClick={() => setShowViewModal(false)}
          >
            Close
          </button>
        </div>

      </div>
    </div>
  </div>
)}


{/* Edit Vehicle Modal */}
{showEditModal && (
  <div
    className="modal d-block"
    tabIndex="-1"
    style={{
      backgroundColor: "rgba(0,0,0,0.5)",
    }}
  >

    <div className="modal-dialog modal-lg">

      <div className="modal-content">

        <div className="modal-header">

          <h5 className="modal-title">
            Edit Vehicle
          </h5>

          <button
            type="button"
            className="btn-close"
            onClick={() => setShowEditModal(false)}
          ></button>

        </div>


        <div className="modal-body">

          <div className="row">


            <div className="col-md-6 mb-3">

              <label className="form-label fw-semibold">
                Vehicle Number
              </label>

              <input
                type="text"
                className="form-control"
                value="WP CAB-1234"
                readOnly
              />

            </div>



            <div className="col-md-6 mb-3">

              <label className="form-label fw-semibold">
                Vehicle Type
              </label>

              <select className="form-select">

                <option>
                  Garbage Collection Truck
                </option>

                <option>
                  Compactor Truck
                </option>

                <option>
                  Water Bowser
                </option>

                <option>
                  Road Sweeper
                </option>

                <option>
                  Tractor with Trailer
                </option>

              </select>

            </div>



            <div className="col-md-6 mb-3">

              <label className="form-label fw-semibold">
                Assigned Driver
              </label>

              <select className="form-select">

                <option>
                  Kasun Perera
                </option>

                <option>
                  Nimal Silva
                </option>

              </select>

            </div>



            <div className="col-md-6 mb-3">

              <label className="form-label fw-semibold">
                Status
              </label>

              <select className="form-select">

                <option>
                  Active
                </option>

                <option>
                  Maintenance
                </option>

                <option>
                  Offline
                </option>

              </select>

            </div>


          </div>

        </div>



        <div className="modal-footer">

          <button
            className="btn btn-secondary"
            onClick={() => setShowEditModal(false)}
          >
            Cancel
          </button>


          <button className="btn btn-primary">
            Update Vehicle
          </button>


        </div>


      </div>

    </div>

  </div>
)}


{/* Delete Vehicle Modal */}
{showDeleteModal && (
  <div
    className="modal d-block"
    tabIndex="-1"
    style={{
      backgroundColor: "rgba(0,0,0,0.5)",
    }}
  >

    <div className="modal-dialog">

      <div className="modal-content">


        <div className="modal-header">

          <h5 className="modal-title text-danger">
            Delete Vehicle
          </h5>

          <button
            type="button"
            className="btn-close"
            onClick={() => setShowDeleteModal(false)}
          ></button>

        </div>


        <div className="modal-body">

          <p>
            Are you sure you want to delete this vehicle?
          </p>


          <div className="mb-2">
            <strong>Vehicle ID:</strong> V001
          </div>


          <div className="mb-2">
            <strong>Vehicle Number:</strong> WP CAB-1234
          </div>


          <div className="mb-2">
            <strong>Vehicle Type:</strong> Garbage Collection Truck
          </div>


        </div>



        <div className="modal-footer">


          <button
            className="btn btn-secondary"
            onClick={() => setShowDeleteModal(false)}
          >
            Cancel
          </button>



          <button
            className="btn btn-danger"
          >
            Delete Vehicle
          </button>


        </div>


      </div>

    </div>

  </div>
)}

    </div>
  );
}

export default Vehicles;