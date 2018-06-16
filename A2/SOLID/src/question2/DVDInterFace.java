package question2;

import java.time.Duration;
import java.util.ArrayList;

public interface DVDInterFace extends ILibraryItem {
	
	public Duration GetPlayTime();
	public ArrayList<String> GetCastList();

}
