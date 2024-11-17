package gaur.himanshu.apiintegration.data.mappers

import gaur.himanshu.apiintegration.data.model.PostDTO
import gaur.himanshu.apiintegration.domain.model.Post

fun List<PostDTO>.toDomain():List<Post>{
    return map{
        Post(
            body = it.body,
            id=it.id,
            title = it.title,
            userId = it.userId
        )
    }
}