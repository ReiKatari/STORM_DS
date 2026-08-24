package com.google.android.gms.common.server.response;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaj implements android.os.Parcelable.Creator {
    public zaj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r0 = 0
            r1 = 0
            r8 = r0
            r10 = r8
            r11 = r10
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
        Lf:
            int r0 = r13.dataPosition()
            if (r0 >= r12) goto L56
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            switch(r1) {
                case 1: goto L51;
                case 2: goto L4c;
                case 3: goto L47;
                case 4: goto L42;
                case 5: goto L3d;
                case 6: goto L38;
                case 7: goto L33;
                case 8: goto L2e;
                case 9: goto L24;
                default: goto L20;
            }
        L20:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r0)
            goto Lf
        L24:
            android.os.Parcelable$Creator<com.google.android.gms.common.server.converter.zaa> r1 = com.google.android.gms.common.server.converter.zaa.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r0, r1)
            r11 = r0
            com.google.android.gms.common.server.converter.zaa r11 = (com.google.android.gms.common.server.converter.zaa) r11
            goto Lf
        L2e:
            java.lang.String r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r0)
            goto Lf
        L33:
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r0)
            goto Lf
        L38:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r0)
            goto Lf
        L3d:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r0)
            goto Lf
        L42:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r0)
            goto Lf
        L47:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r0)
            goto Lf
        L4c:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r0)
            goto Lf
        L51:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r0)
            goto Lf
        L56:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r12)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$Field[] r0 = new com.google.android.gms.common.server.response.FastJsonResponse.Field[r1]
            return r0
    }
}
