package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v66  reason: default package */
/* loaded from: classes.dex */
public final class v66 {
    public final defpackage.v66 a;
    public final java.lang.Object b;
    public boolean c;

    public v66(defpackage.v66 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.b = r1
            return
    }

    public final void a() {
            r3 = this;
            java.lang.Object r0 = r3.b
            monitor-enter(r0)
            boolean r1 = r3.c     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L19
            v66 r1 = r3.a     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            r1.a()     // Catch: java.lang.Throwable -> Lf
            goto L20
        Lf:
            r3 = move-exception
            goto L25
        L11:
            java.lang.String r1 = "ScreenFlashWrapper"
            java.lang.String r2 = "completePendingScreenFlashClear: screenFlash is null!"
            defpackage.kj2.v(r1, r2)     // Catch: java.lang.Throwable -> Lf
            goto L20
        L19:
            java.lang.String r1 = "ScreenFlashWrapper"
            java.lang.String r2 = "completePendingScreenFlashClear: none pending!"
            defpackage.kj2.f0(r1, r2)     // Catch: java.lang.Throwable -> Lf
        L20:
            r1 = 0
            r3.c = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        L25:
            monitor-exit(r0)
            throw r3
    }

    public final void b() {
            r0 = this;
            java.lang.Object r0 = r0.b
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }
}
