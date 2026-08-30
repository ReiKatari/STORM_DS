package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qr  reason: default package */
/* loaded from: classes.dex */
public final class qr extends View.BaseSavedState {
    public static final Parcelable.Creator<qr> CREATOR = new x8(1);
    public boolean A;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }
}
