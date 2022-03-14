package com.example.solid.lsp;

public class WhatsApp extends SocialMedia{

    /**
     * Now this class is NOT fulfilled LSP
     */

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPost() {
    // Not supported by WhatsApp
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall() {

    }
}
