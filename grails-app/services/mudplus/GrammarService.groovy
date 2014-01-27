package mudplus

import grails.transaction.Transactional

@Transactional
class GrammarService {
    static final WORD_TYPES = [
            adjective: "adjective",
            adverb: "adverb",
            noun: "noun",
            preposition: "preposition",
            prounoun: "pronoun",
            verb: "verb"
    ]

    //todo i8n support? -English support is kind of hard enough.
    def getWords(message) {
        message.split(/ +/).collect { def word ->
            //weirder cases checked before parsing
            if (word.endsWith("y'all")) return "y'all" //for country-folk
            else if (word.toLowerCase() == "'tis") return "'tis" //for the archaic
            else if (word.toLowerCase() == "o'") return "o'" //for the archaic
            else if (word.toLowerCase() == "o'er") return "o'er" //for the archaic
            else if (word.toLowerCase() == "ne'er") return "ne'er" //for the archaic
            else if (word.toLowerCase() == "'twont") return "'twont" //for the archaic
            else if (word.toLowerCase() == "'twill") return "'twill" //for the archaic

            String result = word
            result = result.replaceAll(/[^A-Za-z0-9 \-]+/, '')

            //add back in what could be a legit contraction
            if (word.endsWith("'s")) result = result.substring(0, result.length() - 1) + "'s"
            else if (word.endsWith("s'")) result = result.substring(0, result.length() - 1) + "s'"
            else if (word.endsWith("'m")) result = result.substring(0, result.length() - 1) + "'m"
            else if (word.endsWith("'d")) result = result.substring(0, result.length() - 1) + "'d"
            else if (word.endsWith("'t")) result = result.substring(0, result.length() - 1) + "'t"
            else if (word.endsWith("'ve")) result = result.substring(0, result.length() - 2) + "'ve"
            else if (word.endsWith("'ll")) result = result.substring(0, result.length() - 2) + "'ll"
            else if (word.endsWith("'re")) result = result.substring(0, result.length() - 2) + "'re"

            result
        }
    }
}
