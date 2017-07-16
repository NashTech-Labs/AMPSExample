package amps.client
import com.crankuptheamps.client.Client
import collection.JavaConverters._

object Subscriber extends App {
  val server_url = "tcp://127.0.0.1:9007/amps/json"
  val subsriber = new Client("Subscriber")
  val topic = "Sixer"
  subsriber.connect(server_url)
  subsriber.logon
  val dataStream = subsriber.subscribe(topic)
  for( msg <- dataStream.iterator().asScala )
    println("Messages......." + msg.getData )
}
