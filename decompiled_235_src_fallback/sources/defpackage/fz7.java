package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz7  reason: default package */
/* loaded from: classes.dex */
public final class fz7 extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<defpackage.fz7> CREATOR = null;
    public final int A;
    public final int B;
    public final android.content.Intent L;

    static {
            b96 r0 = new b96
            r1 = 5
            r0.<init>(r1)
            defpackage.fz7.CREATOR = r0
            return
    }

    public fz7(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r0 = this;
            int r0 = r0.B
            if (r0 != 0) goto L7
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            return r0
        L7:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_CANCELED
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            int r2 = r3.A
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r2)
            r1 = 2
            int r2 = r3.B
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r2)
            android.content.Intent r3 = r3.L
            r1 = 0
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r4, r2, r3, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
