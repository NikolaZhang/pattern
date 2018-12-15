package responsibilitychain;

public abstract class Position {
	private int level; 
	private Position nextPosition;
	private String name;

	public void giveNotice(int level, String notice) {
		if(level>=this.level) {
			System.out.println(this.name+"获取："+notice);
		}
		if(this.nextPosition == null){
			return;
		}
		this.nextPosition.giveNotice(level, notice);
	}

	public void setNextPosition(Position position){
		this.nextPosition = position;
	}

	public Position(int level, String name) {
		super();
		this.level = level;
		this.name = name;
	}

}
