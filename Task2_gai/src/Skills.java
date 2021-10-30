public class Skills {

    private String name;
    private int defbroke;
    private double upatk;
    public Skills (String name , int defbroke , double upatk){
        this.name = name;
        this.defbroke = defbroke;
        this.upatk = upatk;
    }


    public String getSkillsname(){
        return name;
    }

    public int getSkillsdefbroke(){
        return defbroke;
    }

    public double getSkillsupatk(){
        return upatk;
    }
}

