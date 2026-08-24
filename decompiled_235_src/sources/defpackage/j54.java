package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j54  reason: default package */
/* loaded from: classes.dex */
public final class j54 implements j66 {
    public final c1 a;
    public final ng7 b;
    public final i82 c;

    public j54(ng7 ng7Var, i82 i82Var, c1 c1Var) {
        this.b = ng7Var;
        i82Var.getClass();
        this.c = i82Var;
        this.a = c1Var;
    }

    @Override // defpackage.j66
    public final void a(Object obj) {
        this.b.getClass();
        ((pr2) obj).unknownFields.e = false;
        this.c.getClass();
        xg6.A(obj);
        throw null;
    }

    @Override // defpackage.j66
    public final boolean b(Object obj) {
        this.c.getClass();
        xg6.A(obj);
        throw null;
    }

    @Override // defpackage.j66
    public final boolean c(pr2 pr2Var, pr2 pr2Var2) {
        this.b.getClass();
        if (!pr2Var.unknownFields.equals(pr2Var2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.j66
    public final void d(Object obj, ls0 ls0Var, g82 g82Var) {
        this.b.getClass();
        pr2 pr2Var = (pr2) obj;
        if (pr2Var.unknownFields == mg7.f) {
            pr2Var.unknownFields = mg7.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j66
    public final void e(Object obj, os0 os0Var) {
        this.c.getClass();
        xg6.A(obj);
        throw null;
    }

    @Override // defpackage.j66
    public final int f(pr2 pr2Var) {
        this.b.getClass();
        return pr2Var.unknownFields.hashCode();
    }

    @Override // defpackage.j66
    public final void g(pr2 pr2Var, pr2 pr2Var2) {
        m66.x(this.b, pr2Var, pr2Var2);
    }

    @Override // defpackage.j66
    public final void h(Object obj, byte[] bArr, int i, int i2, ou ouVar) {
        pr2 pr2Var = (pr2) obj;
        if (pr2Var.unknownFields == mg7.f) {
            pr2Var.unknownFields = mg7.b();
        }
        throw i61.i(obj);
    }

    @Override // defpackage.j66
    public final int i(c1 c1Var) {
        this.b.getClass();
        mg7 mg7Var = ((pr2) c1Var).unknownFields;
        int i = mg7Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < mg7Var.a; i3++) {
            i2 += ms0.a(3, (ea0) mg7Var.c[i3]) + ms0.i(mg7Var.b[i3] >>> 3) + ms0.h(2) + (ms0.h(1) * 2);
        }
        mg7Var.d = i2;
        return i2;
    }

    @Override // defpackage.j66
    public final Object j() {
        pr2 pr2Var = (pr2) this.a;
        pr2Var.getClass();
        return ((mr2) pr2Var.f(or2.NEW_BUILDER)).b();
    }
}
