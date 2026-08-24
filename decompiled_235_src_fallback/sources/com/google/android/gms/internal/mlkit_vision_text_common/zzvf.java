package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzvf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzvf> CREATOR = null;
    private final java.lang.String zza;
    private final java.util.List zzb;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzvg r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzvg
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzvf.CREATOR = r0
            return
    }

    public zzvf(java.lang.String r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            r5 = 2
            java.util.List r3 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r5, r3, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }

    public final java.lang.String zza() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }

    public final java.util.List zzb() {
            r0 = this;
            java.util.List r0 = r0.zzb
            return r0
    }
}
