package com.google.android.gms.common.server.response;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zao implements android.os.Parcelable.Creator {
    public zao() {
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
            if (r3 >= r6) goto L34
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 1
            if (r4 == r5) goto L2f
            r5 = 2
            if (r4 == r5) goto L28
            r5 = 3
            if (r4 == r5) goto L23
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L8
        L23:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r7, r3)
            goto L8
        L28:
            android.os.Parcelable$Creator<com.google.android.gms.common.server.response.zal> r0 = com.google.android.gms.common.server.response.zal.CREATOR
            java.util.ArrayList r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r7, r3, r0)
            goto L8
        L2f:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r7, r3)
            goto L8
        L34:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r6)
            com.google.android.gms.common.server.response.zan r6 = new com.google.android.gms.common.server.response.zan
            r6.<init>(r2, r0, r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.server.response.zan[] r0 = new com.google.android.gms.common.server.response.zan[r1]
            return r0
    }
}
