 /* 
 A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.

For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high. Finally, he returns to sea level and ends his hike
  */
  
  // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int valley=0;
        int sum =0;

        for(int i =0; i< s.length();i++){

            if(s.charAt(i)=='U'){
                sum++;
            }
            if(s.charAt(i)=='D'){
                sum--;
            }
            if(sum==0 && s.charAt(i)=='U'){
                valley++;
            }
        }
        return valley;
        

    }
