package ha;

import android.os.Parcel;
import android.os.Parcelable;
import z2.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends i6.b {
    public static final Parcelable.Creator<a> CREATOR = new o(2);
    public boolean L;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = parcel.readInt() == 1;
    }

    @Override // i6.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.L ? 1 : 0);
    }
}
