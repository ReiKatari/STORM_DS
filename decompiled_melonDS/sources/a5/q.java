package a5;

import java.util.ArrayList;
import java.util.List;
import u1.l1;
import u1.p1;
import y3.i1;
import y3.u0;
import y3.v0;
import y3.w0;
import y3.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements v0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f424a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f425b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f426c;

    public /* synthetic */ q(int i2, Object obj, Object obj2) {
        this.f424a = i2;
        this.f425b = obj;
        this.f426c = obj2;
    }

    @Override // y3.v0
    public final w0 a(x0 x0Var, List list, long j2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        yb.j jVar;
        switch (this.f424a) {
            case 0:
                ((m0) this.f425b).setParentLayoutDirection((x4.m) this.f426c);
                return x0Var.u0(0, 0, zb.r.A, e.X);
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj = list.get(i2);
                    if (!(((u0) obj).n() instanceof p1)) {
                        arrayList3.add(obj);
                    }
                }
                List list3 = (List) ((mc.a) this.f426c).b();
                if (list3 != null) {
                    ArrayList arrayList4 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        h3.c cVar = (h3.c) list3.get(i10);
                        if (cVar != null) {
                            float f8 = cVar.f6053b;
                            float f10 = cVar.f6052a;
                            arrayList2 = arrayList3;
                            list2 = list3;
                            i1 e6 = ((u0) arrayList3.get(i10)).e(x4.b.b((int) Math.floor(cVar.f6054c - f10), (int) Math.floor(cVar.f6055d - f8), 5));
                            int round = Math.round(f10);
                            jVar = new yb.j(e6, new x4.j((Math.round(f8) & 4294967295L) | (round << 32)));
                        } else {
                            arrayList2 = arrayList3;
                            list2 = list3;
                            jVar = null;
                        }
                        if (jVar != null) {
                            arrayList4.add(jVar);
                        }
                        i10++;
                        arrayList3 = arrayList2;
                        list3 = list2;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    Object obj2 = list.get(i11);
                    if (((u0) obj2).n() instanceof p1) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList l10 = u1.l0.l(arrayList5, (mc.a) this.f425b);
                return x0Var.u0(x4.a.h(j2), x4.a.g(j2), zb.r.A, new l1(2, arrayList, l10));
        }
    }
}
