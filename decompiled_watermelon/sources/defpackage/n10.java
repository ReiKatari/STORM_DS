package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n10  reason: default package */
/* loaded from: classes.dex */
public final class n10 implements jo6 {
    public final et0 a;
    public final x24 b = new x24();
    public final tj4 c = me2.G(null);

    public n10(et0 et0Var) {
        this.a = et0Var;
    }

    @Override // defpackage.jo6
    public final Object a(ao6 ao6Var, nk6 nk6Var) {
        Object b = x24.b(this.b, new kc(this, new m10(ao6Var), null, 2), nk6Var);
        if (b == p31.COROUTINE_SUSPENDED) {
            return b;
        }
        return o27.a;
    }

    public final void b(final ki2 ki2Var, tu0 tu0Var, final int i) {
        int i2;
        boolean z;
        final ki2 ki2Var2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(723898654);
        if (sk2Var.f(this)) {
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
        if (sk2Var.O(i3 & 1, z)) {
            m10 m10Var = (m10) this.c.getValue();
            if (m10Var == null) {
                m55 r = sk2Var.r();
                if (r != null) {
                    r.d = new aj2(this, ki2Var, i, 0) { // from class: l10
                        public final /* synthetic */ int A;
                        public final /* synthetic */ n10 B;
                        public final /* synthetic */ ki2 L;

                        {
                            this.A = r4;
                            this.B = this;
                        }

                        @Override // defpackage.aj2
                        public final Object j(Object obj, Object obj2) {
                            int i4 = this.A;
                            o27 o27Var = o27.a;
                            ki2 ki2Var3 = this.L;
                            n10 n10Var = this.B;
                            tu0 tu0Var2 = (tu0) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    n10Var.b(ki2Var3, tu0Var2, ep2.I(7));
                                    return o27Var;
                                default:
                                    n10Var.b(ki2Var3, tu0Var2, ep2.I(7));
                                    return o27Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            ki2Var2 = ki2Var;
            this.a.o(m10Var, m10Var.a, ki2Var2, sk2Var, Integer.valueOf((int) RendererDebugBridge.CAPTURE_HEIGHT));
        } else {
            ki2Var2 = ki2Var;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2(this, ki2Var2, i, 1) { // from class: l10
                public final /* synthetic */ int A;
                public final /* synthetic */ n10 B;
                public final /* synthetic */ ki2 L;

                {
                    this.A = r4;
                    this.B = this;
                }

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    int i4 = this.A;
                    o27 o27Var = o27.a;
                    ki2 ki2Var3 = this.L;
                    n10 n10Var = this.B;
                    tu0 tu0Var2 = (tu0) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            n10Var.b(ki2Var3, tu0Var2, ep2.I(7));
                            return o27Var;
                        default:
                            n10Var.b(ki2Var3, tu0Var2, ep2.I(7));
                            return o27Var;
                    }
                }
            };
        }
    }
}
