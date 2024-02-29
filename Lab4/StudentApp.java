//LAB 4

public class StudentApp {
    
    public static void main(String[] args){
        
        Student s1 = new Student();
        s1.setName("Beatrix Kiddo");
        
        Student s2 = new Student();
        s2.setName("Dominic Toretto");
        
        Undergraduate u1 = new Undergraduate();
        u1.setName("Barry Allen");
        u1.SetMajor("Forensics");
        u1.SetMinor("Athletics");
        u1.SetCredits(25);
        
        Undergraduate u2 = new Undergraduate();
        u2.setName("John Rambo");
        u2.SetMajor("Conflict Analysis");
        u2.SetMinor("International Affairs");
        u2.SetCredits(20);
        
         Undergraduate u3 = new Undergraduate();
        u3.setName("Ellen Ripley");
        u3.SetMajor("Astrobiology");
        u3.SetMinor("Conflict Analysis");
        u3.SetCredits(15);
        
        Postgraduate p1 = new Postgraduate("John McClain","Prof. Asp Pirin","How to Die Hard");
        Postgraduate p2 = new Postgraduate("Brian Mills", "Dr. No Kia", "Mobile Usage Patterns in Hostage Situations");
        p1.SetStatus("full-time");
        p2.SetStatus("part-time");
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u3.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
     }
}
