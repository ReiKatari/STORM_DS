package n1;

import h1.n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f9747a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9748b;

    /* renamed from: c  reason: collision with root package name */
    public int f9749c;

    /* renamed from: d  reason: collision with root package name */
    public float f9750d;

    /* renamed from: e  reason: collision with root package name */
    public Object f9751e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    public static int a(p pVar, boolean z10) {
        if (z10) {
            return ((q) zb.l.Z(pVar.f9810k)).f9816a + 1;
        }
        return ((q) zb.l.R(pVar.f9810k)).f9816a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    public static int b(o1.n nVar, boolean z10) {
        int i2;
        int i10;
        if (z10) {
            o1.o oVar = (o1.o) zb.l.Z(nVar.m);
            if (nVar.f10557q == n1.Vertical) {
                i10 = oVar.f10574p;
            } else {
                i10 = oVar.f10575q;
            }
            return i10 + 1;
        }
        o1.o oVar2 = (o1.o) zb.l.R(nVar.m);
        if (nVar.f10557q == n1.Vertical) {
            i2 = oVar2.f10574p;
        } else {
            i2 = oVar2.f10575q;
        }
        return i2 - 1;
    }
}
