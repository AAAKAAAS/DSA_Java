class Solution {
    final static int I[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        final static String r[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
        
        StringBuilder ab= new StringBuilder();
        for(int i=0;i<I.length;i++){
            while(num>=I[i]){
                num-=I[i];
                ab.append(r[i]);
            }
        }
        return ab.toString();
    }
}