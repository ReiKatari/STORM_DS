package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends m {
    public static final Parcelable.Creator<c> CREATOR = new a8.l(6);
    public String A;

    public c(Parcel parcel) {
        super(parcel);
        this.A = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A);
    }

    public c() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
