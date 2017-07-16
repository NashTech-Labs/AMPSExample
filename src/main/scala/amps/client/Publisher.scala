package amps.client

import com.crankuptheamps.client.Client
import com.crankuptheamps.client.exception.AMPSException

/** This Object Instantiates an AMPS Client
  * */

object Publisher extends App {

  val  client_name = "Publisher"
  val server_url = "tcp://127.0.0.1:9007/amps/json"
  val topic = "Sixer"
  val publisher = new Client("Publisher")
  publisher.connect(server_url)
  publisher.logon
  publisher.publish(topic, s"""{ "message" : "A has hit a Massive Six!" }""")
}
