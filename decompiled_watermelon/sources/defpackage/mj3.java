package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mj3  reason: default package */
/* loaded from: classes.dex */
public final class mj3 {
    public final Object a;
    public final nj3 b;
    public int d;
    public mj3 e;
    public boolean f;
    public int c = -1;
    public final tj4 g = me2.G(null);

    public mj3(Object obj, nj3 nj3Var) {
        this.a = obj;
        this.b = nj3Var;
    }

    public final mj3 a() {
        if (this.f) {
            pz2.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.A.add(this);
            mj3 mj3Var = (mj3) this.g.getValue();
            if (mj3Var != null) {
                mj3Var.a();
            } else {
                mj3Var = null;
            }
            this.e = mj3Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (!this.f) {
            if (this.d <= 0) {
                pz2.c("Release should only be called once");
            }
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.b.A.remove(this);
                mj3 mj3Var = this.e;
                if (mj3Var != null) {
                    mj3Var.b();
                }
                this.e = null;
            }
        }
    }
}
