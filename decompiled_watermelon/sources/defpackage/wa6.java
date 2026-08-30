package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wa6  reason: default package */
/* loaded from: classes.dex */
public final class wa6 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public static xa6 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = wa6.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new xa6();
        }
        en4 j = a96.B.j();
        for (int i = 0; i < readInt; i++) {
            j.add(parcel.readValue(classLoader));
        }
        return new xa6(j.d());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new k40(parcel, null);
            case 2:
                return new b21(parcel, null);
            case 3:
                return new pu3(parcel, null);
            case 4:
                return new jx5(parcel, null);
            default:
                return new yq6(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new xa6[i];
            case 1:
                return new k40[i];
            case 2:
                return new b21[i];
            case 3:
                return new pu3[i];
            case 4:
                return new jx5[i];
            default:
                return new yq6[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new k40(parcel, classLoader);
            case 2:
                return new b21(parcel, classLoader);
            case 3:
                return new pu3(parcel, classLoader);
            case 4:
                return new jx5(parcel, classLoader);
            default:
                return new yq6(parcel, classLoader);
        }
    }
}
