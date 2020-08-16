// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vtex/scala-first-steps/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Mon Aug 03 12:47:46 BRT 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  UserController_2: controllers.UserController,
  // @LINE:12
  ProductController_1: controllers.ProductController,
  // @LINE:15
  ShoppingLogController_0: controllers.ShoppingLogController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    UserController_2: controllers.UserController,
    // @LINE:12
    ProductController_1: controllers.ProductController,
    // @LINE:15
    ShoppingLogController_0: controllers.ShoppingLogController
  ) = this(errorHandler, UserController_2, ProductController_1, ShoppingLogController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_2, ProductController_1, ShoppingLogController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/name/""" + "$" + """name<[^/]+>""", """controllers.UserController.findByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.findByName(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.create"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.findById(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""", """controllers.ProductController.insert"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shoppingLogs/""" + "$" + """id<[^/]+>""", """controllers.ShoppingLogController.findByKey(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shoppingLogs""", """controllers.ShoppingLogController.insert"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shoppingLogs/""" + "$" + """id<[^/]+>""", """controllers.ShoppingLogController.delete(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_UserController_findByName0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/name/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_findByName0_invoker = createInvoker(
    UserController_2.findByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "findByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/name/""" + "$" + """name<[^/]+>""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_findByName1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_findByName1_invoker = createInvoker(
    UserController_2.findByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "findByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_create2_invoker = createInvoker(
    UserController_2.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      this.prefix + """user""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_update3_invoker = createInvoker(
    UserController_2.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_delete4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete4_invoker = createInvoker(
    UserController_2.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductController_findById5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_findById5_invoker = createInvoker(
    ProductController_1.findById(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "findById",
      Seq(classOf[String]),
      "GET",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductController_insert6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_ProductController_insert6_invoker = createInvoker(
    ProductController_1.insert,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "insert",
      Nil,
      "POST",
      this.prefix + """product""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ProductController_delete7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_delete7_invoker = createInvoker(
    ProductController_1.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ShoppingLogController_findByKey8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shoppingLogs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingLogController_findByKey8_invoker = createInvoker(
    ShoppingLogController_0.findByKey(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingLogController",
      "findByKey",
      Seq(classOf[String]),
      "GET",
      this.prefix + """shoppingLogs/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ShoppingLogController_insert9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shoppingLogs")))
  )
  private[this] lazy val controllers_ShoppingLogController_insert9_invoker = createInvoker(
    ShoppingLogController_0.insert,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingLogController",
      "insert",
      Nil,
      "POST",
      this.prefix + """shoppingLogs""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ShoppingLogController_delete10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shoppingLogs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingLogController_delete10_invoker = createInvoker(
    ShoppingLogController_0.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingLogController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """shoppingLogs/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_UserController_findByName0_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_UserController_findByName0_invoker.call(UserController_2.findByName(name))
      }
  
    // @LINE:8
    case controllers_UserController_findByName1_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_findByName1_invoker.call(UserController_2.findByName(id))
      }
  
    // @LINE:9
    case controllers_UserController_create2_route(params@_) =>
      call { 
        controllers_UserController_create2_invoker.call(UserController_2.create)
      }
  
    // @LINE:10
    case controllers_UserController_update3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_update3_invoker.call(UserController_2.update(id))
      }
  
    // @LINE:11
    case controllers_UserController_delete4_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_delete4_invoker.call(UserController_2.delete(id))
      }
  
    // @LINE:12
    case controllers_ProductController_findById5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProductController_findById5_invoker.call(ProductController_1.findById(id))
      }
  
    // @LINE:13
    case controllers_ProductController_insert6_route(params@_) =>
      call { 
        controllers_ProductController_insert6_invoker.call(ProductController_1.insert)
      }
  
    // @LINE:14
    case controllers_ProductController_delete7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProductController_delete7_invoker.call(ProductController_1.delete(id))
      }
  
    // @LINE:15
    case controllers_ShoppingLogController_findByKey8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ShoppingLogController_findByKey8_invoker.call(ShoppingLogController_0.findByKey(id))
      }
  
    // @LINE:16
    case controllers_ShoppingLogController_insert9_route(params@_) =>
      call { 
        controllers_ShoppingLogController_insert9_invoker.call(ShoppingLogController_0.insert)
      }
  
    // @LINE:17
    case controllers_ShoppingLogController_delete10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ShoppingLogController_delete10_invoker.call(ShoppingLogController_0.delete(id))
      }
  }
}
