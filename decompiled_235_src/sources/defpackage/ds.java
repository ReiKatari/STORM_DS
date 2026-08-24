package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds  reason: default package */
/* loaded from: classes.dex */
public final class ds extends View.BaseSavedState {
    public static final Parcelable.Creator<ds> CREATOR = new y8(1);
    public boolean A;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }
}
