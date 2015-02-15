
package infinotes.factory;

import infinotes.theory.ChordProgression;
import infinotes.theory.Degree;
import infinotes.theory.Duration;
import infinotes.theory.KeySignature;
import infinotes.theory.TimeSignature;
import infinotes.theory.Type;

import java.util.Random;

public class ChordProgressionFactory{	
	private static final Random R = new Random();
	private final KeySignature keySignature;
	private final TimeSignature timeSignature;
	
	private ChordProgressionFactory(KeySignature keySignature, TimeSignature timeSignature){
		this.keySignature = keySignature;
		this.timeSignature = timeSignature;
	}
	
	public static ChordProgressionFactory make(KeySignature keySignature, TimeSignature timeSignature){
		return new ChordProgressionFactory(keySignature, timeSignature);
	}
	
	public ChordProgression makeChordProgression(double lengthOfChordProgression){
		//TODO temp
		return ChordProgression
			.builder()
			.put(Degree.SUBDOMINANT, Type.MAJOR_SEVENTH, Duration.WHOLE)
			.put(Degree.DOMINANT, Type.MAJOR, Duration.WHOLE)
			.put(Degree.MEDIANT, Type.MINOR_SEVENTH, Duration.WHOLE)
			.put(Degree.SUBMEDIANT, Type.MINOR, Duration.WHOLE)
			.put(Degree.SUPERTONIC, Type.MINOR_SEVENTH, Duration.WHOLE)
			.put(Degree.DOMINANT, Type.MAJOR, Duration.WHOLE)
			.put(Degree.TONIC, Type.MAJOR, Duration.WHOLE)
			.put(Degree.TONIC, Type.MAJOR, Duration.WHOLE)
			.build();
	}
}