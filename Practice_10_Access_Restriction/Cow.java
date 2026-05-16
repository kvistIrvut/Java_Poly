package Practice_10_Access_Restriction;

public class Cow {
    public void ordinaryMoo(){
        System.out.println("Moo for everybody");
        return;
    }

    private void freindlyMoo(){
        System.out.println("Freindly Moo for Cow class");
        return;
    }

    protected void peacefulMoo(){
        System.out.println("Peaceful Moo for subclassess");
        return;
    }

    void neighborMoo(){
        System.out.println("Moo to neighbor class");
        return;
    }


    public void show() {
        this.ordinaryMoo();
        this.freindlyMoo();
        this.peacefulMoo();
        this.neighborMoo();
        return;
    }
}
