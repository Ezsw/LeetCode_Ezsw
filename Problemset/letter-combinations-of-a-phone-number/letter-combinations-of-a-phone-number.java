
// @Title: 电话号码的字母组合 (Letter Combinations of a Phone Number)
// @Author: 17816069684
// @Date: 2020-09-03 08:46:52
// @Runtime: 1 ms
// @Memory: 37.8 MB

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations=new ArrayList<>();
        if(digits.length()==0){
            return combinations;
        }
        Map<Character,String>phoneMap=new HashMap<>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");                                    
        }};
        backtrack(combinations,phoneMap,0,digits,new StringBuffer());
        return combinations;
    }
    public void  backtrack(List<String> combinations,Map<Character,String> phoneMap,int index,String digits, StringBuffer combination){
        if(index==digits.length()){
            combinations.add(combination.toString());
        }
        else{
            char digit=digits.charAt(index);
            String letters=phoneMap.get(digit);
            int lettersCount=letters.length();
            for(int i=0;i<lettersCount;i++){
                combination.append(letters.charAt(i));
                backtrack(combinations,phoneMap,index+1,digits,combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
