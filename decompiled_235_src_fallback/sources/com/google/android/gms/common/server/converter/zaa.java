package com.google.android.gms.common.server.converter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.zaa> CREATOR = null;
    final int zaa;
    private final com.google.android.gms.common.server.converter.StringToIntConverter zab;

    static {
            com.google.android.gms.common.server.converter.zab r0 = new com.google.android.gms.common.server.converter.zab
            r0.<init>()
            com.google.android.gms.common.server.converter.zaa.CREATOR = r0
            return
    }

    public zaa(int r1, com.google.android.gms.common.server.converter.StringToIntConverter r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    private zaa(com.google.android.gms.common.server.converter.StringToIntConverter r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            return
    }

    public static com.google.android.gms.common.server.converter.zaa zaa(com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter r1) {
            boolean r0 = r1 instanceof com.google.android.gms.common.server.converter.StringToIntConverter
            if (r0 == 0) goto Lc
            com.google.android.gms.common.server.converter.zaa r0 = new com.google.android.gms.common.server.converter.zaa
            com.google.android.gms.common.server.converter.StringToIntConverter r1 = (com.google.android.gms.common.server.converter.StringToIntConverter) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.lang.String r1 = "Unsupported safe parcelable field converter class."
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r0 = r3.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r2, r0)
            com.google.android.gms.common.server.converter.StringToIntConverter r3 = r3.zab
            r0 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r4, r2, r3, r5, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r1)
            return
    }

    public final com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zab() {
            r0 = this;
            com.google.android.gms.common.server.converter.StringToIntConverter r0 = r0.zab
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "There was no converter wrapped in this ConverterWrapper."
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }
}
