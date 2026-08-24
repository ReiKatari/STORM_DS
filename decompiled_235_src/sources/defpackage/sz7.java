package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz7  reason: default package */
/* loaded from: classes.dex */
public final class sz7 extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<sz7> CREATOR = new b96(7);
    public final List A;
    public final String B;

    public sz7(ArrayList arrayList, String str) {
        this.A = arrayList;
        this.B = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.B != null) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.A, false);
        SafeParcelWriter.writeString(parcel, 2, this.B, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
