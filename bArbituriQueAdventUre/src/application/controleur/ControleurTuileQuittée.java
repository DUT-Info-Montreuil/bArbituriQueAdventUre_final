package application.controleur;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ControleurTuileQuittÃ©e implements EventHandler<MouseEvent> {

	public ControleurTuileQuittÃ©e() {
		
	}
	
	@Override
	public void handle(MouseEvent event) {
		
		//applique une opacitÃ© totale lorsque la souris n'est plus sur la tuile
				ImageView img = (ImageView) event.getSource();
				img.setOpacity(1);
	}

}
