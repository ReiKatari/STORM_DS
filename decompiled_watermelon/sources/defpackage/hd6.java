package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hd6  reason: default package */
/* loaded from: classes.dex */
public final class hd6 implements Parcelable {
    public static final Parcelable.Creator<hd6> CREATOR = new px5(1);
    public int A;
    public int B;
    public int[] L;
    public boolean R;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.A + ", mGapDir=" + this.B + ", mHasUnwantedGapAfter=" + this.R + ", mGapPerSpan=" + Arrays.toString(this.L) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.R ? 1 : 0);
        int[] iArr = this.L;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.L);
            return;
        }
        parcel.writeInt(0);
    }
}
