/*
Student Name: Eros Lima Coelho
Student Number: 3151957
*/

public class Grades {

public int gradesMax(int [] grades){

//    checks if the array is empty, if so throw in illegal exception
    if (grades == null || grades.length == 0){
        throw new IllegalArgumentException("Array cannot be empty!");
    }

//    sets the current maximum as the first element of the grades array
    int max = grades[0];

//    simply sorting through the array and determining which element is greater
    for (int grade : grades){
        if (grade > max){
            max = grade;
        }
    }
    return max;
    }

    public int gradesTotal(int[] grades){

        if (grades == null || grades.length == 0){
            throw new IllegalArgumentException("Array cannot be empty!");
        }

//        initialise variable sum as 0
        int sum = 0;

//        iterate through the loop, adding all elements into the sum variable
        for (int grade : grades){
            sum += grade;
        }
    return sum;
    }

    public double gradesAverage(int[] grades){

        if (grades == null || grades.length == 0){
            throw new IllegalArgumentException("Array cannot be empty!");
        }

//        initialise variable sum as 0
        int sum = 0;

//        iterate through the loop, adding all elements into the sum variable
        for (int grade : grades){
            sum += grade;
        }

//        does the exact same thing as gradesTotal, but ultimately divides the sum by the number of elements in the array, thus giving us the average
        int arrayLength = grades.length;
        double average = (double) sum/ (arrayLength);

//        could return "(double) sum / arrayLength" but thought adding the variable average would make it more readable
    return average;
    }

    public int countFails(int[] grades, int minGrade){

        if (grades == null){
            throw new IllegalArgumentException("Array cannot be empty!");
        }

//        this change on the exception handling ensures that, should countFail be zero (ie no fails), the method simply returns 0 (as in, no one failed)
        if (grades.length == 0){
            return 0;
        }

        int failCount = 0;

//        not much to comment, iterates through the array, for each element lesser than minGrade, means one person failed, keep count of it
        for (int grade : grades){
            if (grade < minGrade){
                failCount++;
            }
        }
    return failCount;
    }
}