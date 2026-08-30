package y9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import z2.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends i6.b {
    public static final Parcelable.Creator<a> CREATOR = new o(10);
    public final int L;
    public final int R;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        boolean z11;
        this.L = parcel.readInt();
        this.R = parcel.readInt();
        if (parcel.readInt() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X = z10;
        if (parcel.readInt() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Y = z11;
        this.Z = parcel.readInt() == 1;
    }

    @Override // i6.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.L);
        parcel.writeInt(this.R);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.L = bottomSheetBehavior.N;
        this.R = bottomSheetBehavior.f2953e;
        this.X = bottomSheetBehavior.f2947b;
        this.Y = bottomSheetBehavior.I;
        this.Z = bottomSheetBehavior.J;
    }
}
