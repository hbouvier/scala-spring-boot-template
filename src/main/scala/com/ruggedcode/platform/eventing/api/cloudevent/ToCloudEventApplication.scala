package com.ruggedcode.platform.eventing.api.cloudevent

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

object ToCloudEventApplication {
  def main(args: Array[String]) : Unit = SpringApplication.run(classOf[ToCloudEventApplication], args :_ *)
}

@SpringBootApplication
class ToCloudEventApplication {}