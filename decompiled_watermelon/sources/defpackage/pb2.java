package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pb2  reason: default package */
/* loaded from: classes.dex */
public final class pb2 {
    public final lb2 a;
    public mv3 b;
    public yn4 c;
    public mv3 d;
    public yn4 e;
    public v23 f;
    public v23 g;

    public pb2(lb2 lb2Var) {
        this.a = lb2Var;
    }

    public final v23 a(int i, boolean z, int i2) {
        int i3 = ob2.a[this.a.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    if (z) {
                        return this.f;
                    }
                    if (i + 1 >= 0 && i2 >= 0) {
                        return this.g;
                    }
                    return null;
                }
                i.c();
                return null;
            } else if (z) {
                return this.f;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void b(mv3 mv3Var, mv3 mv3Var2, long j) {
        long h = hk2.h(j, kg3.Horizontal);
        if (mv3Var != null) {
            int T = mv3Var.T(lz0.g(h));
            this.f = new v23(v23.a(T, mv3Var.g0(T)));
            this.b = mv3Var;
            this.c = null;
        }
        if (mv3Var2 != null) {
            int T2 = mv3Var2.T(lz0.g(h));
            this.g = new v23(v23.a(T2, mv3Var2.g0(T2)));
            this.d = mv3Var2;
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pb2) && this.a == ((pb2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + wh1.a(0, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
