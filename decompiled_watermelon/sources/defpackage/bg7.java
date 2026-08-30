package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bg7  reason: default package */
/* loaded from: classes.dex */
public abstract class bg7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ft6 r4, defpackage.bj2 r5, java.lang.Throwable r6, defpackage.k11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ha2
            if (r0 == 0) goto L13
            r0 = r7
            ha2 r0 = (defpackage.ha2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ha2 r0 = new ha2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.R
            defpackage.me2.a0(r7)     // Catch: java.lang.Throwable -> L29
            goto L40
        L29:
            r4 = move-exception
            goto L43
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L32:
            defpackage.me2.a0(r7)
            r0.R = r6     // Catch: java.lang.Throwable -> L29
            r0.Y = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.i(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L40
            return r1
        L40:
            o27 r4 = defpackage.o27.a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            defpackage.pu.k(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg7.a(ft6, bj2, java.lang.Throwable, k11):java.lang.Object");
    }

    public abstract void b(int i);

    public abstract boolean c();

    public abstract void e(boolean z);

    public abstract void f();

    public abstract void g(int i);

    public void d(boolean z) {
    }
}
