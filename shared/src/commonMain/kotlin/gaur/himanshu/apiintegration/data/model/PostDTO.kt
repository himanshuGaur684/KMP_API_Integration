package gaur.himanshu.apiintegration.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PostDTO(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)