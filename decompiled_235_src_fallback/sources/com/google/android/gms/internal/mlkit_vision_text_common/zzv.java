package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzv {
    private final java.lang.String zza;

    private zzv(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = "\n"
            r0.zza = r1
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_common.zzv zza(java.lang.String r1) {
            com.google.android.gms.internal.mlkit_vision_text_common.zzv r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzv
            java.lang.String r0 = "\n"
            r1.<init>(r0)
            return r1
    }

    public static final java.lang.CharSequence zzc(java.lang.Object r1) {
            java.util.Objects.requireNonNull(r1)
            boolean r0 = r1 instanceof java.lang.CharSequence
            if (r0 == 0) goto La
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
        La:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public final java.lang.String zzb(java.lang.Iterable r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r3.hasNext()     // Catch: java.io.IOException -> L36
            if (r1 == 0) goto L31
            java.lang.Object r1 = r3.next()     // Catch: java.io.IOException -> L36
            java.lang.CharSequence r1 = zzc(r1)     // Catch: java.io.IOException -> L36
            r0.append(r1)     // Catch: java.io.IOException -> L36
        L1a:
            boolean r1 = r3.hasNext()     // Catch: java.io.IOException -> L36
            if (r1 == 0) goto L31
            java.lang.String r1 = r2.zza     // Catch: java.io.IOException -> L36
            r0.append(r1)     // Catch: java.io.IOException -> L36
            java.lang.Object r1 = r3.next()     // Catch: java.io.IOException -> L36
            java.lang.CharSequence r1 = zzc(r1)     // Catch: java.io.IOException -> L36
            r0.append(r1)     // Catch: java.io.IOException -> L36
            goto L1a
        L31:
            java.lang.String r2 = r0.toString()
            return r2
        L36:
            r2 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
    }
}
