package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gc2  reason: default package */
/* loaded from: classes.dex */
public final class gc2 {
    public final nc2 a;
    public final ee b;
    public final e24 c;
    public final e24 d;
    public boolean e;

    public gc2(nc2 nc2Var, ee eeVar) {
        this.a = nc2Var;
        this.b = eeVar;
        e24 e24Var = xu5.a;
        this.c = new e24();
        this.d = new e24();
    }

    public final void a() {
        if (!this.e) {
            i4 i4Var = new i4(0, this, gc2.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 4);
            w14 w14Var = this.b.t1;
            if (w14Var.g(i4Var) < 0) {
                w14Var.a(i4Var);
            }
            this.e = true;
        }
    }
}
