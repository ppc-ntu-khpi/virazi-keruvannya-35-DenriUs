package domain;
 
public class Exercise { 
    /**
     * Method that calculates symmetric time count
     * @return symmetric time count
     */
    public static int Calculate(Boolean showExecutionLog) {
        int[] time = new int[2];
        int symmetricTimeCount = 0;

        for (int i = 0; i <= 2; i++) {
            time[0] = i;

            for (int j = 0; j <= 9; j++) {
                time[1] = j;

                if (time[1] < 6) {
                    if (time[0] == 2 && time[1] >= 4) {
                        break;
                    }

                    symmetricTimeCount++;

                    if (showExecutionLog) {
                        System.out.println("(" + symmetricTimeCount + ")" + " Symmetric time: " + time[0] + time[1] + ":" + time[1] + time [0]);
                    }
                }
            }
        }

        return symmetricTimeCount;
    } 
} 