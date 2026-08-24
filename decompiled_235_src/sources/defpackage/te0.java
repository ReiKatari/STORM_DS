package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te0  reason: default package */
/* loaded from: classes.dex */
public final class te0 implements ve0 {
    public final od2 b;
    public final sy7 c;
    public final dc0 d;

    public te0(sg0 sg0Var, e62 e62Var, od2 od2Var, zg2 zg2Var, wq6 wq6Var, r87 r87Var, wz3 wz3Var, qy7 qy7Var, sy7 sy7Var, dc0 dc0Var, gj7 gj7Var, kj7 kj7Var, ln7 ln7Var) {
        sg0Var.getClass();
        e62Var.getClass();
        od2Var.getClass();
        zg2Var.getClass();
        wq6Var.getClass();
        r87Var.getClass();
        wz3Var.getClass();
        qy7Var.getClass();
        sy7Var.getClass();
        dc0Var.getClass();
        gj7Var.getClass();
        kj7Var.getClass();
        ln7Var.getClass();
        this.b = od2Var;
        this.c = sy7Var;
        this.d = dc0Var;
    }

    @Override // defpackage.ve0
    public final void a() {
        this.c.a();
    }

    @Override // defpackage.ve0
    public final void b(lc6 lc6Var) {
        this.c.b(lc6Var);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [hl5, java.lang.Object] */
    @Override // defpackage.ve0
    public final void c(yy0 yy0Var) {
        yy0Var.getClass();
        dc0 dc0Var = this.d;
        jd0 jd0Var = new jd0(2);
        yy0Var.h(new pk0(0, jd0Var, yy0Var));
        go4 a = go4.a(jd0Var.B);
        dc0Var.getClass();
        ec0 ec0Var = dc0Var.a;
        synchronized (ec0Var.A) {
            for (xx xxVar : a.c()) {
                xxVar.getClass();
                ec0Var.L.B.l(xxVar, xy0.ALWAYS_OVERRIDE, a.e(xxVar));
            }
        }
        tu0 a2 = dc0Var.a.a(dc0Var.d, true);
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = i61.class;
        try {
            a2.a0(new y(18, obj, a2));
            obj.a = "addCaptureRequestOptions";
        } catch (Exception e) {
            tb0Var.b(e);
        }
        l.F(tb0Var);
    }

    @Override // defpackage.ve0
    public final void d(int i) {
        boolean z = true;
        this.b.c(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.c.c(z);
    }

    @Override // defpackage.ve0
    public final void e(v66 v66Var) {
        this.b.getClass();
    }

    @Override // defpackage.ve0
    public final yy0 f() {
        os0 os0Var;
        ec0 ec0Var = this.d.a;
        synchronized (ec0Var.A) {
            kd0 a = ec0Var.L.a();
            jd0 jd0Var = new jd0(2);
            a.h(new pk0(0, jd0Var, a));
            os0Var = new os0(go4.a(jd0Var.B));
        }
        return os0Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hl5, java.lang.Object] */
    @Override // defpackage.ve0
    public final void g() {
        dc0 dc0Var = this.d;
        ec0 ec0Var = dc0Var.a;
        synchronized (ec0Var.A) {
            ec0Var.L = new jd0(0);
        }
        tu0 a = dc0Var.a.a(dc0Var.d, true);
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = i61.class;
        try {
            a.a0(new y(18, obj, a));
            obj.a = "clearCaptureRequestOptions";
        } catch (Exception e) {
            tb0Var.b(e);
        }
        l.F(tb0Var);
    }
}
