package com.google.android.gms.common.server.response;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zam extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zam> CREATOR = null;
    final int zaa;
    final java.lang.String zab;
    final com.google.android.gms.common.server.response.FastJsonResponse.Field zac;

    static {
            com.google.android.gms.common.server.response.zak r0 = new com.google.android.gms.common.server.response.zak
            r0.<init>()
            com.google.android.gms.common.server.response.zam.CREATOR = r0
            return
    }

    public zam(int r1, java.lang.String r2, com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    public zam(java.lang.String r2, com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            r1.zac = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            java.lang.String r0 = r4.zab
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            r0 = 3
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = r4.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r4, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
