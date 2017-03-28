package domein;

import java.util.ArrayDeque;
import java.util.Deque;

public class DomeinController {

    private Document document = new Document();
    private Deque<Command> commands = new ArrayDeque<>();
    
    public String readDocument() {
        return document.readDocument();
    }

    public void execute(String tekst, String actie) {
        //TODO
        Command command = CommandFactory.createCommand(actie, document, tekst);
        commands.push(command);
        command.execute();
    }
    
    public void undo(){
        if(!commands.isEmpty()){
            Command command = commands.pop();
            command.undo();
        }
    }
}
