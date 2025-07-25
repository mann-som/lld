# Open/Closed Principle (OCP)

## Definition  
A class should be **open for extension** but **closed for modification**.  
This means you should be able to add new functionality **without changing** existing code.

## 💡 Why OCP Matters  
- Encourages **extensibility** without breaking existing code
- Minimizes impact on **already tested** components
- Supports **plug-and-play** additions through polymorphism
- Makes system easier to **scale and maintain**

## 🚫 Problem Example (Folder: `LLD/OCP/bad_code/`)
A class like `InvoiceDao` has hardcoded `saveToDB()` logic.  
If we now want to save to file, email, or cloud — we have to **modify** this class each time, violating OCP.

## ✅ Solution (Folder: `LLD/OCP/good_code/`)
Introduce an **abstraction layer** (interface):
- `InvoiceDao`: declares a `save()` method
- `InvoiceDaoDB`, `FileInvoiceDao`: implement their own `save()` logic

A higher-level class like `Invoice` now depends on `InvoiceDao`, and can accept any implementation without modifying its own code.

## 🧠 Summary  
| Aspect         | Bad Practice                         | OCP-Compliant Practice                 |
|----------------|--------------------------------------|----------------------------------------|
| Extension      | Requires editing existing class       | Add new logic via subclass or strategy |
| Scalability    | Poor (risk of bugs in tested logic)   | Great (plug in new behaviors)          |
| Dependency     | Hardcoded implementations             | Relies on abstraction (interface)      |

## 📁 Code Reference  
- See `/LLD/OCP/bad_code/InvoiceDao.java`  
- See `/LLD/OCP/good_code/InvoiceDao.java`, `InvoiceDaoDB.java`, `Invoice.java`
