package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ye0  reason: default package */
/* loaded from: classes.dex */
public interface ye0 {
    static jg1 e(vf0 vf0Var, oa oaVar, qb qbVar, xz xzVar, List list, List list2, List list3, int i) {
        oa oaVar2;
        qb qbVar2;
        xz xzVar2;
        List list4;
        List list5;
        List list6;
        if ((i & 1) != 0) {
            oaVar2 = null;
        } else {
            oaVar2 = oaVar;
        }
        if ((i & 2) != 0) {
            qbVar2 = null;
        } else {
            qbVar2 = qbVar;
        }
        if ((i & 4) != 0) {
            xzVar2 = null;
        } else {
            xzVar2 = xzVar;
        }
        if ((i & 8) != 0) {
            list4 = null;
        } else {
            list4 = list;
        }
        if ((i & 16) != 0) {
            list5 = null;
        } else {
            list5 = list2;
        }
        if ((i & 32) != 0) {
            list6 = null;
        } else {
            list6 = list3;
        }
        if (!vf0Var.A.a()) {
            return t41.a(vf0Var.L, oaVar2, qbVar2, xzVar2, null, list4, list5, list6, 8);
        }
        e41.g(vf0Var, " after close.", "Cannot call update3A on ");
        return null;
    }
}
