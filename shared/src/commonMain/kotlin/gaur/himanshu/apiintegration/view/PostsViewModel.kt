package gaur.himanshu.apiintegration.view

import androidx.lifecycle.ViewModel
import gaur.himanshu.apiintegration.domain.use_case.GetPostsUseCase
import kotlinx.coroutines.runBlocking

class PostsViewModel(
    private val getPostsUseCase: GetPostsUseCase
) : ViewModel(){

    fun getPosts() = runBlocking {
        val response = getPostsUseCase()
        if(response.isSuccess){
            response.getOrThrow()
        }else{
            emptyList()
        }
    }


}

