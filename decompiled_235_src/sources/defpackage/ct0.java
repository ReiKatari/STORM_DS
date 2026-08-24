package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct0  reason: default package */
/* loaded from: classes.dex */
public abstract class ct0 extends m0 {
    public final gg3 a;

    public ct0(gg3 gg3Var) {
        this.a = gg3Var;
    }

    @Override // defpackage.gg3
    public void d(x32 x32Var, Object obj) {
        int i = i(obj);
        wb6 e = e();
        vx0 g0 = x32Var.g0(e, i);
        Iterator h = h(obj);
        for (int i2 = 0; i2 < i; i2++) {
            g0.w(e(), i2, this.a, h.next());
        }
        g0.a(e);
    }

    @Override // defpackage.m0
    public void k(ux0 ux0Var, int i, Object obj) {
        n(i, obj, ux0Var.G(e(), i, this.a, null));
    }

    public abstract void n(int i, Object obj, Object obj2);
}
