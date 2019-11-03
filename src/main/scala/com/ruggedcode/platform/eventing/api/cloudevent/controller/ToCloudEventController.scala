package com.ruggedcode.platform.eventing.api.cloudevent.controller

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

import com.ruggedcode.platform.eventing.api.cloudevent.service.ToCloudEventService

@Controller
class ToCloudEventController @Autowired()(toCloudEventService: ToCloudEventService) {
  @RequestMapping(path = Array("/version"), method = Array(RequestMethod.GET), produces = Array(MediaType.TEXT_PLAIN_VALUE))
  @ResponseBody
  def handleRequest(): String = {
    "To Clound Event Service version " + toCloudEventService.getVersion
  }
}