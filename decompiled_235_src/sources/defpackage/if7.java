package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if7  reason: default package */
/* loaded from: classes.dex */
public final class if7 extends hw6 implements io2 {
    public /* synthetic */ my4 X;
    public /* synthetic */ d83 Y;
    public /* synthetic */ ko4 Z;
    public /* synthetic */ List d0;
    public /* synthetic */ ok3 e0;

    public if7(r41 r41Var) {
        super(6, r41Var);
    }

    @Override // defpackage.io2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if7 if7Var = new if7((r41) obj6);
        if7Var.X = (my4) obj;
        if7Var.Y = (d83) obj2;
        if7Var.Z = (ko4) obj3;
        if7Var.d0 = (List) obj4;
        if7Var.e0 = (ok3) obj5;
        return if7Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        ok3 ok3Var;
        my4 my4Var = this.X;
        d83 d83Var = this.Y;
        ko4 ko4Var = this.Z;
        List list = this.d0;
        ok3 ok3Var2 = this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        if (ok3Var2 == null) {
            if (my4Var != null) {
                ok3Var2 = new ok3(new mk3(0, lk3.BUILT_IN, my4Var.a, my4Var.b), null);
            } else {
                ok3Var = null;
                if (my4Var != null || ko4Var == null || ok3Var == null) {
                    return null;
                }
                return new jf7(my4Var, d83Var, ko4Var, list, ok3Var);
            }
        }
        ok3Var = ok3Var2;
        if (my4Var != null) {
        }
        return null;
    }
}
