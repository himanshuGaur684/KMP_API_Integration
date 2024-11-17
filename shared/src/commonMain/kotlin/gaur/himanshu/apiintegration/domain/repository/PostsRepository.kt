package gaur.himanshu.apiintegration.domain.repository

import gaur.himanshu.apiintegration.domain.model.Post

interface PostsRepository {

    suspend fun getPosts():List<Post>

}