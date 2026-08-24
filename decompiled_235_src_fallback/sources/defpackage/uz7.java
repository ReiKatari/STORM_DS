package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz7  reason: default package */
/* loaded from: classes.dex */
public final class uz7 extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<defpackage.uz7> CREATOR = null;
    public final int A;
    public final com.google.android.gms.common.internal.zat B;

    static {
            b96 r0 = new b96
            r1 = 8
            r0.<init>(r1)
            defpackage.uz7.CREATOR = r0
            return
    }

    public uz7(int r1, com.google.android.gms.common.internal.zat r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            int r2 = r3.A
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r2)
            com.google.android.gms.common.internal.zat r3 = r3.B
            r1 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r4, r2, r3, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
