package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz7  reason: default package */
/* loaded from: classes.dex */
public final class fz7 extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<fz7> CREATOR = new b96(5);
    public final int A;
    public final int B;
    public final Intent L;

    public fz7(int i, int i2, Intent intent) {
        this.A = i;
        this.B = i2;
        this.L = intent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.B == 0) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.A);
        SafeParcelWriter.writeInt(parcel, 2, this.B);
        SafeParcelWriter.writeParcelable(parcel, 3, this.L, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
