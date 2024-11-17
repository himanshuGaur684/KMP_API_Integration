package gaur.himanshu.apiintegration.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import gaur.himanshu.apiintegration.Greeting
import gaur.himanshu.apiintegration.domain.model.Post
import gaur.himanshu.apiintegration.view.PostsViewModel
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val viewModel = koinViewModel<PostsViewModel>()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val list = remember {
                        mutableStateOf(emptyList<Post>())
                    }

                    LaunchedEffect(Unit) {
                        list.value = viewModel.getPosts()
                    }
                    MainScreen(list = list.value)
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier, list: List<Post>) {

    LazyColumn {
        items(list) {
            Card(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .fillMaxWidth()
                    .padding(vertical = 4.dp, horizontal = 8.dp)
            ) {
                Text(text = it.title)

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = it.body)
            }
        }
    }

}
