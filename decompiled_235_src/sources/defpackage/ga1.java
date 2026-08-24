package defpackage;

import java.util.List;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ga1  reason: default package */
/* loaded from: classes.dex */
public final class ga1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ la1 Z;
    public final /* synthetic */ DSiWareTitle d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga1(la1 la1Var, DSiWareTitle dSiWareTitle, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = la1Var;
        this.d0 = dSiWareTitle;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ga1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ga1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new ga1(this.Z, this.d0, r41Var, 0);
            default:
                return new ga1(this.Z, this.d0, r41Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r10.c(r2, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r10 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        DSiWareTitle dSiWareTitle = this.d0;
        la1 la1Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            tp6 tp6Var = la1Var.g;
                            ea1 ea1Var = new ea1((List) obj);
                            tp6Var.getClass();
                            tp6Var.m(null, ea1Var);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    fg fgVar = la1Var.b;
                    this.Y = 1;
                    break;
                }
                fg fgVar2 = la1Var.b;
                this.Y = 2;
                obj = fgVar2.h(this);
                break;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                xe1 xe1Var = xk1.a;
                ga1 ga1Var = new ga1(la1Var, dSiWareTitle, null, 0);
                this.Y = 1;
                if (hv.d0(xe1Var, ga1Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
