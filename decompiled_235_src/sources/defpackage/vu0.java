package defpackage;

import java.lang.reflect.Type;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu0  reason: default package */
/* loaded from: classes.dex */
public final class vu0 implements ib0 {
    public final /* synthetic */ int A;
    public final Type B;

    public /* synthetic */ vu0(int i, Type type) {
        this.A = i;
        this.B = type;
    }

    @Override // defpackage.ib0
    public final Type a() {
        int i = this.A;
        return this.B;
    }

    @Override // defpackage.ib0
    public final Object b(vk4 vk4Var) {
        switch (this.A) {
            case 0:
                wu0 wu0Var = new wu0(vk4Var);
                vk4Var.h(new uu0(wu0Var, 0));
                return wu0Var;
            default:
                wu0 wu0Var2 = new wu0(vk4Var);
                vk4Var.h(new uu0(wu0Var2, 1));
                return wu0Var2;
        }
    }
}
