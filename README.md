# playstore-java
 A PlayStore is a standalone digital marketplace that allows users to browse and download mobile applications (APPs).
 The created program create will allow the creation of a store, filling it with products, creating users and simulating their interaction with the store (purchasing products, adding comments etc).

This project was done to demonstrate the knowledge of inheritance, polymorphism, method overriding, abstract classes, etc

Class Content : - 
Mobile apps and publication items are Content of the PlayStore. 
Each Content (either application or publication) is associated with the following information: an ID, name, number of downloads, price, and reviews. Reviews is a collection of Comment objects (see Group B for details). 
Class Content cannot and should not be instantiated.

Class Application : -
Application is a type of Content. In addition to the data that a content class have, an Application object has an OS type that presents the minimum operating system requirement. An Application object can be initialized as
Application g1 = new Application("g1", "Pokemon", 5.3, "androidV4"); 

In this example 5.3 is the price of the app in dollars, “androidV4” is the OS
requirement. Initially the number of downloads is zero, and the reviews are empty.

Application app1 = new Application("app1", "Calendar", "androidV3"); If no price is provided, the application is then free.

Class Publication : -
Another type of Content is Publication. In addition to the data that the Content class has, a Publication object also has: publisher and number of pages.

Class Book : -
One type of Publication is Book, which has an additional data: the author name. Notes, it is possible that one book have multiple authors.
A Book object can be initialized as
String[] authors = {"L. Tolstoy"}; 
Book b1 = new Book ("b1", "War and Peace", 12.55, "The Russian Messenger",
1225, authors);
“War and Peace” is the name of the book; 12.55 is the price; “The Russian Messenger” is the publisher. The book has 1225 pages and is of course authored by “L. Tolstoy”.

Class Magazine : -
Another type of Publication is Magazine, which has an additional data: volume. A magazine does not contain any author’s name. A Magazine object can be initialized as
Magazine m1 = new Magazine("m1", "Forbes", 8.99, "Forbes Media", 50, 201904);
The name of the magazine here is “Forbes”, selling for $8.99. The publisher is “Forbes Media”. It has 50 pages, and the current volume is 201904. 
You can assume the volume is always an integer showing the year and the month.


Class Comment : -
A Comment class keeps the following data: a User, which is the user who wrote the comment and a string for the comment. A Comment object can be initialized as
Comment comment1 = new Comment(u3, "This is a fantastic book!"); 

Class User : -
The User class has an ID, a name, a phone number and available fund in the account. By default, a new user will start with 500 in balance. A User can be initialized as:
User u1 = new User("u1", "John Doe", "0412000", 200);
User u2 = new User("u2", "Mary Poppins", "0433191"); // Mary has a balance of 500


Class PlayStore : -
The PlayStore class have two attributes: a list of Content and a list of User objects. Note that each content can be uniquely identified by content ID.
An instance of the PlayStore class named store is created in the main method of PlayStoreMain. The interaction with this store is simulated within the main method (see the PlayStoreMain.java class).

Section 2: Functionalities of the classes

User functionalities
1. Method becomePremium. A user can become a Premium user for a cost of $100. A premium user gets 20% discount on each purchase of the contents after becoming premium.

2. Method buyContent, where the parameter is a Content type of object. When a user buys any content, the price of that content needs to be deducted from the balance of that user. 

a. Exceptions must be thrown when trying to buy a content with an insufficient balance. The exception thrown must indicate the cause of error, show an appropriate error message, allowing the caller to respond appropriately and recover if possible.
Note that when you add exceptions the method calls will need to be surrounded by try/catch blocks.

b. A user may buy multiple content. Write a method showContentBought in the User class to show the list of names of all the contents that the user has bought. You may add additional attributes in the User class if necessary.  


3. Write a method for the Content class, where a comment/review (which is a Comment type of object) from users can be added to a Content object. 
4. Write a method showComments in the Content class to show all the comments of a Content object (e.g. a particular game or book).
PlayStore and Admin functionalities
5. Write a method showContent of the PlayStore class to show a list of all available contents. Also write a method for each type of contents to show the list of contents of that type (e.g., show all applications, show all books, show all magazines).
