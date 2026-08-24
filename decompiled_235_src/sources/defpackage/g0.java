package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g0  reason: default package */
/* loaded from: classes.dex */
public final class g0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ h0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(h0 h0Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = h0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                ((g0) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            default:
                ((g0) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        h0 h0Var = this.Y;
        switch (i) {
            case 0:
                return new g0(h0Var, r41Var, 0);
            default:
                return new g0(h0Var, r41Var, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [oy2, java.lang.Object] */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        h0 h0Var = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (h0Var.y0 == null) {
                    ?? obj2 = new Object();
                    r94 r94Var = h0Var.m0;
                    if (r94Var != null) {
                        hv.L(h0Var.F0(), null, null, new z(r94Var, obj2, null, 0), 3);
                    }
                    h0Var.y0 = obj2;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                oy2 oy2Var = h0Var.y0;
                if (oy2Var != null) {
                    py2 py2Var = new py2(oy2Var);
                    r94 r94Var2 = h0Var.m0;
                    if (r94Var2 != null) {
                        hv.L(h0Var.F0(), null, null, new z(r94Var2, py2Var, null, 1), 3);
                    }
                    h0Var.y0 = null;
                }
                return jg7Var;
        }
    }
}
