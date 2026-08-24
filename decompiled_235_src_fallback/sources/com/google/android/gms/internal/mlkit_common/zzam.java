package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzam extends com.google.android.gms.internal.mlkit_common.zzaf {
    final /* synthetic */ com.google.android.gms.internal.mlkit_common.zzan zza;

    public zzam(com.google.android.gms.internal.mlkit_common.zzan r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzan r0 = r2.zza
            int r0 = com.google.android.gms.internal.mlkit_common.zzan.zzh(r0)
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_common.zzt.zza(r3, r0, r1)
            com.google.android.gms.internal.mlkit_common.zzan r0 = r2.zza
            java.lang.Object[] r0 = com.google.android.gms.internal.mlkit_common.zzan.zzi(r0)
            int r3 = r3 + r3
            r0 = r0[r3]
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.mlkit_common.zzan r2 = r2.zza
            java.lang.Object[] r2 = com.google.android.gms.internal.mlkit_common.zzan.zzi(r2)
            int r3 = r3 + 1
            r2 = r2[r3]
            java.util.Objects.requireNonNull(r2)
            java.util.AbstractMap$SimpleImmutableEntry r3 = new java.util.AbstractMap$SimpleImmutableEntry
            r3.<init>(r0, r2)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzan r0 = r0.zza
            int r0 = com.google.android.gms.internal.mlkit_common.zzan.zzh(r0)
            return r0
    }
}
