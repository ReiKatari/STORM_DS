package defpackage;

import defpackage.v53;
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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ro2  reason: default package */
/* loaded from: classes.dex */
public final class ro2 {
    public static final df2 o = df2.d;
    public static final v52 p = v52.IDENTITY;
    public static final wt6 q = wt6.DOUBLE;
    public static final wt6 r = wt6.LAZILY_PARSED_NUMBER;
    public static final qh s;
    public static final w63 t;
    public static final ro2 u;
    public static final List v;
    public final i22 a = i22.L;
    public final zr3 b = zr3.DEFAULT;
    public final w52 c = p;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int g = 2;
    public final int h = 2;
    public final boolean i = true;
    public final df2 j = o;
    public final boolean k = true;
    public final xt6 l = q;
    public final xt6 m = r;
    public final ArrayDeque n = new ArrayDeque();

    static {
        qh qhVar = new qh(Collections.EMPTY_LIST, Collections.EMPTY_MAP, true);
        s = qhVar;
        w63 w63Var = new w63(qhVar);
        t = w63Var;
        ro2 ro2Var = new ro2();
        u = ro2Var;
        v = ro2Var.a(qhVar, w63Var);
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

    public final List a(qh qhVar, w63 w63Var) {
        s84 s84Var;
        zz6 zz6Var;
        zz6 zz6Var2;
        s84 s84Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(k07.C);
        s84 s84Var3 = f94.c;
        wt6 wt6Var = wt6.DOUBLE;
        xt6 xt6Var = this.l;
        if (xt6Var == wt6Var) {
            s84Var = f94.c;
        } else {
            s84Var = new s84(1, xt6Var);
        }
        arrayList.add(s84Var);
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
        boolean z = zc6.a;
        v53.b bVar = null;
        int i = this.g;
        int i2 = this.h;
        if (i != 2 || i2 != 2) {
            zz6 zz6Var3 = new zz6(0, new r91(q91.b, i, i2), Date.class);
            if (z) {
                yc6 yc6Var = zc6.c;
                yc6Var.getClass();
                zz6Var2 = new zz6(0, new r91(yc6Var, i, i2), yc6Var.a);
                yc6 yc6Var2 = zc6.b;
                yc6Var2.getClass();
                zz6Var = new zz6(0, new r91(yc6Var2, i, i2), yc6Var2.a);
            } else {
                zz6Var = null;
                zz6Var2 = null;
            }
            arrayList.add(zz6Var3);
            if (z) {
                arrayList.add(zz6Var2);
                arrayList.add(zz6Var);
            }
        }
        arrayList.add(k07.s);
        arrayList.add(k07.g);
        arrayList.add(k07.d);
        arrayList.add(k07.e);
        arrayList.add(k07.f);
        dz6 typeAdapter = this.b.typeAdapter();
        arrayList.add(new a07(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(new a07(Double.TYPE, Double.class, k07.n));
        arrayList.add(new a07(Float.TYPE, Float.class, k07.m));
        s84 s84Var4 = u84.b;
        wt6 wt6Var2 = wt6.LAZILY_PARSED_NUMBER;
        xt6 xt6Var2 = this.m;
        if (xt6Var2 == wt6Var2) {
            s84Var2 = u84.b;
        } else {
            s84Var2 = new s84(0, new u84(xt6Var2));
        }
        arrayList.add(s84Var2);
        arrayList.add(k07.h);
        arrayList.add(k07.i);
        Objects.requireNonNull(typeAdapter);
        arrayList.add(new zz6(0, new hz6(typeAdapter, 1).a(), AtomicLong.class));
        arrayList.add(new zz6(0, new hz6(typeAdapter, 0).a(), AtomicLongArray.class));
        arrayList.add(k07.j);
        arrayList.add(k07.o);
        arrayList.add(k07.t);
        arrayList.add(k07.u);
        arrayList.add(k07.p);
        arrayList.add(k07.q);
        arrayList.add(k07.r);
        arrayList.add(k07.v);
        arrayList.add(k07.w);
        arrayList.add(k07.y);
        arrayList.add(k07.z);
        arrayList.add(k07.B);
        arrayList.add(k07.x);
        arrayList.add(k07.b);
        arrayList.add(r91.c);
        arrayList.add(k07.A);
        try {
            u53 u53Var = v53.a;
            ((v53) ((j07) v53.class.getDeclaredConstructor(null).newInstance(null))).getClass();
            bVar = v53.j;
        } catch (LinkageError | ReflectiveOperationException unused) {
        }
        if (bVar != null) {
            arrayList.add(bVar);
        }
        arrayList.addAll(zc6.d);
        arrayList.add(ju.c);
        arrayList.add(k07.a);
        arrayList.add(new sq0(qhVar, 0));
        arrayList.add(new sq0(qhVar, 1));
        arrayList.add(w63Var);
        arrayList.add(k07.D);
        arrayList.add(new f85(qhVar, this.c, this.a, w63Var, b(this.n)));
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }

    public final void c(Class cls, Object obj) {
        boolean z;
        if (cls != Object.class) {
            n07 n07Var = new n07(cls);
            if (n07Var.b == n07Var.a) {
                z = true;
            } else {
                z = false;
            }
            cy6 cy6Var = new cy6(obj, n07Var, z, null);
            ArrayList arrayList = this.e;
            arrayList.add(cy6Var);
            if (obj instanceof dz6) {
                n07 n07Var2 = new n07(cls);
                zz6 zz6Var = k07.a;
                arrayList.add(new zz6(2, (dz6) obj, n07Var2));
                return;
            }
            return;
        }
        f81.x(cls, "Cannot override built-in adapter for ");
    }
}
