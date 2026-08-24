package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc7  reason: default package */
/* loaded from: classes.dex */
public final class vc7 extends v05 {
    public static final Parcelable.Creator<vc7> CREATOR = new b96(4);
    public boolean A;

    public vc7(Parcel parcel) {
        super(parcel);
        this.A = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A ? 1 : 0);
    }

    public vc7() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
