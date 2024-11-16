package gaur.himanshu.apiintegration

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform