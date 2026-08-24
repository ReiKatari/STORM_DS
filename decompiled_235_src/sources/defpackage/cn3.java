package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn3  reason: default package */
/* loaded from: classes.dex */
public final class cn3 extends pm3 {
    public final /* synthetic */ gn3 b;
    public final /* synthetic */ eo2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn3(gn3 gn3Var, eo2 eo2Var, String str) {
        super(str);
        this.b = gn3Var;
        this.c = eo2Var;
    }

    @Override // defpackage.e34
    public final f34 d(g34 g34Var, List list, long j) {
        gn3 gn3Var = this.b;
        an3 an3Var = gn3Var.d0;
        an3Var.A = g34Var.getLayoutDirection();
        an3Var.B = g34Var.a();
        an3Var.L = g34Var.Y();
        boolean a0 = g34Var.a0();
        eo2 eo2Var = this.c;
        if (!a0 && gn3Var.A.e0 != null) {
            gn3Var.X = 0;
            f34 f34Var = (f34) eo2Var.o(gn3Var.e0, new q21(j));
            return new bn3(f34Var, gn3Var, gn3Var.X, f34Var, 0);
        }
        gn3Var.R = 0;
        f34 f34Var2 = (f34) eo2Var.o(an3Var, new q21(j));
        return new bn3(f34Var2, gn3Var, gn3Var.R, f34Var2, 1);
    }
}
