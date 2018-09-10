# HotelDeals Spring Boot App

This application is used for connect to JSON Api and presents a bunch of Hotel deals in the UI. It exposes the `actuator` endpoints as well as the `/findHotels` endpoint, which search for a hotel based on specifiec criteria when it gets a Search `POST` request.


Check the application by type in your browser this url: https://hotels-deal-app.herokuapp.com/


## Instructions for setting the site up in a local sandbox

The application based on two ways Docker and standalone


## Instructions for setting the site up by Docker
Make sure the docker container install in your windows machine, i try this docker image in docker window  
Type docker ps to make sure the container up and running   
Create folder in your machine with name expedia and let's assume this folder located in c:\  
C:\mkdir expedia  
cd expedia  
C:\>expedia>  
Clone the project by type git clone 
after you clone the project new folder shopuld be create with name HotelDeals, navigate inside the folder by type cd HotelDeals, so the current work directory should be luke this
C:\>expedia>HotelDeals>
Type dir you should see Dockerfile listed
Type docker ps in order to make sure the docker container run locally.
Type docker build -t hotel-deal .
the image should be created, it will take a time durring install the openJdk, and the end you should get Successfully built.
Type docker images
hotel-deal should be listed.
Type docker run -p 9090:9090 -t hotel-deal
you should see the tomcat start running with 9090 port.
To check if the application run correctly please type: curl http://localhost:9090/actuator/health or by browser just put the url, you should see {"status":"UP"}, means the application ready and up.
to enter to the application type http://localhost:9090



## Instructions for setting the site up by stnadalone












