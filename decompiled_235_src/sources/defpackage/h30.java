package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h30  reason: default package */
/* loaded from: classes.dex */
public final class h30 implements u07 {
    public final zv0 a;
    public final db4 b = new db4();
    public final vs4 c = np2.Y(null);

    public h30(zv0 zv0Var) {
        this.a = zv0Var;
    }

    @Override // defpackage.u07
    public final Object a(m07 m07Var, hw6 hw6Var) {
        Object b = db4.b(this.b, new yc(this, new g30(m07Var), null, 2), hw6Var);
        if (b == x61.COROUTINE_SUSPENDED) {
            return b;
        }
        return jg7.a;
    }

    public final void b(final on2 on2Var, px0 px0Var, final int i) {
        int i2;
        boolean z;
        final on2 on2Var2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(723898654);
        if (xq2Var.f(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            g30 g30Var = (g30) this.c.getValue();
            if (g30Var == null) {
                cf5 t = xq2Var.t();
                if (t != null) {
                    t.d = new eo2(this, on2Var, i, 0) { // from class: f30
                        public final /* synthetic */ int A;
                        public final /* synthetic */ h30 B;
                        public final /* synthetic */ on2 L;

                        {
                            this.A = r4;
                            this.B = this;
                        }

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            int i4 = this.A;
                            jg7 jg7Var = jg7.a;
                            on2 on2Var3 = this.L;
                            h30 h30Var = this.B;
                            px0 px0Var2 = (px0) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    h30Var.b(on2Var3, px0Var2, ii2.a0(7));
                                    return jg7Var;
                                default:
                                    h30Var.b(on2Var3, px0Var2, ii2.a0(7));
                                    return jg7Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            on2Var2 = on2Var;
            this.a.p(g30Var, g30Var.a, on2Var2, xq2Var, Integer.valueOf((int) RendererDebugBridge.CAPTURE_HEIGHT));
        } else {
            on2Var2 = on2Var;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2(this, on2Var2, i, 1) { // from class: f30
                public final /* synthetic */ int A;
                public final /* synthetic */ h30 B;
                public final /* synthetic */ on2 L;

                {
                    this.A = r4;
                    this.B = this;
                }

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    int i4 = this.A;
                    jg7 jg7Var = jg7.a;
                    on2 on2Var3 = this.L;
                    h30 h30Var = this.B;
                    px0 px0Var2 = (px0) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            h30Var.b(on2Var3, px0Var2, ii2.a0(7));
                            return jg7Var;
                        default:
                            h30Var.b(on2Var3, px0Var2, ii2.a0(7));
                            return jg7Var;
                    }
                }
            };
        }
    }
}
