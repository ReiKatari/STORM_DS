package defpackage;

import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class al3 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ b B;

    public /* synthetic */ al3(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        b bVar = this.B;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(1815524482, new al3(bVar, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                b.j(bVar, (px0) obj, ((Integer) obj2).intValue());
                return jg7Var;
            default:
                b.k(bVar, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return jg7Var;
        }
    }
}
