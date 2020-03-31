  /*  
  
  Sherlock considers a string to be valid if all characters of the string appear the same number of times. 
  It is also valid if he can remove just  character at  index in the string, and the remaining characters will 
  occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO
  
  For example, if , it is a valid string because frequencies are . So is  because we can remove one  and have 
  of each character in the remaining string
*/
  
  static String isValid(String s) {
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int i =0; i<s.length();i++){
            char key = s.charAt(i);
            if(hashMap.containsKey(key)){
                int res = hashMap.get(key);
                res++;
                hashMap.put(key,res);
            } else {
                hashMap.put(key, 1);
            }
        }
       
        Set<Integer> set = new HashSet<Integer>(hashMap.values());
       
        if(set.size()<=1){
            return "YES";
        } else if (set.size()>=3){
            return "NO";

        } else{
             List<Integer> list = new ArrayList<Integer>(hashMap.values());
             int count =0;
            for(int x : list){
                if(x==1){
                    count++;   
                }
            }
            if(count<=1){
                   List<Integer> lt = new ArrayList<Integer>(set);
                   Collections.sort(lt);
                  int diff = lt.get(1)-lt.get(0);
                  if(diff==2){
                  return "NO";
              }
                return "YES";
            } else {
                return "NO";
            }
        }
    }
