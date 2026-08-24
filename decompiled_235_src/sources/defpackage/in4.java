package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: in4  reason: default package */
/* loaded from: classes.dex */
public final class in4 extends ao4 {
    public static final in4 d = new ao4(0, 3, 1);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        ap3 ap3Var;
        mk6 mk6Var = (mk6) ls0Var.g(1);
        sq2 sq2Var = (sq2) ls0Var.g(0);
        ld2 ld2Var = (ld2) ls0Var.g(2);
        pk6 d2 = mk6Var.d();
        if (bo4Var != null) {
            try {
                ap3Var = new ap3(13, bo4Var, pk6Var);
            } catch (Throwable th) {
                d2.e(false);
                throw th;
            }
        } else {
            ap3Var = null;
        }
        if (!ld2Var.d.g0()) {
            tx0.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        ld2Var.c.f0(ntVar, d2, jb1Var, ap3Var);
        d2.e(true);
        pk6Var.d();
        sq2Var.getClass();
        pk6Var.A(mk6Var, mk6Var.a(sq2Var));
        pk6Var.k();
    }
}
