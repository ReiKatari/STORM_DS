package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la1  reason: default package */
/* loaded from: classes.dex */
public final class la1 extends qo7 {
    public final fg b;
    public final kd6 c;
    public final fb2 d;
    public final db1 e;
    public final p06 f;
    public final tp6 g;
    public final tp6 h;
    public final tp6 i;
    public final de5 j;
    public final of6 k;
    public final be5 l;
    public final of6 m;
    public final be5 n;

    public la1(fg fgVar, kd6 kd6Var, fb2 fb2Var, db1 db1Var, p06 p06Var) {
        fgVar.getClass();
        kd6Var.getClass();
        fb2Var.getClass();
        db1Var.getClass();
        p06Var.getClass();
        this.b = fgVar;
        this.c = kd6Var;
        this.d = fb2Var;
        this.e = db1Var;
        this.f = p06Var;
        tp6 a = up6.a(da1.a);
        this.g = a;
        this.h = a;
        tp6 a2 = up6.a(Boolean.FALSE);
        this.i = a2;
        this.j = new de5(a2);
        m80 m80Var = m80.DROP_OLDEST;
        of6 b = pf6.b(0, 1, m80Var, 1);
        this.k = b;
        this.l = new be5(b);
        of6 b2 = pf6.b(0, 1, m80Var, 1);
        this.m = b2;
        this.n = new be5(b2);
        f();
    }

    @Override // defpackage.qo7
    public final void d() {
        this.b.b();
    }

    public final void e(Uri uri) {
        uri.getClass();
        Boolean bool = Boolean.TRUE;
        tp6 tp6Var = this.i;
        tp6Var.getClass();
        tp6Var.m(null, bool);
        hv.L(to7.a(this), null, null, new ia1(this, uri, null, 1), 3);
    }

    public final void f() {
        cz0 cz0Var = this.d.c().b;
        if (cz0Var != cz0.VALID) {
            ba1 ba1Var = new ba1(cz0Var);
            tp6 tp6Var = this.g;
            tp6Var.getClass();
            tp6Var.m(null, ba1Var);
            return;
        }
        hv.L(to7.a(this), null, null, new a6(this, null, 14), 3);
    }
}
