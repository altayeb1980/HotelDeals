# HotelDeals Spring Boot App

This application is used for connecting to JSON API and presents a bunch of Hotel deals in the UI. It exposes the actuator endpoints as well as the endpoint/findHotels, which search for a hotel based on specific criteria when it gets a Search POSTrequest.

The application up and running in Heroku, in your browser type this URL: https://hotels-deal-app.herokuapp.com/
 


## Instructions for setting the site up in a local sandbox

The application can be run locally in two ways Docker and standalone


## Instructions for setting the site up by Docker
Make sure the docker container install in your windows machine, I try this docker image in docker window  

Type docker ps to make sure the container up and running   

Create a folder in your machine with name expedia and let's assume this folder located in c:\  

C:\mkdir expedia  

cd expedia  

C:\>expedia>  

Clone the project by type git clone https://github.com/altayeb1980/HotelDeals.git  

After the clone finish successfully new folder should be created with name HotelDeals, navigate inside this folder by type  

cd HotelDeals, so the current working directory should be like this  

C:\>expedia>HotelDeals>  

Type dir you should see the list of files and folders listed with Dockerfile as well  

Type docker build -t hotel-deal .  

The image should be created, it will take a time during installation of the OpenJDK, at the end of creation for the image you should get the message "Successfully built".  

Type docker images  

hotel-deal should be listed.  

Type docker run -p 9090:9090 -t hotel-deal  

Tomcat should start running with 9090 port.  

To check if the application runs correctly please type: curl http://localhost:9090/actuator/health or by browser just put the URL, you should receive message {"status":"UP"}, means the application is up.  

To enter to the application type http://localhost:9090 in your browser  



## Instructions for setting the site up by stnadalone
Create a folder in your machine with name expedia and let's assume this folder located in c:\  

C:\mkdir expedia  

cd expedia  

C:\>expedia >  

Clone the project by type git clone https://github.com/altayeb1980/HotelDeals.git  

After the clone finish successfully new folder should be created with name HotelDeals, navigate inside this folder by type  

cd HotelDeals, so the current work directory should be like this  

C:\>expedia>HotelDeals>  

Type dir you should see the list of files and folders listed with target folder as well  

Type cd target  

C:\>expedia>HotelDeals>cd target    

Type dir  

The jar name should be listed inside target folder with name "hotel-deals-1.0.0.jar"  

Type java -jar hotel-deals-1.0.0  

Tomcat should start running with 9090 port.  

To check if the application runs correctly please type: curl http://localhost:9090/actuator/health or by browser just put the URL, you should receive message {"status":"UP"}, means the application is up.  

To enter to the application type http://localhost:9090 in your browser  














