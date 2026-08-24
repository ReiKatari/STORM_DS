package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q16  reason: default package */
/* loaded from: classes.dex */
public final class q16 extends pm3 {
    public static final q16 c = new q16("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q16(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.e34
    public final f34 d(g34 g34Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                zt1 zt1Var = zt1.A;
                if (size != 0) {
                    if (size != 1) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < size2; i3++) {
                            dx4 y = ((x24) list.get(i3)).y(j);
                            i = Math.max(y.A, i);
                            i2 = Math.max(y.B, i2);
                            arrayList.add(y);
                        }
                        return g34Var.K(s21.g(i, j), s21.f(i2, j), zt1Var, new kg(3, arrayList));
                    }
                    dx4 y2 = ((x24) list.get(0)).y(j);
                    return g34Var.K(s21.g(y2.A, j), s21.f(y2.B, j), zt1Var, new he(y2, 6));
                }
                return g34Var.K(q21.j(j), q21.i(j), zt1Var, hh2.p0);
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
