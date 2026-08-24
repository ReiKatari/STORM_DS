package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vw6  reason: default package */
/* loaded from: classes.dex */
public final class vw6 extends View.BaseSavedState {
    public static final Parcelable.Creator<vw6> CREATOR = new b96(3);
    public final boolean A;

    public vw6(Parcel parcel) {
        super(parcel);
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.A = z;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }

    public vw6(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.A = z;
    }
}
