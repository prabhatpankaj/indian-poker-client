package com.beable.poker.model.req;


//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;

//@EqualsAndHashCode(callSuper = true)
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class CreateRoomRequest extends BaseRequest {
	private String userID;
	private String roomName;
}
