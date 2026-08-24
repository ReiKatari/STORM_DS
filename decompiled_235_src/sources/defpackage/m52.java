package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m52  reason: default package */
/* loaded from: classes.dex */
public final class m52 extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ n52 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m52(n52 n52Var, int i) {
        super(1);
        this.B = i;
        this.L = n52Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        n52 n52Var = this.L;
        switch (i) {
            case 0:
                aa7 aa7Var = (aa7) obj;
                z42 z42Var = z42.PreEnter;
                z42 z42Var2 = z42.Visible;
                Object obj2 = null;
                if (aa7Var.b(z42Var, z42Var2)) {
                    sl0 sl0Var = n52Var.p0.a.c;
                    if (sl0Var != null) {
                        obj2 = sl0Var.c;
                    }
                } else if (aa7Var.b(z42Var2, z42.PostExit)) {
                    sl0 sl0Var2 = n52Var.q0.a.c;
                    if (sl0Var2 != null) {
                        obj2 = sl0Var2.c;
                    }
                } else {
                    obj2 = i52.d;
                }
                if (obj2 == null) {
                    return i52.d;
                }
                return obj2;
            default:
                aa7 aa7Var2 = (aa7) obj;
                z42 z42Var3 = z42.PreEnter;
                z42 z42Var4 = z42.Visible;
                if (aa7Var2.b(z42Var3, z42Var4)) {
                    pj6 pj6Var = n52Var.p0.a.b;
                    if (pj6Var != null) {
                        return pj6Var.b;
                    }
                    return i52.c;
                } else if (aa7Var2.b(z42Var4, z42.PostExit)) {
                    pj6 pj6Var2 = n52Var.q0.a.b;
                    if (pj6Var2 != null) {
                        return pj6Var2.b;
                    }
                    return i52.c;
                } else {
                    return i52.c;
                }
        }
    }
}
