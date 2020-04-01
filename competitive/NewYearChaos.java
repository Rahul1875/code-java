     /*
     It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by  from  at the front of the line to n at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if  and Person5 bribes Person4, the queue will look like this: 1,2,3,5,4,6,7,8.

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!
     
     */
     
     // Complete the minimumBribes function below.
        static void minimumBribes(int[] q) {
            int count=0;
        for(int i=1;i<q.length;i++){
            int k = q[i-1]-(i-1);
            if(k>3 || k<-3){
                System.out.println("Too chaotic");
                return;
            } else{
                int j = i-1;
                int key = q[i];
                while(j >= 0 && q[j]>key){
                    q[j+1] = q[j];
                    count++;
                    j--;
                }
                q[j+1]=key;

            }
        }
        System.out.println(count);
        }
