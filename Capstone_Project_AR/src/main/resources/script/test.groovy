import com.sap.gateway.ip.core.customdev.util.Message
import groovy.json.JsonSlurper

Message processData(Message message) {

    List expectedUsers = ["rharrison", "szhou"]

    def body = message.getBody(String)
    def json = new JsonSlurper().parseText(body)

    List foundUsers = []

    if (json?.d?.results) {
        json.d.results.each { emp ->
            if (emp.userId) {
                foundUsers.add(emp.userId)
            }
        }
    }

    List missingUsers = expectedUsers - foundUsers

    if (!missingUsers.isEmpty()) {
        // Pass missing users to exception subprocess
        message.setProperty("MissingUsers", missingUsers.join(", "))

        // Raise controlled exception
        throw new Exception("Missing employee data for user(s): ${missingUsers.join(', ')}")
    }

    return message
}
