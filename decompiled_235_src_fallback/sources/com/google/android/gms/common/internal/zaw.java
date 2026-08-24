package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaw implements android.os.Parcelable.Creator {
    public zaw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r0 = 0
            r1 = 0
            r3 = r0
            r6 = r3
            r7 = r6
            r4 = r1
            r5 = r4
        Lb:
            int r0 = r9.dataPosition()
            if (r0 >= r8) goto L4a
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            r2 = 1
            if (r1 == r2) goto L45
            r2 = 2
            if (r1 == r2) goto L40
            r2 = 3
            if (r1 == r2) goto L36
            r2 = 4
            if (r1 == r2) goto L31
            r2 = 5
            if (r1 == r2) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r0)
            goto Lb
        L2c:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r9, r0)
            goto Lb
        L31:
            boolean r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r9, r0)
            goto Lb
        L36:
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r1 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r0, r1)
            r5 = r0
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            goto Lb
        L40:
            android.os.IBinder r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r9, r0)
            goto Lb
        L45:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r0)
            goto Lb
        L4a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r8)
            com.google.android.gms.common.internal.zav r2 = new com.google.android.gms.common.internal.zav
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.zav[] r0 = new com.google.android.gms.common.internal.zav[r1]
            return r0
    }
}
