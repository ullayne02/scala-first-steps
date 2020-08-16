// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vtex/scala-first-steps/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Mon Aug 03 12:47:46 BRT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:15
  class ReverseShoppingLogController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "shoppingLogs/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:15
    def findByKey(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "shoppingLogs/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:16
    def insert(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "shoppingLogs")
    }
  
  }

  // @LINE:12
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:13
    def insert(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "product")
    }
  
    // @LINE:12
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:7
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:7
    def findByName(name:String): Call = {
    
      (name: @unchecked) match {
      
        // @LINE:7
        case (name)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "user/name/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
      
      }
    
    }
  
    // @LINE:9
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:10
    def update(id:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
