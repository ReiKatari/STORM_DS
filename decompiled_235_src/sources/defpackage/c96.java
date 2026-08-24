package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c96  reason: default package */
/* loaded from: classes.dex */
public final class c96 extends v05 {
    public static final Parcelable.Creator<c96> CREATOR = new b96(0);
    public int A;
    public int B;
    public int L;

    public c96(Parcel parcel) {
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

    public c96() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
