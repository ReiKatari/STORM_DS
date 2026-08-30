package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ym  reason: default package */
/* loaded from: classes.dex */
public final class ym implements bh1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ym(ef1 ef1Var, l34 l34Var, xa6 xa6Var) {
        this.a = 1;
        this.c = ef1Var;
        this.d = l34Var;
        this.b = xa6Var;
    }

    @Override // defpackage.bh1
    public final void dispose() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((xa6) obj3).remove(obj2);
                ((mn) obj).d.k(obj2);
                return;
            case 1:
                l34 l34Var = (l34) obj;
                ((ef1) obj2).b().c(l34Var);
                ((xa6) obj3).remove(l34Var);
                return;
            case 2:
                ((fn3) obj3).getLifecycle().c((bn3) obj2);
                ry ryVar = (ry) ((n75) obj).A;
                if (ryVar != null) {
                    ryVar.a();
                    return;
                }
                return;
            case 3:
                Map map = (Map) obj3;
                String str = (String) obj2;
                if (b53.x(map.get(str), (wc2) obj)) {
                    map.remove(str);
                    return;
                }
                return;
            default:
                kt5 kt5Var = (kt5) obj3;
                ot5 ot5Var = (ot5) obj;
                if (kt5Var.B.k(obj2) == ot5Var) {
                    Map map2 = kt5Var.A;
                    Map d = ot5Var.d();
                    if (d.isEmpty()) {
                        map2.remove(obj2);
                        return;
                    } else {
                        map2.put(obj2, d);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ ym(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
