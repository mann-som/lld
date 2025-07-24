# Single Responsibility Principle (SRP)

## Definition  
A class should have **only one reason to change** — meaning it should have **a single, well-defined responsibility**.

## Why SRP Matters  
- Increases **modularity**
- Improves **cohesion**
- Reduces **coupling**
- Avoids **ripple effects** (unrelated parts breaking due to one change)
- Makes code easier to **maintain, extend, test**

## Problem Example (Folder: `LLD/SRP/bad_code/`)
A `Marker` class that handles:
- Product information (like price/color)  
- **And** invoice generation logic  

This mixes unrelated responsibilities, violating SRP.

## Solution (Folder: `/LLD/SRP/good_code/`)
Break responsibilities into:
- `Marker`: holds marker details
- `Invoice`: calculates totals
- `InvoiceDao`: persists to DB

Now each class has one reason to change.

## Summary  
| Aspect       | Bad Practice                       | SRP-Compliant Practice             |
|--------------|------------------------------------|------------------------------------|
| Responsibility | Mixed (marker + invoice logic)    | Separated (each class = one task)  |
| Maintenance   | Risk of breaking unrelated logic   | Local, isolated changes            |

## Code Reference  
- See `/LLD/SRP/bad_code/Marker.java`  
- See `/LLD/SRP/good_code/Marker.java` and `/LLD/SRP/good_code/Invoice.java`