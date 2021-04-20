package domain;

/**
 * public class "editor" for description editor
 * @author User
 */

public class Editor extends Artist {

    /**
     * Constructor 1
     * @param electronicEditing
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Constructor 2
     * @param electronicEditing
     * @param skiils 
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Constructor 3
     * @param electronicEditing 
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Constructor 4
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Method for getting Preferences
     * @return 
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Method for setting preferences
     * @param electronic setting boolean value to electronicEditing
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
