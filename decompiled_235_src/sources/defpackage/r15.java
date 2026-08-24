package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r15  reason: default package */
/* loaded from: classes.dex */
public final class r15 extends v05 {
    public static final Parcelable.Creator<r15> CREATOR = new y8(28);
    public final int A;

    public r15(Parcel parcel) {
        super(parcel);
        this.A = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A);
    }

    public r15(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.A = i;
    }
}
