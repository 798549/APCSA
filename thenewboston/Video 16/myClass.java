public class myClass
{
    private String friendName;
    public void setName(String name){
        friendName = name;
    }
    
    public String getName(){
        return friendName;
    }
    
    public void saying(){
        System.out.printf("Your first friend was %s", getName());
    }
}
