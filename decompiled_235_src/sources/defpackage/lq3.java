package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq3  reason: default package */
/* loaded from: classes.dex */
public final class lq3 {
    public final Object a;
    public final mq3 b;
    public int d;
    public lq3 e;
    public boolean f;
    public int c = -1;
    public final vs4 g = np2.Y(null);

    public lq3(Object obj, mq3 mq3Var) {
        this.a = obj;
        this.b = mq3Var;
    }

    public final lq3 a() {
        if (this.f) {
            s53.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.A.add(this);
            lq3 lq3Var = (lq3) this.g.getValue();
            if (lq3Var != null) {
                lq3Var.a();
            } else {
                lq3Var = null;
            }
            this.e = lq3Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (!this.f) {
            if (this.d <= 0) {
                s53.c("Release should only be called once");
            }
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.b.A.remove(this);
                lq3 lq3Var = this.e;
                if (lq3Var != null) {
                    lq3Var.b();
                }
                this.e = null;
            }
        }
    }
}
