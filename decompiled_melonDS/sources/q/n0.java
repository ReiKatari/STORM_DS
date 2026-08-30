package q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends View.BaseSavedState {
    public static final Parcelable.Creator<n0> CREATOR = new m0(0);
    public boolean A;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }
}
