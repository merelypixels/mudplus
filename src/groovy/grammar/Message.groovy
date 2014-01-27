package grammar

/**
 * Created with IntelliJ IDEA.
 * User: Wintermute
 * Date: 6/18/13
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
class Message {
	String senderUniqueName
	String content
	Date receivedTime = new Date()
	Date processedTime = null
	Date respondedTime = null
}
