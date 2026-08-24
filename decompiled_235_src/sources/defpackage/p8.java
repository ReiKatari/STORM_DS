package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p8  reason: default package */
/* loaded from: classes.dex */
public final class p8 extends zg6 {
    public cf6 a;
    public final vs4 b;

    public p8(cf6 cf6Var, of5 of5Var) {
        this.a = cf6Var;
        this.b = np2.Y(of5Var);
    }

    @Override // defpackage.zg6
    public final zg6 a(gf6 gf6Var, cf6 cf6Var, long j, long j2, long j3) {
        Object obj;
        eb ebVar = new eb(j, jk4.e(j2, j3), j3);
        of5 c = c();
        if (c == null) {
            cf6 cf6Var2 = this.a;
            if (cf6Var2 == null) {
                List b = gf6Var.b();
                int size = b.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        obj = b.get(i);
                        if (gf6Var.c().contains((if6) obj)) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                if6 if6Var = (if6) obj;
                if (if6Var != null) {
                    cf6Var2 = if6Var.h0;
                } else {
                    cf6Var2 = null;
                }
            }
            c = kn2.o(gf6Var, cf6Var2);
            if (c == null) {
                c = kj2.b(j2, j);
            }
        }
        kn2.q(ebVar, j, j2, j3, true);
        return new o8(ebVar, cf6Var, c);
    }

    @Override // defpackage.zg6
    public final boolean b() {
        return true;
    }

    @Override // defpackage.zg6
    public final of5 c() {
        return (of5) this.b.getValue();
    }

    @Override // defpackage.zg6
    public final eb e() {
        return null;
    }

    @Override // defpackage.zg6
    public final of5 f(gf6 gf6Var) {
        Object obj;
        of5 c = c();
        if (c != null) {
            return c;
        }
        if (c() == null) {
            cf6 cf6Var = this.a;
            if (cf6Var == null) {
                List b = gf6Var.b();
                int size = b.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        obj = b.get(i);
                        if (gf6Var.c().contains((if6) obj)) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                if6 if6Var = (if6) obj;
                if (if6Var != null) {
                    cf6Var = if6Var.h0;
                } else {
                    cf6Var = null;
                }
            }
            of5 o = kn2.o(gf6Var, cf6Var);
            if (o != null) {
                this.b.setValue(o);
            }
        }
        return c();
    }

    @Override // defpackage.zg6
    public final zg6 g(cf6 cf6Var) {
        if (this.a == null) {
            this.a = cf6Var;
        }
        return this;
    }

    @Override // defpackage.zg6
    public final zg6 h() {
        return rf4.a;
    }

    @Override // defpackage.zg6
    public final void i(of5 of5Var) {
        this.b.setValue(of5Var);
    }
}
