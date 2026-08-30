package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qx5  reason: default package */
/* loaded from: classes.dex */
public final class qx5 extends sr4 {
    public static final Parcelable.Creator<qx5> CREATOR = new px5(0);
    public int A;
    public int B;
    public int L;

    public qx5(Parcel parcel) {
        super(parcel);
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.L = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.L);
    }

    public qx5() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
