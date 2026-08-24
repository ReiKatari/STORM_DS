package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzue {
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zza;
    private final java.util.concurrent.atomic.AtomicLong zzb;

    public zzue(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r0 = -1
            r4.<init>(r0)
            r2.zzb = r4
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r4 = com.google.android.gms.common.internal.TelemetryLoggingOptions.builder()
            java.lang.String r0 = "mlkit:vision"
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r4 = r4.setApi(r0)
            com.google.android.gms.common.internal.TelemetryLoggingOptions r4 = r4.build()
            com.google.android.gms.common.internal.TelemetryLoggingClient r3 = com.google.android.gms.common.internal.TelemetryLogging.getClient(r3, r4)
            r2.zza = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_common.zzue zza(android.content.Context r2) {
            com.google.android.gms.internal.mlkit_vision_text_common.zzue r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzue
            java.lang.String r1 = "mlkit:vision"
            r0.<init>(r2, r1)
            return r0
    }

    public final /* synthetic */ void zzb(long r1, java.lang.Exception r3) {
            r0 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r0.zzb
            r0.set(r1)
            return
    }

    public final synchronized void zzc(int r18, int r19, long r20, long r22) {
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            java.util.concurrent.atomic.AtomicLong r0 = r1.zzb     // Catch: java.lang.Throwable -> L56
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L56
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L56
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L14
            goto L25
        L14:
            java.util.concurrent.atomic.AtomicLong r0 = r1.zzb     // Catch: java.lang.Throwable -> L56
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L56
            long r4 = r2 - r4
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L25
            monitor-exit(r17)
            return
        L25:
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zza     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.common.internal.MethodInvocation r5 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L56
            r15 = 0
            r16 = -1
            r8 = 0
            r13 = 0
            r14 = 0
            r6 = r18
            r7 = r19
            r9 = r20
            r11 = r22
            r5.<init>(r6, r7, r8, r9, r11, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.common.internal.MethodInvocation[] r5 = new com.google.android.gms.common.internal.MethodInvocation[]{r5}     // Catch: java.lang.Throwable -> L56
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L56
            r6 = 0
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.tasks.Task r0 = r0.log(r4)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.mlkit_vision_text_common.zzud r4 = new com.google.android.gms.internal.mlkit_vision_text_common.zzud     // Catch: java.lang.Throwable -> L56
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L56
            r0.addOnFailureListener(r4)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r17)
            return
        L56:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L56
            throw r0
    }
}
