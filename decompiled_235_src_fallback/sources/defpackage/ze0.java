package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze0  reason: default package */
/* loaded from: classes.dex */
public final class ze0 implements defpackage.ia3 {
    public final defpackage.cf0 a;
    public final java.lang.Object b;
    public defpackage.kh0 c;
    public final java.util.ArrayList d;
    public int e;
    public boolean f;

    public ze0(defpackage.tg0 r1, defpackage.cf0 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.d = r1
            return
    }

    @Override // defpackage.ia3
    public final void a(java.util.List r9) {
            r8 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            cf0 r2 = r8.a     // Catch: java.lang.Exception -> L115
            java.util.Set r2 = defpackage.cf0.c(r2)     // Catch: java.lang.Exception -> L115
            if (r2 != 0) goto L14
            du1 r2 = defpackage.du1.A     // Catch: java.lang.Exception -> L115
        L14:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L115
        L18:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L115
            if (r3 == 0) goto L110
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L115
            java.util.Set r3 = (java.util.Set) r3     // Catch: java.lang.Exception -> L115
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Exception -> L115
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L115
            r6 = 10
            int r6 = defpackage.ht0.v0(r4, r6)     // Catch: java.lang.Exception -> L115
            r5.<init>(r6)     // Catch: java.lang.Exception -> L115
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L115
        L36:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Exception -> L115
            if (r6 == 0) goto L48
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Exception -> L115
            xf0 r6 = (defpackage.xf0) r6     // Catch: java.lang.Exception -> L115
            java.lang.String r6 = r6.a     // Catch: java.lang.Exception -> L115
            r5.add(r6)     // Catch: java.lang.Exception -> L115
            goto L36
        L48:
            java.util.Set r4 = defpackage.gt0.p1(r5)     // Catch: java.lang.Exception -> L115
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Exception -> L115
            boolean r5 = r9.containsAll(r5)     // Catch: java.lang.Exception -> L115
            if (r5 != 0) goto L7a
            boolean r3 = defpackage.kj2.L()     // Catch: java.lang.Exception -> L115
            if (r3 == 0) goto L18
            java.lang.String r3 = "CXCP"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L115
            r5.<init>()     // Catch: java.lang.Exception -> L115
            java.lang.String r6 = "Failed to retrieve concurrent camera: "
            r5.append(r6)     // Catch: java.lang.Exception -> L115
            r5.append(r4)     // Catch: java.lang.Exception -> L115
            java.lang.String r4 = " from "
            r5.append(r4)     // Catch: java.lang.Exception -> L115
            r5.append(r9)     // Catch: java.lang.Exception -> L115
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L115
            android.util.Log.w(r3, r4)     // Catch: java.lang.Exception -> L115
            goto L18
        L7a:
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Exception -> L115
            java.util.List r4 = defpackage.gt0.k1(r4)     // Catch: java.lang.Exception -> L115
            int r5 = r4.size()     // Catch: java.lang.Exception -> L115
            r6 = 2
            if (r5 < r6) goto L18
            r5 = 0
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Exception -> L115
            xf0 r5 = (defpackage.xf0) r5     // Catch: java.lang.Exception -> L115
            java.lang.String r5 = r5.a     // Catch: java.lang.Exception -> L115
            r6 = 1
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Exception -> L115
            xf0 r4 = (defpackage.xf0) r4     // Catch: java.lang.Exception -> L115
            java.lang.String r4 = r4.a     // Catch: java.lang.Exception -> L115
            cf0 r6 = r8.a     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            boolean r6 = defpackage.l.B(r6, r5)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            if (r6 == 0) goto L18
            cf0 r6 = r8.a     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            boolean r6 = defpackage.l.B(r6, r4)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            if (r6 == 0) goto L18
            r0.add(r3)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            boolean r6 = r1.containsKey(r5)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            if (r6 != 0) goto Lbe
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            r6.<init>()     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            r1.put(r5, r6)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            goto Lbe
        Lbc:
            r4 = move-exception
            goto Le6
        Lbe:
            java.lang.Object r6 = r1.get(r5)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            r6.getClass()     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            java.util.List r6 = (java.util.List) r6     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            r6.add(r4)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            boolean r6 = r1.containsKey(r4)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            if (r6 != 0) goto Ld8
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            r6.<init>()     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            r1.put(r4, r6)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
        Ld8:
            java.lang.Object r4 = r1.get(r4)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            r4.getClass()     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            java.util.List r4 = (java.util.List) r4     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            r4.add(r5)     // Catch: defpackage.i53 -> Lbc java.lang.Exception -> L115
            goto L18
        Le6:
            boolean r5 = defpackage.kj2.L()     // Catch: java.lang.Exception -> L115
            if (r5 == 0) goto L18
            java.lang.String r5 = "CXCP"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L115
            r6.<init>()     // Catch: java.lang.Exception -> L115
            java.lang.String r7 = "Skipping incompatible concurrent pair: "
            r6.append(r7)     // Catch: java.lang.Exception -> L115
            r6.append(r3)     // Catch: java.lang.Exception -> L115
            java.lang.String r3 = " due to "
            r6.append(r3)     // Catch: java.lang.Exception -> L115
            java.lang.String r3 = r4.getMessage()     // Catch: java.lang.Exception -> L115
            r6.append(r3)     // Catch: java.lang.Exception -> L115
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Exception -> L115
            android.util.Log.w(r5, r3)     // Catch: java.lang.Exception -> L115
            goto L18
        L110:
            java.lang.Object r8 = r8.b
            monitor-enter(r8)
            monitor-exit(r8)
            return
        L115:
            r8 = move-exception
            qi0 r9 = new qi0
            java.lang.String r0 = "Failed to retrieve concurrent camera id info for camera-pipe."
            r9.<init>(r0, r8)
            throw r9
    }

    public final void b(defpackage.kh0 r5) {
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            r4.c = r5     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            cf0 r5 = r4.a
            java.util.ArrayList r5 = defpackage.cf0.a(r5)
            if (r5 == 0) goto L31
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r5, r1)
            r0.<init>(r1)
            int r1 = r5.size()
            r2 = 0
        L21:
            if (r2 >= r1) goto L33
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            xf0 r3 = (defpackage.xf0) r3
            java.lang.String r3 = r3.a
            r0.add(r3)
            goto L21
        L31:
            yt1 r0 = defpackage.yt1.A
        L33:
            r4.a(r0)
            return
        L37:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}
