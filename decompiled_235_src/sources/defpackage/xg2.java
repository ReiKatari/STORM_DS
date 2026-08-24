package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg2  reason: default package */
/* loaded from: classes.dex */
public final class xg2 {
    public final eh2 a;
    public final te b;
    public final ka4 c;
    public final ka4 d;
    public boolean e;

    public xg2(eh2 eh2Var, te teVar) {
        this.a = eh2Var;
        this.b = teVar;
        ka4 ka4Var = c66.a;
        this.c = new ka4();
        this.d = new ka4();
    }

    public final void a() {
        if (!this.e) {
            i4 i4Var = new i4(0, this, xg2.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 4);
            ca4 ca4Var = this.b.u1;
            if (ca4Var.g(i4Var) < 0) {
                ca4Var.a(i4Var);
            }
            this.e = true;
        }
    }
}
