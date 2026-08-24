package defpackage;

import android.util.Rational;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix1  reason: default package */
/* loaded from: classes.dex */
public final class ix1 implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;

    public ix1(Comparator comparator) {
        this.a = 3;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        s83 s83Var;
        Object obj3;
        s83 s83Var2;
        Object obj4;
        float f;
        float f2;
        int i = this.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                o6 o6Var = (o6) obj2;
                nx1 nx1Var = (nx1) obj5;
                Iterator it = nx1Var.p.iterator();
                while (true) {
                    s83Var = null;
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((gx1) obj3).a == o6Var.a().a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                gx1 gx1Var = (gx1) obj3;
                if (gx1Var != null) {
                    s83Var2 = gx1Var.b;
                } else {
                    s83Var2 = null;
                }
                o6 o6Var2 = (o6) obj;
                Iterator it2 = nx1Var.p.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj4 = it2.next();
                        if (((gx1) obj4).a == o6Var2.a().a) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                gx1 gx1Var2 = (gx1) obj4;
                if (gx1Var2 != null) {
                    s83Var = gx1Var2.b;
                }
                return g04.z(s83Var2, s83Var);
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
                int compare = ((ko5) obj5).compare(obj, obj2);
                if (compare == 0) {
                    return g04.z(Long.valueOf(((c6) obj).a), Long.valueOf(((c6) obj2).a));
                }
                return compare;
            case 3:
                int compare2 = ((Comparator) obj5).compare(obj, obj2);
                if (compare2 == 0) {
                    return sm3.N0.compare(((xa6) obj).c, ((xa6) obj2).c);
                }
                return compare2;
            case 4:
                int compare3 = ((ix1) obj5).compare(obj, obj2);
                if (compare3 == 0) {
                    return g04.z(Integer.valueOf(((xa6) obj).f), Integer.valueOf(((xa6) obj2).f));
                }
                return compare3;
            case 5:
                int compare4 = ((lv) obj5).compare(obj, obj2);
                if (compare4 == 0) {
                    return g04.z((String) obj, (String) obj2);
                }
                return compare4;
            case 6:
                int compare5 = ((tp5) obj5).compare(obj, obj2);
                if (compare5 == 0) {
                    return g04.z(Long.valueOf(((ek4) obj).j), Long.valueOf(((ek4) obj2).j));
                }
                return compare5;
            case 7:
                int compare6 = ((ix1) obj5).compare(obj, obj2);
                if (compare6 == 0) {
                    return g04.z(Long.valueOf(((ek4) obj).a), Long.valueOf(((ek4) obj2).a));
                }
                return compare6;
            default:
                ArrayList arrayList = ((jr6) obj5).Z;
                Iterator it3 = ((hr6) obj).l.iterator();
                if (it3.hasNext()) {
                    Integer valueOf = Integer.valueOf(arrayList.indexOf((ki0) it3.next()));
                    while (it3.hasNext()) {
                        Integer valueOf2 = Integer.valueOf(arrayList.indexOf((ki0) it3.next()));
                        if (valueOf.compareTo(valueOf2) > 0) {
                            valueOf = valueOf2;
                        }
                    }
                    Iterator it4 = ((hr6) obj2).l.iterator();
                    if (it4.hasNext()) {
                        Integer valueOf3 = Integer.valueOf(arrayList.indexOf((ki0) it4.next()));
                        while (it4.hasNext()) {
                            Integer valueOf4 = Integer.valueOf(arrayList.indexOf((ki0) it4.next()));
                            if (valueOf3.compareTo(valueOf4) > 0) {
                                valueOf3 = valueOf4;
                            }
                        }
                        return g04.z(valueOf, valueOf3);
                    }
                }
                fa6.c();
                return 0;
        }
    }

    public /* synthetic */ ix1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
