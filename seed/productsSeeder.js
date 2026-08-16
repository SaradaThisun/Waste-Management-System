import Product from "../models/Product.js";

const productsSeeder = async () => {
  try {
    await Product.deleteMany();

    const products = [
      {
        title: "Recycled Plastic Chair",
        description:
          "Comfortable chair made from recycled plastic waste.",
        category: "Furniture",
        price: 8500,
        stock: 25,
        image:
          "https://images.unsplash.com/photo-1505693416388-ac5ce068fe85",
      },

      {
        title: "Eco Flower Pot",
        description:
          "Eco-friendly flower pot made from recycled plastic.",
        category: "Garden",
        price: 1200,
        stock: 50,
        image:
          "https://images.unsplash.com/photo-1463320726281-696a485928c7",
      },

      {
        title: "Recycled Notebook",
        description:
          "Notebook made from 100% recycled paper.",
        category: "Stationery",
        price: 650,
        stock: 100,
        image:
          "https://images.unsplash.com/photo-1517842645767-c639042777db",
      },

      {
        title: "Compost Bin",
        description:
          "Home compost bin for organic waste.",
        category: "Garden",
        price: 3200,
        stock: 18,
        image:
          "https://images.unsplash.com/photo-1581578731548-c64695cc6952",
      },

      {
        title: "Recycling Bin",
        description:
          "Large recycling bin for household use.",
        category: "Waste Management",
        price: 4500,
        stock: 30,
        image:
          "https://images.unsplash.com/photo-1528323273322-d81458248d40",
      },

      {
        title: "Bamboo Basket",
        description:
          "Eco-friendly handmade bamboo basket.",
        category: "Home",
        price: 2100,
        stock: 20,
        image:
          "https://images.unsplash.com/photo-1517705008128-361805f42e86",
      },

      {
        title: "Recycled Plastic Table",
        description:
          "Outdoor table made from recycled plastic.",
        category: "Furniture",
        price: 12000,
        stock: 8,
        image:
          "https://images.unsplash.com/photo-1505693416388-ac5ce068fe85",
      },

      {
        title: "Eco Water Bottle",
        description:
          "Reusable BPA-free water bottle.",
        category: "Lifestyle",
        price: 1500,
        stock: 60,
        image:
          "https://images.unsplash.com/photo-1523362628745-0c100150b504",
      },

      {
        title: "Paper Gift Bag",
        description:
          "Gift bag made from recycled paper.",
        category: "Stationery",
        price: 350,
        stock: 120,
        image:
          "https://images.unsplash.com/photo-1520607162513-77705c0f0d4a",
      },

      {
        title: "Eco Pen",
        description:
          "Biodegradable bamboo pen.",
        category: "Stationery",
        price: 250,
        stock: 200,
        image:
          "https://images.unsplash.com/photo-1455390582262-044cdead277a",
      },

      {
        title: "Garden Compost Kit",
        description:
          "Everything needed to start composting.",
        category: "Garden",
        price: 5400,
        stock: 12,
        image:
          "https://images.unsplash.com/photo-1466692476868-aef1dfb1e735",
      },

      {
        title: "Reusable Shopping Bag",
        description:
          "Durable eco shopping bag.",
        category: "Lifestyle",
        price: 700,
        stock: 150,
        image:
          "https://images.unsplash.com/photo-1542291026-7eec264c27ff",
      },

      {
        title: "Wooden Spoon Set",
        description:
          "Eco-friendly reusable wooden spoons.",
        category: "Kitchen",
        price: 1800,
        stock: 45,
        image:
          "https://images.unsplash.com/photo-1509440159596-0249088772ff",
      },

      {
        title: "Eco Lunch Box",
        description:
          "Reusable lunch box made from bamboo fiber.",
        category: "Kitchen",
        price: 2800,
        stock: 35,
        image:
          "https://images.unsplash.com/photo-1546069901-ba9599a7e63c",
      },

      {
        title: "Recycled Storage Box",
        description:
          "Storage box manufactured from recycled plastic.",
        category: "Home",
        price: 2600,
        stock: 28,
        image:
          "https://images.unsplash.com/photo-1505693416388-ac5ce068fe85",
      },
    ];

    const createdProducts = await Product.insertMany(products);

    console.log(`✅ ${createdProducts.length} products created`);

    return createdProducts;

  } catch (error) {

    console.error("❌ Product Seeder Error:", error.message);

    throw error;

  }
};

export default productsSeeder;