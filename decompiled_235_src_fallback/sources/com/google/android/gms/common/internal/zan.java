package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zan implements android.os.Parcelable.Creator {
    public zan() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
            r19 = this;
            r0 = r20
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r0)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r18 = r2
            r8 = r3
            r9 = r8
            r10 = r9
            r17 = r10
            r15 = r4
            r16 = r15
            r11 = r5
            r13 = r11
        L17:
            int r2 = r0.dataPosition()
            if (r2 >= r1) goto L65
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r0)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L5f;
                case 2: goto L59;
                case 3: goto L53;
                case 4: goto L4d;
                case 5: goto L47;
                case 6: goto L41;
                case 7: goto L3a;
                case 8: goto L33;
                case 9: goto L2c;
                default: goto L28;
            }
        L28:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L17
        L2c:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r18 = r2
            goto L17
        L33:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r17 = r2
            goto L17
        L3a:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r16 = r2
            goto L17
        L41:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r15 = r2
            goto L17
        L47:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r13 = r2
            goto L17
        L4d:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r11 = r2
            goto L17
        L53:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r10 = r2
            goto L17
        L59:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r9 = r2
            goto L17
        L5f:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r8 = r2
            goto L17
        L65:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.common.internal.MethodInvocation r7 = new com.google.android.gms.common.internal.MethodInvocation
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.MethodInvocation[] r0 = new com.google.android.gms.common.internal.MethodInvocation[r1]
            return r0
    }
}
