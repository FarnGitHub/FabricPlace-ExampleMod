package examplemod;

import net.fabricmc.api.ClientModInitializer;

public class ExampleMod implements ClientModInitializer {
    private static String loggerName = "ExampleLog";

    @Override
    public void onInitializeClient() {
        printLog("Init this mod");
    }

    public static void printLog(String str) {
        System.out.println("[" + loggerName + "] " + str);
    }
}
