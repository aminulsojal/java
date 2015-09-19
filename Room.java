/**
 * Created by Sojal on 9/18/2015.
 */
public class Room {
    private
    String hallName;
    int roomNo;
    boolean status; // room allotment status
    public
    Room(){

    }
    Room(String hallName1,int roomNo1)
    {
        hallName = hallName1;
        roomNo = roomNo1;
        status = false;
    }
    String getHallName(){
        return hallName;
    }
    void setHallName(String hallName1)
    {
        hallName = hallName1;
    }

    int getRoomNo()
    {
        return roomNo;
    }
    void setRoomNo(int roomNo1)
    {
        roomNo = roomNo1;
    }
    boolean getStatus()
    {
        return status;
    }
    void setStatus(boolean status1)
    {
        status = status1;
    }

    void print()
    {
        if(status == false)
        System.out.println("Room No " + getRoomNo() + ", of " + getHallName() + " Hall is currently available for allotment.");
        else
            System.out.println("Room No " + getRoomNo() + ", of " + getHallName() + " Hallis currently alloted.");

    }
}
