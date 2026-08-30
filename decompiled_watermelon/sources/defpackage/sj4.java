package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sj4  reason: default package */
/* loaded from: classes.dex */
public final class sj4 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ sj4(int i) {
        this.a = i;
    }

    public static tj4 a(Parcel parcel, ClassLoader classLoader) {
        ta6 ta6Var;
        if (classLoader == null) {
            classLoader = sj4.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    ta6Var = sn1.q0;
                } else {
                    i.n(wh1.j("Unsupported MutableState policy ", readInt, " was restored"));
                    return null;
                }
            } else {
                ta6Var = k45.n0;
            }
        } else {
            ta6Var = k45.f0;
        }
        return new tj4(readValue, ta6Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return r.B;
                }
                i.n("superState must be null");
                return null;
            case 2:
                return new sn0(parcel, classLoader);
            case 3:
                return new uf2(parcel, classLoader);
            case 4:
                return new z65(parcel, classLoader);
            case 5:
                return new a66(parcel, classLoader);
            default:
                return new sv6(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new tj4[i];
            case 1:
                return new r[i];
            case 2:
                return new sn0[i];
            case 3:
                return new uf2[i];
            case 4:
                return new z65[i];
            case 5:
                return new a66[i];
            default:
                return new sv6[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return r.B;
                }
                i.n("superState must be null");
                return null;
            case 2:
                return new sn0(parcel, null);
            case 3:
                return new uf2(parcel, null);
            case 4:
                return new z65(parcel, null);
            case 5:
                return new a66(parcel, null);
            default:
                return new sv6(parcel, null);
        }
    }
}
