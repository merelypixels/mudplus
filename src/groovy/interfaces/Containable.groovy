package interfaces

import mudplus.things.constants.KnownPhysicalThing

/**
 * Created with IntelliJ IDEA.
 * User: Wintermute
 * Date: 6/18/13
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Containable {
    KnownPhysicalThing environment
    Boolean isContainable
}