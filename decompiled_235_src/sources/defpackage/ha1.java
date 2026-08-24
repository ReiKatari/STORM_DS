package defpackage;

import android.net.Uri;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha1  reason: default package */
/* loaded from: classes.dex */
public final class ha1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ la1 Z;
    public final /* synthetic */ DSiWareTitle d0;
    public final /* synthetic */ bb1 e0;
    public final /* synthetic */ Uri f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha1(la1 la1Var, DSiWareTitle dSiWareTitle, bb1 bb1Var, Uri uri, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = la1Var;
        this.d0 = dSiWareTitle;
        this.e0 = bb1Var;
        this.f0 = uri;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ha1) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((ha1) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((ha1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ha1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new ha1(this.Z, this.d0, this.e0, this.f0, r41Var, 0);
            case 1:
                return new ha1(this.Z, this.d0, this.e0, this.f0, r41Var, 1);
            case 2:
                return new ha1(this.Z, this.d0, this.e0, this.f0, r41Var, 2);
            default:
                return new ha1(this.Z, this.d0, this.e0, this.f0, r41Var, 3);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object e;
        Object g;
        int i = this.X;
        Uri uri = this.f0;
        DSiWareTitle dSiWareTitle = this.d0;
        la1 la1Var = this.Z;
        bb1 bb1Var = this.e0;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        e = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    fg fgVar = la1Var.b;
                    this.Y = 1;
                    e = fgVar.e(dSiWareTitle, bb1Var, uri, this);
                    if (e == x61Var) {
                        return x61Var;
                    }
                }
                if (((Boolean) e).booleanValue()) {
                    la1Var.m.k(new v33(bb1Var.getFileName()));
                } else {
                    la1Var.m.k(u33.a);
                }
                tp6 tp6Var = la1Var.i;
                Boolean bool = Boolean.FALSE;
                tp6Var.getClass();
                tp6Var.m(null, bool);
                return jg7Var;
            case 1:
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
                ha1 ha1Var = new ha1(this.Z, this.d0, this.e0, this.f0, null, 0);
                this.Y = 1;
                if (hv.d0(xe1Var, ha1Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        g = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    fg fgVar2 = la1Var.b;
                    this.Y = 1;
                    g = fgVar2.g(dSiWareTitle, bb1Var, uri, this);
                    if (g == x61Var3) {
                        return x61Var3;
                    }
                }
                if (((Boolean) g).booleanValue()) {
                    la1Var.m.k(new x33(bb1Var.getFileName()));
                } else {
                    la1Var.m.k(w33.a);
                }
                tp6 tp6Var2 = la1Var.i;
                Boolean bool2 = Boolean.FALSE;
                tp6Var2.getClass();
                tp6Var2.m(null, bool2);
                return jg7Var;
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                xe1 xe1Var2 = xk1.a;
                ha1 ha1Var2 = new ha1(this.Z, this.d0, this.e0, this.f0, null, 2);
                this.Y = 1;
                if (hv.d0(xe1Var2, ha1Var2, this) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var;
        }
    }
}
