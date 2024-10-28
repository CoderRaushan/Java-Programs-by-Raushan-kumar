class jump
{
    public static void main(String[] args) 
    {
        int x=2;
        int y=12;
        for(;y<20;++y)
        {
            if(y%x==0)
            continue;
            else if(y==8)
                break;
            else
                System.out.print(y+" ");
        }
    }
}