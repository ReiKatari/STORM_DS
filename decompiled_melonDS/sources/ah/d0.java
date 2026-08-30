package ah;

import android.util.Rational;
import java.util.Comparator;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f750a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f751b;

    public d0(Comparator comparator) {
        this.f750a = 1;
        this.f751b = comparator;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        wc.g gVar;
        Object obj3;
        wc.g gVar2;
        Object obj4;
        float f8;
        float f10;
        switch (this.f750a) {
            case 0:
                pg.c cVar = (pg.c) obj2;
                e0 e0Var = (e0) this.f751b;
                Iterator it = e0Var.f756n.iterator();
                while (true) {
                    gVar = null;
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((a0) obj3).f718a == cVar.a().f11012a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                a0 a0Var = (a0) obj3;
                if (a0Var != null) {
                    gVar2 = a0Var.f719b;
                } else {
                    gVar2 = null;
                }
                pg.c cVar2 = (pg.c) obj;
                Iterator it2 = e0Var.f756n.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj4 = it2.next();
                        if (((a0) obj4).f718a == cVar2.a().f11012a) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                a0 a0Var2 = (a0) obj4;
                if (a0Var2 != null) {
                    gVar = a0Var2.f719b;
                }
                return d0.d.M(gVar2, gVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                int compare = ((Comparator) this.f751b).compare(obj, obj2);
                if (compare == 0) {
                    return a4.o0.M0.compare(((i4.p) obj).f6769c, ((i4.p) obj2).f6769c);
                }
                return compare;
            case 2:
                int compare2 = ((d0) this.f751b).compare(obj, obj2);
                if (compare2 == 0) {
                    return d0.d.M(Integer.valueOf(((i4.p) obj).f6773g), Integer.valueOf(((i4.p) obj2).f6773g));
                }
                return compare2;
            default:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.f751b;
                float floatValue = ((Rational) obj).floatValue();
                float floatValue2 = rational2.floatValue();
                if (floatValue > floatValue2) {
                    f8 = floatValue2 / floatValue;
                } else {
                    f8 = floatValue / floatValue2;
                }
                float floatValue3 = rational.floatValue();
                float floatValue4 = rational2.floatValue();
                if (floatValue3 > floatValue4) {
                    f10 = floatValue4 / floatValue3;
                } else {
                    f10 = floatValue3 / floatValue4;
                }
                return Float.compare(f10, f8);
        }
    }

    public /* synthetic */ d0(int i2, Object obj) {
        this.f750a = i2;
        this.f751b = obj;
    }
}
