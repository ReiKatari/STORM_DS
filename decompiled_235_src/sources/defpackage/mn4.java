package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn4  reason: default package */
/* loaded from: classes.dex */
public final class mn4 extends ao4 {
    public static final mn4 d = new ao4(0, 1, 1);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        cf5 cf5Var = (cf5) ls0Var.g(0);
        Set set = (Set) jb1Var.a;
        if (set == null) {
            return;
        }
        uu4 uu4Var = new uu4(set);
        ja4 ja4Var = (ja4) jb1Var.i;
        if (ja4Var == null) {
            long[] jArr = b66.a;
            ja4Var = new ja4();
            jb1Var.i = ja4Var;
        }
        ja4Var.m(cf5Var, uu4Var);
        ((ua4) jb1Var.e).b(new br2(uu4Var, -1));
    }
}
