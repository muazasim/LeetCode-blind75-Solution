// Date : 31/05/2024

// Problem: Best Time to Buy and Sell Stock
// Solution:
class Solution {
    public int maxProfit(int[] prices) {
        int day=0;
        int profit=0;
        for(int i = 0; i<prices.length; i++){

            for (int j=i+1;j<prices.length;j++){
                int curp=prices[j]-prices[i];
                if(curp>0 && curp>profit){
                    System.out.println("buy on Day "+ i + "sell on Day"+j);
                    profit=curp;
                    day=j;
                } 
            }
        }
        return day>0? day+1 : day;
    }
} 


