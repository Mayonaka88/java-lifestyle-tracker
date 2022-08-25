import java.util.ArrayList;

class Day{
    private String name;
    private int numOfDay;
    private int caloriesGained = 0;
    private double hoursOfSleep = 0;
    private int caloriesBurned = 0;
    private int netCalorieIntake;
    private double totalMinutesSpentWorkingOut = 0;
    private ArrayList<String> foodNameList = new ArrayList<String>();
    private ArrayList<Integer> foodCalories = new ArrayList<Integer>();
    private ArrayList<Integer> foodQuantity = new ArrayList<Integer>();
    private ArrayList<Integer> foodtotalCalories = new ArrayList<Integer>();
    private ArrayList<String> exercisesNameList = new ArrayList<String>();
    private ArrayList<Integer> exercisesCalories = new ArrayList<Integer>();
    private ArrayList<Double> exercisesMinutesPlayed = new ArrayList<Double>();
    private ArrayList<Integer> exercisesTotalCalories = new ArrayList<Integer>();
    
    public Day(int day){
        name = ("day" + day);
        numOfDay = day;
    }

    public String getName(){
        return name;
    }

    public int getCaloriesGained(){
        return caloriesGained;
    }

    public double getHoursOfSleep(){
        return hoursOfSleep;
    }

    public int getCaloriesBurned(){
        return caloriesBurned;
    }

    public double getTotalMinutesSpentWorkingOut(){
        return totalMinutesSpentWorkingOut;
    }

    private int calcNetCalorieIntake(){
        return (caloriesGained - caloriesBurned);
    }

    public int getNetCalorieIntake(){
        netCalorieIntake = calcNetCalorieIntake();
        return netCalorieIntake;
    }

    public void addToCaloriesBurned(int caloriesBurned1){
        caloriesBurned = caloriesBurned + caloriesBurned1;
    }

    public void addToHoursOfSleep(double hoursSlept){
        hoursOfSleep = hoursOfSleep + hoursSlept;
    }

    public void clearHoursOfSleep(){
        hoursOfSleep = 0;
    }

    public void addToMinutesSpentWorkingOut(double minutesWorkedOut){
        minutesSpentWorkingOut = minutesSpentWorkingOut + minutesWorkedOut;
    }

    public void addFoodItem(String foodName, int calories, int quantity){
        foodNameList.add(foodName);
        foodCalories.add(calories);
        foodQuantity.add(quantity);
        int totalCalories = calories * quantity;
        foodtotalCalories.add(totalCalories);
        caloriesGained = caloriesGained + totalCalories;

    }

    public void removeFoodItem(int index){
        if(foodNameList.size() >= (index+1) ){
        foodNameList.remove(index);
        foodCalories.remove(index);
        foodQuantity.remove(index);
        int totalCalories = foodtotalCalories.get(index);
        caloriesGained = caloriesGained - totalCalories;
        foodtotalCalories.remove(index);
        }
        else{
            System.out.println("\n"+"There is no food item there!");
        }

    }

    public void clearFoodList(){
        foodCalories.clear();
        foodNameList.clear();
        foodQuantity.clear();
        foodtotalCalories.clear();
        caloriesGained = 0;
    }

    public void printOutFoodList(){
        System.out.println("\n"+"Food List"+"\n");
        if(foodNameList.isEmpty() != true){
            for (int i=0; i< foodNameList.size(); i++){
                System.out.println((i+1) + ". " + foodNameList.get(i) + " = " + foodCalories.get(i)+ " Calories x " + foodQuantity.get(i)+ " = " + foodtotalCalories.get(i) + " Total Calories");
            }
            
        }
        else{
            System.out.println("The list is empty! Please add food items and try again!");
        }
        System.out.println("\n"+"(End of List)"+"\n");
        System.out.println("\n"+"In total, you gained " +caloriesGained+ " calories today!");
    }

    public void addExercise(String exerciseName, int calories, double minutes){
        exercisesNameList.add(exerciseName);
        exercisesCalories.add(calories);
        exercisesMinutesPlayed.add(minutes);
        int totalCalories = calories * ((int)Math.round(minutes));
        exercisesTotalCalories.add(totalCalories);
        caloriesBurned = caloriesBurned + totalCalories;
        totalMinutesSpentWorkingOut = totalMinutesSpentWorkingOut + minutes;

    }

    public void removeExercise(int index){
        if(exercisesNameList.size() >= (index+1) ){
        exercisesNameList.remove(index);
        exercisesCalories.remove(index);
        totalMinutesSpentWorkingOut = totalMinutesSpentWorkingOut - exercisesMinutesPlayed.get(index);
        exercisesMinutesPlayed.remove(index);
        int totalCalories = exercisesTotalCalories.get(index);
        caloriesBurned = caloriesBurned - totalCalories;
        exercisesTotalCalories.remove(index);
        }
        else{
            System.out.println("\n"+"There are no exercises there!");
        }

    }

    public void clearExerciseList(){
        exercisesNameList.clear();
        exercisesCalories.clear();
        exercisesMinutesPlayed.clear();
        exercisesTotalCalories.clear();
        caloriesBurned = 0;
        totalMinutesSpentWorkingOut = 0;
    }

    public void printOutExerciseList(){
        System.out.println("\n"+"Exercises List"+"\n");
        if(exercisesNameList.isEmpty() != true){
            for (int i=0; i< exercisesNameList.size(); i++){
                System.out.println((i+1) + ". " + exercisesNameList.get(i) + " = " + exercisesCalories.get(i)+ " Calories x " + exercisesMinutesPlayed.get(i)+ " minutes = " + exercisesTotalCalories.get(i) + " Total Calories");
            }
            
        }
        else{
            System.out.println("The list is empty! Please add some exercises and try again!");
        }
        System.out.println("\n"+"(End of List)"+"\n");
        System.out.println("\n"+"In total, you burned " +caloriesBurned+ " calories and worked out for " +totalMinutesSpentWorkingOut+ " minutes today!");
    }

    public double getMinutesSpentOnExecise(int index){
        return exercisesMinutesPlayed.get(index);
    }



}