package mediation;

public class Mediator {

	public static void execute(Action action, String words, Action... action2) {
	    StringBuffer cusNames = new StringBuffer();
	    for (Action act : action2){
	        cusNames.append(act.getName()+" ");
        }
	    String msg = "【"+action.getName() + "】 对【 "+cusNames.toString()+"】说："+words;
	    System.out.println(msg);
	}
}
