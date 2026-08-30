package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k33  reason: default package */
/* loaded from: classes.dex */
public final class k33 implements Parcelable {
    public static final Parcelable.Creator<k33> CREATOR = new x8(15);
    public final IntentSender A;
    public final Intent B;
    public final int L;
    public final int R;

    public k33(IntentSender intentSender, Intent intent, int i, int i2) {
        this.A = intentSender;
        this.B = intent;
        this.L = i;
        this.R = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.A, i);
        parcel.writeParcelable(this.B, i);
        parcel.writeInt(this.L);
        parcel.writeInt(this.R);
    }
}
