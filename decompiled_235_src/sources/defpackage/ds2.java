package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds2  reason: default package */
/* loaded from: classes.dex */
public final class ds2 {
    public static final ds2 a = new Object();

    public final cs2 a(List list, bm7 bm7Var, fs2 fs2Var, bm7 bm7Var2) {
        Object next;
        list.getClass();
        bm7Var.getClass();
        fs2Var.getClass();
        oc2 oc2Var = new oc2(sb6.b0(new pc2(new pc2(new pc2(new ev(list, 1), true, new a0(1, this, ds2.class, "belongsToConfiguredRepository", "belongsToConfiguredRepository(Lme/magnum/melonds/github/dtos/ReleaseDto;)Z", 0, 0, 15)), false, new bz1(20)), true, new bg2(fs2Var, 2)), new bi2(5, bm7Var, bm7Var2)));
        if (!oc2Var.hasNext()) {
            next = null;
        } else {
            next = oc2Var.next();
            while (oc2Var.hasNext()) {
                Object next2 = oc2Var.next();
                cs2 cs2Var = (cs2) next;
                cs2 cs2Var2 = (cs2) next2;
                int z = g04.z(cs2Var.c, cs2Var2.c);
                if (z == 0) {
                    z = g04.z(cs2Var.d, cs2Var2.d);
                }
                if (z < 0) {
                    next = next2;
                }
            }
        }
        return (cs2) next;
    }
}
