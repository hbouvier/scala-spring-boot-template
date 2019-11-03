package  com.ruggedcode.platform.eventing.api.cloudevent.service

import com.ruggedcode.platform.eventing.api.cloudevent.config.ToCloudEventConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ToCloudEventService @Autowired()(serviceConfig: ToCloudEventConfig) {
  def getVersion: String = {
    s"v${serviceConfig.version}"
  }
}