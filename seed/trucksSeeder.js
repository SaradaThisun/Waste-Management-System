import Truck from "../models/Truck.js";

const seedTrucks = async (users) => {
  try {

    await Truck.deleteMany();

    const collectors = users.filter(
      (user) => user.role === "collector"
    );

    const trucks = [
      {
        vehicleNumber: "WP GA 4587",

        driverName: "Nimal Perera",

        collector: collectors[0]._id,

        capacity: 5000,

        fuelType: "Diesel",

        currentLocation: {
          latitude: 6.9271,
          longitude: 79.8612,
        },

        status: "On Route",
      },

      {
        vehicleNumber: "WP GA 6721",

        driverName: "Kasun Silva",

        collector: collectors[1]._id,

        capacity: 4500,

        fuelType: "Diesel",

        currentLocation: {
          latitude: 6.9389,
          longitude: 79.8542,
        },

        status: "Available",
      },

      {
        vehicleNumber: "WP GA 9054",

        driverName: "Saman Fernando",

        collector: collectors[2]._id,

        capacity: 6000,

        fuelType: "Diesel",

        currentLocation: {
          latitude: 6.9123,
          longitude: 79.8765,
        },

        status: "Maintenance",
      },
    ];

    const createdTrucks = await Truck.insertMany(trucks);

    console.log(`✅ ${createdTrucks.length} trucks created`);

    return createdTrucks;

  } catch (error) {

    console.error("❌ Truck Seeder Error:", error.message);

    throw error;

  }
};

export default seedTrucks;