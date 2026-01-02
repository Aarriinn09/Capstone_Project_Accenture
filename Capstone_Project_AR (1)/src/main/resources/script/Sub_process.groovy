import com.sap.gateway.ip.core.customdev.util.Message

Message processData(Message message) {

    def missingUsers = message.getProperty("MissingUsers") ?: "Unknown user"

    def msg = "Employee data not found for user(s): ${missingUsers}"

    // Set body (for datastore / log usage)
    message.setBody(msg)

    // Also set as property for logging
    message.setProperty("MissingUserMessage", msg)

    return message
}
