fun ticketValidator(age: Int, type: String, code: String): String {
    if (age < 18) {
        return "Not Allowed!"
    }

    if (type != "") {
        val ticketType = type.lowercase()
        if (ticketType != "standard" && ticketType != "premium" && ticketType != "deluxe") {
            return "Not Allowed!"
        }

        if (code != "") {
            val ticketCode = code.lowercase()
            return if (ticketType == "standard" && ticketCode.startsWith("xt")) {
                "Welcome!"
            } else if ((ticketType == "premium" || ticketType == "deluxe") && ticketCode.startsWith("xl")) {
                "Welcome!"
            } else {
                "Not Allowed!"
            }
        }
    }

    return "Not Allowed!"
}