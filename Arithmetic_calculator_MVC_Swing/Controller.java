
import javax.swing.*;
import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Controller {
    private boolean clicOperateur = false, update = false;
    private String str = "";
    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        send();
            send2();

    }
    
    

    public void send() {
   		str = model.fonction();
   		str = view.textField.getText() + str;
           view.setTextValue(view.textField.getText() + model.fonction());
   	    view.setTextValue(str); 	
    }
    public void send2() {
   		str = model.fonction();
   		str = view.textField.getText() + str;
           view.setTextValue(view.textField.getText() + model.fonction());
   	    view.setTextValue(str); 	
    }
    
//    View.setTextValue();
    
}
