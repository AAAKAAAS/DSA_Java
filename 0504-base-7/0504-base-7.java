class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean neg=false;
        if(num<0){
            num*=-1;
             neg=true;
        }
        
        for(int i=num;i>0;i=i/7){
            
            int d=i%7;
            sb.append(d);
        }
        if(neg)sb.append("-");
        return sb.reverse().toString();
    }
}