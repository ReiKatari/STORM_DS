package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o34  reason: default package */
/* loaded from: classes.dex */
public final class o34 {
    public final hm1 a;
    public final ee6 b;
    public final ee6 c;
    public boolean d;
    public final q45 e;
    public final q45 f;
    public final k54 g;
    public final /* synthetic */ l44 h;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, hm1] */
    public o34(l44 l44Var, k54 k54Var) {
        k54Var.getClass();
        this.h = l44Var;
        this.a = new Object();
        ee6 a = fe6.a(pp1.A);
        this.b = a;
        ee6 a2 = fe6.a(up1.A);
        this.c = a2;
        this.e = new q45(a);
        this.f = new q45(a2);
        this.g = k54Var;
    }

    public final void a(l34 l34Var) {
        l34Var.getClass();
        synchronized (this.a) {
            ee6 ee6Var = this.b;
            ee6Var.l(null, tq0.Y0((Collection) ee6Var.getValue(), l34Var));
        }
    }

    public final l34 b(b44 b44Var, Bundle bundle) {
        s34 s34Var = this.h.b;
        s34Var.getClass();
        return vn1.f(s34Var.a.c, b44Var, bundle, s34Var.h(), s34Var.o);
    }

    public final void c(l34 l34Var) {
        t34 t34Var;
        l34Var.getClass();
        s34 s34Var = this.h.b;
        ee6 ee6Var = s34Var.h;
        String str = l34Var.Y;
        LinkedHashMap linkedHashMap = s34Var.w;
        boolean x = b53.x(linkedHashMap.get(l34Var), Boolean.TRUE);
        ee6 ee6Var2 = this.c;
        ee6Var2.l(null, hi2.H((Set) ee6Var2.getValue(), l34Var));
        linkedHashMap.remove(l34Var);
        xt xtVar = s34Var.f;
        if (!xtVar.contains(l34Var)) {
            s34Var.q(l34Var);
            if (((in3) l34Var.c0.k).d.isAtLeast(qm3.CREATED)) {
                l34Var.a(qm3.DESTROYED);
            }
            if (!xtVar.isEmpty()) {
                Iterator it = xtVar.iterator();
                while (it.hasNext()) {
                    if (b53.x(((l34) it.next()).Y, str)) {
                        break;
                    }
                }
            }
            if (!x && (t34Var = s34Var.o) != null) {
                str.getClass();
                za7 za7Var = (za7) t34Var.b.remove(str);
                if (za7Var != null) {
                    za7Var.a();
                }
            }
            s34Var.r();
            ArrayList o = s34Var.o();
            ee6Var.getClass();
            ee6Var.l(null, o);
        } else if (!this.d) {
            s34Var.r();
            ee6 ee6Var3 = s34Var.g;
            ArrayList arrayList = new ArrayList(xtVar);
            ee6Var3.getClass();
            ee6Var3.l(null, arrayList);
            ArrayList o2 = s34Var.o();
            ee6Var.getClass();
            ee6Var.l(null, o2);
        }
    }

    public final void d(l34 l34Var, boolean z) {
        l34Var.getClass();
        s34 s34Var = this.h.b;
        jd2 jd2Var = new jd2(this, l34Var, z);
        s34Var.getClass();
        k54 b = s34Var.s.b(l34Var.B.A);
        s34Var.w.put(l34Var, Boolean.valueOf(z));
        if (b.equals(this.g)) {
            q34 q34Var = s34Var.v;
            if (q34Var != null) {
                q34Var.n(l34Var);
                jd2Var.c();
                return;
            }
            xt xtVar = s34Var.f;
            int indexOf = xtVar.indexOf(l34Var);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + l34Var + " as it was not found on the current back stack");
                return;
            }
            int i = indexOf + 1;
            if (i != xtVar.L) {
                s34Var.l(((l34) xtVar.get(i)).B.B.a, true, false);
            }
            s34.n(s34Var, l34Var);
            jd2Var.c();
            s34Var.b.c();
            s34Var.b();
            return;
        }
        Object obj = s34Var.t.get(b);
        obj.getClass();
        ((o34) obj).d(l34Var, z);
    }

    public final void e(l34 l34Var, boolean z) {
        Object obj;
        l34Var.getClass();
        ee6 ee6Var = this.c;
        Iterable iterable = (Iterable) ee6Var.getValue();
        boolean z2 = iterable instanceof Collection;
        q45 q45Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((l34) it.next()) == l34Var) {
                    Iterable<l34> iterable2 = (Iterable) q45Var.A.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (l34 l34Var2 : iterable2) {
                            if (l34Var2 == l34Var) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        ee6Var.l(null, hi2.P((Set) ee6Var.getValue(), l34Var));
        ce6 ce6Var = q45Var.A;
        ce6 ce6Var2 = q45Var.A;
        List list = (List) ce6Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                l34 l34Var3 = (l34) obj;
                if (!b53.x(l34Var3, l34Var) && ((List) ce6Var2.getValue()).lastIndexOf(l34Var3) < ((List) ce6Var2.getValue()).lastIndexOf(l34Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        l34 l34Var4 = (l34) obj;
        if (l34Var4 != null) {
            ee6Var.l(null, hi2.P((Set) ee6Var.getValue(), l34Var4));
        }
        d(l34Var, z);
    }

    public final void f(l34 l34Var) {
        l34Var.getClass();
        s34 s34Var = this.h.b;
        s34Var.getClass();
        k54 b = s34Var.s.b(l34Var.B.A);
        if (b.equals(this.g)) {
            mi2 mi2Var = s34Var.u;
            if (mi2Var != null) {
                mi2Var.n(l34Var);
                a(l34Var);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + l34Var.B + " outside of the call to navigate(). ");
            return;
        }
        Object obj = s34Var.t.get(b);
        if (obj != null) {
            ((o34) obj).f(l34Var);
        } else {
            c44.e(b31.q(new StringBuilder("NavigatorBackStack for "), l34Var.B.A, " should already be created"));
        }
    }
}
