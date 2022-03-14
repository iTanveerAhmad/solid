package com.example.solid.lsp;

public class Insta extends SocialMedia{

    /**
     * Now this class is NOT fulfilled LSP
     */

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPost() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall() {
        // not supported by Insta
    }
}
