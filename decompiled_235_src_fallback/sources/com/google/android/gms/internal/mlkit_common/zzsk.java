package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzsk implements com.google.android.gms.internal.mlkit_common.zzry {
    private final com.google.android.gms.internal.mlkit_common.zzmw zza;
    private com.google.android.gms.internal.mlkit_common.zzqt zzb;

    private zzsk(com.google.android.gms.internal.mlkit_common.zzmw r1, int r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzqt r2 = new com.google.android.gms.internal.mlkit_common.zzqt
            r2.<init>()
            r0.zzb = r2
            r0.zza = r1
            com.google.android.gms.internal.mlkit_common.zzsv.zza()
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zzry zzf(com.google.android.gms.internal.mlkit_common.zzmw r2) {
            com.google.android.gms.internal.mlkit_common.zzsk r0 = new com.google.android.gms.internal.mlkit_common.zzsk
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_common.zzry zzg() {
            com.google.android.gms.internal.mlkit_common.zzsk r0 = new com.google.android.gms.internal.mlkit_common.zzsk
            com.google.android.gms.internal.mlkit_common.zzmw r1 = new com.google.android.gms.internal.mlkit_common.zzmw
            r1.<init>()
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zza(com.google.android.gms.internal.mlkit_common.zzmv r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzmw r0 = r1.zza
            r0.zzf(r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zzb(com.google.android.gms.internal.mlkit_common.zznc r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzmw r0 = r1.zza
            r0.zzi(r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zzc(com.google.android.gms.internal.mlkit_common.zzqt r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final java.lang.String zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzmw r1 = r1.zza
            com.google.android.gms.internal.mlkit_common.zzmy r1 = r1.zzk()
            com.google.android.gms.internal.mlkit_common.zzqv r1 = r1.zzf()
            if (r1 == 0) goto L24
            java.lang.String r0 = r1.zzk()
            if (r0 == 0) goto L24
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            goto L24
        L19:
            java.lang.String r1 = r1.zzk()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L24:
            java.lang.String r1 = "NA"
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final byte[] zze(int r9, boolean r10) {
            r8 = this;
            r10 = r9 ^ 1
            com.google.android.gms.internal.mlkit_common.zzqt r0 = r8.zzb
            r1 = 1
            if (r1 == r10) goto L9
            r10 = 0
            goto La
        L9:
            r10 = r1
        La:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.zzf(r10)
            com.google.android.gms.internal.mlkit_common.zzqt r10 = r8.zzb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_common.zzqt r10 = r8.zzb
            com.google.android.gms.internal.mlkit_common.zzqv r10 = r10.zzm()
            com.google.android.gms.internal.mlkit_common.zzmw r0 = r8.zza
            r0.zzj(r10)
            com.google.android.gms.internal.mlkit_common.zzsv.zza()     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_common.zzmw r8 = r8.zza
            if (r9 != 0) goto L62
            com.google.android.gms.internal.mlkit_common.zzmy r8 = r8.zzk()     // Catch: java.io.UnsupportedEncodingException -> L79
            xd3 r9 = new xd3     // Catch: java.io.UnsupportedEncodingException -> L79
            r9.<init>()     // Catch: java.io.UnsupportedEncodingException -> L79
            gz0 r10 = com.google.android.gms.internal.mlkit_common.zzkr.zza     // Catch: java.io.UnsupportedEncodingException -> L79
            r10.configure(r9)     // Catch: java.io.UnsupportedEncodingException -> L79
            r9.d = r1     // Catch: java.io.UnsupportedEncodingException -> L79
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch: java.io.UnsupportedEncodingException -> L79
            r3.<init>()     // Catch: java.io.UnsupportedEncodingException -> L79
            uf3 r2 = new uf3     // Catch: java.io.IOException -> L57
            java.util.HashMap r4 = r9.a     // Catch: java.io.IOException -> L57
            java.util.HashMap r5 = r9.b     // Catch: java.io.IOException -> L57
            ud3 r6 = r9.c     // Catch: java.io.IOException -> L57
            boolean r7 = r9.d     // Catch: java.io.IOException -> L57
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L57
            r2.a(r8)     // Catch: java.io.IOException -> L57
            r2.c()     // Catch: java.io.IOException -> L57
            android.util.JsonWriter r8 = r2.b     // Catch: java.io.IOException -> L57
            r8.flush()     // Catch: java.io.IOException -> L57
        L57:
            java.lang.String r8 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> L79
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)     // Catch: java.io.UnsupportedEncodingException -> L79
            return r8
        L62:
            com.google.android.gms.internal.mlkit_common.zzmy r8 = r8.zzk()     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_common.zzbg r9 = new com.google.android.gms.internal.mlkit_common.zzbg     // Catch: java.io.UnsupportedEncodingException -> L79
            r9.<init>()     // Catch: java.io.UnsupportedEncodingException -> L79
            gz0 r10 = com.google.android.gms.internal.mlkit_common.zzkr.zza     // Catch: java.io.UnsupportedEncodingException -> L79
            r10.configure(r9)     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_common.zzbh r9 = r9.zza()     // Catch: java.io.UnsupportedEncodingException -> L79
            byte[] r8 = r9.zza(r8)     // Catch: java.io.UnsupportedEncodingException -> L79
            return r8
        L79:
            r0 = move-exception
            r8 = r0
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r10 = "Failed to covert logging to UTF-8 byte array"
            r9.<init>(r10, r8)
            throw r9
    }
}
