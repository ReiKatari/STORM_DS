package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a66  reason: default package */
/* loaded from: classes.dex */
public final class a66 extends r {
    public static final Parcelable.Creator<a66> CREATOR = new sj4(5);
    public final int L;

    public a66(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = parcel.readInt();
    }

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.L);
    }

    public a66(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.L = sideSheetBehavior.h;
    }
}
