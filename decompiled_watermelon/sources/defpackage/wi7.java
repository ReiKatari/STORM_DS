package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wi7  reason: default package */
/* loaded from: classes.dex */
public final class wi7 extends dz3 {
    public final sf1 a;
    public final aj2 b;
    public final Object c;

    public wi7(sf1 sf1Var, aj2 aj2Var, Object obj) {
        this.a = sf1Var;
        this.b = aj2Var;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, yi7] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && wi7.class == obj.getClass()) {
                wi7 wi7Var = (wi7) obj;
                if (this.a != wi7Var.a || !b53.x(this.c, wi7Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        yi7 yi7Var = (yi7) yy3Var;
        yi7Var.j0 = this.a;
        yi7Var.k0 = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.c(this.a.hashCode() * 31, false, 31);
    }
}
