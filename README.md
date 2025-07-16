# 🛒  E-Commerce System

## 📌 Overview

This project is a  system supports product management, shopping cart functionality, expiration and shipping rules, and secure checkout with validation.

---

## 🚀 Features

### ✅ Product Management
- Products have a **name**, **price**, and **quantity**.
- Products can be:
  - **Expirable** (e.g., Cheese, Biscuits)
  - **Non-expirable** (e.g., TV, Mobile)
  - **Shippable** with weight (e.g., Cheese, TV)
  - **Non-shippable** (e.g., Scratch cards)

### 🛍️ Cart & Checkout
- Customers can:
  - Add products to their cart (within available stock).
  - Remove items from the cart.
- On checkout:
  - Show **subtotal**
  - Add **shipping fees**
  - Calculate **total paid**
  - Deduct from customer's **balance**
- Handle errors:
  - Empty cart
  - Insufficient customer balance
