//
//  PostsViewModelWrapper.swift
//  iosApp
//
//  Created by Himanshu Gaur on 17/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared

class PostsViewModelWrapper : ObservableObject{
    
    var viewModel : PostsViewModel
    
    init(){
        self.viewModel = ProvideViewModel.shared.getPostsViewModel()
    }
    

}
