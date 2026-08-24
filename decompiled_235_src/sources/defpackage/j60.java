package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j60  reason: default package */
/* loaded from: classes.dex */
public final class j60 extends s {
    public static final Parcelable.Creator<j60> CREATOR = new lm6(1);
    public final int L;
    public final int R;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;

    public j60(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        boolean z2;
        this.L = parcel.readInt();
        this.R = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.X = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Y = z2;
        this.Z = parcel.readInt() == 1;
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.L);
        parcel.writeInt(this.R);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public j60(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.L = bottomSheetBehavior.N;
        this.R = bottomSheetBehavior.e;
        this.X = bottomSheetBehavior.b;
        this.Y = bottomSheetBehavior.I;
        this.Z = bottomSheetBehavior.J;
    }
}
