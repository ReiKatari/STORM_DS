package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d34  reason: default package */
/* loaded from: classes.dex */
public final class d34 {
    public final /* synthetic */ int a;
    public final aw b;
    public final Object c;

    public d34(z24 z24Var) {
        this.a = 0;
        z24Var.getClass();
        this.c = z24Var;
        this.b = w81.e(false);
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                return this.b.b();
            default:
                return this.b.b();
        }
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                if (!this.b.a()) {
                    return false;
                }
                ((z24) this.c).d(null);
                return true;
            default:
                if (!this.b.a()) {
                    return false;
                }
                l24 l24Var = (l24) this.c;
                synchronized (l24Var.c) {
                    int i = l24Var.a - 1;
                    l24Var.a = i;
                    if (i == 0 && !l24Var.b) {
                        l24Var.f = tq5.w((o31) l24Var.d, null, null, new ys3(l24Var, null, 19), 3);
                    }
                }
                return true;
        }
    }

    public d34(l24 l24Var) {
        this.a = 1;
        this.c = l24Var;
        this.b = w81.e(false);
    }
}
