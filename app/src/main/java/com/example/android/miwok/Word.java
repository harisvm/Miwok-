package com.example.android.miwok;



public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private  int mImageResourseId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourseId, int audioResourseId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourseId = mImageResourseId;
        this.audioResourseId = audioResourseId;
    }

    public int getAudioResourseId() {
        return audioResourseId;
    }

    public void setAudioResourseId(int audioResourseId) {
        this.audioResourseId = audioResourseId;
    }

    private int audioResourseId;






    public int getmImageResourseId() {
        return mImageResourseId;
    }

    public void setmImageResourseId(int mImageResourseId) {
        this.mImageResourseId = mImageResourseId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourseId){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourseId = imageResourseId;


    }



    public boolean hasImage(){

            return mImageResourseId != NO_IMAGE_PROVIDED;

    }

}
