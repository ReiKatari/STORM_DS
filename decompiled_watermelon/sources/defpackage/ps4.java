package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ps4  reason: default package */
/* loaded from: classes.dex */
public final class ps4 extends sr4 {
    public static final Parcelable.Creator<ps4> CREATOR = new x8(28);
    public final int A;

    public ps4(Parcel parcel) {
        super(parcel);
        this.A = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A);
    }

    public ps4(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.A = i;
    }
}
