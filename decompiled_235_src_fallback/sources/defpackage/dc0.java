package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc0  reason: default package */
/* loaded from: classes.dex */
public final class dc0 implements defpackage.gi7 {
    public final defpackage.ec0 a;
    public final defpackage.kj7 b;
    public final defpackage.ou0 c;
    public defpackage.li7 d;

    public dc0(defpackage.ec0 r1, defpackage.kj7 r2, defpackage.ou0 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r3) {
            r2 = this;
            r2.d = r3
            if (r3 == 0) goto L16
            ou0 r0 = r2.c
            ec0 r1 = r2.a
            r0.b(r1)
            kj7 r2 = r2.b
            s37 r2 = r2.e
            r0.a(r1, r2)
            r2 = 0
            r1.a(r3, r2)
        L16:
            return
    }

    @Override // defpackage.gi7
    public final void reset() {
            r6 = this;
            ec0 r0 = r6.a
            java.lang.Object r1 = r0.B
            monitor-enter(r1)
            tu0 r2 = r0.R     // Catch: java.lang.Throwable -> L17
            r3 = 0
            if (r2 == 0) goto L19
            r0.R = r3     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = "The camera control has became inactive."
            se0 r5 = new se0     // Catch: java.lang.Throwable -> L17
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L17
            r2.v0(r5)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r6 = move-exception
            goto L32
        L19:
            tu0 r2 = r0.X     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L29
            r0.X = r3     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "The camera control has became inactive."
            se0 r3 = new se0     // Catch: java.lang.Throwable -> L17
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L17
            r2.v0(r3)     // Catch: java.lang.Throwable -> L17
        L29:
            monitor-exit(r1)
            ou0 r0 = r6.c
            ec0 r6 = r6.a
            r0.b(r6)
            return
        L32:
            monitor-exit(r1)
            throw r6
    }
}
