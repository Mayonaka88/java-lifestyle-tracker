import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Hello! Welcome to your personal lifestyle tracker!");
        System.out.println("Before we begin, we will need some information!");
        System.out.println("\n"+"What's your name?");
        String name1 = input.nextLine();
        System.out.println("\n"+"What gender are you (male or female)?");
        String gender1 = input.nextLine();
        System.out.println("\n"+"How old are you?");
        int age1 = input.nextInt();
        System.out.println("\n"+"How much do you weigh (in kilograms)?");
        double weight1 = input.nextDouble();
        System.out.println("\n"+"How tall are you (in centimetres)?");
        double height1 = input.nextDouble();
        System.out.println("\n"+"What's your calorie intake goal per day?");
        int caloriesIntakeGoal1 = input.nextInt();

        User user1 = new User(weight1, height1, caloriesIntakeGoal1, name1, gender1, age1);
        int dayCount = 1;
        Day day1 = new Day(1);
        Day day2 = new Day(2);
        Day day3 = new Day(3);
        Day day4 = new Day(4);
        Day day5 = new Day(5);
        Day day6 = new Day(6);
        Day day7 = new Day(7);
        mainMenu(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
        

    }

    public static void mainMenu(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Welcome " + user1.getName()+" to the main menu!"+"\n");
        System.out.println("Today is day "+dayCount+"! "+"\n");
        System.out.println("What do you want to work on? (Please choose from number 1 to 5)"+"\n");
        System.out.println("1. Calorie Intake Tracker");
        System.out.println("2. Sleep Schedule Tracker");
        System.out.println("3. Workout Tracker");
        System.out.println("4. Proceed To The Next Day");
        System.out.println("5. View Profile");
        System.out.println("6. Exit" +"\n");
        int userInput = input.nextInt();
        switch(userInput){
            case 1: calorieIntakeTracker(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
                break;
            case 2: sleepSchedule(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
                break;
            case 3: workOutTracker(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
                break;
            case 4: dayCount = proceedToNextDay(dayCount);
                    mainMenu(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
                break;
            case 5: viewProfile(user1, day1, day2, day3, day4, day5, day6, day7);
                    mainMenu(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
                break;
            case 6:System.out.println("\n"+"Thank you for using our service! We hope that you enjoyed your experience with us! Goodbye!"+"\n");
                break;
            default: System.out.println("\n"+"Please choose a valued option");
                     mainMenu(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
                     break;
        }
        
    }

    public static void viewProfile(User user1, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7) {
        System.out.println("\n"+"User Profile"+"\n");
        System.out.println("Name: "+ user1.getName());
        System.out.println("Gender: "+ user1.getGender());
        System.out.println("Age: "+ user1.getAge());
        System.out.println("Weight: "+ user1.getWeight()+" kg");
        System.out.println("Height: "+ user1.getHeight()+" cm");
        System.out.println("BMI: "+Math.round(user1.getBMI()));
        System.out.println("Body Type: "+user1.getBodyType());
        System.out.println("Total Hours Slept Per Week: "+user1.getTotalHoursSleptPerWeek()+" hours in total");
        System.out.println("Average Hours Slept Per Day: "+Math.round(user1.getAverageHourSleptPerDay())+" hours per day");
        System.out.println("Total Minutes Worked Out Per Week: "+user1.getMinutesWorkedOutPerWeek()+" minutes in total");
        System.out.println("Average Minutes Worked Out Per Day: "+Math.round(user1.getAverageMinutesWorkedOutPerWeek())+" minutes per day");
        System.out.println("Calorie Intake Goal: " + user1.getCaloriesIntakeGoal()+ " per day");
        System.out.println("Net Calories Per Day: ");
        System.out.println("Day 1: " + day1.getNetCalorieIntake()+" calories");
        System.out.println("Day 2: " + day2.getNetCalorieIntake()+" calories");
        System.out.println("Day 3: " + day3.getNetCalorieIntake()+" calories");
        System.out.println("Day 4: " + day4.getNetCalorieIntake()+" calories");
        System.out.println("Day 5: " + day5.getNetCalorieIntake()+" calories");
        System.out.println("Day 6: " + day6.getNetCalorieIntake()+" calories");
        System.out.println("Day 7: " + day7.getNetCalorieIntake()+" calories");
    }

    public static int proceedToNextDay(int dayCount) {
        if(dayCount<7){
            return (dayCount+1);
        }
        else{
            return 1;
        }
        
    }

    public static void sleepSchedule(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        System.out.println("\n"+"Sleep Schedule Tracker"+"\n");
        System.out.println("It is recommended for a person to sleep 8 hours per day"+"\n");
        switch(dayCount){
            case 1:System.out.println("You slept for " + day1.getHoursOfSleep() +" hours today!");
            break;
            case 2:System.out.println("You slept for " + day2.getHoursOfSleep() +" hours today!");
            break;
            case 3:System.out.println("You slept for " + day3.getHoursOfSleep() +" hours today!");
            break;
            case 4:System.out.println("You slept for " + day4.getHoursOfSleep() +" hours today!");
            break;
            case 5:System.out.println("You slept for " + day5.getHoursOfSleep() +" hours today!");
            break;
            case 6:System.out.println("You slept for " + day6.getHoursOfSleep() +" hours today!");
            break;
            case 7:System.out.println("You slept for " + day7.getHoursOfSleep() +" hours today!");
            break;
        }
        System.out.println("\n"+"You sleep on average " + Math.round(user1.getAverageHourSleptPerDay())+" hours a day per week");
        System.out.println("\n"+"What do you want to do next?"+"\n");
        System.out.println("1. Add to hours slept today");
        System.out.println("2. Clear Hours");
        System.out.println("3. Back to main menu");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
            case 1:addToHours(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
            case 2:clearHours(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
            default:mainMenu(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
        }
    }

    public static void addToHours(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        System.out.println("\n"+"How many hours do you want to add?"+"\n");
        Scanner input = new Scanner(System.in);
        double newHours = input.nextDouble();
        user1.addToHoursSleptPerWeek(newHours);
        switch(dayCount){
            case 1:day1.addToHoursOfSleep(newHours);
            break;
            case 2:day2.addToHoursOfSleep(newHours);
            break;
            case 3:day3.addToHoursOfSleep(newHours);
            break;
            case 4:day4.addToHoursOfSleep(newHours);
            break;
            case 5:day5.addToHoursOfSleep(newHours);
            break;
            case 6:day6.addToHoursOfSleep(newHours);
            break;
            case 7:day7.addToHoursOfSleep(newHours);
            break;
        }
        sleepSchedule(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
    }

    public static void clearHours(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        
        switch(dayCount){
            case 1:user1.removeFromHoursSleptPerWeek(day1.getHoursOfSleep());
                day1.clearHoursOfSleep();
            break;
            case 2:user1.removeFromHoursSleptPerWeek(day2.getHoursOfSleep());
                day2.clearHoursOfSleep();
            break;
            case 3:user1.removeFromHoursSleptPerWeek(day3.getHoursOfSleep());
                day3.clearHoursOfSleep();
            break;
            case 4:user1.removeFromHoursSleptPerWeek(day4.getHoursOfSleep());
                day4.clearHoursOfSleep();
            break;
            case 5:user1.removeFromHoursSleptPerWeek(day5.getHoursOfSleep());
                day5.clearHoursOfSleep();
            break;
            case 6:user1.removeFromHoursSleptPerWeek(day6.getHoursOfSleep());
                day6.clearHoursOfSleep();
            break;
            case 7:user1.removeFromHoursSleptPerWeek(day7.getHoursOfSleep());
                day7.clearHoursOfSleep();
            break;
        }
        sleepSchedule(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
    }

    public static void calorieIntakeTracker(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        System.out.println("\n"+"Calorie Intake Tracker"+"\n");
        System.out.println("Your Calorie Intake Goal per day is "+user1.getCaloriesIntakeGoal()+"\n");
        
        switch(dayCount){
            case 1:day1.printOutFoodList();
            OverandUnderEaten(user1, day1);
            break;
            case 2:day2.printOutFoodList();
            OverandUnderEaten(user1, day2);
            break;
            case 3:day3.printOutFoodList();
            OverandUnderEaten(user1, day3);
            break;
            case 4:day4.printOutFoodList();
            OverandUnderEaten(user1, day4);
            break;
            case 5:day5.printOutFoodList();
            OverandUnderEaten(user1, day5);
            break;
            case 6:day6.printOutFoodList();
            OverandUnderEaten(user1, day6);
            break;
            case 7:day7.printOutFoodList();
            OverandUnderEaten(user1, day7);
            break;
        }


        System.out.println("\n"+"What do you want to do next?"+"\n");
        System.out.println("1. Add Food Items");
        System.out.println("2. Remove Food Items");
        System.out.println("3. Clear List");
        System.out.println("4. Go To Main Menu"+"\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
            case 1:addToFoodItemsOfToday(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
            case 2:RemoveForFoodItemsOfToday(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
            case 3:clearFoodList(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
            default:mainMenu(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
        }
    }

    public static void addToFoodItemsOfToday(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"What is the name the food you want to add?"+"\n");
        String foodName = input.nextLine();
        System.out.println("\n"+"How many calories does it contain per serving (or per piece)?"+"\n");
        int foodCalories = input.nextInt();
        System.out.println("\n"+"How many servings (or pieces) have you eaten?"+"\n");
        int foodQuantity = input.nextInt();
        switch(dayCount){
            case 1:day1.addFoodItem(foodName, foodCalories, foodQuantity);
            break;
            case 2:day2.addFoodItem(foodName, foodCalories, foodQuantity);
            break;
            case 3:day3.addFoodItem(foodName, foodCalories, foodQuantity);
            break;
            case 4:day4.addFoodItem(foodName, foodCalories, foodQuantity);
            break;
            case 5:day5.addFoodItem(foodName, foodCalories, foodQuantity);
            break;
            case 6:day6.addFoodItem(foodName, foodCalories, foodQuantity);
            break;
            case 7:day7.addFoodItem(foodName, foodCalories, foodQuantity);
            break;
        }
        calorieIntakeTracker(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
    }

    public static void RemoveForFoodItemsOfToday(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Which food item do you want to remove? (Please choose the number assigned to the item)"+"\n");
        int index1 = input.nextInt();
        switch(dayCount){
            case 1:day1.removeFoodItem((index1-1));
            break;
            case 2:day2.removeFoodItem((index1-1));
            break;
            case 3:day3.removeFoodItem((index1-1));
            break;
            case 4:day4.removeFoodItem((index1-1));
            break;
            case 5:day5.removeFoodItem((index1-1));
            break;
            case 6:day6.removeFoodItem((index1-1));
            break;
            case 7:day7.removeFoodItem((index1-1));
            break;
        }
        calorieIntakeTracker(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
    }

    public static void clearFoodList(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        switch(dayCount){
            case 1:day1.clearFoodList();
            break;
            case 2:day2.clearFoodList();
            break;
            case 3:day3.clearFoodList();
            break;
            case 4:day4.clearFoodList();
            break;
            case 5:day5.clearFoodList();
            break;
            case 6:day6.clearFoodList();
            break;
            case 7:day7.clearFoodList();
            break;
        }
        calorieIntakeTracker(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
    }

    public static void workOutTracker(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        System.out.println("\n"+"Workout Tracker"+"\n");
        System.out.println("It is recommended to workout for at least 30 minutes per day"+"\n");
        
        switch(dayCount){
            case 1:day1.printOutExerciseList();
            break;
            case 2:day2.printOutExerciseList();
            break;
            case 3:day3.printOutExerciseList();
            break;
            case 4:day4.printOutExerciseList();
            break;
            case 5:day5.printOutExerciseList();
            break;
            case 6:day6.printOutExerciseList();
            break;
            case 7:day7.printOutExerciseList();
            break;
        }


        System.out.println("\n"+"What do you want to do next?"+"\n");
        System.out.println("1. Add Exercises");
        System.out.println("2. Remove Exercises");
        System.out.println("3. Clear List");
        System.out.println("4. Go To Main Menu"+"\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
            case 1:addToExercisesOfToday(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
            case 2:RemoveFromExercisesToday(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
            case 3:clearExercisesList(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
            default:mainMenu(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
            break;
        }
    }

    public static void addToExercisesOfToday(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        String exerciseName;
        int calories;
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Choose from the options below:"+"\n");
        System.out.println("1. Jogging");
        System.out.println("2. Jumping rope");
        System.out.println("3. Swimming");
        System.out.println("4. Squats");
        System.out.println("5. Stair climbing");
        System.out.println("6. Rock climbing");
        System.out.println("7. Hiking");
        System.out.println("8. Martial arts");
        System.out.println("9. Spinning");
        System.out.println("10. Rowing");
        System.out.println("11. Kettlebells");
        System.out.println("12. Yoga");
        System.out.println("13. Skiing");
        System.out.println("14. Add your own" +"\n");
        int exerciseChoice = input.nextInt();
        System.out.println("\n"+"For how long did you work out (in minutes)?");
        double newMinutes = input.nextDouble();
        user1.addToMinutesWorkedOutPerWeek(newMinutes);
        switch(exerciseChoice){
            case 1:exerciseName = "Jogging";
            calories = 10;
            break;
            case 2:exerciseName = "Jumping rope";
            calories = 14;
            break;
            case 3:exerciseName = "Swimming";
            calories = 12;
            break;
            case 4:exerciseName = "Squats";
            calories = 15;
            break;
            case 5:exerciseName = "Stair climbing";
            calories = 9;
            break;
            case 6:exerciseName = "Rock climbing";
            calories = 10;
            break;
            case 7:exerciseName = "Hiking";
            calories = 7;
            break;
            case 8:exerciseName = "Martial arts";
            calories = 10;
            break;
            case 9:exerciseName = "Spinning";
            calories = 11;
            break;
            case 10:exerciseName = "Rowing";
            calories = 11;
            break;
            case 11:exerciseName = "Kettlebells";
            calories = 20;
            break;
            case 12:exerciseName = "Yoga";
            calories = 15;
            break;
            case 13:exerciseName = "Skiing";
            calories = 8;
            break;
            default: 
            System.out.println("\n"+"What is the name of your exercise?");
            exerciseName = "(Custom Exercise) " + input.next();
            System.out.println("\n"+"How many calories does it burn per minute?");
            calories = input.nextInt();
            break;
        }

        switch(dayCount){
            case 1:day1.addExercise(exerciseName, calories, newMinutes);
            break;
            case 2:day2.addExercise(exerciseName, calories, newMinutes);
            break;
            case 3:day3.addExercise(exerciseName, calories, newMinutes);
            break;
            case 4:day4.addExercise(exerciseName, calories, newMinutes);
            break;
            case 5:day5.addExercise(exerciseName, calories, newMinutes);
            break;
            case 6:day6.addExercise(exerciseName, calories, newMinutes);
            break;
            case 7:day7.addExercise(exerciseName, calories, newMinutes);
            break;
        }
        workOutTracker(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
    }

    public static void RemoveFromExercisesToday(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Which exercise do you want to remove? (Please choose the number assigned to the exercise)"+"\n");
        int index1 = input.nextInt();
        switch(dayCount){
            case 1:user1.removeFromMinutesWorkedOutPerWeek(day1.getMinutesSpentOnExecise((index1-1)));
            day1.removeExercise((index1-1));
            break;
            case 2:user1.removeFromMinutesWorkedOutPerWeek(day2.getMinutesSpentOnExecise((index1-1)));
            day2.removeExercise((index1-1));
            break;
            case 3:user1.removeFromMinutesWorkedOutPerWeek(day3.getMinutesSpentOnExecise((index1-1)));
            day3.removeExercise((index1-1));
            break;
            case 4:user1.removeFromMinutesWorkedOutPerWeek(day4.getMinutesSpentOnExecise((index1-1)));
            day4.removeExercise((index1-1));
            break;
            case 5:user1.removeFromMinutesWorkedOutPerWeek(day5.getMinutesSpentOnExecise((index1-1)));
            day5.removeExercise((index1-1));
            break;
            case 6:user1.removeFromMinutesWorkedOutPerWeek(day6.getMinutesSpentOnExecise((index1-1)));
            day6.removeExercise((index1-1));
            break;
            case 7:user1.removeFromMinutesWorkedOutPerWeek(day7.getMinutesSpentOnExecise((index1-1)));
            day7.removeExercise((index1-1));
            break;
        }
        workOutTracker(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
    }

    public static void clearExercisesList(User user1, int dayCount, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7){
        
        switch(dayCount){
            case 1:user1.removeFromMinutesWorkedOutPerWeek(day1.getTotalMinutesSpentWorkingOut());
            day1.clearExerciseList();
            break;
            case 2:user1.removeFromMinutesWorkedOutPerWeek(day2.getTotalMinutesSpentWorkingOut());
            day2.clearExerciseList();
            break;
            case 3:user1.removeFromMinutesWorkedOutPerWeek(day3.getTotalMinutesSpentWorkingOut());
            day3.clearExerciseList();
            break;
            case 4:user1.removeFromMinutesWorkedOutPerWeek(day4.getTotalMinutesSpentWorkingOut());
            day4.clearExerciseList();
            break;
            case 5:user1.removeFromMinutesWorkedOutPerWeek(day5.getTotalMinutesSpentWorkingOut());
            day5.clearExerciseList();
            break;
            case 6:user1.removeFromMinutesWorkedOutPerWeek(day6.getTotalMinutesSpentWorkingOut());
            day6.clearExerciseList();
            break;
            case 7:user1.removeFromMinutesWorkedOutPerWeek(day7.getTotalMinutesSpentWorkingOut());
            day7.clearExerciseList();
            break;
        }
        workOutTracker(user1, dayCount, day1, day2, day3, day4, day5, day6, day7);
    }

    public static void OverandUnderEaten(User user1,Day day) {
        if(day.getCaloriesGained()< user1.getCaloriesIntakeGoal()){
            System.out.println("You did not reach your calories intake goal! you need to consume " + (user1.getCaloriesIntakeGoal() - day.getCaloriesGained()) + " more calories to reach your goal!");
        }
        else if(day.getCaloriesGained() == user1.getCaloriesIntakeGoal()){
            System.out.println("You reached your calorie intake goal for today!");
        }
        else{
            System.out.println("You passed your calorie intake goal by " + (day.getCaloriesGained() - user1.getCaloriesIntakeGoal()) + " calories!");
        }
    }

}