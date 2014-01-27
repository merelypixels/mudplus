package interfaces

/**
 * Created by Wintermute on 1/27/14.
 */
public interface CommandRespondable {
    def getResponseCommands()
    def setResponseCommands(commandList)
    def addResponseCommand(command)
    def removeResponseCommand(command)
    def clearResponseCommands()
}