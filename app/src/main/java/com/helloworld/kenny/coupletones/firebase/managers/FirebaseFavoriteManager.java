package com.helloworld.kenny.coupletones.firebase.managers;

import com.firebase.client.Firebase;
import com.helloworld.kenny.coupletones.favorites.FavoriteEntry;
import com.helloworld.kenny.coupletones.favorites.PartnerFavoriteEntry;
import com.helloworld.kenny.coupletones.firebase.FirebaseService;

import java.util.ArrayList;

/**
 * Created by Kenny on 5/27/2016.
 */
public class FirebaseFavoriteManager extends FirebaseManager {

    private ArrayList<PartnerFavoriteEntry> partnerFavorites;
    private Firebase root;

    public FirebaseFavoriteManager() {
        this.root = new Firebase(FirebaseService.ENDPOINT);
    }

    public void onUserRegistered(String userKey) {
        Firebase userRef = root.child(userKey);
    }

    public void onPartnerRegistered(String partnerKey) {
        Firebase partnerRef = root.child(partnerKey);
    }

    public void onUserCleared(String userKey) {

    }

    public void onPartnerCleared(String partnerKey) {

    }

    public void onLocationVisited(FavoriteEntry entry) {

    }
}
