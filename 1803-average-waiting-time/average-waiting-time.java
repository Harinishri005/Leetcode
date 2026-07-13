class Solution {
    public double averageWaitingTime(int[][] customers) {
        double waiting_time=0;
        double current_time=0;
        for(int [] arr:customers){
            int arrival=arr[0];
            int cooktime=arr[1];
            if(current_time<=arrival){
                current_time=arrival;
            }
            else{
                waiting_time+=(current_time-arrival);
            }
            waiting_time+=cooktime;
            current_time+=cooktime;
  
        }
        return (double)waiting_time/customers.length;
    }
}