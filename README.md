# JSalon — Java Salon Management System

![Java](https://img.shields.io/badge/Java-JDK%2011%2B-orange)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen)

A console-based Salon Booking & Management System built using core Java OOP principles.

---

## 📌 About the Project
JSalon is an interactive menu-driven application that simulates a real salon booking system.
Customers can browse services for Gents, Ladies, or choose Yearly Packages, select a service,
make payment, and receive a confirmed booking — all saved to a local file.

---

## ✨ Features
- Gents Section — Haircut, Hair Color, Texture, Treatments, Skin Care, Beard Grooming, Combo Offers
- Ladies Section — Hair Styling, Make-Up, Texture, Treatments, Facials, Hand & Feet, Nail Care, Combo Offers
- Yearly Packages — Male and Female annual plans
- Payment Options — Cash, Card, UPI
- Email Validation — Regex-based format check
- Booking Persistence — All bookings saved to `bookings.txt` with timestamps
- Session Summary — Prints all bookings made in current session

---

## 🧠 OOP Concepts Used

| Concept | Where Used |
|---|---|
| Interface | `Payment` interface implemented by `Unissalon` |
| Encapsulation | Private fields with getters/setters in `Unissalon` |
| Inheritance | Multi-level: `Unissalon → Gents → Hair_cut_finish` |
| Upcasting & Downcasting | All category/sub-category object creation |
| Exception Handling | `try-catch (InputMismatchException)` on every menu |
| Static Initializer Block | Welcome banner before `main()` |
| File I/O | `BookingLogger` writes to `bookings.txt` |
| ArrayList | In-memory session booking records |
| Regex | Email format validation |

---

## 🗂️ Project Structure
