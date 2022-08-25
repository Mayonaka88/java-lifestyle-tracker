class User{
    private double weight;
    private double height;
    private double bmi;
    private int caloriesIntakeGoal;
    private String body;
    private String name;
    private String gender;
    private int age;
    private double hoursSleptPerWeek = 0;
    private double minutesWorkedOutPerWeek = 0;
    

    public User(double weight1, double height1, int caloriesIntakeGoal1, String name1, String gender1, int age1){
        name = name1;
        gender = gender1;
        weight = weight1;
        height = height1;
        caloriesIntakeGoal = caloriesIntakeGoal1;
        bmi = (weight / (height*height))*10000;
        body = bodyType(bmi);
        age = age1;
    }

    private String bodyType(double bmi1){
        Long bmiRounded = Math.round(bmi1);
        if(bmiRounded <= 18){
            return "Underweight";
        }
        else if((bmiRounded > 18) && (bmiRounded <= 24)){
            return "Healthy";
        }
        else if((bmiRounded > 24) && (bmiRounded <= 29)){
            return "Overweight";
        }
        else if((bmiRounded > 29) && (bmiRounded <= 39)){
            return "Obese";
        }
        else{
            return "Extremely Obese";
        }
    }

    public String getBodyType(){
        return body;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }


    public double getBMI(){
        return bmi;
    }

    public int getCaloriesIntakeGoal(){
        return caloriesIntakeGoal;
    }

    public int getAge(){
        return age;
    }

    public void addToHoursSleptPerWeek(double hours){
        hoursSleptPerWeek = hoursSleptPerWeek + hours;
    }

    public void removeFromHoursSleptPerWeek(double hours){
        hoursSleptPerWeek = hoursSleptPerWeek - hours;
    }

    public double getTotalHoursSleptPerWeek(){
        return hoursSleptPerWeek;
    }

    public double getAverageHourSleptPerDay(){
        return (hoursSleptPerWeek / 7);
    }

    public void addToMinutesWorkedOutPerWeek(double minutes){
        minutesWorkedOutPerWeek = minutesWorkedOutPerWeek + minutes;
    }

    public double getMinutesWorkedOutPerWeek(){
        return minutesWorkedOutPerWeek;
    }

    public double getAverageMinutesWorkedOutPerWeek(){
        return (minutesWorkedOutPerWeek / 7);
    }

    public void removeFromMinutesWorkedOutPerWeek(double minutes){
        minutesWorkedOutPerWeek = minutesWorkedOutPerWeek - minutes;
    }
    
}