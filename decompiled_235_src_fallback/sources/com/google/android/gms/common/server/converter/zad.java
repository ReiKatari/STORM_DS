package com.google.android.gms.common.server.converter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zad implements android.os.Parcelable.Creator {
    public zad() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r6)
            r0 = 0
            r1 = 0
        L6:
            int r2 = r6.dataPosition()
            if (r2 >= r5) goto L2a
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r6)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            r4 = 1
            if (r3 == r4) goto L25
            r4 = 2
            if (r3 == r4) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r6, r2)
            goto L6
        L1e:
            android.os.Parcelable$Creator<com.google.android.gms.common.server.converter.zac> r0 = com.google.android.gms.common.server.converter.zac.CREATOR
            java.util.ArrayList r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r6, r2, r0)
            goto L6
        L25:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r6, r2)
            goto L6
        L2a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r6, r5)
            com.google.android.gms.common.server.converter.StringToIntConverter r5 = new com.google.android.gms.common.server.converter.StringToIntConverter
            r5.<init>(r1, r0)
            return r5
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.server.converter.StringToIntConverter[] r0 = new com.google.android.gms.common.server.converter.StringToIntConverter[r1]
            return r0
    }
}
