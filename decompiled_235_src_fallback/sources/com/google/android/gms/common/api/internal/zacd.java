package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zacd implements com.google.android.gms.tasks.OnCompleteListener {
    private final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final int zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;
    private final long zad;
    private final long zae;

    public zacd(com.google.android.gms.common.api.internal.GoogleApiManager r1, int r2, com.google.android.gms.common.api.internal.ApiKey r3, long r4, long r6, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            r0.zae = r6
            return
    }

    public static com.google.android.gms.common.api.internal.zacd zaa(com.google.android.gms.common.api.internal.GoogleApiManager r11, int r12, com.google.android.gms.common.api.internal.ApiKey r13) {
            boolean r0 = r11.zaD()
            if (r0 != 0) goto L7
            goto L49
        L7:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.getConfig()
            if (r0 == 0) goto L4b
            boolean r1 = r0.getMethodInvocationTelemetryEnabled()
            if (r1 == 0) goto L49
            boolean r0 = r0.getMethodTimingTelemetryEnabled()
            com.google.android.gms.common.api.internal.zabq r1 = r11.zai(r13)
            if (r1 == 0) goto L4c
            com.google.android.gms.common.api.Api$Client r2 = r1.zaf()
            boolean r2 = r2 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r2 == 0) goto L49
            com.google.android.gms.common.api.Api$Client r2 = r1.zaf()
            com.google.android.gms.common.internal.BaseGmsClient r2 = (com.google.android.gms.common.internal.BaseGmsClient) r2
            boolean r3 = r2.hasConnectionInfo()
            if (r3 == 0) goto L4c
            boolean r3 = r2.isConnecting()
            if (r3 != 0) goto L4c
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = zab(r1, r2, r12)
            if (r0 == 0) goto L49
            r1.zaq()
            boolean r0 = r0.getMethodTimingTelemetryEnabled()
            goto L4c
        L49:
            r11 = 0
            return r11
        L4b:
            r0 = 1
        L4c:
            com.google.android.gms.common.api.internal.zacd r1 = new com.google.android.gms.common.api.internal.zacd
            r2 = 0
            if (r0 == 0) goto L58
            long r4 = java.lang.System.currentTimeMillis()
            r5 = r4
            goto L59
        L58:
            r5 = r2
        L59:
            if (r0 == 0) goto L5f
            long r2 = android.os.SystemClock.elapsedRealtime()
        L5f:
            r7 = r2
            r9 = 0
            r10 = 0
            r2 = r11
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            return r1
    }

    private static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab(com.google.android.gms.common.api.internal.zabq r2, com.google.android.gms.common.internal.BaseGmsClient r3, int r4) {
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r3 = r3.getTelemetryConfiguration()
            r0 = 0
            if (r3 == 0) goto L33
            boolean r1 = r3.getMethodInvocationTelemetryEnabled()
            if (r1 == 0) goto L33
            int[] r1 = r3.getMethodInvocationMethodKeyAllowlist()
            if (r1 != 0) goto L21
            int[] r1 = r3.getMethodInvocationMethodKeyDisallowlist()
            if (r1 != 0) goto L1a
            goto L28
        L1a:
            boolean r4 = com.google.android.gms.common.util.ArrayUtils.contains(r1, r4)
            if (r4 == 0) goto L28
            goto L33
        L21:
            boolean r4 = com.google.android.gms.common.util.ArrayUtils.contains(r1, r4)
            if (r4 != 0) goto L28
            goto L33
        L28:
            int r2 = r2.zac()
            int r4 = r3.getMaxMethodInvocationsLogged()
            if (r2 >= r4) goto L33
            return r3
        L33:
            return r0
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task r22) {
            r21 = this;
            r0 = r21
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r0.zaa
            boolean r1 = r1.zaD()
            if (r1 != 0) goto Lc
            goto Lee
        Lc:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r1 = r1.getConfig()
            if (r1 == 0) goto L1c
            boolean r2 = r1.getMethodInvocationTelemetryEnabled()
            if (r2 == 0) goto Lee
        L1c:
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r0.zaa
            com.google.android.gms.common.api.internal.ApiKey r3 = r0.zac
            com.google.android.gms.common.api.internal.zabq r2 = r2.zai(r3)
            if (r2 == 0) goto Lee
            com.google.android.gms.common.api.Api$Client r3 = r2.zaf()
            boolean r3 = r3 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r3 == 0) goto Lee
            com.google.android.gms.common.api.Api$Client r3 = r2.zaf()
            com.google.android.gms.common.internal.BaseGmsClient r3 = (com.google.android.gms.common.internal.BaseGmsClient) r3
            long r4 = r0.zad
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            r8 = 0
            if (r4 <= 0) goto L40
            r4 = r5
            goto L41
        L40:
            r4 = r8
        L41:
            int r19 = r3.getGCoreServiceId()
            r9 = 100
            if (r1 == 0) goto L84
            boolean r10 = r1.getMethodTimingTelemetryEnabled()
            r4 = r4 & r10
            int r10 = r1.getBatchPeriodMillis()
            int r11 = r1.getMaxMethodInvocationsInBatch()
            int r1 = r1.getVersion()
            boolean r12 = r3.hasConnectionInfo()
            if (r12 == 0) goto L81
            boolean r12 = r3.isConnecting()
            if (r12 != 0) goto L81
            int r4 = r0.zab
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = zab(r2, r3, r4)
            if (r2 == 0) goto Lee
            boolean r3 = r2.getMethodTimingTelemetryEnabled()
            if (r3 == 0) goto L7b
            long r3 = r0.zad
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L7b
            goto L7c
        L7b:
            r5 = r8
        L7c:
            int r11 = r2.getMaxMethodInvocationsLogged()
            r4 = r5
        L81:
            r2 = r10
            r3 = r11
            goto L89
        L84:
            r10 = 5000(0x1388, float:7.006E-42)
            r1 = r8
            r3 = r9
            r2 = r10
        L89:
            com.google.android.gms.common.api.internal.GoogleApiManager r5 = r0.zaa
            boolean r10 = r22.isSuccessful()
            r11 = -1
            if (r10 == 0) goto L94
            r12 = r8
            goto Lc0
        L94:
            boolean r8 = r22.isCanceled()
            if (r8 == 0) goto L9d
        L9a:
            r8 = r9
        L9b:
            r12 = r11
            goto Lc0
        L9d:
            java.lang.Exception r8 = r22.getException()
            boolean r9 = r8 instanceof com.google.android.gms.common.api.ApiException
            if (r9 == 0) goto Lbd
            com.google.android.gms.common.api.ApiException r8 = (com.google.android.gms.common.api.ApiException) r8
            com.google.android.gms.common.api.Status r8 = r8.getStatus()
            int r9 = r8.getStatusCode()
            com.google.android.gms.common.ConnectionResult r8 = r8.getConnectionResult()
            if (r8 != 0) goto Lb6
            goto L9a
        Lb6:
            int r8 = r8.getErrorCode()
            r12 = r8
            r8 = r9
            goto Lc0
        Lbd:
            r8 = 101(0x65, float:1.42E-43)
            goto L9b
        Lc0:
            if (r4 == 0) goto Ld6
            long r6 = r0.zad
            long r9 = r0.zae
            long r13 = java.lang.System.currentTimeMillis()
            long r15 = android.os.SystemClock.elapsedRealtime()
            long r9 = r15 - r9
            int r11 = (int) r9
            r15 = r13
            r13 = r6
        Ld3:
            r20 = r11
            goto Ld9
        Ld6:
            r13 = r6
            r15 = r13
            goto Ld3
        Ld9:
            int r10 = r0.zab
            com.google.android.gms.common.internal.MethodInvocation r9 = new com.google.android.gms.common.internal.MethodInvocation
            r17 = 0
            r18 = 0
            r11 = r8
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r20)
            long r14 = (long) r2
            r13 = r1
            r16 = r3
            r11 = r5
            r12 = r9
            r11.zaw(r12, r13, r14, r16)
        Lee:
            return
    }
}
