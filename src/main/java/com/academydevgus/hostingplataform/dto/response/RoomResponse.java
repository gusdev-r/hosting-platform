package com.academydevgus.hostingplataform.dto.response;

import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class RoomResponse {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked;
    private String photo;
    private List<BookedRoomResponse> bookedRoomResponseList;

    public RoomResponse() {
    }

    public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public RoomResponse(Long id, String roomType, BigDecimal roomPrice, boolean isBooked, byte[] photoByte,
                        List<BookedRoomResponse> bookedRoomResponseList) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.photo = photoByte != null ? Base64.encodeBase64String(photoByte) : null;
        this.bookedRoomResponseList = bookedRoomResponseList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<BookedRoomResponse> getBookedRoomResponseList() {
        return bookedRoomResponseList;
    }

    public void setBookedRoomResponseList(List<BookedRoomResponse> bookedRoomResponseList) {
        this.bookedRoomResponseList = bookedRoomResponseList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomResponse that = (RoomResponse) o;
        return isBooked == that.isBooked && Objects.equals(id, that.id) && Objects.equals(roomType, that.roomType) && Objects.equals(roomPrice, that.roomPrice) && Objects.equals(photo, that.photo) && Objects.equals(bookedRoomResponseList, that.bookedRoomResponseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomType, roomPrice, isBooked, photo, bookedRoomResponseList);
    }

    @Override
    public String toString() {
        return "RoomResponse{" +
                "id=" + id +
                ", roomType='" + roomType + '\'' +
                ", roomPrice=" + roomPrice +
                ", isBooked=" + isBooked +
                ", photo='" + photo + '\'' +
                ", bookedRoomResponseList=" + bookedRoomResponseList +
                '}';
    }
}
