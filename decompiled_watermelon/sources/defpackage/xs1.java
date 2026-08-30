package defpackage;

import android.util.Rational;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xs1  reason: default package */
/* loaded from: classes.dex */
public final class xs1 implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;

    public xs1(Comparator comparator) {
        this.a = 3;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l23 l23Var;
        Object obj3;
        l23 l23Var2;
        Object obj4;
        float f;
        float f2;
        int i = this.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                n6 n6Var = (n6) obj2;
                ct1 ct1Var = (ct1) obj5;
                Iterator it = ct1Var.p.iterator();
                while (true) {
                    l23Var = null;
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((vs1) obj3).a == n6Var.a().a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                vs1 vs1Var = (vs1) obj3;
                if (vs1Var != null) {
                    l23Var2 = vs1Var.b;
                } else {
                    l23Var2 = null;
                }
                n6 n6Var2 = (n6) obj;
                Iterator it2 = ct1Var.p.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj4 = it2.next();
                        if (((vs1) obj4).a == n6Var2.a().a) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                vs1 vs1Var2 = (vs1) obj4;
                if (vs1Var2 != null) {
                    l23Var = vs1Var2.b;
                }
                return iq2.i(l23Var2, l23Var);
            case 1:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj5;
                float floatValue = ((Rational) obj).floatValue();
                float floatValue2 = rational2.floatValue();
                if (floatValue > floatValue2) {
                    f = floatValue2 / floatValue;
                } else {
                    f = floatValue / floatValue2;
                }
                float floatValue3 = rational.floatValue();
                float floatValue4 = rational2.floatValue();
                if (floatValue3 > floatValue4) {
                    f2 = floatValue4 / floatValue3;
                } else {
                    f2 = floatValue3 / floatValue4;
                }
                return Float.compare(f2, f);
            case 2:
                int compare = ((pe5) obj5).compare(obj, obj2);
                if (compare == 0) {
                    return iq2.i(Long.valueOf(((c6) obj).a), Long.valueOf(((c6) obj2).a));
                }
                return compare;
            case 3:
                int compare2 = ((Comparator) obj5).compare(obj, obj2);
                if (compare2 == 0) {
                    return vf3.M0.compare(((iz5) obj).c, ((iz5) obj2).c);
                }
                return compare2;
            case 4:
                int compare3 = ((xs1) obj5).compare(obj, obj2);
                if (compare3 == 0) {
                    return iq2.i(Integer.valueOf(((iz5) obj).f), Integer.valueOf(((iz5) obj2).f));
                }
                return compare3;
            case 5:
                int compare4 = ((tu) obj5).compare(obj, obj2);
                if (compare4 == 0) {
                    return iq2.i((String) obj, (String) obj2);
                }
                return compare4;
            case ig7.b /* 6 */:
                int compare5 = ((so5) obj5).compare(obj, obj2);
                if (compare5 == 0) {
                    return iq2.i(Long.valueOf(((hb4) obj).j), Long.valueOf(((hb4) obj2).j));
                }
                return compare5;
            case 7:
                int compare6 = ((xs1) obj5).compare(obj, obj2);
                if (compare6 == 0) {
                    return iq2.i(Long.valueOf(((hb4) obj).a), Long.valueOf(((hb4) obj2).a));
                }
                return compare6;
            default:
                ArrayList arrayList = ((tf6) obj5).Z;
                Iterator it3 = ((rf6) obj).l.iterator();
                if (it3.hasNext()) {
                    Integer valueOf = Integer.valueOf(arrayList.indexOf((bg0) it3.next()));
                    while (it3.hasNext()) {
                        Integer valueOf2 = Integer.valueOf(arrayList.indexOf((bg0) it3.next()));
                        if (valueOf.compareTo(valueOf2) > 0) {
                            valueOf = valueOf2;
                        }
                    }
                    Iterator it4 = ((rf6) obj2).l.iterator();
                    if (it4.hasNext()) {
                        Integer valueOf3 = Integer.valueOf(arrayList.indexOf((bg0) it4.next()));
                        while (it4.hasNext()) {
                            Integer valueOf4 = Integer.valueOf(arrayList.indexOf((bg0) it4.next()));
                            if (valueOf3.compareTo(valueOf4) > 0) {
                                valueOf3 = valueOf4;
                            }
                        }
                        return iq2.i(valueOf, valueOf3);
                    }
                }
                vd6.b();
                return 0;
        }
    }

    public /* synthetic */ xs1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
