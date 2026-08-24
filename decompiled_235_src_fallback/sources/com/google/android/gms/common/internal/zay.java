package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zay implements android.os.Parcelable.Creator {
    public zay() {
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
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r7) goto L3e
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 1
            if (r5 == r6) goto L39
            r6 = 2
            if (r5 == r6) goto L34
            r6 = 3
            if (r5 == r6) goto L2f
            r6 = 4
            if (r5 == r6) goto L26
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L8
        L26:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r0 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r8, r4, r0)
            com.google.android.gms.common.api.Scope[] r0 = (com.google.android.gms.common.api.Scope[]) r0
            goto L8
        L2f:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L8
        L34:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L8
        L39:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L8
        L3e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r7)
            com.google.android.gms.common.internal.zax r7 = new com.google.android.gms.common.internal.zax
            r7.<init>(r1, r2, r3, r0)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.zax[] r0 = new com.google.android.gms.common.internal.zax[r1]
            return r0
    }
}
