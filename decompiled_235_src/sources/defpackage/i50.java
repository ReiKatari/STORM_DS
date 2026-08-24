package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i50  reason: default package */
/* loaded from: classes.dex */
public final class i50 {
    public final /* synthetic */ int a;

    public /* synthetic */ i50(int i) {
        this.a = i;
    }

    public final Object a(d14 d14Var, ng3 ng3Var) {
        switch (this.a) {
            case 0:
                return new h50(d14Var.a, 0);
            case 1:
                return new is0(d14Var.a);
            case 2:
                return new js0(d14Var.a, 0);
            case 3:
                return new qt1(0);
            case 4:
                return new bx2(d14Var.a, ((Integer) u24.g.a(ng3Var)).intValue());
            case 5:
                f14 f14Var = d14Var.a;
                String str = (String) mb3.s.a(ng3Var);
                nb3 nb3Var = d14Var.b;
                w31 w31Var = d14Var.f;
                h45 h45Var = mb3.u;
                HashMap hashMap = ng3Var.A;
                if (hashMap.get(h45Var) == null) {
                    vv vvVar = new vv(str, nb3Var, w31Var);
                    h45 h45Var2 = mb3.t;
                    Object obj = Boolean.FALSE;
                    Object obj2 = hashMap.get(h45Var2);
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    return new xv(f14Var, vvVar, ((Boolean) obj).booleanValue());
                }
                u34.a();
                return null;
            case 6:
                return new uv3(d14Var.a, (String) u24.h.a(ng3Var), d14Var.d);
            case 7:
                f14 f14Var2 = d14Var.a;
                if (n51.BULLET == u24.d.a(ng3Var)) {
                    return new i90(f14Var2, ((Integer) u24.e.a(ng3Var)).intValue());
                }
                return new io4(f14Var2, String.valueOf(u24.f.a(ng3Var)).concat(". "));
            case 8:
                return new qt1(1);
            default:
                return new h50(d14Var.a, 1);
        }
    }
}
