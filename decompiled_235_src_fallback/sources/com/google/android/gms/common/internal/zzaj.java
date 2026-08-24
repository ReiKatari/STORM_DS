package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzaj implements android.os.Parcelable.Creator {
    public zzaj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        La:
            int r0 = r9.dataPosition()
            if (r0 >= r8) goto L44
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            r7 = 1
            if (r1 == r7) goto L3f
            r7 = 2
            if (r1 == r7) goto L3a
            r7 = 3
            if (r1 == r7) goto L35
            r7 = 4
            if (r1 == r7) goto L30
            r7 = 5
            if (r1 == r7) goto L2b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r0)
            goto La
        L2b:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r0)
            goto La
        L30:
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r0)
            goto La
        L35:
            boolean r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r9, r0)
            goto La
        L3a:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r9, r0)
            goto La
        L3f:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r0)
            goto La
        L44:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r8)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r1 = new com.google.android.gms.common.internal.RootTelemetryConfiguration
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration[] r0 = new com.google.android.gms.common.internal.RootTelemetryConfiguration[r1]
            return r0
    }
}
