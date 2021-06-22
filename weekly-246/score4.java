class Solution {
    public int numberOfRounds(String startTime, String finishTime) {
        int beginTime=toMinutes(startTime);
        int endTime=toMinutes(finishTime);
        
        int roundBegin=toNextQuater(beginTime);
        int roundEnd=toPrevQuater(endTime);
        
        if(beginTime<endTime){
            return Math.max(0,((roundEnd-roundBegin)/15));
        }
        return (24*60+roundEnd-roundBegin)/15;
    }
    
    public int toMinutes(String str){
        return Integer.parseInt(str.substring(0,2))*60+Integer.parseInt(str.substring(3,5));
    }
    
    public int toPrevQuater(int time){
        return ((time)/15)*15;
    }
    
    public int toNextQuater(int time){
        return ((time+14)/15)*15;
    }
    
}
