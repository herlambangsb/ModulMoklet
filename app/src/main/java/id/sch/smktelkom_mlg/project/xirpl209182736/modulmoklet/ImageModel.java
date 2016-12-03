package id.sch.smktelkom_mlg.project.xirpl209182736.modulmoklet;

public class ImageModel {

    private String mImage;
    private String mImageName;
    private String mImageOwnerName;
    private String mDesc;

    public ImageModel(String mImage, String mImageName, String mImageOwnerName, String mDesc) {
        this.mImage = mImage;
        this.mImageName = mImageName;
        this.mImageOwnerName = mImageOwnerName;
        this.mDesc = mDesc;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public String getmImageName() {
        return mImageName;
    }

    public void setmImageName(String mImageName) {
        this.mImageName = mImageName;
    }

    public String getmImageOwnerName() {
        return mImageOwnerName;
    }

    public void setmImageOwnerName(String mImageOwnerName) {
        this.mImageOwnerName = mImageOwnerName;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }


}
