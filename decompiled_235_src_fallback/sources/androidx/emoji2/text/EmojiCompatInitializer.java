package androidx.emoji2.text;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements defpackage.j53 {
    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.j53
    public final java.util.List a() {
            r0 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // defpackage.j53
    public final java.lang.Object b(android.content.Context r4) {
            r3 = this;
            wi2 r0 = new wi2
            rh r1 = new rh
            r2 = 4
            r1.<init>(r4, r2)
            r0.<init>(r1)
            r1 = 1
            r0.a = r1
            ws1 r1 = defpackage.ws1.k
            if (r1 != 0) goto L27
            java.lang.Object r1 = defpackage.ws1.j
            monitor-enter(r1)
            ws1 r2 = defpackage.ws1.k     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L23
            ws1 r2 = new ws1     // Catch: java.lang.Throwable -> L21
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L21
            defpackage.ws1.k = r2     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r3 = move-exception
            goto L25
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            goto L27
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r3
        L27:
            bt r4 = defpackage.bt.J(r4)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            r4.getClass()
            java.lang.Object r1 = defpackage.bt.Y
            monitor-enter(r1)
            java.lang.Object r2 = r4.B     // Catch: java.lang.Throwable -> L47
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L49
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r4.F(r0, r2)     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r3 = move-exception
            goto L5b
        L49:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            hu3 r2 = (defpackage.hu3) r2
            ut3 r4 = r2.getLifecycle()
            xs1 r0 = new xs1
            r0.<init>(r3, r4)
            r4.a(r0)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L5b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            throw r3
    }
}
