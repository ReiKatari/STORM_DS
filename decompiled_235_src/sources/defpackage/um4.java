package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um4  reason: default package */
/* loaded from: classes.dex */
public final class um4 extends ao4 {
    public static final um4 d = new ao4(0, 2, 1);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        int i;
        ap3 ap3Var;
        n93 n93Var = (n93) ls0Var.g(1);
        if (n93Var != null) {
            i = n93Var.a;
        } else {
            i = 0;
        }
        rl0 rl0Var = (rl0) ls0Var.g(0);
        if (i > 0) {
            ntVar = new r90(ntVar, i);
        }
        if (bo4Var != null) {
            ap3Var = new ap3(13, bo4Var, pk6Var);
        } else {
            ap3Var = null;
        }
        rl0Var.Z(ntVar, pk6Var, jb1Var, ap3Var);
    }
}
