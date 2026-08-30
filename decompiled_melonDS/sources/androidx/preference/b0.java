package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends m {
    public static final Parcelable.Creator<b0> CREATOR = new a8.l(10);
    public final int A;

    public b0(Parcel parcel) {
        super(parcel);
        this.A = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A);
    }

    public b0(int i2) {
        super(AbsSavedState.EMPTY_STATE);
        this.A = i2;
    }
}
