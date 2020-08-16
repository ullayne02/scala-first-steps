package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import model.{Product}
import play.api.libs.json._
class ProductController @Inject()(cc: ControllerComponents) extends AbstractController(cc)  {
  def findById(id: String) = Action {
    val response = Product.findById(id)
    implicit request: Request[AnyContent] =>
      response.map{
        res => {
          Ok(res)
        }
      }.getOrElse {
        BadRequest("Expecting application/json request body")
      }
    }
    def insert() = Action {
      implicit request: Request[AnyContent] =>
        val res = request.body.asJson
        res.map{
          json => {
            val product = getProductFromJson(json)
            val response = Product.insert(product.name, product.toString)

            if(response){
              Ok(s"Insert ${product.name}")
            }else {
              BadRequest("Some error occur")
            }
          }
        }.getOrElse {
          BadRequest("Expecting application/json request body")
        }
    }

  def delete(id: String) = Action {
    val response = Product.delete(id)
    implicit request: Request[AnyContent] =>
      response.map{
        res => {
          Ok(res.toString)
        }
      }.getOrElse {
        BadRequest("Expecting application/json request body")
      }
  }

  def getProductFromJson(json: JsValue): Product ={
    val name: String = (json \ "name").as[String]
    val description: String = (json \ "description").as[String]
    val price: String = (json \ "price").as[String]
    new Product(name, description, price)
  }
}
