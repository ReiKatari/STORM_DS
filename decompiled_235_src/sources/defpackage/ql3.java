package defpackage;

import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql3  reason: default package */
/* loaded from: classes.dex */
public final class ql3 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ yl3 B;

    public /* synthetic */ ql3(yl3 yl3Var, int i) {
        this.A = i;
        this.B = yl3Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        yl3 yl3Var = this.B;
        switch (i) {
            case 0:
                fk3 fk3Var = (fk3) obj;
                ci0 ci0Var = yl3Var.d;
                ci0Var.getClass();
                fk3Var.getClass();
                tp6 tp6Var = (tp6) ci0Var.g;
                tp6Var.getClass();
                tp6Var.m(null, fk3Var);
                return jg7Var;
            case 1:
                vr4 vr4Var = (vr4) obj;
                tp6 tp6Var2 = yl3Var.o;
                if (vr4Var == null) {
                    tp6Var2.l(null);
                } else {
                    jf7 jf7Var = (jf7) vr4Var.A;
                    ff7 ff7Var = (ff7) vr4Var.B;
                    fk3 fk3Var2 = (fk3) yl3Var.i.getValue();
                    if (fk3Var2 != null) {
                        yl3Var.h = jf7Var;
                        w71 w71Var = new w71(ff7Var, fk3Var2.d);
                        tp6Var2.getClass();
                        tp6Var2.m(null, w71Var);
                    }
                }
                return jg7Var;
            case 2:
                w71 w71Var2 = (w71) obj;
                if (w71Var2 != null) {
                    z66 z66Var = w71Var2.a.a;
                    yl3.e(yl3Var, z66Var.a, z66Var.b);
                } else {
                    yl3.e(yl3Var, null, BackgroundMode.FIT_CENTER);
                }
                return jg7Var;
            default:
                w71 w71Var3 = (w71) obj;
                if (w71Var3 != null) {
                    z66 z66Var2 = w71Var3.a.b;
                    yl3.f(yl3Var, z66Var2.a, z66Var2.b);
                } else {
                    yl3.f(yl3Var, null, BackgroundMode.FIT_CENTER);
                }
                return jg7Var;
        }
    }
}
