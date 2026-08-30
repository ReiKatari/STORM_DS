package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wq5  reason: default package */
/* loaded from: classes.dex */
public final class wq5 extends sf3 {
    public static final wq5 c = new wq5("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq5(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.tv3
    public final uv3 f(vv3 vv3Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                qp1 qp1Var = qp1.A;
                if (size != 0) {
                    if (size != 1) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < size2; i3++) {
                            yn4 c2 = ((mv3) list.get(i3)).c(j);
                            i = Math.max(c2.A, i);
                            i2 = Math.max(c2.B, i2);
                            arrayList.add(c2);
                        }
                        return vv3Var.s0(nz0.g(i, j), nz0.f(i2, j), qp1Var, new vf(3, arrayList));
                    }
                    yn4 c3 = ((mv3) list.get(0)).c(j);
                    return vv3Var.s0(nz0.g(c3.A, j), nz0.f(c3.B, j), qp1Var, new sd(c3, 6));
                }
                return vv3Var.s0(lz0.j(j), lz0.i(j), qp1Var, qc2.n0);
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
