public class ClassRoom {
    private int classid;
    private String className;

    public ClassRoom() {

    }
    public ClassRoom(int id, String name){
        classid = id;
        className = name;
    }

    public int getClassid() {
        return classid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String toString() {
        return "" + classid +" "+ className;
    }
}
