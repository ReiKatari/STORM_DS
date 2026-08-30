package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k30  reason: default package */
/* loaded from: classes.dex */
public final class k30 {
    public final /* synthetic */ int a;

    public /* synthetic */ k30(int i) {
        this.a = i;
    }

    public final Object a(au3 au3Var, u93 u93Var) {
        switch (this.a) {
            case 0:
                return new j30(au3Var.a, 0);
            case 1:
                return new vp0(au3Var.a);
            case 2:
                return new wp0(0, au3Var.a);
            case 3:
                return new hp1(0);
            case 4:
                return new ar2(au3Var.a, ((Integer) n40.g.a(u93Var)).intValue());
            case 5:
                cu3 cu3Var = au3Var.a;
                String str = (String) l.g.a(u93Var);
                pu puVar = au3Var.b;
                vn1 vn1Var = au3Var.f;
                av4 av4Var = l.i;
                HashMap hashMap = u93Var.a;
                if (hashMap.get(av4Var) == null) {
                    dv dvVar = new dv(str, puVar, vn1Var);
                    av4 av4Var2 = l.h;
                    Object obj = Boolean.FALSE;
                    Object obj2 = hashMap.get(av4Var2);
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    return new fv(cu3Var, dvVar, ((Boolean) obj).booleanValue());
                }
                c44.b();
                return null;
            case ig7.b /* 6 */:
                return new so3(au3Var.a, (String) n40.h.a(u93Var), au3Var.d);
            case 7:
                cu3 cu3Var2 = au3Var.a;
                if (f21.BULLET == n40.d.a(u93Var)) {
                    return new d70(cu3Var2, ((Integer) n40.e.a(u93Var)).intValue());
                }
                return new gf4(cu3Var2, String.valueOf(n40.f.a(u93Var)).concat(". "));
            case 8:
                return new hp1(1);
            default:
                return new j30(au3Var.a, 1);
        }
    }
}
