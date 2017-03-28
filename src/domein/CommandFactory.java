/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author bram
 */
public class CommandFactory {
    public static Command createCommand(String command, Document document, String tekst){
        switch(command.toLowerCase()){
            case "delete":
                return new DeleteCommand(document, tekst);
            case "concat":
                return new ConcatCommand(document, tekst);
            default:
                return new NoCommand();
        }
    }
}
