package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iq6  reason: default package */
/* loaded from: classes.dex */
public final class iq6 {
    public sd3 a;
    public od1 b;
    public od2 c;
    public ds6 d;
    public Object e;
    public final tj4 f = me2.G(Boolean.TRUE);
    public long g;

    public iq6(sd3 sd3Var, od1 od1Var, od2 od2Var, ds6 ds6Var, Object obj) {
        long a;
        this.a = sd3Var;
        this.b = od1Var;
        this.c = od2Var;
        this.d = ds6Var;
        this.e = obj;
        a = zo6.a(this.d, this.b, this.c, zo6.a, 1);
        this.g = a;
    }

    public static void a(iq6 iq6Var, sd3 sd3Var, od1 od1Var, ds6 ds6Var, int i) {
        if ((i & 1) != 0) {
            sd3Var = iq6Var.a;
        }
        if ((i & 2) != 0) {
            od1Var = iq6Var.b;
        }
        od2 od2Var = iq6Var.c;
        if ((i & 8) != 0) {
            ds6Var = iq6Var.d;
        }
        Object obj = iq6Var.e;
        sd3 sd3Var2 = iq6Var.a;
        tj4 tj4Var = iq6Var.f;
        if (sd3Var == sd3Var2 && b53.x(od1Var, iq6Var.b) && b53.x(od2Var, iq6Var.c) && b53.x(ds6Var, iq6Var.d)) {
            if (!b53.x(obj, iq6Var.e)) {
                iq6Var.e = obj;
                tj4Var.setValue(Boolean.TRUE);
                return;
            }
            return;
        }
        iq6Var.a = sd3Var;
        iq6Var.b = od1Var;
        iq6Var.c = od2Var;
        iq6Var.d = ds6Var;
        tj4Var.setValue(Boolean.TRUE);
    }
}
