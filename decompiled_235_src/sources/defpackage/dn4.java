package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dn4  reason: default package */
/* loaded from: classes.dex */
public final class dn4 extends ao4 {
    public static final dn4 d = new ao4(0, 1, 1);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        ua4 ua4Var;
        cf5 cf5Var = (cf5) ls0Var.g(0);
        ja4 ja4Var = (ja4) jb1Var.i;
        if (ja4Var != null && ((uu4) ja4Var.g(cf5Var)) != null) {
            ArrayList arrayList = (ArrayList) jb1Var.j;
            if (arrayList != null && (ua4Var = (ua4) arrayList.remove(arrayList.size() - 1)) != null) {
                jb1Var.e = ua4Var;
            }
            ja4Var.k(cf5Var);
        }
    }
}
