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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb4  reason: default package */
/* loaded from: classes.dex */
public final class vb4 {
    public final q61 a;
    public final tp6 b;
    public final tp6 c;
    public boolean d;
    public final de5 e;
    public final de5 f;
    public final qd4 g;
    public final /* synthetic */ rc4 h;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, q61] */
    public vb4(rc4 rc4Var, qd4 qd4Var) {
        qd4Var.getClass();
        this.h = rc4Var;
        this.a = new Object();
        tp6 a = up6.a(yt1.A);
        this.b = a;
        tp6 a2 = up6.a(du1.A);
        this.c = a2;
        this.e = new de5(a);
        this.f = new de5(a2);
        this.g = qd4Var;
    }

    public final void a(sb4 sb4Var) {
        sb4Var.getClass();
        synchronized (this.a) {
            tp6 tp6Var = this.b;
            tp6Var.m(null, gt0.U0(sb4Var, (Collection) tp6Var.getValue()));
        }
    }

    public final sb4 b(ic4 ic4Var, Bundle bundle) {
        zb4 zb4Var = this.h.b;
        zb4Var.getClass();
        return x31.r(zb4Var.a.c, ic4Var, bundle, zb4Var.h(), zb4Var.o);
    }

    public final void c(sb4 sb4Var) {
        ac4 ac4Var;
        sb4Var.getClass();
        zb4 zb4Var = this.h.b;
        tp6 tp6Var = zb4Var.h;
        String str = sb4Var.Y;
        LinkedHashMap linkedHashMap = zb4Var.w;
        boolean k = nb3.k(linkedHashMap.get(sb4Var), Boolean.TRUE);
        tp6 tp6Var2 = this.c;
        tp6Var2.m(null, ii2.E((Set) tp6Var2.getValue(), sb4Var));
        linkedHashMap.remove(sb4Var);
        pu puVar = zb4Var.f;
        if (!puVar.contains(sb4Var)) {
            zb4Var.q(sb4Var);
            if (((ku3) sb4Var.d0.k).d.isAtLeast(tt3.CREATED)) {
                sb4Var.a(tt3.DESTROYED);
            }
            if (!puVar.isEmpty()) {
                Iterator it = puVar.iterator();
                while (it.hasNext()) {
                    if (nb3.k(((sb4) it.next()).Y, str)) {
                        break;
                    }
                }
            }
            if (!k && (ac4Var = zb4Var.o) != null) {
                str.getClass();
                ap7 ap7Var = (ap7) ac4Var.b.remove(str);
                if (ap7Var != null) {
                    ap7Var.a();
                }
            }
            zb4Var.r();
            ArrayList o = zb4Var.o();
            tp6Var.getClass();
            tp6Var.m(null, o);
        } else if (!this.d) {
            zb4Var.r();
            tp6 tp6Var3 = zb4Var.g;
            ArrayList arrayList = new ArrayList(puVar);
            tp6Var3.getClass();
            tp6Var3.m(null, arrayList);
            ArrayList o2 = zb4Var.o();
            tp6Var.getClass();
            tp6Var.m(null, o2);
        }
    }

    public final void d(sb4 sb4Var, boolean z) {
        sb4Var.getClass();
        zb4 zb4Var = this.h.b;
        ci2 ci2Var = new ci2(this, sb4Var, z);
        zb4Var.getClass();
        qd4 b = zb4Var.s.b(sb4Var.B.A);
        zb4Var.w.put(sb4Var, Boolean.valueOf(z));
        if (b.equals(this.g)) {
            xb4 xb4Var = zb4Var.v;
            if (xb4Var != null) {
                xb4Var.g(sb4Var);
                ci2Var.c();
                return;
            }
            pu puVar = zb4Var.f;
            int indexOf = puVar.indexOf(sb4Var);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + sb4Var + " as it was not found on the current back stack");
                return;
            }
            int i = indexOf + 1;
            if (i != puVar.L) {
                zb4Var.l(((sb4) puVar.get(i)).B.B.a, true, false);
            }
            zb4.n(zb4Var, sb4Var);
            ci2Var.c();
            zb4Var.b.c();
            zb4Var.b();
            return;
        }
        Object obj = zb4Var.t.get(b);
        obj.getClass();
        ((vb4) obj).d(sb4Var, z);
    }

    public final void e(sb4 sb4Var, boolean z) {
        Object obj;
        sb4Var.getClass();
        tp6 tp6Var = this.c;
        Iterable iterable = (Iterable) tp6Var.getValue();
        boolean z2 = iterable instanceof Collection;
        de5 de5Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((sb4) it.next()) == sb4Var) {
                    Iterable<sb4> iterable2 = (Iterable) de5Var.A.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (sb4 sb4Var2 : iterable2) {
                            if (sb4Var2 == sb4Var) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        tp6Var.m(null, ii2.L((Set) tp6Var.getValue(), sb4Var));
        rp6 rp6Var = de5Var.A;
        rp6 rp6Var2 = de5Var.A;
        List list = (List) rp6Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                sb4 sb4Var3 = (sb4) obj;
                if (!nb3.k(sb4Var3, sb4Var) && ((List) rp6Var2.getValue()).lastIndexOf(sb4Var3) < ((List) rp6Var2.getValue()).lastIndexOf(sb4Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        sb4 sb4Var4 = (sb4) obj;
        if (sb4Var4 != null) {
            tp6Var.m(null, ii2.L((Set) tp6Var.getValue(), sb4Var4));
        }
        d(sb4Var, z);
    }

    public final void f(sb4 sb4Var) {
        sb4Var.getClass();
        zb4 zb4Var = this.h.b;
        zb4Var.getClass();
        qd4 b = zb4Var.s.b(sb4Var.B.A);
        if (b.equals(this.g)) {
            qn2 qn2Var = zb4Var.u;
            if (qn2Var != null) {
                qn2Var.g(sb4Var);
                a(sb4Var);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + sb4Var.B + " outside of the call to navigate(). ");
            return;
        }
        Object obj = zb4Var.t.get(b);
        if (obj != null) {
            ((vb4) obj).f(sb4Var);
        } else {
            u34.f(i61.n(new StringBuilder("NavigatorBackStack for "), sb4Var.B.A, " should already be created"));
        }
    }
}
