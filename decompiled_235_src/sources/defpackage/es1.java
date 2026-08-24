package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: es1  reason: default package */
/* loaded from: classes.dex */
public final class es1 extends v05 {
    public static final Parcelable.Creator<es1> CREATOR = new y8(10);
    public String A;

    public es1(Parcel parcel) {
        super(parcel);
        this.A = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A);
    }

    public es1() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
