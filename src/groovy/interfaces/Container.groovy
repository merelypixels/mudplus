package interfaces

/**
 * Created by Wintermute on 1/27/14.
 */
public interface Container {
    Boolean isContainer

    def getInventory()
    def setInventory(contentList)
    def addInventory(thing)
    def removeInventory(thing)
    def clearInventory()
}