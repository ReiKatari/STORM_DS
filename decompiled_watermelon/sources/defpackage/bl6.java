package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bl6  reason: default package */
/* loaded from: classes.dex */
public final class bl6 extends View.BaseSavedState {
    public static final Parcelable.Creator<bl6> CREATOR = new px5(3);
    public final boolean A;

    public bl6(Parcel parcel) {
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

    public bl6(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.A = z;
    }
}
