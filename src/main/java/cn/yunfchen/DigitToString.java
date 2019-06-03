package cn.yunfchen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitToString {
    List<String> list=new ArrayList<String>();
    Map<String,String> map=new HashMap<String, String>();
    public List<String> letterCombinations(String digits) {
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        if(digits.length()!=0)
            BackTrack("",digits);
        return list;
    }
    public void BackTrack(String already,String next){
        if(next.length()==0)
            list.add(already);
        else{
            String key=next.substring(0,1);
            String value=map.get(key);
            for(int i=0;i<value.length();i++){
                String s=already+value.substring(i,i+1);
                BackTrack(s,next.substring(1));
            } 
        } 
    }
    
}
//public class HellowWorld{
//	public static void main(String[] args) {
//		Solution s = new Solution();
//		List<String> list = s.letterCombinations("23");
//		for (String string : list) { System.out.println(string);}
//	}
//	}

