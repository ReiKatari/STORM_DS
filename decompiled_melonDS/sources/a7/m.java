package a7;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.d1;
import cd.o1;
import cd.q1;
import cd.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final na.f f595a;

    /* renamed from: b  reason: collision with root package name */
    public final q1 f596b;

    /* renamed from: c  reason: collision with root package name */
    public final q1 f597c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f598d;

    /* renamed from: e  reason: collision with root package name */
    public final y0 f599e;

    /* renamed from: f  reason: collision with root package name */
    public final y0 f600f;

    /* renamed from: g  reason: collision with root package name */
    public final m0 f601g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d0 f602h;

    /* JADX WARN: Type inference failed for: r3v1, types: [na.f, java.lang.Object] */
    public m(d0 d0Var, m0 m0Var) {
        m0Var.getClass();
        this.f602h = d0Var;
        this.f595a = new Object();
        q1 c4 = cd.q.c(zb.q.A);
        this.f596b = c4;
        q1 c10 = cd.q.c(zb.s.A);
        this.f597c = c10;
        this.f599e = new y0(c4);
        this.f600f = new y0(c10);
        this.f601g = m0Var;
    }

    public final void a(i iVar) {
        iVar.getClass();
        synchronized (this.f595a) {
            q1 q1Var = this.f596b;
            q1Var.k(null, zb.l.d0((Collection) q1Var.getValue(), iVar));
        }
    }

    public final i b(x xVar, Bundle bundle) {
        d7.f fVar = this.f602h.f552b;
        fVar.getClass();
        return x8.e.i(fVar.f3921a.f553c, xVar, bundle, fVar.h(), fVar.f3934o);
    }

    public final void c(i iVar) {
        o oVar;
        iVar.getClass();
        d7.f fVar = this.f602h.f552b;
        q1 q1Var = fVar.f3928h;
        String str = iVar.Y;
        LinkedHashMap linkedHashMap = fVar.f3942w;
        boolean a10 = nc.k.a(linkedHashMap.get(iVar), Boolean.TRUE);
        q1 q1Var2 = this.f597c;
        Set set = (Set) q1Var2.getValue();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(zb.v.E(set.size()));
        boolean z10 = false;
        for (Object obj : set) {
            boolean z11 = true;
            if (!z10 && nc.k.a(obj, iVar)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj);
            }
        }
        q1Var2.k(null, linkedHashSet);
        linkedHashMap.remove(iVar);
        zb.j jVar = fVar.f3926f;
        if (!jVar.contains(iVar)) {
            fVar.q(iVar);
            if (((androidx.lifecycle.z) iVar.f576b0.f3262k).f1504d.isAtLeast(androidx.lifecycle.q.CREATED)) {
                iVar.b(androidx.lifecycle.q.DESTROYED);
            }
            if (!jVar.isEmpty()) {
                Iterator it = jVar.iterator();
                while (it.hasNext()) {
                    if (nc.k.a(((i) it.next()).Y, str)) {
                        break;
                    }
                }
            }
            if (!a10 && (oVar = fVar.f3934o) != null) {
                str.getClass();
                d1 d1Var = (d1) oVar.f609b.remove(str);
                if (d1Var != null) {
                    d1Var.a();
                }
            }
            fVar.r();
            ArrayList o5 = fVar.o();
            q1Var.getClass();
            q1Var.k(null, o5);
        } else if (!this.f598d) {
            fVar.r();
            q1 q1Var3 = fVar.f3927g;
            ArrayList arrayList = new ArrayList(jVar);
            q1Var3.getClass();
            q1Var3.k(null, arrayList);
            ArrayList o8 = fVar.o();
            q1Var.getClass();
            q1Var.k(null, o8);
        }
    }

    public final void d(i iVar, boolean z10) {
        d7.f fVar = this.f602h.f552b;
        a3.e eVar = new a3.e(this, iVar, z10);
        fVar.getClass();
        m0 b10 = fVar.f3938s.b(iVar.B.A);
        fVar.f3942w.put(iVar, Boolean.valueOf(z10));
        if (b10.equals(this.f601g)) {
            d7.d dVar = fVar.f3941v;
            if (dVar != null) {
                dVar.k(iVar);
                eVar.b();
                return;
            }
            zb.j jVar = fVar.f3926f;
            int indexOf = jVar.indexOf(iVar);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + iVar + " as it was not found on the current back stack");
                return;
            }
            int i2 = indexOf + 1;
            if (i2 != jVar.L) {
                fVar.l(((i) jVar.get(i2)).B.B.f248a, true, false);
            }
            d7.f.n(fVar, iVar);
            eVar.b();
            fVar.f3922b.b();
            fVar.b();
            return;
        }
        Object obj = fVar.f3939t.get(b10);
        obj.getClass();
        ((m) obj).d(iVar, z10);
    }

    public final void e(i iVar, boolean z10) {
        Object obj;
        q1 q1Var = this.f597c;
        Iterable iterable = (Iterable) q1Var.getValue();
        boolean z11 = iterable instanceof Collection;
        y0 y0Var = this.f599e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((i) it.next()) == iVar) {
                    Iterable<i> iterable2 = (Iterable) y0Var.A.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (i iVar2 : iterable2) {
                            if (iVar2 == iVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        q1Var.k(null, p7.j.C((Set) q1Var.getValue(), iVar));
        o1 o1Var = y0Var.A;
        o1 o1Var2 = y0Var.A;
        List list = (List) o1Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                i iVar3 = (i) obj;
                if (!nc.k.a(iVar3, iVar) && ((List) o1Var2.getValue()).lastIndexOf(iVar3) < ((List) o1Var2.getValue()).lastIndexOf(iVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        i iVar4 = (i) obj;
        if (iVar4 != null) {
            q1Var.k(null, p7.j.C((Set) q1Var.getValue(), iVar4));
        }
        d(iVar, z10);
    }

    public final void f(i iVar) {
        iVar.getClass();
        d7.f fVar = this.f602h.f552b;
        fVar.getClass();
        m0 b10 = fVar.f3938s.b(iVar.B.A);
        if (b10.equals(this.f601g)) {
            mc.l lVar = fVar.f3940u;
            if (lVar != null) {
                lVar.k(iVar);
                a(iVar);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + iVar.B + " outside of the call to navigate(). ");
            return;
        }
        Object obj = fVar.f3939t.get(b10);
        if (obj != null) {
            ((m) obj).f(iVar);
        } else {
            m9.o.g(w.d.s(new StringBuilder("NavigatorBackStack for "), iVar.B.A, " should already be created"));
        }
    }
}
