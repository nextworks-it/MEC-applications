/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.client.mp1;

import io.swagger.client.model.CellChangeNotification;
import io.swagger.client.model.CollectionData;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-12-03T08:24:25.833Z[GMT]")
@Api(value = "mec012-app", description = "")
public interface NotificationsApi {

    @ApiOperation(value = "Enable ", nickname = "startCollection", notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Collection started")
    })
    @RequestMapping(value = "/collection/",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<?> startCollectionPost();


    @ApiOperation(value = "Receive notification ", nickname = "receiveNotification", notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Receive notification")
    })
    @RequestMapping(value = "/subscription/hoStatusChange",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<?> postNotification(@ApiParam(value = "" ,required=true )  @RequestBody CellChangeNotification body);


    @ApiOperation(value = "Notification endpoint", nickname = "Get response to server", notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Collection started")
    })
    @RequestMapping(value = "/subscription/hoStatusChange",
            method = RequestMethod.GET)
    ResponseEntity<?> getNotification();

    }