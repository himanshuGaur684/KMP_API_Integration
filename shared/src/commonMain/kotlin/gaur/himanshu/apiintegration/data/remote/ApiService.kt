package gaur.himanshu.apiintegration.data.remote

import gaur.himanshu.apiintegration.data.model.PostDTO
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.path

class ApiService(
    private val client:HttpClient
) {

    // https://jsonplaceholder.typicode.com/posts
    suspend fun getPosts() : List<PostDTO> {
       return client.get {
            url {
                host = "jsonplaceholder.typicode.com"
                path("posts")
            }
        }.body<List<PostDTO>>()
    }

}