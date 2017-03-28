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
public class DeleteCommand implements Command{
    private Document document;
    private String tekst;
    private int eersteVoorkomen;
    
    public DeleteCommand(Document document, String tekst){
        this.document = document;
        this.tekst = tekst;
    }
    
    @Override
    public void execute() {
        eersteVoorkomen = document.getFirstIndexOf(tekst);
        document.erase(tekst);
    }

    @Override
    public void undo() {
        document.insert(tekst, eersteVoorkomen);
    }
    
}
