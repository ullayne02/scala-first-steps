package controllers

import javax.inject._
import model.User
import play.api.Configuration
import play.api.libs.json.JsValue
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

@Singleton
class UserController @Inject()(cc: ControllerComponents, config: Configuration) extends AbstractController(cc) {
  val dbName = config.get[String]("dbname")
  val collectionName = config.get[String]("collectionName")

  def findByName(name: String) = Action {
    val response = User.findById(dbName, collectionName, name)
    implicit request: Request[AnyContent] =>
      Ok(response.toString())
  }

  def findById(id: String) = Action {
    val response = User.findById(dbName, collectionName,id)
    implicit request: Request[AnyContent] =>
      Ok(response.toString())
   }

  def update(id: String) = Action {
    println("UPDATE")
    implicit request: Request[AnyContent] =>
      Ok(request.body.toString())
  }

  def create() = Action {
    implicit request: Request[AnyContent] =>
      val res = request.body.asJson
      res.map{
        json => {
          val user = getUserFromJson(json)
          User.insert(user, dbName, collectionName)
          Ok("Insert " + user.name)
        }
      }.getOrElse {
        BadRequest("Expecting application/json request body")
      }
  }

  def delete(id: String) = Action {
    implicit request: Request[AnyContent] =>
      User.delete(dbName, collectionName, id)
      Ok(s"Deleted ${id}")
  }

  def getUserFromJson(json: JsValue): User = {
    val name: String = (json \ "name").as[String]
    val age: Int = (json \ "age").as[Int]
    new User(name, age)
  }
}