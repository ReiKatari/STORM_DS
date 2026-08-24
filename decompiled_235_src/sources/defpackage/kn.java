package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn  reason: default package */
/* loaded from: classes.dex */
public final class kn implements fl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public kn(ij1 ij1Var, sb4 sb4Var, mm6 mm6Var) {
        this.a = 1;
        this.c = ij1Var;
        this.d = sb4Var;
        this.b = mm6Var;
    }

    @Override // defpackage.fl1
    public final void dispose() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((mm6) obj3).remove(obj2);
                ((yn) obj).d.k(obj2);
                return;
            case 1:
                sb4 sb4Var = (sb4) obj;
                ((ij1) obj2).b().c(sb4Var);
                ((mm6) obj3).remove(sb4Var);
                return;
            case 2:
                ((hu3) obj3).getLifecycle().c((du3) obj2);
                i00 i00Var = (i00) ((dh5) obj).A;
                if (i00Var != null) {
                    i00Var.a();
                    return;
                }
                return;
            case 3:
                Map map = (Map) obj3;
                String str = (String) obj2;
                if (nb3.k(map.get(str), (nh2) obj)) {
                    map.remove(str);
                    return;
                }
                return;
            default:
                p46 p46Var = (p46) obj3;
                u46 u46Var = (u46) obj;
                if (p46Var.B.k(obj2) == u46Var) {
                    Map map2 = p46Var.A;
                    Map d = u46Var.d();
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

    public /* synthetic */ kn(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
