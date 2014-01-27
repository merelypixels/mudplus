package interfaces

/**
 * Created by Wintermute on 1/27/14.
 */
public interface Nameable {
    String keyName
    String shortDisplayName
    String fullDisplayName
    String shortHtmlName
    String fullHtmlName

    def getUniqueName()
    def isKnownAs(name)

    def getAdjectives()
    def setAdjectives(adjectiveList)
    def addAdjective(adjective)
    def removeAdjective(adjective)
    def clearAdjectives()

    def getPrepositionalPhrases()
    def setPrepositionalPhrases(phraseList)
    def addPrepositionalPhrase(phrase)
    def removePrepositionalPhrase(phrase)
    def clearPrepositionalPhrases()
}