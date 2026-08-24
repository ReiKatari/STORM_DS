package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh  reason: default package */
/* loaded from: classes.dex */
public final class xh implements defpackage.tt2 {
    public static boolean f = true;
    public final defpackage.te a;
    public final java.lang.Object b;
    public defpackage.po7 c;
    public boolean d;
    public final defpackage.vh e;

    public xh(defpackage.te r4) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.b = r0
            vh r0 = new vh
            r0.<init>()
            r3.e = r0
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L2b
            android.content.Context r1 = r4.getContext()
            boolean r2 = r3.d
            if (r2 != 0) goto L2b
            android.content.Context r1 = r1.getApplicationContext()
            r1.registerComponentCallbacks(r0)
            r0 = 1
            r3.d = r0
        L2b:
            wh r0 = new wh
            r1 = 0
            r0.<init>(r3, r1)
            r4.addOnAttachStateChangeListener(r0)
            return
    }

    @Override // defpackage.tt2
    public final void a(defpackage.ut2 r2) {
            r1 = this;
            java.lang.Object r1 = r1.b
            monitor-enter(r1)
            boolean r0 = r2.s     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Ld
            r0 = 1
            r2.s = r0     // Catch: java.lang.Throwable -> Lf
            r2.b()     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // defpackage.tt2
    public final defpackage.ut2 b() {
            r5 = this;
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            te r1 = r5.a     // Catch: java.lang.Throwable -> L16
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L16
            r3 = 29
            if (r2 < r3) goto Le
            defpackage.od.a(r1)     // Catch: java.lang.Throwable -> L16
        Le:
            if (r2 < r3) goto L18
            bu2 r5 = new bu2     // Catch: java.lang.Throwable -> L16
            r5.<init>()     // Catch: java.lang.Throwable -> L16
            goto L49
        L16:
            r5 = move-exception
            goto L50
        L18:
            boolean r1 = defpackage.xh.f     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L3d
            zt2 r1 = new zt2     // Catch: java.lang.Throwable -> L2e
            te r2 = r5.a     // Catch: java.lang.Throwable -> L2e
            ak0 r3 = new ak0     // Catch: java.lang.Throwable -> L2e
            r3.<init>()     // Catch: java.lang.Throwable -> L2e
            zj0 r4 = new zj0     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r1 = 0
            defpackage.xh.f = r1     // Catch: java.lang.Throwable -> L16
            du2 r1 = new du2     // Catch: java.lang.Throwable -> L16
            te r2 = r5.a     // Catch: java.lang.Throwable -> L16
            ko1 r5 = r5.c(r2)     // Catch: java.lang.Throwable -> L16
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L16
            goto L48
        L3d:
            du2 r1 = new du2     // Catch: java.lang.Throwable -> L16
            te r2 = r5.a     // Catch: java.lang.Throwable -> L16
            ko1 r5 = r5.c(r2)     // Catch: java.lang.Throwable -> L16
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L16
        L48:
            r5 = r1
        L49:
            ut2 r1 = new ut2     // Catch: java.lang.Throwable -> L16
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L50:
            monitor-exit(r0)
            throw r5
    }

    public final defpackage.ko1 c(defpackage.te r4) {
            r3 = this;
            po7 r0 = r3.c
            if (r0 != 0) goto L23
            android.content.Context r0 = r4.getContext()
            po7 r1 = new po7
            r1.<init>(r0)
            r0 = 0
            r1.setClipChildren(r0)
            r1.setClipToPadding(r0)
            r0 = 2131427607(0x7f0b0117, float:1.8476835E38)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setTag(r0, r2)
            r0 = -1
            r4.addView(r1, r0)
            r3.c = r1
            return r1
        L23:
            return r0
    }
}
