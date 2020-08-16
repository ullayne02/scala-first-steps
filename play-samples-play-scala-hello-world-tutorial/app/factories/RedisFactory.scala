package factories
import com.redis._

class RedisFactory {
  def getClient(host: String, port: Int) = {
    new RedisClient(host, port)
  }
}
