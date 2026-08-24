package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c72  reason: default package */
/* loaded from: classes.dex */
public final class c72 implements defpackage.f92 {
    public final /* synthetic */ int a;

    public /* synthetic */ c72(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.n55
    public final java.lang.Object get() {
            r17 = this;
            r0 = r17
            int r0 = r0.a
            switch(r0) {
                case 0: goto L91;
                default: goto L7;
            }
        L7:
            vo7 r0 = new vo7
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            b35 r2 = defpackage.b35.DEFAULT
            java.util.Set r8 = java.util.Collections.EMPTY_SET
            r9 = 0
            java.lang.String r10 = "Null flags"
            if (r8 == 0) goto L8d
            vy r3 = new vy
            r4 = 30000(0x7530, double:1.4822E-319)
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            r3.<init>(r4, r6, r8)
            r1.put(r2, r3)
            b35 r2 = defpackage.b35.HIGHEST
            if (r8 == 0) goto L89
            vy r3 = new vy
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            r3.<init>(r4, r6, r8)
            r1.put(r2, r3)
            b35 r2 = defpackage.b35.VERY_LOW
            if (r8 == 0) goto L85
            f66 r3 = defpackage.f66.NETWORK_UNMETERED
            f66 r4 = defpackage.f66.DEVICE_IDLE
            f66[] r3 = new defpackage.f66[]{r3, r4}
            java.util.HashSet r4 = new java.util.HashSet
            java.util.List r3 = java.util.Arrays.asList(r3)
            r4.<init>(r3)
            java.util.Set r16 = java.util.Collections.unmodifiableSet(r4)
            if (r16 == 0) goto L81
            vy r11 = new vy
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            r11.<init>(r12, r14, r16)
            r1.put(r2, r11)
            java.util.Set r2 = r1.keySet()
            int r2 = r2.size()
            b35[] r3 = defpackage.b35.values()
            int r3 = r3.length
            if (r2 < r3) goto L7b
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            uy r9 = new uy
            r9.<init>(r0, r1)
            goto L90
        L7b:
            java.lang.String r0 = "Not all priorities have been configured"
            defpackage.i.m(r0)
            goto L90
        L81:
            defpackage.u34.x(r10)
            goto L90
        L85:
            defpackage.u34.x(r10)
            goto L90
        L89:
            defpackage.u34.x(r10)
            goto L90
        L8d:
            defpackage.u34.x(r10)
        L90:
            return r9
        L91:
            lx2 r0 = new lx2
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0.<init>(r1)
            return r0
    }
}
