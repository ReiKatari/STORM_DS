package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zab implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final com.google.android.gms.common.images.zag zab;

    public zab(com.google.android.gms.common.images.ImageManager r1, com.google.android.gms.common.images.zag r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            java.lang.String r0 = "LoadImageRunnable must be executed on the main thread"
            com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
            com.google.android.gms.common.images.ImageManager r0 = r7.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zag(r0)
            com.google.android.gms.common.images.zag r1 = r7.zab
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.images.ImageManager$ImageReceiver r0 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) r0
            if (r0 == 0) goto L25
            com.google.android.gms.common.images.ImageManager r1 = r7.zaa
            com.google.android.gms.common.images.zag r2 = r7.zab
            java.util.Map r1 = com.google.android.gms.common.images.ImageManager.zag(r1)
            r1.remove(r2)
            com.google.android.gms.common.images.zag r1 = r7.zab
            r0.zac(r1)
        L25:
            com.google.android.gms.common.images.zag r0 = r7.zab
            com.google.android.gms.common.images.zad r1 = r0.zaa
            android.net.Uri r2 = r1.zaa
            com.google.android.gms.common.images.ImageManager r3 = r7.zaa
            r4 = 1
            if (r2 == 0) goto Lcb
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zaf(r3)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L67
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.longValue()
            long r2 = r2 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L5c
            com.google.android.gms.common.images.zag r0 = r7.zab
            com.google.android.gms.common.images.ImageManager r7 = r7.zaa
            android.content.Context r1 = com.google.android.gms.common.images.ImageManager.zaa(r7)
            zz7 r7 = com.google.android.gms.common.images.ImageManager.zac(r7)
            r0.zab(r1, r7, r4)
            return
        L5c:
            com.google.android.gms.common.images.ImageManager r0 = r7.zaa
            android.net.Uri r2 = r1.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zaf(r0)
            r0.remove(r2)
        L67:
            com.google.android.gms.common.images.zag r0 = r7.zab
            r2 = 0
            r3 = 0
            r0.zaa(r2, r3, r4, r3)
            com.google.android.gms.common.images.ImageManager r0 = r7.zaa
            android.net.Uri r2 = r1.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zah(r0)
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.common.images.ImageManager$ImageReceiver r0 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) r0
            if (r0 != 0) goto L93
            com.google.android.gms.common.images.ImageManager r0 = r7.zaa
            android.net.Uri r2 = r1.zaa
            com.google.android.gms.common.images.ImageManager$ImageReceiver r3 = new com.google.android.gms.common.images.ImageManager$ImageReceiver
            r3.<init>(r0, r2)
            com.google.android.gms.common.images.ImageManager r0 = r7.zaa
            android.net.Uri r2 = r1.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zah(r0)
            r0.put(r2, r3)
            r0 = r3
        L93:
            com.google.android.gms.common.images.zag r2 = r7.zab
            r0.zab(r2)
            com.google.android.gms.common.images.zag r2 = r7.zab
            boolean r3 = r2 instanceof com.google.android.gms.common.images.zaf
            if (r3 != 0) goto La7
            com.google.android.gms.common.images.ImageManager r7 = r7.zaa
            java.util.Map r7 = com.google.android.gms.common.images.ImageManager.zag(r7)
            r7.put(r2, r0)
        La7:
            java.lang.Object r7 = com.google.android.gms.common.images.ImageManager.zad()
            monitor-enter(r7)
            java.util.HashSet r2 = com.google.android.gms.common.images.ImageManager.zae()     // Catch: java.lang.Throwable -> Lc5
            android.net.Uri r3 = r1.zaa     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto Lc7
            java.util.HashSet r2 = com.google.android.gms.common.images.ImageManager.zae()     // Catch: java.lang.Throwable -> Lc5
            android.net.Uri r1 = r1.zaa     // Catch: java.lang.Throwable -> Lc5
            r2.add(r1)     // Catch: java.lang.Throwable -> Lc5
            r0.zad()     // Catch: java.lang.Throwable -> Lc5
            goto Lc7
        Lc5:
            r0 = move-exception
            goto Lc9
        Lc7:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc5
            return
        Lc9:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc5
            throw r0
        Lcb:
            android.content.Context r7 = com.google.android.gms.common.images.ImageManager.zaa(r3)
            zz7 r1 = com.google.android.gms.common.images.ImageManager.zac(r3)
            r0.zab(r7, r1, r4)
            return
    }
}
