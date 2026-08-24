package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz7  reason: default package */
/* loaded from: classes.dex */
public final class xz7 extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<defpackage.xz7> CREATOR = null;
    public final int A;
    public final com.google.android.gms.common.ConnectionResult B;
    public final com.google.android.gms.common.internal.zav L;

    static {
            b96 r0 = new b96
            r1 = 9
            r0.<init>(r1)
            defpackage.xz7.CREATOR = r0
            return
    }

    public xz7(int r1, com.google.android.gms.common.ConnectionResult r2, com.google.android.gms.common.internal.zav r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r1 = 1
            int r2 = r4.A
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r2)
            r1 = 2
            com.google.android.gms.common.ConnectionResult r2 = r4.B
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r1 = 3
            com.google.android.gms.common.internal.zav r4 = r4.L
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r4, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
