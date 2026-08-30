package q;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k3 extends i6.b {
    public static final Parcelable.Creator<k3> CREATOR = new z2.o(8);
    public int L;
    public boolean R;

    public k3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.L = parcel.readInt();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.R = z10;
    }

    @Override // i6.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.L);
        parcel.writeInt(this.R ? 1 : 0);
    }
}
