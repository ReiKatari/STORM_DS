package a8;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends View.BaseSavedState {
    public static final Parcelable.Creator<m> CREATOR = new l(0);
    public final boolean A;

    public m(Parcel parcel) {
        super(parcel);
        boolean z10;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.A = z10;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }

    public m(Parcelable parcelable, boolean z10) {
        super(parcelable);
        this.A = z10;
    }
}
