package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: km5  reason: default package */
/* loaded from: classes.dex */
public final class km5 implements Parcelable {
    public static final jm5 CREATOR = new Object();
    public final me2 A;

    public km5(Parcel parcel) {
        me2 me2Var;
        Uri uri;
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt != 2) {
                    if (readInt != 3) {
                        if (readInt == 4) {
                            me2Var = cm5.d;
                        } else {
                            vd6.i(wh1.g(readInt, "Unsupported GBA slot type: "));
                            throw null;
                        }
                    } else {
                        me2Var = gm5.d;
                    }
                } else {
                    me2Var = em5.d;
                }
            } else {
                String readString = parcel.readString();
                if (readString != null) {
                    uri = Uri.parse(readString);
                } else {
                    uri = null;
                }
                String readString2 = parcel.readString();
                me2Var = new dm5(uri, readString2 != null ? Uri.parse(readString2) : null);
            }
        } else {
            me2Var = fm5.d;
        }
        this.A = me2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.getClass();
        me2 me2Var = this.A;
        if (me2Var instanceof fm5) {
            parcel.writeInt(0);
        } else if (me2Var instanceof dm5) {
            parcel.writeInt(1);
            Uri uri = ((dm5) me2Var).d;
            String str2 = null;
            if (uri != null) {
                str = uri.toString();
            } else {
                str = null;
            }
            parcel.writeString(str);
            Uri uri2 = ((dm5) me2Var).e;
            if (uri2 != null) {
                str2 = uri2.toString();
            }
            parcel.writeString(str2);
        } else if (b53.x(me2Var, gm5.d)) {
            parcel.writeInt(3);
        } else if (b53.x(me2Var, em5.d)) {
            parcel.writeInt(2);
        } else if (b53.x(me2Var, cm5.d)) {
            parcel.writeInt(4);
        } else {
            i.c();
        }
    }

    public km5(me2 me2Var) {
        me2Var.getClass();
        this.A = me2Var;
    }
}
