A simple Hello world Rest application deployed on Docker

Steps to run this.

1. Clone this repository
2. Package the project by running mvn package
3. Then build the image by running the below command[ Make sure that install the docker before this. 
    docker build -t helloworld-docker .
4. Then run the image as below
    docker run -p 8081:8081 helloworld-docker
5. Then access it by running http://localhost:8082/api/greeting
6. To stop the Docker container, run the below
   
    a) Get the container id of helloworld-docker by running below
         docker ps
    b) Then stop the container by running below,
        docker stop CONTAINER_ID

