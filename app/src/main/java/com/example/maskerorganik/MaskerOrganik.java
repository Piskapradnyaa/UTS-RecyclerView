package com.example.maskerorganik;

import android.os.Parcel;
import android.os.Parcelable;

public class MaskerOrganik implements Parcelable {

    private String name;
    private String detail;
    private int photo;

    public MaskerOrganik(){

    }

    protected MaskerOrganik(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MaskerOrganik> CREATOR = new Creator<MaskerOrganik>() {
        @Override
        public MaskerOrganik createFromParcel(Parcel in) {
            return new MaskerOrganik(in);
        }

        @Override
        public MaskerOrganik[] newArray(int size) { return new MaskerOrganik[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
