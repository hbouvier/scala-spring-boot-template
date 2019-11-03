package com.ruggedcode.platform.eventing.api.cloudevent.config

import scala.beans.BeanProperty
import org.springframework.stereotype.Component
import org.springframework.boot.context.properties.ConfigurationProperties

@Component
@ConfigurationProperties("cloud-event")
case class ToCloudEventConfig() {
  @BeanProperty
  var version: String = _
}