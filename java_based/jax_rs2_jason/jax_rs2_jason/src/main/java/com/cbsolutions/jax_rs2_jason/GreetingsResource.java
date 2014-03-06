/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cbsolutions.jax_rs2_jason;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author philw
 */
@Path("greetings")
public class GreetingsResource {
  
  @GET  
  public JsonObject greetings() {
      return Json.createObjectBuilder().add("hello","world").build();
  }   
          
}
