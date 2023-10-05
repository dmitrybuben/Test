package Test;

import java.util.List;

public class Animal {
    private String name;
    private List<String> commands;

    public Animal(String name, List<String> commands) {
        this.name = name;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }
    public void listCommands(){
        for (String command : commands) {
            System.out.println(command);
        }
    }

    public void addCommand(String command) {
        commands.add(command);
    }
}
