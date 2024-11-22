package sopt35.skyscanner.dto;

import java.util.List;

public class WishListResponse {

    private final List<WishResponse> wishList;

    public WishListResponse(List<WishResponse> wishList) {
        this.wishList = wishList;
    }

    public List<WishResponse> getWishList() {
        return wishList;
    }
}
