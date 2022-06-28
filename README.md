# PetInsuranceCapstone
June 13, 2022
Generated my dependencies using spring.io
Captured a picture of all my dependencies
Unzipped the file
Opened Heidi SQL and created the database - petinsurance_ow
Uploaded project into Eclipse
Then I went into application.properties and added the database in line 2
Then I created a model package
Then I created a Owner class that will be a table within my database
I annotated with @Entity, @Table @Id, @GeneratedValue(strategy = GenerationType.AUTO) and @Column
I put in the default constructor, the constructor with fields, getters/setters, and toString
Ran the application to make sure that my table was created and that my database was connected = success!
Created class in my model package called “Pet” this will house and id, name, breed
Created class in my model package called “Medicine” this will house id, medicine
Created class in my model package called “ContactUs” this will house email

Now I need to learn how to add three more tables and connect two with id table (foreign keys)
I wasn't able to connect my owner, pet and medicine entities using onetomany annotations

Ran my application and all tables were created. Each table has a primary id key…

Issues - having trouble with foreign key implementation

Was able to connect tables with onetomany implementation

I stopped with the backebd and completed the frontend

created the CRUD but used @RestController instead of @Controller and had to completely re-do my CRUD

Issues with security - wanted to have the welcome, about, contact page load before having to force login

finally project was complete after many revisions and sleepless nights
