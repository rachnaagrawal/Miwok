package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private  String defaultTranslation;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int imageResourceId=NO_IMAGE_PROVIDED;
    private int audioResourceId;


    public Word(String mDefaultTranslation,String mMiwokTranslation,int mAudioResourceId){
        miwokTranslation=mMiwokTranslation;
        defaultTranslation=mDefaultTranslation;
        audioResourceId=mAudioResourceId;
    }

    public Word(String mDefaultTranslation,String mMiwokTranslation,int mImageResourceId,int mAudioResourceId){
        miwokTranslation=mMiwokTranslation;
        defaultTranslation=mDefaultTranslation;
        imageResourceId=mImageResourceId;
        audioResourceId=mAudioResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
