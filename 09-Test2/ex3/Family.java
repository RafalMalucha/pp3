public class Family {
    public Person[] familyMembers;

    public Family(Person[] familyMembers){
        this.familyMembers = familyMembers;
    }

    public int adult(){
        int amountOfAdultMembers = 0;
        for (Person member : familyMembers){
            if (member.getAge() >= 18){
                amountOfAdultMembers++;
            }
        }
        return amountOfAdultMembers;
    }
}
