public class Bird {

    private final String name;
    private final String latinName;
    private int observations;


    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        observations = 0;
    }

    public void observe(){
        observations++;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return (name + " (" + latinName+ "): " + observations + " observations.");
    }


}
