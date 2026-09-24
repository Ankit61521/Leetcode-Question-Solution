class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> outcome = new ArrayList<>();
        generator("",0,0,n,outcome);
        return outcome;
    }
    public void generator(String current,int open, int close,int n ,List<String> outcome){
        if(current.length()==2*n){
            outcome.add(current);
            return;
        }
        if(open<n){
            generator(current +"(",open+1,close,n,outcome);
        }
        if(close<open){
            generator(current+")",open,close+1,n,outcome);
        }
    }
}