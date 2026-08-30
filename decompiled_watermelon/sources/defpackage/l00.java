package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l00  reason: default package */
/* loaded from: classes.dex */
public abstract class l00 implements fy0 {
    public final vy0 a;

    public l00(vy0 vy0Var) {
        vy0Var.getClass();
        this.a = vy0Var;
    }

    @Override // defpackage.fy0
    public final boolean b(xh7 xh7Var) {
        if (a(xh7Var) && e(this.a.d())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fy0
    public final h90 c(kz0 kz0Var) {
        kz0Var.getClass();
        return se.k(new y(this, (j11) null, 8));
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
