package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j27  reason: default package */
/* loaded from: classes.dex */
public final class j27 extends fv5 {
    public final ThreadLocal Z;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j27(defpackage.j11 r3, defpackage.e31 r4) {
        /*
            r2 = this;
            nh0 r0 = defpackage.nh0.R
            c31 r1 = r4.I(r0)
            if (r1 != 0) goto Ld
            e31 r0 = r4.C(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.Z = r0
            e31 r3 = r3.a()
            k45 r0 = defpackage.k45.Y
            c31 r3 = r3.I(r0)
            boolean r3 = r3 instanceof defpackage.g31
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = defpackage.ts6.c(r4, r3)
            defpackage.ts6.a(r4, r3)
            r2.z0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j27.<init>(j11, e31):void");
    }

    @Override // defpackage.fv5, defpackage.p63
    public final void f(Object obj) {
        y0();
        Object d0 = b53.d0(obj);
        j11 j11Var = this.Y;
        e31 a = j11Var.a();
        j27 j27Var = null;
        Object c = ts6.c(a, null);
        if (c != ts6.a) {
            j27Var = pu.O(j11Var, a, c);
        }
        try {
            j11Var.k(d0);
            if (j27Var != null && !j27Var.x0()) {
                return;
            }
            ts6.a(a, c);
        } catch (Throwable th) {
            if (j27Var == null || j27Var.x0()) {
                ts6.a(a, c);
            }
            throw th;
        }
    }

    @Override // defpackage.fv5
    public final void w0() {
        y0();
    }

    public final boolean x0() {
        boolean z;
        if (this.threadLocalIsSet && this.Z.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.Z.remove();
        return !z;
    }

    public final void y0() {
        if (this.threadLocalIsSet) {
            ti4 ti4Var = (ti4) this.Z.get();
            if (ti4Var != null) {
                ts6.a((e31) ti4Var.A, ti4Var.B);
            }
            this.Z.remove();
        }
    }

    public final void z0(e31 e31Var, Object obj) {
        this.threadLocalIsSet = true;
        this.Z.set(new ti4(e31Var, obj));
    }
}
