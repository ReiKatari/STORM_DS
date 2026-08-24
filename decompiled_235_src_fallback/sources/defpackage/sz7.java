package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz7  reason: default package */
/* loaded from: classes.dex */
public final class sz7 extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<defpackage.sz7> CREATOR = null;
    public final java.util.List A;
    public final java.lang.String B;

    static {
            b96 r0 = new b96
            r1 = 7
            r0.<init>(r1)
            defpackage.sz7.CREATOR = r0
            return
    }

    public sz7(java.util.ArrayList r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r0 = this;
            java.lang.String r0 = r0.B
            if (r0 == 0) goto L7
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            return r0
        L7:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_CANCELED
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 1
            java.util.List r1 = r3.A
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r3 = r3.B
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r0, r3, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
