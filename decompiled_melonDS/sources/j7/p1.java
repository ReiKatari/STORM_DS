package j7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 implements Parcelable {
    public static final Parcelable.Creator<p1> CREATOR = new a8.l(27);
    public int A;
    public int B;
    public int[] L;
    public boolean R;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.A + ", mGapDir=" + this.B + ", mHasUnwantedGapAfter=" + this.R + ", mGapPerSpan=" + Arrays.toString(this.L) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.R ? 1 : 0);
        int[] iArr = this.L;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.L);
            return;
        }
        parcel.writeInt(0);
    }
}
