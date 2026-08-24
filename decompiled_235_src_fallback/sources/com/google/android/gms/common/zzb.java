package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r8)
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
            r1 = r0
        L9:
            int r4 = r8.dataPosition()
            if (r4 >= r7) goto L3f
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 1
            if (r5 == r6) goto L3a
            r6 = 2
            if (r5 == r6) goto L35
            r6 = 3
            if (r5 == r6) goto L2c
            r6 = 4
            if (r5 == r6) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L9
        L27:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r8, r4)
            goto L9
        L2c:
            android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r8, r4, r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            goto L9
        L35:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L9
        L3a:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L9
        L3f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r7)
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult
            r7.<init>(r2, r3, r0, r1)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.ConnectionResult[] r0 = new com.google.android.gms.common.ConnectionResult[r1]
            return r0
    }
}
