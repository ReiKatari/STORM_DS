package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh0  reason: default package */
/* loaded from: classes.dex */
public final class sh0 {
    public final java.lang.Object a;
    public final defpackage.s63 b;
    public final defpackage.s94 c;
    public defpackage.sf0 d;
    public defpackage.dg0 e;
    public defpackage.tx f;
    public boolean g;
    public final java.util.LinkedHashMap h;

    public sh0() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.a = r0
            s63 r0 = new s63
            r1 = 14
            r2 = 0
            r0.<init>(r1, r2)
            r3.b = r0
            s94 r0 = new s94
            r0.<init>()
            r3.c = r0
            dg0 r0 = defpackage.dg0.CLOSED
            r3.e = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.h = r1
            r1 = 0
            r3.c(r0, r1)
            return
    }

    public final void a(defpackage.sf0 r8, defpackage.pt2 r9) {
            r7 = this;
            lt2 r0 = defpackage.lt2.b
            lt2 r1 = defpackage.lt2.c
            sf0 r2 = r7.d
            java.lang.String r3 = "CXCP"
            if (r8 == r2) goto L2a
            boolean r7 = defpackage.kj2.F(r3)
            if (r7 == 0) goto L1b4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Ignored stale transition "
            r7.<init>(r0)
            r7.append(r9)
            java.lang.String r9 = " for "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r3, r7)
            return
        L2a:
            dg0 r8 = r7.e
            r8.getClass()
            r9.getClass()
            int[] r2 = defpackage.rh0.a
            int r8 = r8.ordinal()
            r8 = r2[r8]
            r2 = 1
            r4 = 0
            if (r8 == r2) goto L173
            nt2 r2 = defpackage.nt2.b
            mt2 r5 = defpackage.mt2.b
            r6 = 2
            if (r8 == r6) goto L10f
            r6 = 3
            if (r8 == r6) goto Lc9
            r2 = 4
            if (r8 == r2) goto L97
            r2 = 5
            if (r8 == r2) goto L50
            goto L191
        L50:
            boolean r8 = r9.equals(r1)
            if (r8 == 0) goto L60
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.OPENING
            r8.<init>(r0, r4)
        L5d:
            r4 = r8
            goto L191
        L60:
            boolean r8 = r9.equals(r0)
            if (r8 == 0) goto L6e
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.OPEN
            r8.<init>(r0, r4)
            goto L5d
        L6e:
            boolean r8 = r9 instanceof defpackage.kt2
            if (r8 == 0) goto L191
            r8 = r9
            kt2 r8 = (defpackage.kt2) r8
            int r8 = r8.b
            boolean r0 = defpackage.g04.I(r8)
            if (r0 == 0) goto L8a
            ph0 r4 = new ph0
            dg0 r0 = defpackage.dg0.PENDING_OPEN
            tx r8 = defpackage.g04.T(r8)
            r4.<init>(r0, r8)
            goto L191
        L8a:
            ph0 r4 = new ph0
            dg0 r0 = defpackage.dg0.CLOSED
            tx r8 = defpackage.g04.T(r8)
            r4.<init>(r0, r8)
            goto L191
        L97:
            boolean r8 = r9.equals(r5)
            if (r8 == 0) goto La5
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.CLOSED
            r8.<init>(r0, r4)
            goto L5d
        La5:
            boolean r8 = r9.equals(r1)
            if (r8 == 0) goto Lb3
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.OPENING
            r8.<init>(r0, r4)
            goto L5d
        Lb3:
            boolean r8 = r9 instanceof defpackage.kt2
            if (r8 == 0) goto L191
            ph0 r4 = new ph0
            dg0 r8 = defpackage.dg0.CLOSING
            r0 = r9
            kt2 r0 = (defpackage.kt2) r0
            int r0 = r0.b
            tx r0 = defpackage.g04.T(r0)
            r4.<init>(r8, r0)
            goto L191
        Lc9:
            boolean r8 = r9.equals(r2)
            if (r8 == 0) goto Ld7
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.CLOSING
            r8.<init>(r0, r4)
            goto L5d
        Ld7:
            boolean r8 = r9.equals(r5)
            if (r8 == 0) goto Le6
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.CLOSED
            r8.<init>(r0, r4)
            goto L5d
        Le6:
            boolean r8 = r9 instanceof defpackage.kt2
            if (r8 == 0) goto L191
            r8 = r9
            kt2 r8 = (defpackage.kt2) r8
            int r8 = r8.b
            boolean r0 = defpackage.g04.I(r8)
            if (r0 == 0) goto L102
            ph0 r4 = new ph0
            dg0 r0 = defpackage.dg0.PENDING_OPEN
            tx r8 = defpackage.g04.T(r8)
            r4.<init>(r0, r8)
            goto L191
        L102:
            ph0 r4 = new ph0
            dg0 r0 = defpackage.dg0.CLOSED
            tx r8 = defpackage.g04.T(r8)
            r4.<init>(r0, r8)
            goto L191
        L10f:
            boolean r8 = r9.equals(r0)
            if (r8 == 0) goto L11e
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.OPEN
            r8.<init>(r0, r4)
            goto L5d
        L11e:
            boolean r8 = r9 instanceof defpackage.kt2
            if (r8 == 0) goto L155
            r8 = r9
            kt2 r8 = (defpackage.kt2) r8
            int r0 = r8.b
            boolean r8 = r8.c
            if (r8 == 0) goto L137
            ph0 r4 = new ph0
            dg0 r8 = defpackage.dg0.OPENING
            tx r0 = defpackage.g04.T(r0)
            r4.<init>(r8, r0)
            goto L191
        L137:
            boolean r8 = defpackage.g04.I(r0)
            if (r8 == 0) goto L149
            ph0 r4 = new ph0
            dg0 r8 = defpackage.dg0.PENDING_OPEN
            tx r0 = defpackage.g04.T(r0)
            r4.<init>(r8, r0)
            goto L191
        L149:
            ph0 r4 = new ph0
            dg0 r8 = defpackage.dg0.CLOSING
            tx r0 = defpackage.g04.T(r0)
            r4.<init>(r8, r0)
            goto L191
        L155:
            boolean r8 = r9.equals(r2)
            if (r8 == 0) goto L164
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.CLOSING
            r8.<init>(r0, r4)
            goto L5d
        L164:
            boolean r8 = r9.equals(r5)
            if (r8 == 0) goto L191
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.CLOSED
            r8.<init>(r0, r4)
            goto L5d
        L173:
            boolean r8 = r9.equals(r1)
            if (r8 == 0) goto L182
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.OPENING
            r8.<init>(r0, r4)
            goto L5d
        L182:
            boolean r8 = r9.equals(r0)
            if (r8 == 0) goto L191
            ph0 r8 = new ph0
            dg0 r0 = defpackage.dg0.OPEN
            r8.<init>(r0, r4)
            goto L5d
        L191:
            if (r4 != 0) goto L1b5
            boolean r8 = defpackage.kj2.L()
            if (r8 == 0) goto L1b4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Impermissible state transition: current camera internal state: "
            r8.<init>(r0)
            dg0 r7 = r7.e
            r8.append(r7)
            java.lang.String r7 = ", received graph state: "
            r8.append(r7)
            r8.append(r9)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r3, r7)
        L1b4:
            return
        L1b5:
            dg0 r8 = r4.a
            r7.e = r8
            tx r8 = r4.b
            r7.f = r8
            boolean r8 = defpackage.kj2.F(r3)
            if (r8 == 0) goto L1d4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Updated current camera internal state to "
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r3, r8)
        L1d4:
            dg0 r8 = r7.e
            tx r9 = r7.f
            r7.c(r8, r9)
            return
    }

    public final void b(defpackage.sf0 r5, defpackage.pt2 r6) {
            r4 = this;
            java.lang.String r0 = "Ignoring graph state update "
            r6.getClass()
            java.lang.Object r1 = r4.a
            monitor-enter(r1)
            boolean r2 = r4.g     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2d
            boolean r4 = defpackage.kj2.L()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2b
            java.lang.String r4 = "CXCP"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L29
            r5.append(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = " on removed camera."
            r5.append(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L29
            android.util.Log.w(r4, r5)     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r4 = move-exception
            goto L53
        L2b:
            monitor-exit(r1)
            return
        L2d:
            java.lang.String r0 = "CXCP"
            boolean r0 = defpackage.kj2.F(r0)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L4e
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            r2.append(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = " state updated to "
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            r2.append(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L29
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> L29
        L4e:
            r4.a(r5, r6)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            return
        L53:
            monitor-exit(r1)
            throw r4
    }

    public final void c(defpackage.dg0 r4, defpackage.tx r5) {
            r3 = this;
            s63 r0 = r3.b
            java.lang.Object r0 = r0.B
            s94 r0 = (defpackage.s94) r0
            u2 r1 = new u2
            r2 = 4
            r1.<init>(r4, r2)
            r0.g(r1)
            r4.getClass()
            int[] r0 = defpackage.qh0.a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3a
            r1 = 2
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L34
            if (r0 == r2) goto L31
            r1 = 5
            if (r0 != r1) goto L2b
            nh0 r4 = defpackage.nh0.PENDING_OPEN
            goto L3c
        L2b:
            java.lang.String r3 = "Unexpected CameraInternal state: "
            defpackage.e41.w(r4, r3)
            return
        L31:
            nh0 r4 = defpackage.nh0.CLOSING
            goto L3c
        L34:
            nh0 r4 = defpackage.nh0.OPEN
            goto L3c
        L37:
            nh0 r4 = defpackage.nh0.OPENING
            goto L3c
        L3a:
            nh0 r4 = defpackage.nh0.CLOSED
        L3c:
            sx r0 = new sx
            r0.<init>(r4, r5)
            s94 r4 = r3.c
            r4.getClass()
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r5 = defpackage.nb3.k(r5, r1)
            if (r5 == 0) goto L58
            r4.f(r0)
            goto L5b
        L58:
            r4.g(r0)
        L5b:
            java.lang.Object r4 = r3.a
            monitor-enter(r4)
            java.util.LinkedHashMap r3 = r3.h     // Catch: java.lang.Throwable -> L93
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L93
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L93
            java.util.List r3 = defpackage.gt0.k1(r3)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r4)
            java.util.Iterator r3 = r3.iterator()
        L6f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L92
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            b31 r5 = (defpackage.b31) r5
            java.lang.Object r4 = r4.getValue()
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            mf r1 = new mf
            r2 = 8
            r1.<init>(r2, r5, r0)
            r4.execute(r1)
            goto L6f
        L92:
            return
        L93:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
    }
}
