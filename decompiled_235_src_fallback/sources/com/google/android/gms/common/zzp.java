package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzp implements android.os.Parcelable.Creator {
    public zzp() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r0 = 0
            r1 = 0
            r4 = r0
            r5 = r4
            r7 = r5
            r8 = r7
            r3 = r1
            r6 = r3
        Lc:
            int r0 = r10.dataPosition()
            if (r0 >= r9) goto L3f
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            switch(r1) {
                case 1: goto L3a;
                case 2: goto L35;
                case 3: goto L30;
                case 4: goto L2b;
                case 5: goto L26;
                case 6: goto L21;
                default: goto L1d;
            }
        L1d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r0)
            goto Lc
        L21:
            boolean r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r0)
            goto Lc
        L26:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r0)
            goto Lc
        L2b:
            android.os.IBinder r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r10, r0)
            goto Lc
        L30:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r0)
            goto Lc
        L35:
            boolean r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r0)
            goto Lc
        L3a:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r0)
            goto Lc
        L3f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r9)
            com.google.android.gms.common.zzo r2 = new com.google.android.gms.common.zzo
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.zzo[] r0 = new com.google.android.gms.common.zzo[r1]
            return r0
    }
}
