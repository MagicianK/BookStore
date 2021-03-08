# BookStore
Simple database interaction written in java for book store. You interact with database by adding and deleting books from your cart and looking at available books. You can look at java source codes in bookStore directory and sql queries on someSQL.sql file.


This project consist 6 classes:
1)Books
2)Cart
3)ConnectDB(to connect for database)
4)Main
5)SQLObject
6)InputKey
and 2 interfaces
1)IBooks (interaction methods)
2)ICart (interaction methods)


In Main.class you user have menu panel to conveniently interact with database. All users have own cart and cart has cart_id. Cart_id equals to 8001 by default.

Books class provide methods for deleting and showing books in books table on the database.

Cart class provide methods for deleting and showing cart_content table in your database

SQLObjects are Books and Cart. They inherit some values from SQLObjects. 

This is a ER diagram for database. It has four tables.

![BookStore](https://user-images.githubusercontent.com/45946407/110332948-38df6880-804b-11eb-94c6-ebecd68543af.png)
