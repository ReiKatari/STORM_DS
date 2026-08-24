package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zav;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz7  reason: default package */
/* loaded from: classes.dex */
public final class xz7 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<xz7> CREATOR = new b96(9);
    public final int A;
    public final ConnectionResult B;
    public final zav L;

    public xz7(int i, ConnectionResult connectionResult, zav zavVar) {
        this.A = i;
        this.B = connectionResult;
        this.L = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.A);
        SafeParcelWriter.writeParcelable(parcel, 2, this.B, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.L, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
