# Parking Slot & Space Optimization System

## Project Overview
The Parking Slot & Space Optimization System is a simple Java-based application that manages vehicle parking and slot allocation.

It supports standard vehicles and electric vehicles (EVs), assigns suitable parking slots, calculates parking fees, and handles parking-related exceptions.

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Exception Handling
- Arrays

## Features
- Park standard vehicles and EVs.
- Allocate suitable parking slots automatically.
- Reserve specific slots for EVs.
- Calculate parking fees based on vehicle type and parking hours.
- Remove vehicles from parking slots.
- Display available and occupied slots.
- Handle parking-related errors using custom exceptions.

## Project Structure

```text
ParkingSlotOptimization/
│
├── Vehicle.java
├── StandardVehicle.java
├── EVVehicle.java
├── ParkingSlot.java
├── ParkingLot.java
├── ParkingException.java
├── Main.java
└── README.md
```

## OOP Concepts Used

- **Inheritance:** `StandardVehicle` and `EVVehicle` extend the `Vehicle` class.
- **Polymorphism:** Both vehicle classes override the `calculateFee()` method.
- **Encapsulation:** Vehicle details and parking operations are organized within classes.
- **Exception Handling:** Custom `ParkingException` handles parking-related errors.

## Parking Fee Calculation

| Vehicle Type | Fee per Hour |
|---|---:|
| Standard Vehicle | ₹30 |
| Electric Vehicle | ₹20 |

## How to Run

### 1. Clone the repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Open the project folder

```bash
cd ParkingSlotOptimization
```

### 3. Compile the Java files

```bash
javac *.java
```

### 4. Run the application

```bash
java Main
```

## Sample Menu

```text
===== PARKING SLOT MANAGEMENT =====
1. Park Standard Vehicle
2. Park EV Vehicle
3. Remove Vehicle
4. Display Parking Slots
5. Exit

Enter your choice:
```

## Author
Divya Sri S.

B.Tech - Artificial Intelligence and Data Science
