# Design Patterns - Chain of Responsibility and Observer Exercise
Exercise of Chain of Responsibility and Observer Design Patterns for the class Bonnes pratiques de développement logiciel

## Problem
We have a small web server that receive requests with the method getRequest();
The first parameter is the path of the request, and the second is an object that represents the
user that is currently logged in.

The only valid paths for our web app are "/dashboard" and "/home".
- "/dashboard" is only accessible to admin users.
- "/home" is accessible to any user.

The web server writes directly its response to the console using System.out.println.

When a non authorized user wants to access the content, the webserver must respond with the message :
"Status 403 : user is not authorized to access this content"

When we try to access content that do not exist, the server must respons with the message :
"Status 404 : Page missing".

Otherwise the server respond with the asked content which is :
- "/dashboard" => "Status 200 : Dashboard content here"
- "/home" => "Status 200 : Home content here"

We also want to have a file system log of all request that were made.

## Chain of Responsibility
Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

In our case the chain of responsibility was used to do some verifications such as:
1. if the provided path is valid 
2. if the user has the rights access to that endpoint
3. display the message of success 
All of that in this order, using handlers in chain.

## Observer
Observer is also a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

In our case the observer pattern was used to notify the fileLogger everytime a request is made.
- Observable: Web Request
- Observer: File Logger