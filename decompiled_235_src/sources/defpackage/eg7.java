package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg7  reason: default package */
/* loaded from: classes.dex */
public final class eg7 extends o66 {
    public final ThreadLocal Z;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eg7(r41 r41Var, l61 l61Var) {
        super(r41Var, r0);
        l61 l61Var2;
        wj0 wj0Var = wj0.R;
        if (l61Var.Z(wj0Var) == null) {
            l61Var2 = l61Var.N(wj0Var);
        } else {
            l61Var2 = l61Var;
        }
        this.Z = new ThreadLocal();
        if (!(r41Var.b().Z(d90.r0) instanceof n61)) {
            Object c = k57.c(l61Var, null);
            k57.a(l61Var, c);
            z0(l61Var, c);
        }
    }

    @Override // defpackage.o66, defpackage.ed3
    public final void g(Object obj) {
        y0();
        Object H = lb4.H(obj);
        r41 r41Var = this.Y;
        l61 b = r41Var.b();
        eg7 eg7Var = null;
        Object c = k57.c(b, null);
        if (c != k57.a) {
            eg7Var = mb3.O(r41Var, b, c);
        }
        try {
            r41Var.i(H);
            if (eg7Var != null && !eg7Var.x0()) {
                return;
            }
            k57.a(b, c);
        } catch (Throwable th) {
            if (eg7Var == null || eg7Var.x0()) {
                k57.a(b, c);
            }
            throw th;
        }
    }

    @Override // defpackage.o66
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
            vr4 vr4Var = (vr4) this.Z.get();
            if (vr4Var != null) {
                k57.a((l61) vr4Var.A, vr4Var.B);
            }
            this.Z.remove();
        }
    }

    public final void z0(l61 l61Var, Object obj) {
        this.threadLocalIsSet = true;
        this.Z.set(new vr4(l61Var, obj));
    }
}
