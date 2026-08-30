package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k40  reason: default package */
/* loaded from: classes.dex */
public final class k40 extends r {
    public static final Parcelable.Creator<k40> CREATOR = new wa6(1);
    public final int L;
    public final int R;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;

    public k40(Parcel parcel, ClassLoader classLoader) {
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

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.L);
        parcel.writeInt(this.R);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public k40(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.L = bottomSheetBehavior.N;
        this.R = bottomSheetBehavior.e;
        this.X = bottomSheetBehavior.b;
        this.Y = bottomSheetBehavior.I;
        this.Z = bottomSheetBehavior.J;
    }
}
