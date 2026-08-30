package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o21  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o21 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ hm3 B;

    public /* synthetic */ o21(hm3 hm3Var, int i) {
        this.A = i;
        this.B = hm3Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        String str;
        int i = this.A;
        o27 o27Var = o27.a;
        hm3 hm3Var = this.B;
        switch (i) {
            case 0:
                rd3 rd3Var = (rd3) obj;
                mr6 d = hm3Var.d();
                if (d != null) {
                    d.c = rd3Var;
                }
                return o27Var;
            case 1:
                tj4 tj4Var = hm3Var.t;
                oq6 oq6Var = (oq6) obj;
                String str2 = oq6Var.a.B;
                to toVar = hm3Var.j;
                if (toVar != null) {
                    str = toVar.B;
                } else {
                    str = null;
                }
                if (!b53.x(str2, str)) {
                    hm3Var.k.setValue(gp2.None);
                    if (((Boolean) tj4Var.getValue()).booleanValue()) {
                        tj4Var.setValue(Boolean.FALSE);
                    } else {
                        hm3Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = vr6.b;
                hm3Var.f(j);
                hm3Var.e(j);
                hm3Var.u.n(oq6Var);
                m55 m55Var = hm3Var.b;
                iv0 iv0Var = m55Var.a;
                if (iv0Var != null) {
                    iv0Var.s(m55Var, null);
                }
                return o27Var;
            case 2:
                hm3Var.r.b(((gx2) obj).a);
                return o27Var;
            case 3:
                return Boolean.valueOf(hm3Var.r.b(((gx2) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                hm3Var.q.setValue(bool);
                return o27Var;
        }
    }
}
