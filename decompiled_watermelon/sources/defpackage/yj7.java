package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yj7  reason: default package */
/* loaded from: classes.dex */
public final class yj7 implements i47 {
    public final wj7 a;
    public final float b;
    public final float c;
    public final il6 d = new il6(new ki2(this) { // from class: xj7
        public final /* synthetic */ yj7 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            yj7 yj7Var = this.B;
            switch (i) {
                case 0:
                    return new zj7(yj7Var.b, yj7Var.c);
                default:
                    return new pq3((zj7) yj7Var.d.getValue());
            }
        }
    });
    public final il6 e = new il6(new ki2(this) { // from class: xj7
        public final /* synthetic */ yj7 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            yj7 yj7Var = this.B;
            switch (i) {
                case 0:
                    return new zj7(yj7Var.b, yj7Var.c);
                default:
                    return new pq3((zj7) yj7Var.d.getValue());
            }
        }
    });
    public boolean f;
    public n47 g;
    public gs0 h;

    public yj7(wj7 wj7Var) {
        this.a = wj7Var;
        this.b = wj7Var.d();
        this.c = wj7Var.a();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [pb5, java.lang.Object] */
    public final fq3 a(zj7 zj7Var, boolean z, boolean z2) {
        ic1 e;
        zj7Var.getClass();
        gs0 gs0Var = new gs0();
        gs0 gs0Var2 = this.h;
        if (gs0Var2 != null) {
            if (z) {
                b31.z("Cancelled due to another zoom value being set.", gs0Var2);
            } else {
                l.K(gs0Var, gs0Var2);
            }
        }
        this.h = gs0Var;
        boolean M = nk2.M();
        il6 il6Var = this.e;
        if (M) {
            ((m14) il6Var.getValue()).f(zj7Var);
        } else {
            ((m14) il6Var.getValue()).g(zj7Var);
        }
        n47 n47Var = this.g;
        if (n47Var != null) {
            wj7 wj7Var = this.a;
            if (z2) {
                e = wj7Var.f(n47Var);
            } else {
                e = wj7Var.e(n47Var);
            }
            l.K(e, gs0Var);
        } else {
            b31.z("Camera is not active.", gs0Var);
        }
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = a31.class;
        try {
            gs0Var.R(new j0(17, (Object) obj));
            obj.a = "Job.asListenableFuture";
        } catch (Exception e2) {
            l90Var.b(e2);
        }
        return jv3.N(l90Var);
    }

    @Override // defpackage.i47
    public final void b(n47 n47Var) {
        boolean z;
        this.g = n47Var;
        zj7 zj7Var = (zj7) ((m14) this.e.getValue()).c();
        if (zj7Var == null) {
            zj7Var = (zj7) this.d.getValue();
        }
        if (!this.f) {
            zj7Var.getClass();
            z = false;
        } else {
            z = true;
        }
        a(zj7Var, false, z);
        this.f = true;
    }

    @Override // defpackage.i47
    public final void reset() {
        a((zj7) this.d.getValue(), true, true);
    }
}
