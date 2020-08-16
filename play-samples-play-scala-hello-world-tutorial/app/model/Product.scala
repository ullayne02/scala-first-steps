package model
import factories.RedisFactory

object Product {
  val redisFactory = new RedisFactory()
  def findById(key: String) = {
    redisFactory.getClient("localhost", 6379).get(key)
  }
  
  def insert(key: String, value: String) = {
    redisFactory.getClient("localhost", 6379).set(key, value)
  }

  def delete(key: String) = {
    redisFactory.getClient("localhost", 6379).del(key)
  }
}

class Product(val name: String, val description: String, val price: String) {
    override def toString:String = {
      s""""{
         name: ${this.name},
         description: ${this.description},
         price: ${this.price}}
      """"
    }

    /*def convertToJson(): JsValue = {
      Json.toJson(this)
    }

    implicit val ProductWrites = new Writes[Product] {
      def writes(product: Product) = Json.obj(
        "name" -> product.name,
        "description" -> product.description,
        "price" -> product.price
      )
    }*/
}
