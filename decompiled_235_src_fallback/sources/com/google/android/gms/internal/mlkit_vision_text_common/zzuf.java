package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuf implements com.google.android.gms.internal.mlkit_vision_text_common.zztr {
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzow zza;
    private com.google.android.gms.internal.mlkit_vision_text_common.zzsr zzb;
    private final int zzc;

    private zzuf(com.google.android.gms.internal.mlkit_vision_text_common.zzow r2, int r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzsr r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzsr
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            com.google.android.gms.internal.mlkit_vision_text_common.zzuo.zza()
            r1.zzc = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_common.zztr zzf(com.google.android.gms.internal.mlkit_vision_text_common.zzow r2) {
            com.google.android.gms.internal.mlkit_vision_text_common.zzuf r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuf
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_text_common.zztr zzg(com.google.android.gms.internal.mlkit_vision_text_common.zzow r1, int r2) {
            com.google.android.gms.internal.mlkit_vision_text_common.zzuf r2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuf
            r0 = 1
            r2.<init>(r1, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final int zza() {
            r0 = this;
            int r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final com.google.android.gms.internal.mlkit_vision_text_common.zztr zzb(com.google.android.gms.internal.mlkit_vision_text_common.zzov r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzow r0 = r1.zza
            r0.zzf(r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final com.google.android.gms.internal.mlkit_vision_text_common.zztr zzc(com.google.android.gms.internal.mlkit_vision_text_common.zzsr r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final java.lang.String zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzow r1 = r1.zza
            com.google.android.gms.internal.mlkit_vision_text_common.zzoy r1 = r1.zzj()
            com.google.android.gms.internal.mlkit_vision_text_common.zzst r1 = r1.zzf()
            if (r1 == 0) goto L21
            java.lang.String r0 = r1.zzk()
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzy.zzb(r0)
            if (r0 != 0) goto L21
            java.lang.String r1 = r1.zzk()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L21:
            java.lang.String r1 = "NA"
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final byte[] zze(int r9, boolean r10) {
            r8 = this;
            r10 = r9 ^ 1
            com.google.android.gms.internal.mlkit_vision_text_common.zzsr r0 = r8.zzb
            r1 = 1
            if (r1 == r10) goto L9
            r10 = 0
            goto La
        L9:
            r10 = r1
        La:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.zzf(r10)
            com.google.android.gms.internal.mlkit_vision_text_common.zzsr r10 = r8.zzb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzsr r10 = r8.zzb
            com.google.android.gms.internal.mlkit_vision_text_common.zzst r10 = r10.zzm()
            com.google.android.gms.internal.mlkit_vision_text_common.zzow r0 = r8.zza
            r0.zzi(r10)
            com.google.android.gms.internal.mlkit_vision_text_common.zzuo.zza()     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_vision_text_common.zzow r8 = r8.zza
            if (r9 != 0) goto L62
            com.google.android.gms.internal.mlkit_vision_text_common.zzoy r8 = r8.zzj()     // Catch: java.io.UnsupportedEncodingException -> L79
            xd3 r9 = new xd3     // Catch: java.io.UnsupportedEncodingException -> L79
            r9.<init>()     // Catch: java.io.UnsupportedEncodingException -> L79
            gz0 r10 = com.google.android.gms.internal.mlkit_vision_text_common.zzmq.zza     // Catch: java.io.UnsupportedEncodingException -> L79
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
            com.google.android.gms.internal.mlkit_vision_text_common.zzoy r8 = r8.zzj()     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_vision_text_common.zzdb r9 = new com.google.android.gms.internal.mlkit_vision_text_common.zzdb     // Catch: java.io.UnsupportedEncodingException -> L79
            r9.<init>()     // Catch: java.io.UnsupportedEncodingException -> L79
            gz0 r10 = com.google.android.gms.internal.mlkit_vision_text_common.zzmq.zza     // Catch: java.io.UnsupportedEncodingException -> L79
            r10.configure(r9)     // Catch: java.io.UnsupportedEncodingException -> L79
            com.google.android.gms.internal.mlkit_vision_text_common.zzdc r9 = r9.zza()     // Catch: java.io.UnsupportedEncodingException -> L79
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
