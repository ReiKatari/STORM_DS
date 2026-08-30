package c1;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    public int f2429a;

    /* renamed from: b  reason: collision with root package name */
    public int f2430b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2431c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2432d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2433e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2434f;

    /* renamed from: g  reason: collision with root package name */
    public Object f2435g;

    /* renamed from: h  reason: collision with root package name */
    public Object f2436h;

    public h2(RecyclerView recyclerView) {
        this.f2436h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2431c = arrayList;
        this.f2432d = null;
        this.f2433e = new ArrayList();
        this.f2434f = Collections.unmodifiableList(arrayList);
        this.f2429a = 2;
        this.f2430b = 2;
    }

    public void a(j7.j1 j1Var, boolean z10) {
        a6.b bVar;
        RecyclerView.l(j1Var);
        View view = j1Var.f7594a;
        RecyclerView recyclerView = (RecyclerView) this.f2436h;
        j7.l1 l1Var = recyclerView.f1635h1;
        if (l1Var != null) {
            a6.b j2 = l1Var.j();
            if (j2 instanceof j7.k1) {
                bVar = (a6.b) ((j7.k1) j2).X.remove(view);
            } else {
                bVar = null;
            }
            a6.x0.o(view, bVar);
        }
        if (z10) {
            ArrayList arrayList = recyclerView.f1642l0;
            if (arrayList.size() <= 0) {
                j7.k0 k0Var = recyclerView.f1638j0;
                if (k0Var != null) {
                    k0Var.g(j1Var);
                }
                if (recyclerView.f1621a1 != null) {
                    recyclerView.f1626d0.d(j1Var);
                }
                if (RecyclerView.f1617w1) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + j1Var);
                }
            } else {
                arrayList.get(0).getClass();
                m9.o.b();
                return;
            }
        }
        j1Var.f7611s = null;
        j1Var.f7610r = null;
        j7.z0 c4 = c();
        c4.getClass();
        int i2 = j1Var.f7599f;
        ArrayList arrayList2 = c4.a(i2).f7742a;
        if (((j7.y0) c4.f7750a.get(i2)).f7743b <= arrayList2.size()) {
            ij.a.A(view);
        } else if (RecyclerView.f1616v1 && arrayList2.contains(j1Var)) {
            a0.j.h("this scrap item already exists");
        } else {
            j1Var.m();
            arrayList2.add(j1Var);
        }
    }

    public int b(int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f2436h;
        j7.f1 f1Var = recyclerView.f1621a1;
        if (i2 >= 0 && i2 < f1Var.b()) {
            if (!f1Var.f7556g) {
                return i2;
            }
            return recyclerView.f1622b0.g(i2, 0);
        }
        StringBuilder i10 = kc.a.i("invalid position ", i2, ". State item count is ");
        i10.append(f1Var.b());
        i10.append(recyclerView.B());
        throw new IndexOutOfBoundsException(i10.toString());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j7.z0, java.lang.Object] */
    public j7.z0 c() {
        if (((j7.z0) this.f2435g) == null) {
            ?? obj = new Object();
            obj.f7750a = new SparseArray();
            obj.f7751b = 0;
            obj.f7752c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2435g = obj;
            g();
        }
        return (j7.z0) this.f2435g;
    }

    public f2 d() {
        return (f2) ((n2.f1) this.f2432d).getValue();
    }

    public View e(int i2) {
        return o(i2, Long.MAX_VALUE).f7594a;
    }

    public void f() {
        l1 l1Var;
        Object obj;
        z2.p pVar = ((p1) this.f2431c).f2501h;
        int size = pVar.size();
        int i2 = 0;
        while (true) {
            l1Var = null;
            if (i2 < size) {
                obj = pVar.get(i2);
                if (((q1) obj).d().b()) {
                    break;
                }
                i2++;
            } else {
                obj = null;
                break;
            }
        }
        q1 q1Var = (q1) obj;
        if (q1Var != null || ((l1) this.f2436h) != null) {
            if (q1Var != null) {
                l1Var = q1Var.f2511f0;
            }
            if (nc.k.a(l1Var, (l1) this.f2436h)) {
                return;
            }
            ((n2.c1) this.f2434f).h(this.f2430b + 1);
        }
    }

    public void g() {
        RecyclerView recyclerView;
        j7.k0 k0Var;
        j7.z0 z0Var = (j7.z0) this.f2435g;
        if (z0Var != null && (k0Var = (recyclerView = (RecyclerView) this.f2436h).f1638j0) != null && recyclerView.p0) {
            z0Var.f7752c.add(k0Var);
        }
    }

    public void h(j7.k0 k0Var, boolean z10) {
        j7.z0 z0Var = (j7.z0) this.f2435g;
        if (z0Var != null) {
            SparseArray sparseArray = z0Var.f7750a;
            Set set = z0Var.f7752c;
            set.remove(k0Var);
            if (set.size() == 0 && !z10) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    ArrayList arrayList = ((j7.y0) sparseArray.get(sparseArray.keyAt(i2))).f7742a;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ij.a.A(((j7.j1) arrayList.get(i10)).f7594a);
                    }
                }
            }
        }
    }

    public void i() {
        Object obj;
        Object obj2;
        p1 p1Var = (p1) this.f2431c;
        z2.p pVar = p1Var.f2501h;
        n2.c1 c1Var = (n2.c1) this.f2433e;
        int i2 = 0;
        if (c1Var.g() != this.f2429a) {
            this.f2429a = c1Var.g();
            int i10 = g2.f2426a[((r2) this.f2435g).ordinal()];
            f2 f2Var = i1.f2444a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            int size = pVar.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                    if (nc.k.a(((q1) pVar.get(i11)).f2511f0, (l1) this.f2436h)) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    f2Var = d().h();
                                    break;
                                }
                            }
                        } else {
                            m9.o.o();
                            return;
                        }
                    } else {
                        f2Var = d().g((l1) this.f2436h);
                    }
                } else {
                    f2Var = d();
                }
            }
            ((n2.f1) this.f2432d).setValue(f2Var);
            this.f2435g = r2.NoRequest;
        }
        n2.c1 c1Var2 = (n2.c1) this.f2434f;
        if (c1Var2.g() != this.f2430b) {
            l1 l1Var = null;
            if (p1Var.f2495b.b()) {
                int size2 = pVar.size();
                while (true) {
                    if (i2 < size2) {
                        obj2 = pVar.get(i2);
                        if (((q1) obj2).d().b()) {
                            break;
                        }
                        i2++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                q1 q1Var = (q1) obj2;
                if (q1Var != null) {
                    l1Var = q1Var.f2511f0;
                }
            } else {
                z2.p pVar2 = p1Var.f2500g;
                int size3 = pVar2.size();
                while (true) {
                    if (i2 < size3) {
                        obj = pVar2.get(i2);
                        if (((q1) obj).d().b()) {
                            break;
                        }
                        i2++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                q1 q1Var2 = (q1) obj;
                if (q1Var2 != null) {
                    l1Var = q1Var2.f2511f0;
                }
            }
            if (!nc.k.a(l1Var, (l1) this.f2436h)) {
                this.f2436h = l1Var;
            }
            this.f2430b = c1Var2.g();
        }
    }

    public void j() {
        ArrayList arrayList = (ArrayList) this.f2433e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k(size);
        }
        arrayList.clear();
        if (RecyclerView.A1) {
            f2.s sVar = ((RecyclerView) this.f2436h).Z0;
            int[] iArr = (int[]) sVar.f4792e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            sVar.f4791d = 0;
        }
    }

    public void k(int i2) {
        ArrayList arrayList = (ArrayList) this.f2433e;
        if (RecyclerView.f1617w1) {
            Log.d("RecyclerView", "Recycling cached view at index " + i2);
        }
        j7.j1 j1Var = (j7.j1) arrayList.get(i2);
        if (RecyclerView.f1617w1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + j1Var);
        }
        a(j1Var, true);
        arrayList.remove(i2);
    }

    public void l(View view) {
        RecyclerView recyclerView = (RecyclerView) this.f2436h;
        j7.j1 M = RecyclerView.M(view);
        if (M.j()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (M.i()) {
            M.f7606n.p(M);
        } else if (M.p()) {
            M.f7603j &= -33;
        }
        m(M);
        if (recyclerView.I0 != null && !M.g()) {
            recyclerView.I0.d(M);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(j7.j1 r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.h2.m(j7.j1):void");
    }

    public void n(View view) {
        j7.q0 q0Var;
        RecyclerView recyclerView = (RecyclerView) this.f2436h;
        j7.j1 M = RecyclerView.M(view);
        if ((M.f7603j & 12) == 0 && M.k() && (q0Var = recyclerView.I0) != null) {
            j7.i iVar = (j7.i) q0Var;
            if (M.c().isEmpty() && iVar.f7579g && !M.f()) {
                if (((ArrayList) this.f2432d) == null) {
                    this.f2432d = new ArrayList();
                }
                M.f7606n = this;
                M.f7607o = true;
                ((ArrayList) this.f2432d).add(M);
                return;
            }
        }
        if (M.f() && !M.h() && !recyclerView.f1638j0.f7620b) {
            a0.j.h("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.B()));
            return;
        }
        M.f7606n = this;
        M.f7607o = false;
        ((ArrayList) this.f2431c).add(M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x04b9, code lost:
        if (r12.f() == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0682 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Type inference failed for: r10v2, types: [a6.b] */
    /* JADX WARN: Type inference failed for: r15v13, types: [c1.h2] */
    /* JADX WARN: Type inference failed for: r2v11, types: [j7.k0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [a6.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v5, types: [a6.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j7.j1 o(int r30, long r31) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.h2.o(int, long):j7.j1");
    }

    public void p(j7.j1 j1Var) {
        if (j1Var.f7607o) {
            ((ArrayList) this.f2432d).remove(j1Var);
        } else {
            ((ArrayList) this.f2431c).remove(j1Var);
        }
        j1Var.f7606n = null;
        j1Var.f7607o = false;
        j1Var.f7603j &= -33;
    }

    public void q() {
        int i2;
        ArrayList arrayList = (ArrayList) this.f2433e;
        j7.u0 u0Var = ((RecyclerView) this.f2436h).f1640k0;
        if (u0Var != null) {
            i2 = u0Var.f7717j;
        } else {
            i2 = 0;
        }
        this.f2430b = this.f2429a + i2;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2430b; size--) {
            k(size);
        }
    }

    public h2(p1 p1Var) {
        this.f2431c = p1Var;
        this.f2432d = n2.s.w(i1.f2444a);
        this.f2433e = new n2.c1(0);
        this.f2435g = r2.NoRequest;
        this.f2434f = new n2.c1(0);
    }
}
