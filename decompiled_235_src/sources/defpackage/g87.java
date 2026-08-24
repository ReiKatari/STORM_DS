package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g87  reason: default package */
/* loaded from: classes.dex */
public final class g87 extends s {
    public static final Parcelable.Creator<g87> CREATOR = new us4(6);
    public int L;
    public boolean R;

    public g87(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        this.L = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.R = z;
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.L);
        parcel.writeInt(this.R ? 1 : 0);
    }
}
