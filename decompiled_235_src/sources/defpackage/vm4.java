package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vm4  reason: default package */
/* loaded from: classes.dex */
public final class vm4 extends ao4 {
    public static final vm4 d = new ao4(0, 2, 1);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        int i = ((n93) ls0Var.g(0)).a;
        List list = (List) ls0Var.g(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            ntVar.c(i3, obj);
            ntVar.k(i3, obj);
        }
    }
}
