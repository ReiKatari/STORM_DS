package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zac implements android.os.Parcelable.Creator {
    public zac() {
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
            r2 = r0
            r3 = r1
            r1 = r2
        L9:
            int r4 = r8.dataPosition()
            if (r4 >= r7) goto L3d
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 1
            if (r5 == r6) goto L36
            r6 = 2
            if (r5 == r6) goto L31
            r6 = 3
            if (r5 == r6) goto L2c
            r6 = 4
            if (r5 == r6) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L9
        L27:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r8, r4)
            goto L9
        L2c:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r8, r4)
            goto L9
        L31:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r8, r4)
            goto L9
        L36:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r0 = com.google.android.gms.common.Feature.CREATOR
            java.util.ArrayList r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r8, r4, r0)
            goto L9
        L3d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r7)
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r7 = new com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest
            r7.<init>(r0, r3, r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest[] r0 = new com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest[r1]
            return r0
    }
}
