A simple Hello world Rest application deployed on Docker

Steps to run this.

1. Clone this repository
2. Package the project by running mvn package
3. Then run the image as below
    docker run -p 8080:8080 hello-rest
5. Then access it by running http://localhost:8080/api/greeting
6. To stop the Docker container, run the below
   
    a) Get the container id of hello-rest by running below
         docker ps
    b) Then stop the container by running below,
        docker stop CONTAINER_ID

		
I have updated it to add the code for binding the filters to JAX-RS resources. By default, it uses NameBinding. 
If you want to implement the Dynamic Binding then do the below steps,

1. Uncomment the line //@Provider in the AppKeyFeature.java class
2. Comment out the AppKeyVerifier.java and AppKeyVerifierFilter classes
3. Comment out @AppKeyVerifier line in UserResource.java class.







