/**
 * Created by Sojal on 9/18/2015.
 */
public class Student {
    private
    String studentName;
    String studentNo;
    Room room;
    public
    Student()
    {

    }
    Student(String studentName1,String studentNo1,Room room1)
    {
        studentName = studentName1;
        studentNo = studentNo1;
        room = room1;
    }

    String getStudentName()
    {
        return studentName;
    }
    void setStudentName(String studentName1)
    {
        studentName = studentName1;
    }
    String getStudentNo()
    {
        return studentNo;
    }
    void setStudentNo(String studentNo1)
    {
        studentNo = studentNo1;
    }
    Room getRoom()
    {
        return room;
    }
    void setRoom(Room room1)
    {
        room = room1;
    }
    void print()
    {
        System.out.println("Student No : " + getStudentNo() + " , " + getStudentName()+ " resides on " + room.getHallName()+ " Hall , Room No, " +room.getRoomNo());
    }
}
