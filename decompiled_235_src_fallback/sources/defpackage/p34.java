package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p34  reason: default package */
/* loaded from: classes.dex */
public final class p34 implements defpackage.ne2 {
    public static final defpackage.p34 B = null;
    public static final defpackage.p34 L = null;
    public final /* synthetic */ int A;

    static {
            p34 r0 = new p34
            r1 = 0
            r0.<init>(r1)
            defpackage.p34.B = r0
            p34 r0 = new p34
            r1 = 1
            r0.<init>(r1)
            defpackage.p34.L = r0
            return
    }

    public /* synthetic */ p34(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r2, defpackage.r41 r3) {
            r1 = this;
            int r1 = r1.A
            switch(r1) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            b00 r2 = (defpackage.b00) r2
            jg7 r1 = defpackage.jg7.a
            return r1
        La:
            g57 r2 = (defpackage.g57) r2
            int r1 = r2.getNightMode()
            zb6 r2 = defpackage.tq.A
            r2 = -1
            r3 = 1
            if (r1 == r2) goto L28
            if (r1 == 0) goto L28
            if (r1 == r3) goto L28
            r2 = 2
            if (r1 == r2) goto L28
            r2 = 3
            if (r1 == r2) goto L28
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r2 = "setDefaultNightMode() called with an unknown mode"
            android.util.Log.d(r1, r2)
            goto L5b
        L28:
            int r2 = defpackage.tq.B
            if (r2 == r1) goto L5b
            defpackage.tq.B = r1
            java.lang.Object r1 = defpackage.tq.d0
            monitor-enter(r1)
            zu r2 = defpackage.tq.Z     // Catch: java.lang.Throwable -> L55
            r2.getClass()     // Catch: java.lang.Throwable -> L55
            su r0 = new su     // Catch: java.lang.Throwable -> L55
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L55
        L3b:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L55
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L55
            tq r2 = (defpackage.tq) r2     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L3b
            fr r2 = (defpackage.fr) r2     // Catch: java.lang.Throwable -> L55
            r2.q(r3, r3)     // Catch: java.lang.Throwable -> L55
            goto L3b
        L55:
            r2 = move-exception
            goto L59
        L57:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            goto L5b
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            throw r2
        L5b:
            jg7 r1 = defpackage.jg7.a
            return r1
    }
}
