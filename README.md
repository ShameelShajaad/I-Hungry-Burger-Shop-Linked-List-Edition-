# 🍔 I Hungry Burger Shop - LinkedList Edition

**Author:** Shameel Shajaad  
**Module:** Object-Oriented Programming & Data Structures and Algorithms (ICET Institute)  
**Language:** Java (NetBeans Project)

---

## 📝 Description
**IHungryBurgerShop - LinkedList Edition** is a **Java Swing-based burger shop ordering system** developed for the **OOP & Data Structures module** at **ICET Institute**.  

This version replaces file-based arrays with a **Linked List (`Node.java`)** for **dynamic order management**. Orders are stored in memory using linked nodes and can be navigated, updated, or displayed in multiple pages (`ViewOrdersPage` and subpages for Cancelled, Processing, and Delivered orders).  

> 🍔 Developed using **NetBeans IDE** for GUI design and project management.

---

## ⚡ Features

1. **Linked List-Based Order Management**
   - Stores orders dynamically using `Node` objects
   - Easy addition, deletion, and update of orders
   - Maintains first and last nodes for fast navigation

2. **Customer & Order Management**
   - Place new orders through `PlaceOrderPage`
   - Update existing orders via `UpdateOrderPage`
   - Search customers with `SearchCustomerPage`
   - Search specific orders with `SearchOrderPage`
   - Identify best customer using `SearchBestCustomerPage`

3. **Order Status Management**
   - Orders categorized into:
     - **ProcessingOrdersPage** – orders currently being prepared
     - **DeliveredOrdersPage** – completed orders
     - **CancelledOrdersPage** – cancelled orders
   - `ViewOrdersPage` lets you navigate to these subpages

4. **Graphical User Interface (GUI)**
   - Built using **Java Swing**
   - Rounded buttons and interactive panels
   - Real-time navigation between order pages
   - Visual feedback for order placement and updates

---

## 🗂 File Structure

IHungryBurgerShop-LinkedList-Edition/  
├── src/  
│   ├── iHungryBurgerShop/  
│   │   ├── HomePage.java  
│   │   ├── PlaceOrderPage.java  
│   │   ├── ViewOrdersPage.java  
│   │   ├── UpdateOrderPage.java  
│   │   ├── CancelledOrdersPage.java  
│   │   ├── DeliveredOrdersPage.java  
│   │   ├── Main.java  
│   │   ├── ProcessingOrdersPage.java  
│   │   ├── RoundedButton.java  
│   │   ├── CancelledOrdersPage.java  
│   │   ├── SearchBestCustomerPage.java  
│   │   ├── SearchCustomerPage.java  
│   │   ├── SearchOrderPage.java  
│   │   └── Node.java  
│   └── Images/  
│       └── Burger_Logo.png 
├── Burger.txt  
└── README.md  


---

## 🛠 Setup & Run Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/ShameelShajaad/I-Hungry-BurgerShop-LinkedList-Edition.git

2. **Open in NetBeans**
   -Open NetBeans IDE
   -Go to File → Open Project
   -Select the cloned folder and open it
   
4. **Run the Project**
   -Click the Run button in NetBeans
   -Or, open terminal inside project folder:
   ```bash
   javac src/iHungryBurgerShop *.java
   java src/iHungryBurgerShop/Main
   ```

5. **Important Notes**
   - `Burger.txt` must remain in the **project root directory**.  
   - Do **not rename** or move this file.  
   - Image paths are **relative**, so the `assets/images/` folder must remain unchanged.  


## 💡 Concepts Demonstrated

| Concept         | Description                                                  |
|-----------------|--------------------------------------------------------------|
| **OOP Principles** | Encapsulation, getters/setters, modular classes             |
| **Linked List**    | Dynamic order management with `Node` class                  |
| **Swing GUI**      | Event-driven design and interactive interface              |
| **Search & Update**| Efficient navigation and modification of linked list nodes |
| **Navigation Flow**| Multi-page system with `ViewOrdersPage` subpages           |

---

## ⚙️ Technologies Used

- **Java (JDK 17+)**  
- **NetBeans IDE**  
- **Java Swing**  
- **Custom Linked List (`Node.java`)**  

---

## 📝 Summary

The **IHungryBurgerShop - LinkedList Edition** demonstrates **dynamic in-memory order management** with a linked list.  
It provides a realistic mini POS simulation, showing how orders can be tracked, updated, and categorized into **Processing, Delivered, or Cancelled** dynamically.  

This project reflects practical application of **OOP, linked lists, and GUI navigation** for small-scale software systems.
