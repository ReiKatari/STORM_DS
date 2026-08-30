package n2;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 implements Parcelable.ClassLoaderCreator {
    public static f1 a(Parcel parcel, ClassLoader classLoader) {
        e eVar;
        if (classLoader == null) {
            classLoader = e1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    eVar = e.X;
                } else {
                    a0.j.p(w.d.m("Unsupported MutableState policy ", readInt, " was restored"));
                    return null;
                }
            } else {
                eVar = e.Z;
            }
        } else {
            eVar = e.R;
        }
        return new f1(readValue, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new f1[i2];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
