class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> a= new HashMap<>();
        a.put('I',1);a.put('V',5);a.put('X',10);a.put('L',50);a.put('C',100);a.put('D',500);a.put('M',1000);
        int result =0;
        for(int i=0;i<s.length();i++){
           int c=a.get(s.charAt(i));
           if(i+1<s.length()){
           int d=a.get(s.charAt(i+1));
           if(c<d){
            result-=c;
           }
           else{
            result+=c;
           }
           } 
           else{
            result+=c;
           }
        }
        return result;
    }
}