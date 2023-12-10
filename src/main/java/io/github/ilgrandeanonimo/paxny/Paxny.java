/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.ilgrandeanonimo.paxny;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Paxny extends ListenerAdapter {
    public class Logger {

        public void info(String message) {
            System.out.println("[INFO] " + message);
        }

        public void warn(String message) {
            System.out.println("[WARN] " + message);
        }

        public void error(String message) {
            System.out.println("[ERROR] " + message);
        }

        public void fatal(String message) {
            System.out.println("[FATAL] " + message);
        }

        public void fatalWithExit(String message) {
            System.out.println("[FATAL] " + message);
        }

    }
}
