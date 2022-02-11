# AndroidArch
Base architecture of android projects
 
doubts and notes
- first all the class or start with directories ? 
- Names of the classes ?
- remote name and implementation ?
- repository name and implementation ?
- utils -> imp. or extra ?
- val viewModel by viewModels<TheViewModel>() -> should we use it not not ? -> don't use this as it can issue in context 
   while creating sharedviewmodel
- what to do in case we don't know the library import exactly -> google ??   
- should we complete activity first and then move ahead . What should be the approach ? 
-  Backend to frontEnd or reverse ? -> Backend to frontEnd
  
- how to name data class -> ClassName == What we are getting in url eg /tweets -> Tweets.kt








V-> Activity/Fragment
VM -> VieModel
M -> repository , remote, 

directories
ui -> V, VM
data -> repo, remote, local
utils -> ViewExt.kt(isVisible), ContextExt.kt(Toast) 
models -> 

error Handling -> common variable in vm