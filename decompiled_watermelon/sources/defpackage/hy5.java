package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hy5  reason: default package */
/* loaded from: classes.dex */
public final class hy5 {
    public final Object a;
    public final bj2 b;
    public final bj2 c;
    public final Object d;
    public final nk6 e;
    public final bj2 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ jy5 i;

    public hy5(jy5 jy5Var, Object obj, bj2 bj2Var, bj2 bj2Var2, an1 an1Var, nk6 nk6Var, bj2 bj2Var3) {
        this.i = jy5Var;
        this.a = obj;
        this.b = bj2Var;
        this.c = bj2Var2;
        this.d = an1Var;
        this.e = nk6Var;
        this.f = bj2Var3;
    }

    public final void a() {
        eh1 eh1Var;
        Object obj = this.g;
        if (obj instanceof dy5) {
            ((dy5) obj).m(this.h, this.i.A);
            return;
        }
        if (obj instanceof eh1) {
            eh1Var = (eh1) obj;
        } else {
            eh1Var = null;
        }
        if (eh1Var != null) {
            eh1Var.dispose();
        }
    }
}
