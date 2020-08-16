package model

import factories.MongoFactory
import model.Helpers._
import org.mongodb.scala.MongoCollection
import org.mongodb.scala.model.Filters.equal

object User {
  val mongoFactory = new MongoFactory

  def findById(dbName: String, collectionName: String, name: String): Seq[User] = {
    this.getCollection(dbName, collectionName).find(equal("name", name)).results()
  }

  def getCollection(dbName: String, collectionName: String): MongoCollection[User] = {
    mongoFactory.getDatabase(dbName).getCollection(collectionName)
  }

  def insert(user: User, dbName: String, collectionName: String) = {
    this.getCollection(dbName, collectionName).insertOne(user).results()
  }

  def delete(userName: String, dbName: String, collectionName: String) = {
    this.getCollection(dbName, collectionName).deleteOne(equal("name", userName)).printHeadResult("Delete Result: ")
  }
}

class User (val name: String, val age: Int) {
  override def toString: String =
    this.name + " has " + this.age + " years old"
}
