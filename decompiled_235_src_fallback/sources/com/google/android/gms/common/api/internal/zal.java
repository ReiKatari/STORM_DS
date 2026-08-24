package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zal {
    private final defpackage.wu zaa;
    private final defpackage.wu zab;
    private final com.google.android.gms.tasks.TaskCompletionSource zac;
    private int zad;
    private boolean zae;

    public zal(java.lang.Iterable r4) {
            r3 = this;
            r3.<init>()
            wu r0 = new wu
            r1 = 0
            r0.<init>(r1)
            r3.zab = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r3.zac = r0
            r3.zae = r1
            wu r0 = new wu
            r0.<init>(r1)
            r3.zaa = r0
            java.util.Iterator r4 = r4.iterator()
        L1f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            com.google.android.gms.common.api.HasApiKey r0 = (com.google.android.gms.common.api.HasApiKey) r0
            wu r1 = r3.zaa
            com.google.android.gms.common.api.internal.ApiKey r0 = r0.getApiKey()
            r2 = 0
            r1.put(r0, r2)
            goto L1f
        L36:
            wu r4 = r3.zaa
            java.util.Set r4 = r4.keySet()
            tu r4 = (defpackage.tu) r4
            wu r4 = r4.A
            int r4 = r4.L
            r3.zad = r4
            return
    }

    public final com.google.android.gms.tasks.Task zaa() {
            r0 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zac
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }

    public final java.util.Set zab() {
            r0 = this;
            wu r0 = r0.zaa
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public final void zac(com.google.android.gms.common.api.internal.ApiKey r2, com.google.android.gms.common.ConnectionResult r3, java.lang.String r4) {
            r1 = this;
            wu r0 = r1.zaa
            r0.put(r2, r3)
            wu r0 = r1.zab
            r0.put(r2, r4)
            int r2 = r1.zad
            int r2 = r2 + (-1)
            r1.zad = r2
            boolean r2 = r3.isSuccess()
            if (r2 != 0) goto L19
            r2 = 1
            r1.zae = r2
        L19:
            int r2 = r1.zad
            if (r2 != 0) goto L35
            boolean r2 = r1.zae
            if (r2 == 0) goto L2e
            wu r2 = r1.zaa
            com.google.android.gms.common.api.AvailabilityException r3 = new com.google.android.gms.common.api.AvailabilityException
            r3.<init>(r2)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r1.zac
            r1.setException(r3)
            return
        L2e:
            com.google.android.gms.tasks.TaskCompletionSource r2 = r1.zac
            wu r1 = r1.zab
            r2.setResult(r1)
        L35:
            return
    }
}
