package defpackage;

import defpackage.kc3;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tu2  reason: default package */
/* loaded from: classes.dex */
public final class tu2 {
    public static final ck2 o = ck2.d;
    public static final pa2 p = pa2.IDENTITY;
    public static final n67 q = n67.DOUBLE;
    public static final n67 r = n67.LAZILY_PARSED_NUMBER;
    public static final ci s;
    public static final ld3 t;
    public static final tu2 u;
    public static final List v;
    public final z62 a = z62.L;
    public final ez3 b = ez3.DEFAULT;
    public final qa2 c = p;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int g = 2;
    public final int h = 2;
    public final boolean i = true;
    public final ck2 j = o;
    public final boolean k = true;
    public final o67 l = q;
    public final o67 m = r;
    public final ArrayDeque n = new ArrayDeque();

    static {
        ci ciVar = new ci(Collections.EMPTY_LIST, Collections.EMPTY_MAP, true);
        s = ciVar;
        ld3 ld3Var = new ld3(ciVar);
        t = ld3Var;
        tu2 tu2Var = new tu2();
        u = tu2Var;
        v = tu2Var.a(ciVar, ld3Var);
    }

    public static List b(AbstractCollection abstractCollection) {
        Object next;
        if (abstractCollection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (abstractCollection.size() == 1) {
            if (abstractCollection instanceof List) {
                next = ((List) abstractCollection).get(0);
            } else {
                next = abstractCollection.iterator().next();
            }
            return Collections.singletonList(next);
        }
        return Collections.unmodifiableList(Arrays.asList(abstractCollection.toArray()));
    }

    public final List a(ci ciVar, ld3 ld3Var) {
        kh4 kh4Var;
        ud7 ud7Var;
        ud7 ud7Var2;
        kh4 kh4Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(fe7.C);
        kh4 kh4Var3 = yh4.c;
        n67 n67Var = n67.DOUBLE;
        o67 o67Var = this.l;
        if (o67Var == n67Var) {
            kh4Var = yh4.c;
        } else {
            kh4Var = new kh4(o67Var, 1);
        }
        arrayList.add(kh4Var);
        arrayList.add(this.a);
        ArrayList arrayList2 = this.e;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Collections.reverse(arrayList3);
            arrayList.addAll(arrayList3);
        }
        ArrayList arrayList4 = this.f;
        if (!arrayList4.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(arrayList4);
            Collections.reverse(arrayList5);
            arrayList.addAll(arrayList5);
        }
        boolean z = po6.a;
        kc3.b bVar = null;
        int i = this.g;
        int i2 = this.h;
        if (i != 2 || i2 != 2) {
            ud7 ud7Var3 = new ud7(0, new nd1(md1.b, i, i2), Date.class);
            if (z) {
                oo6 oo6Var = po6.c;
                oo6Var.getClass();
                ud7Var2 = new ud7(0, new nd1(oo6Var, i, i2), oo6Var.a);
                oo6 oo6Var2 = po6.b;
                oo6Var2.getClass();
                ud7Var = new ud7(0, new nd1(oo6Var2, i, i2), oo6Var2.a);
            } else {
                ud7Var = null;
                ud7Var2 = null;
            }
            arrayList.add(ud7Var3);
            if (z) {
                arrayList.add(ud7Var2);
                arrayList.add(ud7Var);
            }
        }
        arrayList.add(fe7.s);
        arrayList.add(fe7.g);
        arrayList.add(fe7.d);
        arrayList.add(fe7.e);
        arrayList.add(fe7.f);
        yc7 typeAdapter = this.b.typeAdapter();
        arrayList.add(new vd7(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(new vd7(Double.TYPE, Double.class, fe7.n));
        arrayList.add(new vd7(Float.TYPE, Float.class, fe7.m));
        kh4 kh4Var4 = mh4.b;
        n67 n67Var2 = n67.LAZILY_PARSED_NUMBER;
        o67 o67Var2 = this.m;
        if (o67Var2 == n67Var2) {
            kh4Var2 = mh4.b;
        } else {
            kh4Var2 = new kh4(new mh4(o67Var2), 0);
        }
        arrayList.add(kh4Var2);
        arrayList.add(fe7.h);
        arrayList.add(fe7.i);
        Objects.requireNonNull(typeAdapter);
        arrayList.add(new ud7(0, new cd7(typeAdapter, 1).a(), AtomicLong.class));
        arrayList.add(new ud7(0, new cd7(typeAdapter, 0).a(), AtomicLongArray.class));
        arrayList.add(fe7.j);
        arrayList.add(fe7.o);
        arrayList.add(fe7.t);
        arrayList.add(fe7.u);
        arrayList.add(fe7.p);
        arrayList.add(fe7.q);
        arrayList.add(fe7.r);
        arrayList.add(fe7.v);
        arrayList.add(fe7.w);
        arrayList.add(fe7.y);
        arrayList.add(fe7.z);
        arrayList.add(fe7.B);
        arrayList.add(fe7.x);
        arrayList.add(fe7.b);
        arrayList.add(nd1.c);
        arrayList.add(fe7.A);
        try {
            ic3 ic3Var = kc3.a;
            ((kc3) ((ee7) kc3.class.getDeclaredConstructor(null).newInstance(null))).getClass();
            bVar = kc3.j;
        } catch (LinkageError | ReflectiveOperationException unused) {
        }
        if (bVar != null) {
            arrayList.add(bVar);
        }
        arrayList.addAll(po6.d);
        arrayList.add(bv.c);
        arrayList.add(fe7.a);
        arrayList.add(new ft0(ciVar, 0));
        arrayList.add(new ft0(ciVar, 1));
        arrayList.add(ld3Var);
        arrayList.add(fe7.D);
        arrayList.add(new vh5(ciVar, this.c, this.a, ld3Var, b(this.n)));
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }

    public final void c(Class cls, Object obj) {
        boolean z;
        if (cls != Object.class) {
            ie7 ie7Var = new ie7(cls);
            if (ie7Var.b == ie7Var.a) {
                z = true;
            } else {
                z = false;
            }
            xb7 xb7Var = new xb7(obj, ie7Var, z, null);
            ArrayList arrayList = this.e;
            arrayList.add(xb7Var);
            if (obj instanceof yc7) {
                ie7 ie7Var2 = new ie7(cls);
                ud7 ud7Var = fe7.a;
                arrayList.add(new ud7(2, (yc7) obj, ie7Var2));
                return;
            }
            return;
        }
        e41.w(cls, "Cannot override built-in adapter for ");
    }
}
