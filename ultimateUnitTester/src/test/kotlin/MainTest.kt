import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    @DisplayName("Validate Tickets Scenarios")
    fun testTicketValidator() {
        Assertions.assertEquals(ticketValidator(15, "", ""), "Not Allowed!")
        Assertions.assertEquals(ticketValidator(20, "", ""), "Not Allowed!")
        Assertions.assertEquals(ticketValidator(20, "VIP", ""), "Not Allowed!")

        Assertions.assertEquals(ticketValidator(20, "standard", "xt9800"), "Welcome!")
        Assertions.assertEquals(ticketValidator(20, "standard", "9800"), "Not Allowed!")

        Assertions.assertEquals(ticketValidator(20, "premium", "xl9800"), "Welcome!")
        Assertions.assertEquals(ticketValidator(20, "premium", "9800"), "Not Allowed!")
    }
}