package com.jochen.designpatterns.command;

import java.util.Vector;

/**
 * Created by JoChen on 2020/5/23.
 * 命令模式
 */
public class CommandDemo {
    public interface Command {
        void execute();
    }

    public class CutCommand implements Command {
        String arg;

        public CutCommand(String arg) {
            this.arg = arg;
        }

        @Override
        public void execute() {
            System.out.println("#cut process..." + arg + "\n");
        }
    }

    public class CopyCommand implements Command {
        String arg;

        public CopyCommand(String arg) {
            this.arg = arg;
        }

        @Override
        public void execute() {
            System.out.println("#copy process..." + arg + "\n");
        }
    }

    public class PasteCommand implements Command {
        String arg;

        public PasteCommand(String arg) {
            this.arg = arg;
        }

        @Override
        public void execute() {
            System.out.println("#paste process..." + arg + "\n");
        }
    }
    public class DeleteCommand implements Command {
        String arg;

        public DeleteCommand(String arg) {
            this.arg = arg;
        }

        @Override
        public void execute() {
            System.out.println("#delete process..." + arg + "\n");
        }
    }
    public class MacroCommand implements Command {
        Vector<Command> commands = new Vector<>();
        public void addCommand(Command c) {
            commands.add(c);
        }

        @Override
        public void execute() {
            for (Command c : commands) {
                c.execute();
            }
        }

        public void main(String[] args) {
            CutCommand command1 = new CutCommand("Arg ###");
            CopyCommand command2 = new CopyCommand("Arg $$$");
            MacroCommand macro = new MacroCommand();
            macro.addCommand(command1);
            macro.addCommand(command2);
            macro.execute();
        }
    }
}
