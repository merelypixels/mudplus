package things

import interfaces.CommandActionable
import interfaces.Container
import interfaces.Heartbeatable

/**
 * Created by Wintermute on 1/27/14.
 */
abstract class PhysicalThing extends Thing
        implements CommandActionable, Container, Heartbeatable {
}
