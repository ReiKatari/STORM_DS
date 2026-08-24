package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n5  reason: default package */
/* loaded from: classes.dex */
public final class n5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ qa4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(List list, qa4 qa4Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = list;
        this.Z = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                ((n5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            default:
                ((n5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new n5(this.Y, this.Z, r41Var, 0);
            default:
                return new n5(this.Y, this.Z, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.Z;
        List list = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (!list.contains((l6) qa4Var.getValue())) {
                    qa4Var.setValue(l6.All);
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (!list.contains((g6) qa4Var.getValue())) {
                    qa4Var.setValue(g6.All);
                }
                return jg7Var;
        }
    }
}
