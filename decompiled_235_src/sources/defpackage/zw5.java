package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw5  reason: default package */
/* loaded from: classes.dex */
public final class zw5 implements Parcelable {
    public static final yw5 CREATOR = new Object();
    public final hi2 A;

    public zw5(Parcel parcel) {
        hi2 hi2Var;
        Uri uri;
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt != 2) {
                    if (readInt != 3) {
                        if (readInt == 4) {
                            hi2Var = rw5.o;
                        } else {
                            fa6.h(lb1.g(readInt, "Unsupported GBA slot type: "));
                            throw null;
                        }
                    } else {
                        hi2Var = vw5.o;
                    }
                } else {
                    hi2Var = tw5.o;
                }
            } else {
                String readString = parcel.readString();
                if (readString != null) {
                    uri = Uri.parse(readString);
                } else {
                    uri = null;
                }
                String readString2 = parcel.readString();
                hi2Var = new sw5(uri, readString2 != null ? Uri.parse(readString2) : null);
            }
        } else {
            hi2Var = uw5.o;
        }
        this.A = hi2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.getClass();
        hi2 hi2Var = this.A;
        if (hi2Var instanceof uw5) {
            parcel.writeInt(0);
        } else if (hi2Var instanceof sw5) {
            parcel.writeInt(1);
            Uri uri = ((sw5) hi2Var).o;
            String str2 = null;
            if (uri != null) {
                str = uri.toString();
            } else {
                str = null;
            }
            parcel.writeString(str);
            Uri uri2 = ((sw5) hi2Var).p;
            if (uri2 != null) {
                str2 = uri2.toString();
            }
            parcel.writeString(str2);
        } else if (nb3.k(hi2Var, vw5.o)) {
            parcel.writeInt(3);
        } else if (nb3.k(hi2Var, tw5.o)) {
            parcel.writeInt(2);
        } else if (nb3.k(hi2Var, rw5.o)) {
            parcel.writeInt(4);
        } else {
            i.d();
        }
    }

    public zw5(hi2 hi2Var) {
        hi2Var.getClass();
        this.A = hi2Var;
    }
}
