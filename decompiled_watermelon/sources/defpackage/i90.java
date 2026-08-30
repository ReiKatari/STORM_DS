package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i90  reason: default package */
/* loaded from: classes.dex */
public final class i90 {
    public Object a;
    public l90 b;
    public pb5 c;
    public boolean d;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            r4.d = r0
            l90 r1 = r4.b
            r2 = 0
            if (r1 == 0) goto L1d
            k90 r1 = r1.B
            r1.getClass()
            if (r5 != 0) goto L11
            java.lang.Object r5 = defpackage.q1.Z
        L11:
            l07 r3 = defpackage.q1.Y
            boolean r5 = r3.w(r1, r2, r5)
            if (r5 == 0) goto L1d
            defpackage.q1.c(r1)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L26
            r4.a = r2
            r4.b = r2
            r4.c = r2
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i90.a(java.lang.Object):boolean");
    }

    public final void b() {
        this.d = true;
        l90 l90Var = this.b;
        if (l90Var != null && l90Var.B.cancel(true)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final boolean c(Throwable th) {
        boolean z = true;
        this.d = true;
        l90 l90Var = this.b;
        z = (l90Var == null || !l90Var.B.i(th)) ? false : false;
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        pb5 pb5Var;
        l90 l90Var = this.b;
        if (l90Var != null && !l90Var.B.isDone()) {
            l90Var.b(new k1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
        }
        if (!this.d && (pb5Var = this.c) != null) {
            pb5Var.j(null);
        }
    }
}
