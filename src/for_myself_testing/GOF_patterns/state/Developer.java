package for_myself_testing.GOF_patterns.state;

public class Developer {
 Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleeping){
            setActivity(new Training());
        }
        else if(activity instanceof Training){
            setActivity(new Codiing());
        }
        else if (activity instanceof Codiing){
            setActivity(new Reading());
        }
        else if (activity instanceof  Reading){
            setActivity(new Sleeping());
        }
    }

   public void justDoIt(){
        activity.justDoIt();
   }

}


