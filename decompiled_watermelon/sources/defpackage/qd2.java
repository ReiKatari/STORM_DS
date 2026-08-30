package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qd2  reason: default package */
/* loaded from: classes.dex */
public final class qd2 implements od2 {
    public final fh a;
    public final gh b;
    public final wv6 c;
    public final ud2 d;
    public final ka3 e;
    public final kb2 f;

    public qd2(fh fhVar, gh ghVar) {
        wv6 wv6Var = rd2.a;
        ud2 ud2Var = new ud2(rd2.b);
        ka3 ka3Var = new ka3(24, (byte) 0);
        this.a = fhVar;
        this.b = ghVar;
        this.c = wv6Var;
        this.d = ud2Var;
        this.e = ka3Var;
        this.f = new kb2(1, this);
    }

    public final b17 a(y07 y07Var) {
        wv6 wv6Var = this.c;
        x xVar = new x(29, this, y07Var);
        synchronized (((jo1) wv6Var.B)) {
            b17 b17Var = (b17) ((us3) wv6Var.L).h(y07Var);
            if (b17Var != null) {
                if (b17Var.a()) {
                    return b17Var;
                }
                b17 b17Var2 = (b17) ((us3) wv6Var.L).m(y07Var);
            }
            try {
                b17 b17Var3 = (b17) xVar.n(new zr4(28, wv6Var, y07Var));
                synchronized (((jo1) wv6Var.B)) {
                    if (((us3) wv6Var.L).h(y07Var) == null && b17Var3.a()) {
                        ((us3) wv6Var.L).l(y07Var, b17Var3);
                    }
                }
                return b17Var3;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final b17 b(pd2 pd2Var, pe2 pe2Var, int i, int i2) {
        pe2 pe2Var2;
        gh ghVar = this.b;
        ghVar.getClass();
        int i3 = ghVar.A;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            pe2Var2 = new pe2(io2.m(pe2Var.A + i3, 1, 1000));
        } else {
            pe2Var2 = pe2Var;
        }
        this.a.getClass();
        return a(new y07(pd2Var, pe2Var2, i, i2, null));
    }
}
