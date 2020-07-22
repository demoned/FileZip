package com.bojun.zip;

/**
 * 简  述  压缩回调
 * 作  者  demons
 * 类  名  IZipCallback
 * 时  间  2020/7/22 1:43 PM
 */
public interface IZipCallback {
    /**
     * 开始
     */
    void onStart();

    /**
     * 进度回调
     *
     * @param percentDone 完成百分比
     */
    void onProgress(int percentDone);

    /**
     * 完成
     *
     * @param success 是否成功
     */
    void onFinish(boolean success);
}
