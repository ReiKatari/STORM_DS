package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz7  reason: default package */
/* loaded from: classes.dex */
public final class uz7 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<uz7> CREATOR = new b96(8);
    public final int A;
    public final zat B;

    public uz7(int i, zat zatVar) {
        this.A = i;
        this.B = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.A);
        SafeParcelWriter.writeParcelable(parcel, 2, this.B, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
