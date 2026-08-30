package oa;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import z2.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends i6.b {
    public static final Parcelable.Creator<d> CREATOR = new o(6);
    public final int L;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = parcel.readInt();
    }

    @Override // i6.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.L);
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.L = sideSheetBehavior.f3086h;
    }
}
