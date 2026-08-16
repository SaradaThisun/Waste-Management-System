import bcrypt from "bcryptjs";
import User from "../models/User.js";

const seedUsers = async () => {
  try {
    // Remove existing users
    await User.deleteMany();

    const password = await bcrypt.hash("123456", 10);

    const users = [
      // ==========================
      // Admin
      // ==========================

      {
        fullName: "System Administrator",
        email: "admin@ecocollect.com",
        password,
        phone: "0773000000",
        address: "Colombo Head Office",
        role: "admin",
      },

      // ==========================
      // Collectors
      // ==========================

      {
        fullName: "Nimal Perera",
        email: "collector1@ecocollect.com",
        password,
        phone: "0771111111",
        address: "Colombo",
        role: "collector",
      },

      {
        fullName: "Kasun Silva",
        email: "collector2@ecocollect.com",
        password,
        phone: "0771111112",
        address: "Kelaniya",
        role: "collector",
      },

      {
        fullName: "Saman Fernando",
        email: "collector3@ecocollect.com",
        password,
        phone: "0771111113",
        address: "Kandy",
        role: "collector",
      },

      {
        fullName: "Amila Jayasinghe",
        email: "collector4@ecocollect.com",
        password,
        phone: "0771111114",
        address: "Gampaha",
        role: "collector",
      },

      {
        fullName: "Ruwan Wijesinghe",
        email: "collector5@ecocollect.com",
        password,
        phone: "0771111115",
        address: "Negombo",
        role: "collector",
      },

      // ==========================
      // Citizens
      // ==========================

      {
        fullName: "Sumudu Citizen",
        email: "citizen1@ecocollect.com",
        password,
        phone: "0772000001",
        address: "Kelaniya",
        role: "citizen",
      },

      {
        fullName: "Nadeesha Perera",
        email: "citizen2@ecocollect.com",
        password,
        phone: "0772000002",
        address: "Kadawatha",
        role: "citizen",
      },

      {
        fullName: "Tharindu Silva",
        email: "citizen3@ecocollect.com",
        password,
        phone: "0772000003",
        address: "Kiribathgoda",
        role: "citizen",
      },

      {
        fullName: "Dilshan Fernando",
        email: "citizen4@ecocollect.com",
        password,
        phone: "0772000004",
        address: "Colombo",
        role: "citizen",
      },

      {
        fullName: "Sachini Kumari",
        email: "citizen5@ecocollect.com",
        password,
        phone: "0772000005",
        address: "Malabe",
        role: "citizen",
      },

      {
        fullName: "Nipun Jayawardena",
        email: "citizen6@ecocollect.com",
        password,
        phone: "0772000006",
        address: "Maharagama",
        role: "citizen",
      },

      {
        fullName: "Sanduni Perera",
        email: "citizen7@ecocollect.com",
        password,
        phone: "0772000007",
        address: "Ragama",
        role: "citizen",
      },

      {
        fullName: "Charith Senanayake",
        email: "citizen8@ecocollect.com",
        password,
        phone: "0772000008",
        address: "Ja-Ela",
        role: "citizen",
      },

      {
        fullName: "Ishara Fernando",
        email: "citizen9@ecocollect.com",
        password,
        phone: "0772000009",
        address: "Wattala",
        role: "citizen",
      },

      {
        fullName: "Kavindu Gunasekara",
        email: "citizen10@ecocollect.com",
        password,
        phone: "0772000010",
        address: "Kadawatha",
        role: "citizen",
      },
    ];

    const createdUsers = await User.insertMany(users);

    console.log(`✅ ${createdUsers.length} users created`);

    return createdUsers;
  } catch (error) {
    console.error("❌ User Seeder Error:", error.message);
    throw error;
  }
};

export default seedUsers;