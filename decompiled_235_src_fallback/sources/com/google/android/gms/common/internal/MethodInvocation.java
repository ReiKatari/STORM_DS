package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MethodInvocation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.MethodInvocation> CREATOR = null;
    private final int zaa;
    private final int zab;
    private final int zac;
    private final long zad;
    private final long zae;
    private final java.lang.String zaf;
    private final java.lang.String zag;
    private final int zah;
    private final int zai;

    static {
            com.google.android.gms.common.internal.zan r0 = new com.google.android.gms.common.internal.zan
            r0.<init>()
            com.google.android.gms.common.internal.MethodInvocation.CREATOR = r0
            return
    }

    @java.lang.Deprecated
    public MethodInvocation(int r13, int r14, int r15, long r16, long r18, java.lang.String r20, java.lang.String r21, int r22) {
            r12 = this;
            r11 = -1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            return
    }

    public MethodInvocation(int r1, int r2, int r3, long r4, long r6, java.lang.String r8, java.lang.String r9, int r10, int r11) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            r0.zae = r6
            r0.zaf = r8
            r0.zag = r9
            r0.zah = r10
            r0.zai = r11
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.zaa
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            r5 = 2
            int r1 = r3.zab
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            r5 = 3
            int r1 = r3.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            r5 = 4
            long r1 = r3.zad
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r5, r1)
            r5 = 5
            long r1 = r3.zae
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r5, r1)
            java.lang.String r5 = r3.zaf
            r1 = 6
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            r5 = 7
            java.lang.String r1 = r3.zag
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r5, r1, r2)
            r5 = 8
            int r1 = r3.zah
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            r5 = 9
            int r3 = r3.zai
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
