package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f8650a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8651b;

    public y0(b2 b2Var, int i2) {
        this.f8650a = b2Var;
        this.f8651b = i2;
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        if ((this.f8651b & 32) != 0) {
            return this.f8650a.a(cVar);
        }
        return 0;
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        int i2;
        if (mVar == x4.m.Ltr) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        if ((i2 & this.f8651b) != 0) {
            return this.f8650a.b(cVar, mVar);
        }
        return 0;
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        int i2;
        if (mVar == x4.m.Ltr) {
            i2 = 8;
        } else {
            i2 = 2;
        }
        if ((i2 & this.f8651b) != 0) {
            return this.f8650a.c(cVar, mVar);
        }
        return 0;
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        if ((this.f8651b & 16) != 0) {
            return this.f8650a.d(cVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (nc.k.a(this.f8650a, y0Var.f8650a) && this.f8651b == y0Var.f8651b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8651b) + (this.f8650a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f8650a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i2 = c.f8508d;
        int i10 = this.f8651b;
        if ((i10 & i2) == i2) {
            c.A(sb4, "Start");
        }
        int i11 = c.f8510f;
        if ((i10 & i11) == i11) {
            c.A(sb4, "Left");
        }
        if ((i10 & 16) == 16) {
            c.A(sb4, "Top");
        }
        int i12 = c.f8509e;
        if ((i10 & i12) == i12) {
            c.A(sb4, "End");
        }
        int i13 = c.f8511g;
        if ((i10 & i13) == i13) {
            c.A(sb4, "Right");
        }
        if ((i10 & 32) == 32) {
            c.A(sb4, "Bottom");
        }
        sb3.append(sb4.toString());
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
