// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vtex/scala-first-steps/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Mon Aug 03 12:47:46 BRT 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseShoppingLogController ShoppingLogController = new controllers.ReverseShoppingLogController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductController ProductController = new controllers.ReverseProductController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseShoppingLogController ShoppingLogController = new controllers.javascript.ReverseShoppingLogController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductController ProductController = new controllers.javascript.ReverseProductController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
