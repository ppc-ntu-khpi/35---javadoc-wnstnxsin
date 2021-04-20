package domain;

/**
 * public class "artist" for description of artist
 * @author User
 */

public class Artist extends Employee {

    /**
     * constructor 1
     * @param skiils list of skills
     * @param name name of artist
     * @param jobTitle job Title
     * @param level level
     * @param dept department(?)
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * constructor 2
     * @param skiils list of skills
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * constructor 3
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Method for getting skills 
     * @return array(type: string) of skills
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method for setting skills
     * @param skills is array of skills
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Method for getting skills
     * @return 
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
