package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzp> CREATOR = null;
    private final java.lang.String zza;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzq r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzq
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzp.CREATOR = r0
            return
    }

    public zzp() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public zzp(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r2 = r2.zza
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r0 = 2
            r1 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r3, r0, r2, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
