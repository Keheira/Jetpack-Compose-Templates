package projects.keheira.basicinfolib

object BasicInfo {
    fun getBuildDetails(version: String, code: Int): String{
        return "$version($code)"
    }

    fun getDeveloper(): String{
        return "Keheira"
    }

    fun getReason(reason: String = "I wanted to build an SDK"): String{
        return reason
    }
}