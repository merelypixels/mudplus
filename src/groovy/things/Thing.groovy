package things

import interfaces.CommandRespondable
import interfaces.Nameable

/**
 * Created by Wintermute on 1/27/14.
 */
abstract class Thing
        implements Nameable, CommandRespondable {
    abstract String keyName
    abstract String shortDisplayName
    abstract String fullDisplayName
    //todo strip dangerous html from names
    abstract String shortHtmlName
    abstract String fullHtmlName

    def getUniqueName() { "${keyName}#${id}" }

    def isKnownAs(nameOrPhrase) {
        if(nameOrPhrase == uniqueName) return true
        else if(nameOrPhrase == keyName) return true
        else if(nameOrPhrase == shortDisplayName) return true
        else if(nameOrPhrase == fullDisplayName) return true

        //todo things.isKnownAs(name)


        false
    }
}
