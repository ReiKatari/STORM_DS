package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xy6  reason: default package */
/* loaded from: classes.dex */
public final class xy6 implements jm1 {
    public final int a;
    public final int b;
    public final bn1 c;

    public xy6(int i, bn1 bn1Var, int i2) {
        this(i, 0, (i2 & 4) != 0 ? cn1.a : bn1Var);
    }

    @Override // defpackage.ho
    public final j77 a(bz6 bz6Var) {
        return new k70(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xy6) {
            xy6 xy6Var = (xy6) obj;
            if (xy6Var.a == this.a && xy6Var.b == this.b && b53.x(xy6Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public xy6(int i, int i2, bn1 bn1Var) {
        this.a = i;
        this.b = i2;
        this.c = bn1Var;
    }

    @Override // defpackage.jm1, defpackage.ho
    public final l77 a(bz6 bz6Var) {
        return new k70(this.a, this.b, this.c);
    }
}
