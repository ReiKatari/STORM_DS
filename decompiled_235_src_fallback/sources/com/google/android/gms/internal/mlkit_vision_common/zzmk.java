package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzmk implements com.google.android.gms.internal.mlkit_vision_common.zzmb {
    private final com.google.android.gms.internal.mlkit_vision_common.zziw zza;
    private com.google.android.gms.internal.mlkit_vision_common.zzky zzb;

    private zzmk(com.google.android.gms.internal.mlkit_vision_common.zziw r1, int r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_common.zzky r2 = new com.google.android.gms.internal.mlkit_vision_common.zzky
            r2.<init>()
            r0.zzb = r2
            r0.zza = r1
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza()
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzmb zze(com.google.android.gms.internal.mlkit_vision_common.zziw r2) {
            com.google.android.gms.internal.mlkit_vision_common.zzmk r0 = new com.google.android.gms.internal.mlkit_vision_common.zzmk
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final com.google.android.gms.internal.mlkit_vision_common.zzmb zza(com.google.android.gms.internal.mlkit_vision_common.zziv r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zziw r0 = r1.zza
            r0.zzc(r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final com.google.android.gms.internal.mlkit_vision_common.zzmb zzb(com.google.android.gms.internal.mlkit_vision_common.zzky r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final java.lang.String zzc() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zziw r1 = r1.zza
            com.google.android.gms.internal.mlkit_vision_common.zziy r1 = r1.zzf()
            com.google.android.gms.internal.mlkit_vision_common.zzla r1 = r1.zzc()
            if (r1 == 0) goto L21
            java.lang.String r0 = r1.zzk()
            boolean r0 = com.google.android.gms.internal.mlkit_vision_common.zzg.zzb(r0)
            if (r0 != 0) goto L21
            java.lang.String r1 = r1.zzk()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L21:
            java.lang.String r1 = "NA"
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int r9, boolean r10) {
            r8 = this;
            r10 = r9 ^ 1
            com.google.android.gms.internal.mlkit_vision_common.zzky r0 = r8.zzb
            r1 = 1
            if (r1 == r10) goto L9
            r10 = 0
            goto La
        L9:
            r10 = r1
        La:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.zzf(r10)
            com.google.android.gms.internal.mlkit_vision_common.zzky r10 = r8.zzb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_vision_common.zziw r10 = r8.zza
            com.google.android.gms.internal.mlkit_vision_common.zzky r0 = r8.zzb
            com.google.android.gms.internal.mlkit_vision_common.zzla r0 = r0.zzm()
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza()     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_vision_common.zziw r8 = r8.zza
            if (r9 != 0) goto L62
            com.google.android.gms.internal.mlkit_vision_common.zziy r8 = r8.zzf()     // Catch: java.io.UnsupportedEncodingException -> L79
            xd3 r9 = new xd3     // Catch: java.io.UnsupportedEncodingException -> L79
            r9.<init>()     // Catch: java.io.UnsupportedEncodingException -> L79
            gz0 r10 = com.google.android.gms.internal.mlkit_vision_common.zzhe.zza     // Catch: java.io.UnsupportedEncodingException -> L79
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
            com.google.android.gms.internal.mlkit_vision_common.zziy r8 = r8.zzf()     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_vision_common.zzam r9 = new com.google.android.gms.internal.mlkit_vision_common.zzam     // Catch: java.io.UnsupportedEncodingException -> L79
            r9.<init>()     // Catch: java.io.UnsupportedEncodingException -> L79
            gz0 r10 = com.google.android.gms.internal.mlkit_vision_common.zzhe.zza     // Catch: java.io.UnsupportedEncodingException -> L79
            r10.configure(r9)     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_vision_common.zzan r9 = r9.zza()     // Catch: java.io.UnsupportedEncodingException -> L79
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
