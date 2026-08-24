package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mo5  reason: default package */
/* loaded from: classes.dex */
public final class mo5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ qv5 Z;
    public final /* synthetic */ String d0;
    public final /* synthetic */ String e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo5(qv5 qv5Var, String str, String str2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = qv5Var;
        this.d0 = str;
        this.e0 = str2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((mo5) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((mo5) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((mo5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((mo5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new mo5(this.Z, this.d0, this.e0, r41Var, 0);
            case 1:
                return new mo5(this.Z, this.d0, this.e0, r41Var, 1);
            case 2:
                return new mo5(this.Z, this.d0, this.e0, r41Var, 2);
            default:
                return new mo5(this.Z, this.d0, this.e0, r41Var, 3);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object v;
        Object e;
        int i = this.X;
        String str = this.e0;
        String str2 = this.d0;
        qv5 qv5Var = this.Z;
        boolean z = true;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        v = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = qv5Var.b;
                    this.Y = 1;
                    v = ((pl) pn5Var).v(str2, str, this);
                    if (v == x61Var) {
                        return x61Var;
                    }
                }
                if (!(v instanceof em5)) {
                    qv5Var.m();
                } else {
                    tp6 tp6Var = qv5Var.d;
                    tp6Var.getClass();
                    tp6Var.m(null, h06.a);
                }
                return jg7.a;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                boolean z2 = false;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        ck4 ck4Var = qv5Var.k;
                        this.Y = 1;
                        obj = ck4Var.b(str2, str, this);
                        if (obj == x61Var2) {
                            return x61Var2;
                        }
                    }
                    if (obj == null) {
                        z = false;
                    }
                    z2 = z;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z2);
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                oj4 oj4Var = qv5Var.j;
                this.Y = 1;
                Object g = oj4Var.g(str2, str, this);
                if (g == x61Var3) {
                    return x61Var3;
                }
                return g;
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        e = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    vk6 vk6Var = qv5Var.l;
                    this.Y = 1;
                    e = vk6Var.e(str2, str, this);
                    if (e == x61Var4) {
                        return x61Var4;
                    }
                }
                return new hm5(e);
        }
    }
}
