package controllers

import javax.inject.Inject
import model.{ShoppingLogRepo, ShoppingLog}
import play.api.libs.json.JsValue
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

class ShoppingLogController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  private val repo = new ShoppingLogRepo()
  def findByKey(key: String) = Action {
    val response = repo.get(key)
    implicit request: Request[AnyContent] =>
      Ok(response.toString())
  }

  def delete(key: String) = Action {
    val response = repo.delete(key)
    implicit request: Request[AnyContent] =>
      Ok(response.toString())
  }

  def insert() = Action {
    implicit request: Request[AnyContent] =>
      val res = request.body.asJson
      res.map{
        json => {
          val shoppingLog = getShoppingLogFromJson(json)
          val response = repo.insert(shoppingLog)
          Ok(s"Insert ${shoppingLog.getRowKey}")
        }
      }.getOrElse {
        BadRequest("Expecting application/json request body")
      }
  }

  def getShoppingLogFromJson(json: JsValue): ShoppingLog ={
    val user: String = (json \ "user").as[String]
    val product: String = (json \ "product").as[String]
    val key: String = (json \ "key").as[String]
    new ShoppingLog(user, product, key)
  }
}
