package model;

public class ComputerScienceStudent extends Student implements Citizen{

    String favProgrammingLanguage;

    public ComputerScienceStudent(String name, String id, String favProgrammingLanguage) {
        super(name, id);
        this.favProgrammingLanguage = favProgrammingLanguage;
    }

   @Override
    public void newFancyMethod(){
        System.out.println("I like computers!");
   }

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }
}
