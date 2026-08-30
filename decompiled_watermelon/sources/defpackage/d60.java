package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d60  reason: default package */
/* loaded from: classes.dex */
public final class d60 implements qq6 {
    public final l26 a;
    public final float b;

    public d60(l26 l26Var, float f) {
        this.a = l26Var;
        this.b = f;
    }

    @Override // defpackage.qq6
    public final float a() {
        return this.b;
    }

    @Override // defpackage.qq6
    public final long b() {
        int i = xq0.i;
        return xq0.h;
    }

    @Override // defpackage.qq6
    public final b60 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d60)) {
            return false;
        }
        d60 d60Var = (d60) obj;
        if (b53.x(this.a, d60Var.a) && Float.compare(this.b, d60Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return ej6.f(sb, this.b, ')');
    }
}
