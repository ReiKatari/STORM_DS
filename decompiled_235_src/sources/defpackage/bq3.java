package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq3  reason: default package */
/* loaded from: classes.dex */
public final class bq3 {
    public final o46 a;
    public final f4 b;
    public final ja4 c;

    public bq3(o46 o46Var, f4 f4Var) {
        this.a = o46Var;
        this.b = f4Var;
        long[] jArr = b66.a;
        this.c = new ja4();
    }

    public final eo2 a(int i, Object obj, Object obj2) {
        ja4 ja4Var = this.c;
        aq3 aq3Var = (aq3) ja4Var.g(obj);
        if (aq3Var != null && aq3Var.c == i && nb3.k(aq3Var.b, obj2)) {
            zv0 zv0Var = aq3Var.d;
            if (zv0Var == null) {
                zv0 zv0Var2 = new zv0(818252804, true, new ql1(20, aq3Var.e, aq3Var));
                aq3Var.d = zv0Var2;
                return zv0Var2;
            }
            return zv0Var;
        }
        aq3 aq3Var2 = new aq3(this, i, obj, obj2);
        ja4Var.m(obj, aq3Var2);
        zv0 zv0Var3 = aq3Var2.d;
        if (zv0Var3 == null) {
            zv0 zv0Var4 = new zv0(818252804, true, new ql1(20, this, aq3Var2));
            aq3Var2.d = zv0Var4;
            return zv0Var4;
        }
        return zv0Var3;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            aq3 aq3Var = (aq3) this.c.g(obj);
            if (aq3Var != null) {
                return aq3Var.b;
            }
            cq3 cq3Var = (cq3) this.b.c();
            int e = cq3Var.e(obj);
            if (e != -1) {
                return cq3Var.d(e);
            }
            return null;
        }
        return null;
    }
}
