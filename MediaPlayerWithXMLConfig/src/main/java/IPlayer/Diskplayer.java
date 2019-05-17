package IPlayer;

import org.springframework.beans.factory.annotation.Autowired;

public class Diskplayer implements Player{

	
	@Autowired
	public Diskplayer(Disk d) {
		super();
		this.d = d;
	}



	Disk d;
	
	
	
	@Override
	public void play() {
		this.d.play();
		
	}

}
