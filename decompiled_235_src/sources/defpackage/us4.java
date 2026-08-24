package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: us4  reason: default package */
/* loaded from: classes.dex */
public final class us4 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ us4(int i) {
        this.a = i;
    }

    public static vs4 a(Parcel parcel, ClassLoader classLoader) {
        im6 im6Var;
        if (classLoader == null) {
            classLoader = us4.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    im6Var = vs0.s0;
                } else {
                    i.m(lb1.k("Unsupported MutableState policy ", readInt, " was restored"));
                    return null;
                }
            } else {
                im6Var = xd5.s0;
            }
        } else {
            im6Var = vs0.j0;
        }
        return new vs4(readValue, im6Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return s.B;
                }
                i.m("superState must be null");
                return null;
            case 2:
                return new cq0(parcel, classLoader);
            case 3:
                return new tk2(parcel, classLoader);
            case 4:
                return new pg5(parcel, classLoader);
            case 5:
                return new oh6(parcel, classLoader);
            default:
                return new g87(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vs4[i];
            case 1:
                return new s[i];
            case 2:
                return new cq0[i];
            case 3:
                return new tk2[i];
            case 4:
                return new pg5[i];
            case 5:
                return new oh6[i];
            default:
                return new g87[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return s.B;
                }
                i.m("superState must be null");
                return null;
            case 2:
                return new cq0(parcel, null);
            case 3:
                return new tk2(parcel, null);
            case 4:
                return new pg5(parcel, null);
            case 5:
                return new oh6(parcel, null);
            default:
                return new g87(parcel, null);
        }
    }
}
