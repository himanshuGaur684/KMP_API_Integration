package gaur.himanshu.apiintegration.data.repository

import gaur.himanshu.apiintegration.data.mappers.toDomain
import gaur.himanshu.apiintegration.data.remote.ApiService
import gaur.himanshu.apiintegration.domain.model.Post
import gaur.himanshu.apiintegration.domain.repository.PostsRepository

class PostsRepoImpl(
    private val apiService: ApiService
) : PostsRepository {
    override suspend fun getPosts(): List<Post> {
        val l = apiService.getPosts()
        return apiService.getPosts().toDomain()
    }
}