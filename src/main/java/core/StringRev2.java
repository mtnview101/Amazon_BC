package core;

class StringRev2{
    public static void main(String args[]){
    	String a="Sometimes when a video is playing, the quality of the picture might get fuzzy or blurry";
    String str[] = a.split(" ");
    String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--){finalStr += str[i]+" ";}
        System.out.println(finalStr);
        
        StringBuffer sb=new StringBuffer(a);
        String reverse_sb=sb.reverse().toString();
        System.out.println(reverse_sb);
        
        String sb_str[]=reverse_sb.split(" ");
        String straight_sb="";
        for(int i=sb_str.length-1;i>=0;i--){
        	straight_sb+=sb_str[i]+" ";}
        System.out.println(straight_sb);
        System.out.println(a);
    }
}
