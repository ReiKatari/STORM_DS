package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dj3  reason: default package */
/* loaded from: classes.dex */
public final class dj3 {
    public final jt5 a;
    public final f4 b;
    public final d24 c;

    public dj3(jt5 jt5Var, f4 f4Var) {
        this.a = jt5Var;
        this.b = f4Var;
        long[] jArr = wu5.a;
        this.c = new d24();
    }

    public final aj2 a(int i, Object obj, Object obj2) {
        d24 d24Var = this.c;
        cj3 cj3Var = (cj3) d24Var.g(obj);
        if (cj3Var != null && cj3Var.c == i && b53.x(cj3Var.b, obj2)) {
            et0 et0Var = cj3Var.d;
            if (et0Var == null) {
                et0 et0Var2 = new et0(818252804, true, new s4(21, cj3Var.e, cj3Var));
                cj3Var.d = et0Var2;
                return et0Var2;
            }
            return et0Var;
        }
        cj3 cj3Var2 = new cj3(this, i, obj, obj2);
        d24Var.m(obj, cj3Var2);
        et0 et0Var3 = cj3Var2.d;
        if (et0Var3 == null) {
            et0 et0Var4 = new et0(818252804, true, new s4(21, this, cj3Var2));
            cj3Var2.d = et0Var4;
            return et0Var4;
        }
        return et0Var3;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            cj3 cj3Var = (cj3) this.c.g(obj);
            if (cj3Var != null) {
                return cj3Var.b;
            }
            ej3 ej3Var = (ej3) this.b.c();
            int e = ej3Var.e(obj);
            if (e != -1) {
                return ej3Var.d(e);
            }
            return null;
        }
        return null;
    }
}
