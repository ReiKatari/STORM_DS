package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s93  reason: default package */
/* loaded from: classes.dex */
public final class s93 implements Parcelable {
    public static final Parcelable.Creator<s93> CREATOR = new y8(15);
    public final IntentSender A;
    public final Intent B;
    public final int L;
    public final int R;

    public s93(IntentSender intentSender, Intent intent, int i, int i2) {
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
