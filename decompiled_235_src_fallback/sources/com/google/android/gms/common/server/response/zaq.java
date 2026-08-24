package com.google.android.gms.common.server.response;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaq implements android.os.Parcelable.Creator {
    public zaq() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r7)
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L8:
            int r3 = r7.dataPosition()
            if (r3 >= r6) goto L36
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 1
            if (r4 == r5) goto L31
            r5 = 2
            if (r4 == r5) goto L2c
            r5 = 3
            if (r4 == r5) goto L23
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L8
        L23:
            android.os.Parcelable$Creator<com.google.android.gms.common.server.response.zan> r1 = com.google.android.gms.common.server.response.zan.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r7, r3, r1)
            com.google.android.gms.common.server.response.zan r1 = (com.google.android.gms.common.server.response.zan) r1
            goto L8
        L2c:
            android.os.Parcel r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(r7, r3)
            goto L8
        L31:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r7, r3)
            goto L8
        L36:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r6)
            com.google.android.gms.common.server.response.SafeParcelResponse r6 = new com.google.android.gms.common.server.response.SafeParcelResponse
            r6.<init>(r2, r0, r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.server.response.SafeParcelResponse[] r0 = new com.google.android.gms.common.server.response.SafeParcelResponse[r1]
            return r0
    }
}
