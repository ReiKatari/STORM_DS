package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h80  reason: default package */
/* loaded from: classes.dex */
public final class h80 implements e37 {
    public final xd6 a;
    public final float b;

    public h80(xd6 xd6Var, float f) {
        this.a = xd6Var;
        this.b = f;
    }

    @Override // defpackage.e37
    public final float a() {
        return this.b;
    }

    @Override // defpackage.e37
    public final long b() {
        int i = kt0.i;
        return kt0.h;
    }

    @Override // defpackage.e37
    public final f80 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        if (nb3.k(this.a, h80Var.a) && Float.compare(this.b, h80Var.b) == 0) {
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
        return xg6.p(sb, this.b, ')');
    }
}
