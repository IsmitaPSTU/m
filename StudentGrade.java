class StudentGrade{
    private  String student_name;
    private  int student_id;
    private int grade1,grade2,grade3;
      
    public StudentGrade(String name,int id){
        student_name=name ;
        student_id=id;  

    }
    //getter setter 
    public String  getStudentId(){
         return  student_name;
    }
    public void  setStudentName(String name){
         student_name=name;
      
    }
    public int getstudentId(){
         return  student_id;
    }
    public void setStudentId(int id){
        student_id=id;
       
    }

    public void addGrade(int g1,int g2,int g3){
        if(g1>=0 && g1<=100 && g2>=0 && g2<=100 && g3=>0 && g3<=100){
            grade1=g1;
            grade2=g2;
            grade3=g3;
            System.out.println("Grade added successfully");
        }else{
            System.out.println("Invalid grade!");
        }
    }
    public void  showGrade(){
        System.out.println("Name:"+student_name);
        System.out.println("Id:"+student_id);
        System.out.println("Grades:"+grade1+","+grade2+","+grade3);
    } 
        public static void main(String[] args) {
        StudentGrade s= new StudentGrade("Ismita", 2202035);
        s.addGrade(70, 80, 90);
        s.showGrade();
    }
    
}






