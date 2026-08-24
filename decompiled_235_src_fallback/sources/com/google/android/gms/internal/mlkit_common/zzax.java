package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzax implements com.google.android.gms.internal.mlkit_common.zzbc {
    private final int zza;
    private final com.google.android.gms.internal.mlkit_common.zzbb zzb;

    public zzax(int r1, com.google.android.gms.internal.mlkit_common.zzbb r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
            r0 = this;
            java.lang.Class<com.google.android.gms.internal.mlkit_common.zzbc> r0 = com.google.android.gms.internal.mlkit_common.zzbc.class
            return r0
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_common.zzbc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.mlkit_common.zzbc r5 = (com.google.android.gms.internal.mlkit_common.zzbc) r5
            int r1 = r4.zza
            int r3 = r5.zza()
            if (r1 != r3) goto L21
            com.google.android.gms.internal.mlkit_common.zzbb r4 = r4.zzb
            com.google.android.gms.internal.mlkit_common.zzbb r5 = r5.zzb()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L21
            return r0
        L21:
            return r2
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzbb r0 = r2.zzb
            int r0 = r0.hashCode()
            r1 = 2041407134(0x79ad669e, float:1.12543585E35)
            r0 = r0 ^ r1
            int r2 = r2.zza
            r1 = 14552422(0xde0d66, float:2.0392287E-38)
            r2 = r2 ^ r1
            int r2 = r2 + r0
            return r2
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@com.google.firebase.encoders.proto.Protobuf(tag="
            r0.<init>(r1)
            int r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = "intEncoding="
            r0.append(r1)
            com.google.android.gms.internal.mlkit_common.zzbb r2 = r2.zzb
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final int zza() {
            r0 = this;
            int r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final com.google.android.gms.internal.mlkit_common.zzbb zzb() {
            r0 = this;
            com.google.android.gms.internal.mlkit_common.zzbb r0 = r0.zzb
            return r0
    }
}
