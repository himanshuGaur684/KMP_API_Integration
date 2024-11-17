package gaur.himanshu.apiintegration.domain.use_case

import gaur.himanshu.apiintegration.domain.model.Post
import gaur.himanshu.apiintegration.domain.repository.PostsRepository

class GetPostsUseCase(private val postsRepository: PostsRepository) {

   suspend operator fun invoke():Result<List<Post>>{
       return try {
           val response = postsRepository.getPosts()
           Result.success(response)
       }catch (e:Exception){
           println(e.message)
           Result.failure(e)
       }
   }
}