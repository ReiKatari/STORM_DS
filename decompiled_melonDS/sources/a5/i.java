package a5;

import java.util.ArrayList;
import java.util.List;
import y3.i1;
import y3.u0;
import y3.v0;
import y3.w0;
import y3.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements v0 {

    /* renamed from: b  reason: collision with root package name */
    public static final i f398b = new i(0);

    /* renamed from: c  reason: collision with root package name */
    public static final i f399c = new i(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f400a;

    public /* synthetic */ i(int i2) {
        this.f400a = i2;
    }

    @Override // y3.v0
    public final w0 a(x0 x0Var, List list, long j2) {
        switch (this.f400a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    i1 e6 = ((u0) list.get(i11)).e(j2);
                    i2 = Math.max(i2, e6.A);
                    i10 = Math.max(i10, e6.B);
                    arrayList.add(e6);
                }
                if (list.isEmpty()) {
                    i2 = x4.a.j(j2);
                    i10 = x4.a.i(j2);
                }
                return x0Var.u0(i2, i10, zb.r.A, new h(0, arrayList));
            default:
                int size2 = list.size();
                zb.r rVar = zb.r.A;
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        int i12 = 0;
                        int i13 = 0;
                        for (int i14 = 0; i14 < size3; i14++) {
                            i1 e10 = ((u0) list.get(i14)).e(j2);
                            i12 = Math.max(i12, e10.A);
                            i13 = Math.max(i13, e10.B);
                            arrayList2.add(e10);
                        }
                        return x0Var.u0(i12, i13, rVar, new h(1, arrayList2));
                    }
                    i1 e11 = ((u0) list.get(0)).e(j2);
                    return x0Var.u0(e11.A, e11.B, rVar, new t(e11, 0));
                }
                return x0Var.u0(0, 0, rVar, e.Z);
        }
    }
}
