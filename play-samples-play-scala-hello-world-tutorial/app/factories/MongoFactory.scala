package factories

import model.User
import org.bson.codecs.configuration.CodecRegistries.{fromProviders, fromRegistries}
import org.mongodb.scala.MongoClient
import org.mongodb.scala.MongoClient.DEFAULT_CODEC_REGISTRY
import org.mongodb.scala.bson.codecs.Macros._

class MongoFactory() {
  def getDatabase(dbName: String) = {
    val codecRegistry = fromRegistries(fromProviders(classOf[User]), DEFAULT_CODEC_REGISTRY)
    MongoClient().getDatabase(dbName).withCodecRegistry(codecRegistry)
  }
}
