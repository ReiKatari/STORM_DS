package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kc0  reason: default package */
/* loaded from: classes.dex */
public final class kc0 implements mc0 {
    public final w82 b;
    public final ak7 c;
    public final v90 d;

    public kc0(je0 je0Var, p12 p12Var, w82 w82Var, ic2 ic2Var, hf6 hf6Var, ew6 ew6Var, rs3 rs3Var, yj7 yj7Var, ak7 ak7Var, v90 v90Var, j57 j57Var, n57 n57Var, l97 l97Var) {
        je0Var.getClass();
        p12Var.getClass();
        w82Var.getClass();
        ic2Var.getClass();
        hf6Var.getClass();
        ew6Var.getClass();
        rs3Var.getClass();
        yj7Var.getClass();
        ak7Var.getClass();
        v90Var.getClass();
        j57Var.getClass();
        n57Var.getClass();
        l97Var.getClass();
        this.b = w82Var;
        this.c = ak7Var;
        this.d = v90Var;
    }

    @Override // defpackage.mc0
    public final void a() {
        this.c.a();
    }

    @Override // defpackage.mc0
    public final void b(x06 x06Var) {
        this.c.b(x06Var);
    }

    @Override // defpackage.mc0
    public final cw0 c() {
        bq0 bq0Var;
        w90 w90Var = this.d.a;
        synchronized (w90Var.A) {
            cb0 a = w90Var.L.a();
            bb0 bb0Var = new bb0(2);
            a.k(new hi0(0, bb0Var, a));
            bq0Var = new bq0(ef4.b(bb0Var.B));
        }
        return bq0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [pb5, java.lang.Object] */
    @Override // defpackage.mc0
    public final void d(cw0 cw0Var) {
        cw0Var.getClass();
        v90 v90Var = this.d;
        bb0 bb0Var = new bb0(2);
        cw0Var.k(new hi0(0, bb0Var, cw0Var));
        ef4 b = ef4.b(bb0Var.B);
        v90Var.getClass();
        w90 w90Var = v90Var.a;
        synchronized (w90Var.A) {
            for (uw uwVar : b.e()) {
                uwVar.getClass();
                w90Var.L.B.m(uwVar, bw0.ALWAYS_OVERRIDE, b.g(uwVar));
            }
        }
        gs0 a = v90Var.a.a(v90Var.d, true);
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = b31.class;
        try {
            a.R(new x(19, obj, a));
            obj.a = "addCaptureRequestOptions";
        } catch (Exception e) {
            l90Var.b(e);
        }
        jv3.N(l90Var);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pb5, java.lang.Object] */
    @Override // defpackage.mc0
    public final void e() {
        v90 v90Var = this.d;
        w90 w90Var = v90Var.a;
        synchronized (w90Var.A) {
            w90Var.L = new bb0(0);
        }
        gs0 a = v90Var.a.a(v90Var.d, true);
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = b31.class;
        try {
            a.R(new x(19, obj, a));
            obj.a = "clearCaptureRequestOptions";
        } catch (Exception e) {
            l90Var.b(e);
        }
        jv3.N(l90Var);
    }

    @Override // defpackage.mc0
    public final void f(int i) {
        boolean z = true;
        this.b.c(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.c.c(z);
    }

    @Override // defpackage.mc0
    public final void g(iv5 iv5Var) {
        this.b.getClass();
    }
}
