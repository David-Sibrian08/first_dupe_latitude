# Duplicate Finder
This is a basic Java program that finds the first duplate in a list fo given numbers.

## Running The Program
1. Clone the repository to your local machine  
`git clone https://github.com/David-Sibrian08/first_dupe_latitude.git`
2. Go into the project directory  
`cd first_dupe_latitude`
3. Making sure you have Maven installed, Run the following command  
`mvn clean install`
4. Run the program with the following command, followed by the list of numbers  
`java -cp target/first-first-duplicate-1.0-SNAPSHOT.jar org.example.Main 1 2 3 1`  
The program will output the first duplicate value in the input, or -1 if no duplicates are found.  
**NOTE: The name is *first-first-duplicate*, this was a naming error on my part in the artifactid.**

## Running The Tests
* The tests should run with only  
`mvn test`

## Assumptions Made
* Only integers will be provided (positive and negatives work)
* The input may contain multiple duplicates (only the first duplicate found will be returned)
* The input may be empty
