package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw0  reason: default package */
/* loaded from: classes.dex */
public final class zw0 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw0(Object obj, r41 r41Var, int i) {
        super(3, r41Var);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        ne2 ne2Var = (ne2) obj;
        Throwable th = (Throwable) obj2;
        r41 r41Var = (r41) obj3;
        switch (i) {
            case 0:
                new zw0((zg5) this.Y, r41Var, 0).s(jg7Var);
                return jg7Var;
            case 1:
                new zw0((ci0) this.Y, r41Var, 1).s(jg7Var);
                return jg7Var;
            default:
                zw0 zw0Var = new zw0(3, r41Var);
                zw0Var.Y = th;
                zw0Var.s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((zg5) this.Y).A = true;
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ci0 ci0Var = (ci0) this.Y;
                tp6 tp6Var = (tp6) ci0Var.g;
                tp6Var.getClass();
                tp6Var.m(null, yt1.A);
                v80 v80Var = (v80) ci0Var.f;
                if (v80Var != null) {
                    v80Var.h(null);
                }
                ci0Var.f = null;
                return jg7Var;
            default:
                Throwable th = (Throwable) this.Y;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (th instanceof c67) {
                    return jg7Var;
                }
                throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw0(int i, r41 r41Var) {
        super(i, r41Var);
        this.X = 2;
    }
}
