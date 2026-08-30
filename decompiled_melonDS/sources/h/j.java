package h;

import a8.l;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new l(25);
    public final IntentSender A;
    public final Intent B;
    public final int L;
    public final int R;

    public j(IntentSender intentSender, Intent intent, int i2, int i10) {
        this.A = intentSender;
        this.B = intent;
        this.L = i2;
        this.R = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeParcelable(this.A, i2);
        parcel.writeParcelable(this.B, i2);
        parcel.writeInt(this.L);
        parcel.writeInt(this.R);
    }
}
