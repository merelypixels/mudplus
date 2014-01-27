package interfaces

/**
 * Created by Wintermute on 1/27/14.
 */
public interface CommandActionable {
    def getActionCommands()
    def setActionCommands(commandList)
    def addActionCommand(command)
    def removeActionCommand(command)
    def clearActionCommands()
}
