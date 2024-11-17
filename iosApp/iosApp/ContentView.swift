import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
        
    @ObservedObject var viewModelWrapper = PostsViewModelWrapper()
    
    @State var list : [Post] = []
    
	var body: some View {
        VStack{
            Text("\(list)")
        }.onAppear(perform: {
            DispatchQueue.global().async {
                let posts = viewModelWrapper.viewModel.getPosts()
                
                DispatchQueue.main.async {
                    self.list = posts
                }
                
            }
        })
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
