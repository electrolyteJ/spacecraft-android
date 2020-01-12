//
// Created by hawks.jamesf on 1/5/20.
//

#include <LogUtil.h>
#include "GifPlayer.h"


//static start

GifPlayer *UriGifPlayer::create(JNIEnv *env,char *uriPath) {
    GifPlayer *gifPlayer = new UriGifPlayer(env);
    gifPlayer->setDataSource(uriPath);
    return gifPlayer;
}

//static end
UriGifPlayer::~UriGifPlayer() {

}

void UriGifPlayer::setDataSource(char *uriPath) {
    std::string assetNameString(uriPath);
    mUriPath = assetNameString;

    if (mUriPath.empty()) {
        LOGE(MODULE_NAME, "exception:uri path must be not empty");
        throw "uri path must be not empty";
    }
    int error = -1;
    gifFileType = DGifOpenFileName(mUriPath.c_str(), &error);
    DGifSlurp(gifFileType);
//    GifFileType *gifFileType  = DGifOpenFileName(fd, &error);
//    DGifCloseFile(gifFileType, &error);
    LOGE(MODULE_NAME, "error: %s", GifErrorString(error));
}

off_t UriGifPlayer::getFileSize() {
    return 0;
}

void UriGifPlayer::start() {}

void UriGifPlayer::pause() {}

void UriGifPlayer::stop() {}

