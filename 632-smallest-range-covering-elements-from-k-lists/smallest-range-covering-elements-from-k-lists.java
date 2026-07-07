class  data
{
    int num,r,c;
    data(int n,int i,int j)
    {
      num=n;r=i;c=j;
    }
}

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<data> pq=new PriorityQueue<>((a,b)->a.num-b.num);
        int minR=Integer.MAX_VALUE;
        int maxR=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++)
        {
            pq.offer(new data(nums.get(i).get(0),i,0));
            minR=Math.min(minR,nums.get(i).get(0));
            maxR=Math.max(maxR,nums.get(i).get(0));
        }
        int mi=minR;int ma=maxR;
        while(pq.size()==nums.size())
        {
            data cur=pq.poll();
            int num=cur.num;int row=cur.r;int col=cur.c;
            if(col+1<nums.get(row).size()){
            pq.offer(new data(nums.get(row).get(col+1),row,col+1));
            maxR=Math.max(maxR,nums.get(row).get(col+1));
            minR=pq.peek().num;}
            if(maxR-minR<ma-mi){mi=minR;ma=maxR;}
        }
        return new int[]{mi,ma};
        
    }
}
