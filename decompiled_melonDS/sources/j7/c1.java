package j7;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 extends i6.b {
    public static final Parcelable.Creator<c1> CREATOR = new z2.o(4);
    public Parcelable L;

    public c1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = parcel.readParcelable(classLoader == null ? u0.class.getClassLoader() : classLoader);
    }

    @Override // i6.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.L, 0);
    }
}
