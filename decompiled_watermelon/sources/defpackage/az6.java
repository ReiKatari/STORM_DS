package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: az6  reason: default package */
/* loaded from: classes.dex */
public final class az6 extends sr4 {
    public static final Parcelable.Creator<az6> CREATOR = new px5(4);
    public boolean A;

    public az6(Parcel parcel) {
        super(parcel);
        this.A = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A ? 1 : 0);
    }

    public az6() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
