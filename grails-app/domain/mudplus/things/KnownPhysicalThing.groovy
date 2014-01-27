package mudplus.things

import mudplus.grammar.KnownPrepositionalPhrase
import mudplus.grammar.KnownWord
import things.PhysicalThing

class KnownPhysicalThing extends PhysicalThing {
    String keyName
    KnownPhysicalThing environment
    Boolean isContainable
    Boolean isContainer
    Boolean hasHeartbeat

    //don't use these directly
    private static hasMany = [ adjectiveDescriptors : KnownWord, prepositionalPhraseDescriptors: KnownPrepositionalPhrase, containedThings: KnownPhysicalThing]

    static constraints = {
        adjectives(nullable: true)
    }

    //implement Container

    @Override
    def getInventory() {
        if(isContainer) containedThings
        else []
    }

    @Override
    def setInventory(contentList) {
        if(isContainable) containedThings = contentList
    }

    @Override
    def addInventory(thing) {
        containedThings.add(thing)
    }

    @Override
    def removeInventory(thing) {
        containedThings.remove(thing)
    }

    @Override
    def clearInventory() {
        containedThings = []
    }

    //todo implement CommandActionable

    @Override
    def getActionCommands() {
        return null
    }

    @Override
    def setActionCommands(Object commandList) {
        return null
    }

    @Override
    def addActionCommand(Object command) {
        return null
    }

    @Override
    def removeActionCommand(Object command) {
        return null
    }

    @Override
    def clearActionCommands() {
        return null
    }

    //todo implement CommandRespondable

    @Override
    def getResponseCommands() {
        return null
    }

    @Override
    def setResponseCommands(Object commandList) {
        return null
    }

    @Override
    def addResponseCommand(Object command) {
        return null
    }

    @Override
    def removeResponseCommand(Object command) {
        return null
    }

    @Override
    def clearResponseCommands() {
        return null
    }

    //todo implement Nameable

    @Override
    def getAdjectives() {
        return null
    }

    @Override
    def setAdjectives(Object adjectiveList) {
        return null
    }

    @Override
    def addAdjective(Object adjective) {
        return null
    }

    @Override
    def removeAdjective(Object adjective) {
        return null
    }

    @Override
    def clearAdjectives() {
        return null
    }

    @Override
    def getPrepositionalPhrases() {
        return null
    }

    @Override
    def setPrepositionalPhrases(Object phraseList) {
        return null
    }

    @Override
    def addPrepositionalPhrase(Object phrase) {
        return null
    }

    @Override
    def removePrepositionalPhrase(Object phrase) {
        return null
    }

    @Override
    def clearPrepositionalPhrases() {
        return null
    }
}
