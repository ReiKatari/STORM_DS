package i4;

import i3.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends nc.l implements mc.p {
    public static final k L = new k(2, 0);
    public static final k R = new k(2, 1);
    public static final k X = new k(2, 2);
    public static final k Y = new k(2, 3);
    public static final k Z = new k(2, 4);

    /* renamed from: b0  reason: collision with root package name */
    public static final k f6725b0 = new k(2, 5);

    /* renamed from: c0  reason: collision with root package name */
    public static final k f6726c0 = new k(2, 6);

    /* renamed from: d0  reason: collision with root package name */
    public static final k f6727d0 = new k(2, 7);

    /* renamed from: e0  reason: collision with root package name */
    public static final k f6728e0 = new k(2, 8);

    /* renamed from: f0  reason: collision with root package name */
    public static final k f6729f0 = new k(2, 9);

    /* renamed from: g0  reason: collision with root package name */
    public static final k f6730g0 = new k(2, 10);

    /* renamed from: h0  reason: collision with root package name */
    public static final k f6731h0 = new k(2, 11);

    /* renamed from: i0  reason: collision with root package name */
    public static final k f6732i0 = new k(2, 12);

    /* renamed from: j0  reason: collision with root package name */
    public static final k f6733j0 = new k(2, 13);

    /* renamed from: k0  reason: collision with root package name */
    public static final k f6734k0 = new k(2, 14);

    /* renamed from: l0  reason: collision with root package name */
    public static final k f6735l0 = new k(2, 15);

    /* renamed from: m0  reason: collision with root package name */
    public static final k f6736m0 = new k(2, 16);

    /* renamed from: n0  reason: collision with root package name */
    public static final k f6737n0 = new k(2, 17);

    /* renamed from: o0  reason: collision with root package name */
    public static final k f6738o0 = new k(2, 18);
    public static final k p0 = new k(2, 19);

    /* renamed from: q0  reason: collision with root package name */
    public static final k f6739q0 = new k(2, 20);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        String str;
        yb.d dVar;
        switch (this.B) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = zb.q.A;
                }
                return zb.l.e0(collection, list);
            case DSiCameraSource.FrontCamera /* 1 */:
                c3.e eVar = (c3.e) obj2;
                return (c3.e) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList(list2);
                    arrayList.addAll(list3);
                    return arrayList;
                }
                return list3;
            case 3:
                c3.o oVar = (c3.o) obj2;
                return (c3.o) obj;
            case 4:
                c3.g gVar = (c3.g) obj2;
                return (c3.g) obj;
            case l1.c.f8511g /* 5 */:
                yb.y yVar = (yb.y) obj2;
                return (yb.y) obj;
            case l1.c.f8509e /* 6 */:
                yb.y yVar2 = (yb.y) obj2;
                return (yb.y) obj;
            case 7:
                yb.y yVar3 = (yb.y) obj;
                yb.y yVar4 = (yb.y) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                yb.y yVar5 = (yb.y) obj;
                yb.y yVar6 = (yb.y) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case l1.c.f8508d /* 9 */:
                yb.y yVar7 = (yb.y) obj2;
                return (yb.y) obj;
            case l1.c.f8510f /* 10 */:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                i iVar = (i) obj;
                int i2 = ((i) obj2).f6722a;
                return iVar;
            case 12:
                n0 n0Var = (n0) obj2;
                return (n0) obj;
            case 13:
                String str4 = (String) obj2;
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 != null) {
                    ArrayList arrayList2 = new ArrayList(list4);
                    arrayList2.addAll(list5);
                    return arrayList2;
                }
                return list5;
            case l1.c.f8512h /* 15 */:
                Float f8 = (Float) obj;
                ((Number) obj2).floatValue();
                return f8;
            case 16:
                String str5 = (String) obj2;
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f6707a) == null) {
                    str = aVar2.f6707a;
                }
                if (aVar == null || (dVar = aVar.f6708b) == null) {
                    dVar = aVar2.f6708b;
                }
                return new a(str, dVar);
            case 19:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            default:
                p pVar = (p) obj2;
                Float valueOf = Float.valueOf(0.0f);
                m mVar = ((p) obj).f6770d;
                w wVar = t.f6799t;
                Object g10 = mVar.A.g(wVar);
                if (g10 == null) {
                    g10 = valueOf;
                }
                float floatValue = ((Number) g10).floatValue();
                Object g11 = pVar.f6770d.A.g(wVar);
                if (g11 != null) {
                    valueOf = g11;
                }
                return Integer.valueOf(Float.compare(floatValue, valueOf.floatValue()));
        }
    }
}
