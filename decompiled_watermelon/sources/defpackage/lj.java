package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lj  reason: default package */
/* loaded from: classes.dex */
public final class lj implements tv3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ lj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tv3
    public final uv3 f(vv3 vv3Var, List list, long j) {
        ArrayList arrayList;
        int i;
        int i2;
        ti4 ti4Var;
        int i3 = this.a;
        qp1 qp1Var = qp1.A;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                ((yq4) obj).setParentLayoutDirection((sd3) obj2);
                return vv3Var.s0(0, 0, qp1Var, yd.d0);
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj3 = list.get(i4);
                    if (!(((mv3) obj3).l() instanceof wr6)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((ki2) obj2).c();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        y55 y55Var = (y55) list2.get(i5);
                        if (y55Var != null) {
                            float f = y55Var.b;
                            float f2 = y55Var.a;
                            i = size2;
                            i2 = i5;
                            yn4 c = ((mv3) arrayList2.get(i5)).c(nz0.b(0, (int) Math.floor(y55Var.c - f2), 0, (int) Math.floor(y55Var.d - f), 5));
                            int round = Math.round(f2);
                            ti4Var = new ti4(c, new a33((Math.round(f) & 4294967295L) | (round << 32)));
                        } else {
                            i = size2;
                            i2 = i5;
                            ti4Var = null;
                        }
                        if (ti4Var != null) {
                            arrayList3.add(ti4Var);
                        }
                        i5 = i2 + 1;
                        size2 = i;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    Object obj4 = list.get(i6);
                    if (((mv3) obj4).l() instanceof wr6) {
                        arrayList4.add(obj4);
                    }
                }
                return vv3Var.s0(lz0.h(j), lz0.g(j), qp1Var, new zr4(21, arrayList, l.o(arrayList4, (ki2) obj)));
        }
    }
}
