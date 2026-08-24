package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm6  reason: default package */
/* loaded from: classes.dex */
public final class lm6 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public static mm6 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = lm6.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new mm6();
        }
        jw4 f = qk6.B.f();
        for (int i = 0; i < readInt; i++) {
            f.add(parcel.readValue(classLoader));
        }
        return new mm6(f.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new j60(parcel, null);
            case 2:
                return new j51(parcel, null);
            case 3:
                return new y14(parcel, null);
            case 4:
                return new v86(parcel, null);
            default:
                return new n37(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mm6[i];
            case 1:
                return new j60[i];
            case 2:
                return new j51[i];
            case 3:
                return new y14[i];
            case 4:
                return new v86[i];
            default:
                return new n37[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new j60(parcel, classLoader);
            case 2:
                return new j51(parcel, classLoader);
            case 3:
                return new y14(parcel, classLoader);
            case 4:
                return new v86(parcel, classLoader);
            default:
                return new n37(parcel, classLoader);
        }
    }
}
