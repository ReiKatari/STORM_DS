package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sa1  reason: default package */
/* loaded from: classes.dex */
public final class sa1 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(jk3 jk3Var, boolean z) {
        if (z) {
            return ((kk3) tq0.T0(jk3Var.k)).a + 1;
        }
        return ((kk3) tq0.K0(jk3Var.k)).a - 1;
    }

    public static int b(yh3 yh3Var, boolean z) {
        int i;
        int i2;
        if (z) {
            zh3 zh3Var = (zh3) tq0.T0(yh3Var.m);
            if (yh3Var.q == jf4.Vertical) {
                i2 = zh3Var.p;
            } else {
                i2 = zh3Var.q;
            }
            return i2 + 1;
        }
        zh3 zh3Var2 = (zh3) tq0.K0(yh3Var.m);
        if (yh3Var.q == jf4.Vertical) {
            i = zh3Var2.p;
        } else {
            i = zh3Var2.q;
        }
        return i - 1;
    }
}
