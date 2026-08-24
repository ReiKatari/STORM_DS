package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx3  reason: default package */
/* loaded from: classes.dex */
public final class bx3 extends v05 {
    public static final Parcelable.Creator<bx3> CREATOR = new y8(17);
    public String A;

    public bx3(Parcel parcel) {
        super(parcel);
        this.A = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A);
    }

    public bx3() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
