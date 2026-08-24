package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements java.lang.Runnable {
    public final /* synthetic */ int A;

    public /* synthetic */ ge(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ ge(defpackage.fh0 r1, java.util.Set r2) {
            r0 = this;
            r1 = 1
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ ge(defpackage.jk0 r1) {
            r0 = this;
            r1 = 2
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ ge(defpackage.jk0 r1, int r2) {
            r0 = this;
            r1 = 3
            r0.A = r1
            r0.<init>()
            return
    }

    private final void a() {
            r0 = this;
            return
    }

    private final void b() {
            r0 = this;
            return
    }

    private final void c() {
            r0 = this;
            return
    }

    private final void d() {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r6 = r6.A
            switch(r6) {
                case 0: goto L6;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L5;
                default: goto L5;
            }
        L5:
            return
        L6:
            ca4 r6 = defpackage.te.L1
            monitor-enter(r6)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r1 = r6.a
            int r2 = r6.b
            r3 = 0
            r4 = 30
            if (r0 >= r4) goto L3c
        L14:
            if (r3 >= r2) goto L4e
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L37
            te r0 = (defpackage.te) r0     // Catch: java.lang.Throwable -> L37
            boolean r4 = r0.getShowLayoutBounds()     // Catch: java.lang.Throwable -> L37
            java.lang.Class r5 = defpackage.te.I1     // Catch: java.lang.Throwable -> L37
            boolean r5 = defpackage.g04.F()     // Catch: java.lang.Throwable -> L37
            r0.setShowLayoutBounds(r5)     // Catch: java.lang.Throwable -> L37
            boolean r5 = r0.getShowLayoutBounds()     // Catch: java.lang.Throwable -> L37
            if (r4 == r5) goto L39
            ee r4 = new ee     // Catch: java.lang.Throwable -> L37
            r5 = 2
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L37
            r0.post(r4)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L50
        L39:
            int r3 = r3 + 1
            goto L14
        L3c:
            if (r3 >= r2) goto L4e
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L37
            te r0 = (defpackage.te) r0     // Catch: java.lang.Throwable -> L37
            ee r4 = new ee     // Catch: java.lang.Throwable -> L37
            r5 = 3
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L37
            r0.post(r4)     // Catch: java.lang.Throwable -> L37
            int r3 = r3 + 1
            goto L3c
        L4e:
            monitor-exit(r6)
            return
        L50:
            monitor-exit(r6)
            throw r0
    }
}
