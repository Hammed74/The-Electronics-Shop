WESTERN GOVERNOR UNIVERSITY
D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming. FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.

BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point).


C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Location: mainscreen.html
Lines: 14, 19, 21, 53
Change: Changed names of default titles and headers

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
Location: about.html, About.controller, mainscreen.html
Lines: mainscreen.html Lines: 20 -24
Change: Added about page, added about controller, added about button and back to home button

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
Location: bootstrap.BootStrapData
Lines: 64 - 91
Change: created parts and products, saved parts and products, added logic to only add if product and part list were empty

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

Location: mainscreen.html
Lines: 92
Change: added buy now button

Location: buyNowController.java
Changes: created buy now controller and added mapping for buying a product including inventory update logic.

Location: buySuccess.html
Changes: created page for a successful purchase.

Location: error.html
Changes: created a page in case product is no longer in stock


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

Location: OutsourcedPartForm.html
Lines: 25-29
Changes: Added input fields for max and min inventory

Location: InhousePartForm.html
Lines: 24-28
Changes: Added input fields for max and min inventory

Locattion Part.java
Lines: 33-37, 47, 51-52, 55, 60-61
Changes: added min and max inv to part entity

Location Part.java
Lines: 96-106
Changes: added getter and setter methods for min and max inventory

Location application.properties
Lines: 6
Changes: renamed database, changed url

Location: Part.java
Lines: 115-117
Changes: added logic to make sure inventory falls between max and min

Location: AddInhousePartController.java
Lines: 44-45
Changes: Added inv validator logic to addinhousepartcontroller.java

Location: AddOutsourcedPartController.java
Lines: 46-48
Changes: Added inv validator logic to addOutsourcePartcontroller.java


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.