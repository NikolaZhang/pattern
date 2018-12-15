package mediation;

public abstract class Action {
    private String name;

    public String getName() {
        return name;
    }

    public Action(String name) {
        this.name = name;
    }

	public void saySomething(String words, Action... action){
        Mediator.execute(this, words, action);
	}
}
