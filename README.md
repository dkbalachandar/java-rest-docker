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
				
I have added Users service and Filtring logic.

