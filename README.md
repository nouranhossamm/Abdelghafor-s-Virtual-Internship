# Abdelghafor's Virtual Internship

### Task 5: Online Shopping Cart System

### UML Diagram
---------------

```markdown

**Online Shopping Cart System UML Class Diagram**
=====================================================

                            +--------------------+
                            |    OnlineShopping  |
                            +--------------------+
                            | - productList      |
                            | - userList         |
                            | + browseProducts() |
                            | + searchProducts() |
                            | + checkout()       |
                            +--------------------+
                               |             |
                               | 1..*        | 1..*
                               |             |
                               v             v
                        +----------------+   +----------------+
                        |      Product   |   |     User       |
                        +----------------+   +----------------+
                        | - name         |   | - userInfo     |
                        | - description  |   | - cart         |
                        | - price        |   |                |
                        | - stockQuantity|   |                |
                        +----------------+   +----------------+
                        |
                        | 1..1
                        |
                        v
                +-------------------+
                |     Cart          |
                +-------------------+
                | - products        |
                | - total           |
                | + addItem()       |
                | + removeItem()    |
                | + updateQuantity()|
                | + calculateTotal()|
                +-------------------+
                        |
                        | 1..*
                        |
                        v
                +-------------------+
                |     Order         |
                +-------------------+
                | - orderSummary    |
                | - paymentStatus   |
                | - shippingDetails |
                | + processPayment()|
                | + confirmOrder()  |
                +-------------------+