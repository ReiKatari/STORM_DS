package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w65  reason: default package */
/* loaded from: classes.dex */
public final class w65 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public w65(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = Collections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public void a(g75 g75Var, boolean z) {
        z1 z1Var;
        RecyclerView.l(g75Var);
        View view = g75Var.a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        i75 i75Var = recyclerView.j1;
        if (i75Var != null) {
            z1 j = i75Var.j();
            if (j instanceof h75) {
                z1Var = (z1) ((h75) j).X.remove(view);
            } else {
                z1Var = null;
            }
            aa7.n(view, z1Var);
        }
        if (z) {
            ArrayList arrayList = recyclerView.m0;
            if (arrayList.size() <= 0) {
                if (recyclerView.c1 != null) {
                    recyclerView.e0.j(g75Var);
                }
                if (RecyclerView.y1) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + g75Var);
                }
            } else {
                arrayList.get(0).getClass();
                c44.b();
                return;
            }
        }
        g75Var.s = null;
        g75Var.r = null;
        v65 c = c();
        c.getClass();
        int i = g75Var.f;
        ArrayList arrayList2 = c.a(i).a;
        if (((u65) c.a.get(i)).b <= arrayList2.size()) {
            gk2.w(view);
        } else if (RecyclerView.x1 && arrayList2.contains(g75Var)) {
            i.i("this scrap item already exists");
        } else {
            g75Var.m();
            arrayList2.add(g75Var);
        }
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        c75 c75Var = recyclerView.c1;
        if (i >= 0 && i < c75Var.b()) {
            if (!c75Var.g) {
                return i;
            }
            return recyclerView.c0.g(i, 0);
        }
        StringBuilder s = wh1.s("invalid position ", i, ". State item count is ");
        s.append(c75Var.b());
        s.append(recyclerView.C());
        throw new IndexOutOfBoundsException(s.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [v65, java.lang.Object] */
    public v65 c() {
        if (((v65) this.g) == null) {
            ?? obj = new Object();
            obj.a = new SparseArray();
            obj.b = 0;
            obj.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = obj;
            g();
        }
        return (v65) this.g;
    }

    public m56 d() {
        return (m56) ((tj4) this.d).getValue();
    }

    public View e(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    public void f() {
        q36 q36Var;
        Object obj;
        List c = ((u36) this.c).c();
        int size = c.size();
        int i = 0;
        while (true) {
            q36Var = null;
            if (i < size) {
                obj = c.get(i);
                if (((w36) obj).d().b()) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        w36 w36Var = (w36) obj;
        if (w36Var != null || ((q36) this.g) != null) {
            if (w36Var != null) {
                q36Var = w36Var.g0;
            }
            if (b53.x(q36Var, (q36) this.g)) {
                return;
            }
            ((qj4) this.h).i(this.b + 1);
        }
    }

    public void g() {
        RecyclerView recyclerView;
        g65 g65Var;
        v65 v65Var = (v65) this.g;
        if (v65Var != null && (g65Var = (recyclerView = (RecyclerView) this.h).k0) != null && recyclerView.q0) {
            v65Var.c.add(g65Var);
        }
    }

    public void h(g65 g65Var, boolean z) {
        v65 v65Var = (v65) this.g;
        if (v65Var != null) {
            SparseArray sparseArray = v65Var.a;
            Set set = v65Var.c;
            set.remove(g65Var);
            if (set.size() == 0 && !z) {
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList arrayList = ((u65) sparseArray.get(sparseArray.keyAt(i))).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        gk2.w(((g75) arrayList.get(i2)).a);
                    }
                }
            }
        }
    }

    public void i() {
        Object obj;
        Object obj2;
        u36 u36Var = (u36) this.c;
        qj4 qj4Var = (qj4) this.e;
        int i = 0;
        if (qj4Var.h() != this.a) {
            this.a = qj4Var.h();
            int i2 = n56.a[((be6) this.f).ordinal()];
            m56 m56Var = c74.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            List c = u36Var.c();
                            int size = c.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    if (b53.x(((w36) c.get(i3)).g0, (q36) this.g)) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    m56Var = d().h();
                                    break;
                                }
                            }
                        } else {
                            i.c();
                            return;
                        }
                    } else {
                        m56Var = d().g((q36) this.g);
                    }
                } else {
                    m56Var = d();
                }
            }
            ((tj4) this.d).setValue(m56Var);
            this.f = be6.NoRequest;
        }
        qj4 qj4Var2 = (qj4) this.h;
        if (qj4Var2.h() != this.b) {
            q36 q36Var = null;
            if (u36Var.b.b()) {
                List c2 = u36Var.c();
                int size2 = c2.size();
                while (true) {
                    if (i < size2) {
                        obj2 = c2.get(i);
                        if (((w36) obj2).d().b()) {
                            break;
                        }
                        i++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                w36 w36Var = (w36) obj2;
                if (w36Var != null) {
                    q36Var = w36Var.g0;
                }
            } else {
                List b = u36Var.b();
                int size3 = b.size();
                while (true) {
                    if (i < size3) {
                        obj = b.get(i);
                        if (((w36) obj).d().b()) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                w36 w36Var2 = (w36) obj;
                if (w36Var2 != null) {
                    q36Var = w36Var2.g0;
                }
            }
            if (!b53.x(q36Var, (q36) this.g)) {
                this.g = q36Var;
            }
            this.b = qj4Var2.h();
        }
    }

    public void j() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k(size);
        }
        arrayList.clear();
        if (RecyclerView.C1) {
            yp0 yp0Var = ((RecyclerView) this.h).b1;
            int[] iArr = (int[]) yp0Var.e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            yp0Var.d = 0;
        }
    }

    public void k(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (RecyclerView.y1) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        g75 g75Var = (g75) arrayList.get(i);
        if (RecyclerView.y1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + g75Var);
        }
        a(g75Var, true);
        arrayList.remove(i);
    }

    public void l(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        g75 N = RecyclerView.N(view);
        if (N.j()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (N.i()) {
            N.n.p(N);
        } else if (N.p()) {
            N.j &= -33;
        }
        m(N);
        if (recyclerView.K0 != null && !N.g()) {
            recyclerView.K0.d(N);
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
    public void m(defpackage.g75 r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.m(g75):void");
    }

    public void n(View view) {
        m65 m65Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        g75 N = RecyclerView.N(view);
        if ((N.j & 12) == 0 && N.k() && (m65Var = recyclerView.K0) != null) {
            oa1 oa1Var = (oa1) m65Var;
            if (N.c().isEmpty() && oa1Var.g && !N.f()) {
                if (((ArrayList) this.d) == null) {
                    this.d = new ArrayList();
                }
                N.n = this;
                N.o = true;
                ((ArrayList) this.d).add(N);
                return;
            }
        }
        if (N.f() && !N.h() && !recyclerView.k0.b) {
            i.i("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
            return;
        }
        N.n = this;
        N.o = false;
        ((ArrayList) this.c).add(N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:352:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Type inference failed for: r15v13, types: [w65] */
    /* JADX WARN: Type inference failed for: r2v11, types: [g65, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [hj7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v10, types: [z1] */
    /* JADX WARN: Type inference failed for: r9v3, types: [z1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.g75 o(int r30, long r31) {
        /*
            Method dump skipped, instructions count: 1669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.o(int, long):g75");
    }

    public void p(g75 g75Var) {
        if (g75Var.o) {
            ((ArrayList) this.d).remove(g75Var);
        } else {
            ((ArrayList) this.c).remove(g75Var);
        }
        g75Var.n = null;
        g75Var.o = false;
        g75Var.j &= -33;
    }

    public void q() {
        int i;
        ArrayList arrayList = (ArrayList) this.e;
        q65 q65Var = ((RecyclerView) this.h).l0;
        if (q65Var != null) {
            i = q65Var.j;
        } else {
            i = 0;
        }
        this.b = this.a + i;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            k(size);
        }
    }

    public w65(u36 u36Var) {
        this.c = u36Var;
        this.d = me2.G(c74.a);
        this.e = new qj4(0);
        this.f = be6.NoRequest;
        this.h = new qj4(0);
    }
}
