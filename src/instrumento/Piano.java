package instrumento;

import java.util.List;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import notasMusicais.Nota;

public class Piano {

	public void tocar(List<Nota> musica){
		
		Player player = new Player();
		
		StringBuilder music = new StringBuilder();
		for(Nota nota: musica){
			music.append(nota.codigo()+" ");
		}
		System.out.println(music.toString());
		
		player.play(music.toString());
		
	}
}
