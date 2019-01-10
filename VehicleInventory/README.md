
Steps to set up the Vehicle Inventory API:

1. Download the code from following GITHUB url:
https://github.com/rameshmsat126/VehicleInventory

2. Import the code into STS/Eclipse as Maven existing project.


3. Right click the imported project in IDE and do MAVEN project update

4. Clean/Build the project 

5. Right click on the project and click "Run As" --> "Run on Server"

6. Server will be started and Vehicle Inventory project will be deployed.

7. Welcome Page URL after appication got successfully deployed:

	URL : http://localhost:8080/VehicleInventory/
	Message : Welcome to Vehicle Inventory.

Steps to start Vehicle Inventory API Consumption:

1. It is a prerequisite step to Create the Vehicle Inventory DB before executing any other API's.


URL : http://localhost:8080/VehicleInventory/vehicle/repo
Method Type : POST

Response Message : Inventory Database created successfully


2. Insert Vehicle Inventory by Type of the Vehicle:

Vechicle Types: CAR, TRUCK,  AIRPLANE, DRONE, AMPHIBIAN, BOAT

URL: http://localhost:8080/VehicleInventory/vehicle/<Vehicle Type>
Example 1: http://localhost:8080/VehicleInventory/vehicle/CAR
Example 2: http://localhost:8080/VehicleInventory/vehicle/TRUCK

Method Type : POST
Sample Request : 

{
    "name": "Sedan",
    "year": 2019,
    "make": "Nissan",
    "model": "altima",
    "engine": "2.5 S"
}

Reponse Message : Vehicle Inserted Successfully


3. Retrieve Vehicle Details by Vehicle ID
URL : http://localhost:8080/VehicleInventory/vehicle/<Vehicle ID>
Example : http://localhost:8080/VehicleInventory/vehicle/1

Method Type : GET

Sample Request : NA

Reponse Message : 

{
    "id": 1,
    "type": "CAR",
    "name": "Nissan alitima",
    "year": 2019,
    "make": "Nissan",
    "model": "altima",
    "engine": "2.8"
}



4. Retrieve All Vehicle Details by Year

URL : http://localhost:8080/VehicleInventory/vehicle/year/<Year>
Example: http://localhost:8080/VehicleInventory/vehicle/year/2019

Method Type : GET

Sample Request : NA

Reponse Message : 

[
    {
        "id": 1,
        "type": "CAR",
        "name": "Nissan alitima",
        "year": 2019,
        "make": "Nissan",
        "model": "altima",
        "engine": "2.8"
    },
    {
        "id": 3,
        "type": "AIRPLANE",
        "name": "Sedan",
        "year": 2019,
        "make": "Nissan",
        "model": "altima",
        "engine": "2.5 S"
    }
]


5. Retrieve All Vehicle Details 
URL : http://localhost:8080/VehicleInventory/vehicle/all

Method Type : GET

Sample Request : NA

Reponse Message : 

[
    {
        "id": 1,
        "type": "CAR",
        "name": "Nissan alitima",
        "year": 2019,
        "make": "Nissan",
        "model": "altima",
        "engine": "2.8"
    },
    {
        "id": 2,
        "type": "AIRPLANE",
        "name": "Deccan",
        "year": 2018,
        "make": "Deccan",
        "model": "AirIndia",
        "engine": "2.8"
    },
    {
        "id": 3,
        "type": "AIRPLANE",
        "name": "Sedan",
        "year": 2019,
        "make": "Nissan",
        "model": "altima",
        "engine": "2.5 S"
    }
]


6. Update Vehicle Details 
URL : http://localhost:8080/VehicleInventory/vehicle/update

Method Type : PUT

Sample Request : 
{
    "id": 3,
    "type": "CAR",
    "name": "Nissan alitimaaaaaaaaaaaaa",
    "year": 2018,
    "make": "Nissannn",
    "model": "altimaaaaaaaaaaa",
    "engine": "2.8"
}

Reponse Message : 

{
    "id": 3,
    "type": "CAR",
    "name": "Nissan alitimaaaaaaaaaaaaa",
    "year": 2018,
    "make": "Nissannn",
    "model": "altimaaaaaaaaaaa",
    "engine": "2.8"
}

7. Delete Vehicle Details  which was added recently

URL : http://localhost:8080/VehicleInventory/vehicle/delete

Method Type : DELETE

Sample Request : NA

Reponse Message : Vehicle Deleted Successfully
