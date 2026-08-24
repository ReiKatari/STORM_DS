package defpackage;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg5  reason: default package */
/* loaded from: classes.dex */
public final class mg5 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public mg5(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = Collections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public void a(wg5 wg5Var, boolean z) {
        b2 b2Var;
        RecyclerView.l(wg5Var);
        View view = wg5Var.a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        yg5 yg5Var = recyclerView.k1;
        if (yg5Var != null) {
            b2 j = yg5Var.j();
            if (j instanceof xg5) {
                b2Var = (b2) ((xg5) j).X.remove(view);
            } else {
                b2Var = null;
            }
            ao7.n(view, b2Var);
        }
        if (z) {
            ArrayList arrayList = recyclerView.n0;
            if (arrayList.size() <= 0) {
                if (recyclerView.d1 != null) {
                    recyclerView.f0.o(wg5Var);
                }
                if (RecyclerView.z1) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + wg5Var);
                }
            } else {
                arrayList.get(0).getClass();
                u34.a();
                return;
            }
        }
        wg5Var.s = null;
        wg5Var.r = null;
        lg5 c = c();
        c.getClass();
        int i = wg5Var.f;
        ArrayList arrayList2 = c.a(i).a;
        if (((kg5) c.a.get(i)).b <= arrayList2.size()) {
            bl2.n(view);
        } else if (RecyclerView.y1 && arrayList2.contains(wg5Var)) {
            i.h("this scrap item already exists");
        } else {
            wg5Var.m();
            arrayList2.add(wg5Var);
        }
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        sg5 sg5Var = recyclerView.d1;
        if (i >= 0 && i < sg5Var.b()) {
            if (!sg5Var.g) {
                return i;
            }
            return recyclerView.d0.g(i, 0);
        }
        StringBuilder t = xg6.t("invalid position ", i, ". State item count is ");
        t.append(sg5Var.b());
        t.append(recyclerView.C());
        throw new IndexOutOfBoundsException(t.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lg5] */
    public lg5 c() {
        if (((lg5) this.g) == null) {
            ?? obj = new Object();
            obj.a = new SparseArray();
            obj.b = 0;
            obj.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = obj;
            g();
        }
        return (lg5) this.g;
    }

    public zg6 d() {
        return (zg6) ((vs4) this.d).getValue();
    }

    public View e(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    public void f() {
        cf6 cf6Var;
        Object obj;
        List c = ((gf6) this.c).c();
        int size = c.size();
        int i = 0;
        while (true) {
            cf6Var = null;
            if (i < size) {
                obj = c.get(i);
                if (((if6) obj).d().b()) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        if6 if6Var = (if6) obj;
        if (if6Var != null || ((cf6) this.g) != null) {
            if (if6Var != null) {
                cf6Var = if6Var.h0;
            }
            if (nb3.k(cf6Var, (cf6) this.g)) {
                return;
            }
            ((ss4) this.h).i(this.b + 1);
        }
    }

    public void g() {
        RecyclerView recyclerView;
        wf5 wf5Var;
        lg5 lg5Var = (lg5) this.g;
        if (lg5Var != null && (wf5Var = (recyclerView = (RecyclerView) this.h).l0) != null && recyclerView.r0) {
            lg5Var.c.add(wf5Var);
        }
    }

    public void h(wf5 wf5Var, boolean z) {
        lg5 lg5Var = (lg5) this.g;
        if (lg5Var != null) {
            SparseArray sparseArray = lg5Var.a;
            Set set = lg5Var.c;
            set.remove(wf5Var);
            if (set.size() == 0 && !z) {
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList arrayList = ((kg5) sparseArray.get(sparseArray.keyAt(i))).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        bl2.n(((wg5) arrayList.get(i2)).a);
                    }
                }
            }
        }
    }

    public void i() {
        Object obj;
        Object obj2;
        gf6 gf6Var = (gf6) this.c;
        ss4 ss4Var = (ss4) this.e;
        int i = 0;
        if (ss4Var.h() != this.a) {
            this.a = ss4Var.h();
            int i2 = ah6.a[((qp6) this.f).ordinal()];
            zg6 zg6Var = rf4.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            List c = gf6Var.c();
                            int size = c.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    if (nb3.k(((if6) c.get(i3)).h0, (cf6) this.g)) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    zg6Var = d().h();
                                    break;
                                }
                            }
                        } else {
                            i.d();
                            return;
                        }
                    } else {
                        zg6Var = d().g((cf6) this.g);
                    }
                } else {
                    zg6Var = d();
                }
            }
            ((vs4) this.d).setValue(zg6Var);
            this.f = qp6.NoRequest;
        }
        ss4 ss4Var2 = (ss4) this.h;
        if (ss4Var2.h() != this.b) {
            cf6 cf6Var = null;
            if (gf6Var.b.a()) {
                List c2 = gf6Var.c();
                int size2 = c2.size();
                while (true) {
                    if (i < size2) {
                        obj2 = c2.get(i);
                        if (((if6) obj2).d().b()) {
                            break;
                        }
                        i++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if6 if6Var = (if6) obj2;
                if (if6Var != null) {
                    cf6Var = if6Var.h0;
                }
            } else {
                List b = gf6Var.b();
                int size3 = b.size();
                while (true) {
                    if (i < size3) {
                        obj = b.get(i);
                        if (((if6) obj).d().b()) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                if6 if6Var2 = (if6) obj;
                if (if6Var2 != null) {
                    cf6Var = if6Var2.h0;
                }
            }
            if (!nb3.k(cf6Var, (cf6) this.g)) {
                this.g = cf6Var;
            }
            this.b = ss4Var2.h();
        }
    }

    public void j() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k(size);
        }
        arrayList.clear();
        if (RecyclerView.D1) {
            ls0 ls0Var = ((RecyclerView) this.h).c1;
            int[] iArr = (int[]) ls0Var.e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            ls0Var.d = 0;
        }
    }

    public void k(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (RecyclerView.z1) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        wg5 wg5Var = (wg5) arrayList.get(i);
        if (RecyclerView.z1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + wg5Var);
        }
        a(wg5Var, true);
        arrayList.remove(i);
    }

    public void l(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        wg5 N = RecyclerView.N(view);
        if (N.j()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (N.i()) {
            N.n.p(N);
        } else if (N.p()) {
            N.j &= -33;
        }
        m(N);
        if (recyclerView.L0 != null && !N.g()) {
            recyclerView.L0.d(N);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(wg5 wg5Var) {
        boolean z;
        boolean z2;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        ls0 ls0Var = recyclerView.c1;
        boolean i = wg5Var.i();
        View view = wg5Var.a;
        boolean z3 = false;
        boolean z4 = true;
        if (!i && view.getParent() == null) {
            if (!wg5Var.j()) {
                if (!wg5Var.o()) {
                    if ((wg5Var.j & 16) == 0) {
                        WeakHashMap weakHashMap = ao7.a;
                        if (view.hasTransientState()) {
                            z = true;
                            if (!RecyclerView.y1 && arrayList.contains(wg5Var)) {
                                StringBuilder sb = new StringBuilder("cached view received recycle internal? ");
                                sb.append(wg5Var);
                                i.j(sb, recyclerView.C());
                                return;
                            }
                            if (!wg5Var.g()) {
                                if (this.b > 0 && (wg5Var.j & 526) == 0) {
                                    int size = arrayList.size();
                                    if (size >= this.b && size > 0) {
                                        k(0);
                                        size--;
                                    }
                                    if (RecyclerView.D1 && size > 0) {
                                        int i2 = wg5Var.c;
                                        if (((int[]) ls0Var.e) != null) {
                                            int i3 = ls0Var.d * 2;
                                            for (int i4 = 0; i4 < i3; i4 += 2) {
                                                if (((int[]) ls0Var.e)[i4] == i2) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i5 = size - 1;
                                        loop1: while (i5 >= 0) {
                                            int i6 = ((wg5) arrayList.get(i5)).c;
                                            if (((int[]) ls0Var.e) == null) {
                                                break;
                                            }
                                            int i7 = ls0Var.d * 2;
                                            for (int i8 = 0; i8 < i7; i8 += 2) {
                                                if (((int[]) ls0Var.e)[i8] == i6) {
                                                    break;
                                                }
                                            }
                                            break loop1;
                                        }
                                        size = i5 + 1;
                                    }
                                    arrayList.add(size, wg5Var);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    a(wg5Var, true);
                                } else {
                                    z4 = false;
                                }
                                z3 = z2;
                            } else {
                                if (RecyclerView.z1) {
                                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.C()));
                                }
                                z4 = false;
                            }
                            recyclerView.f0.o(wg5Var);
                            if (z3 && !z4 && z) {
                                bl2.n(view);
                                wg5Var.s = null;
                                wg5Var.r = null;
                                return;
                            }
                            return;
                        }
                    }
                    z = false;
                    if (!RecyclerView.y1) {
                    }
                    if (!wg5Var.g()) {
                    }
                    recyclerView.f0.o(wg5Var);
                    if (z3) {
                        return;
                    }
                    return;
                }
                i.h("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.C()));
                return;
            }
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(wg5Var);
            i.j(sb2, recyclerView.C());
            return;
        }
        StringBuilder sb3 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb3.append(wg5Var.i());
        sb3.append(" isAttached:");
        if (view.getParent() != null) {
            z3 = true;
        }
        sb3.append(z3);
        sb3.append(recyclerView.C());
        throw new IllegalArgumentException(sb3.toString());
    }

    public void n(View view) {
        cg5 cg5Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        wg5 N = RecyclerView.N(view);
        if ((N.j & 12) == 0 && N.k() && (cg5Var = recyclerView.L0) != null) {
            ke1 ke1Var = (ke1) cg5Var;
            if (N.c().isEmpty() && ke1Var.g && !N.f()) {
                if (((ArrayList) this.d) == null) {
                    this.d = new ArrayList();
                }
                N.n = this;
                N.o = true;
                ((ArrayList) this.d).add(N);
                return;
            }
        }
        if (N.f() && !N.h() && !recyclerView.l0.b) {
            i.h("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
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
    /* JADX WARN: Type inference failed for: r15v13, types: [mg5] */
    /* JADX WARN: Type inference failed for: r2v11, types: [wf5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [dy7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v10, types: [b2] */
    /* JADX WARN: Type inference failed for: r9v3, types: [b2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wg5 o(int i, long j) {
        View view;
        boolean z;
        boolean z2;
        wg5 wg5Var;
        wg5 wg5Var2;
        long j2;
        boolean z3;
        boolean z4;
        long j3;
        boolean z5;
        boolean z6;
        ViewGroup.LayoutParams layoutParams;
        hg5 hg5Var;
        boolean z7;
        String str;
        String str2;
        RecyclerView H;
        wg5 wg5Var3;
        wg5 wg5Var4;
        wg5 wg5Var5;
        int i2;
        boolean z8;
        int size;
        int g;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        ?? r4 = (RecyclerView) this.h;
        sg5 sg5Var = r4.d1;
        if (i >= 0 && i < sg5Var.b()) {
            if (sg5Var.g) {
                ArrayList arrayList3 = (ArrayList) this.d;
                if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            wg5Var = (wg5) ((ArrayList) this.d).get(i3);
                            if (!wg5Var.p() && wg5Var.b() == i) {
                                wg5Var.a(32);
                                view = null;
                                z = true;
                                break;
                            }
                            i3++;
                        } else if (r4.l0.b && (g = r4.d0.g(i, 0)) > 0 && g < r4.l0.a()) {
                            long b = r4.l0.b(g);
                            for (int i4 = 0; i4 < size; i4++) {
                                wg5 wg5Var6 = (wg5) ((ArrayList) this.d).get(i4);
                                if (!wg5Var6.p()) {
                                    view = null;
                                    z = true;
                                    if (wg5Var6.e == b) {
                                        wg5Var6.a(32);
                                        wg5Var = wg5Var6;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (wg5Var == null) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                }
                view = null;
                z = true;
                wg5Var = null;
                if (wg5Var == null) {
                }
            } else {
                view = null;
                z = true;
                z2 = false;
                wg5Var = null;
            }
            String str3 = "RecyclerView";
            if (wg5Var == null) {
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    wg5 wg5Var7 = (wg5) arrayList.get(i5);
                    if (!wg5Var7.p() && wg5Var7.b() == i && !wg5Var7.f() && (sg5Var.g || !wg5Var7.h())) {
                        wg5Var7.a(32);
                        wg5Var2 = view;
                        wg5Var5 = wg5Var7;
                        break;
                    }
                }
                ArrayList arrayList4 = (ArrayList) r4.e0.B;
                int size3 = arrayList4.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size3) {
                        View view2 = (View) arrayList4.get(i6);
                        wg5 N = RecyclerView.N(view2);
                        wg5Var2 = view;
                        if (N.b() == i && !N.f() && !N.h()) {
                            view = view2;
                            break;
                        }
                        i6++;
                        view = wg5Var2;
                    } else {
                        wg5Var2 = view;
                        break;
                    }
                }
                if (view != null) {
                    wg5 N2 = RecyclerView.N(view);
                    dk0 dk0Var = r4.e0;
                    kk kkVar = (kk) dk0Var.X;
                    int indexOfChild = ((uf5) dk0Var.R).A.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (kkVar.d(indexOfChild)) {
                            kkVar.a(indexOfChild);
                            dk0Var.z(view);
                            dk0 dk0Var2 = r4.e0;
                            kk kkVar2 = (kk) dk0Var2.X;
                            int indexOfChild2 = ((uf5) dk0Var2.R).A.indexOfChild(view);
                            if (indexOfChild2 == -1 || kkVar2.d(indexOfChild2)) {
                                i2 = -1;
                            } else {
                                i2 = indexOfChild2 - kkVar2.b(indexOfChild2);
                            }
                            if (i2 != -1) {
                                r4.e0.k(i2);
                                n(view);
                                N2.a(8224);
                                wg5Var5 = N2;
                            } else {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(N2);
                                u34.r(sb, r4.C());
                                return wg5Var2;
                            }
                        } else {
                            e41.p(view, "trying to unhide a view that was not hidden");
                            return wg5Var2;
                        }
                    } else {
                        e41.w(view, "view is not a child, cannot hide ");
                        return wg5Var2;
                    }
                } else {
                    int size4 = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size4) {
                            wg5Var5 = (wg5) arrayList2.get(i7);
                            if (!wg5Var5.f() && wg5Var5.b() == i && !wg5Var5.d()) {
                                arrayList2.remove(i7);
                                if (RecyclerView.z1) {
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + wg5Var5);
                                }
                            } else {
                                i7++;
                            }
                        } else {
                            wg5Var5 = wg5Var2;
                            break;
                        }
                    }
                }
                if (wg5Var5 != null) {
                    if (wg5Var5.h()) {
                        if (RecyclerView.y1 && !sg5Var.g) {
                            i.m("should not receive a removed view unless it is pre layout".concat(r4.C()));
                            return wg5Var2;
                        }
                        z8 = sg5Var.g;
                    } else {
                        int i8 = wg5Var5.c;
                        if (i8 >= 0 && i8 < r4.l0.a()) {
                            if (sg5Var.g || r4.l0.c(wg5Var5.c) == wg5Var5.f) {
                                wf5 wf5Var = r4.l0;
                                if (!wf5Var.b || wg5Var5.e == wf5Var.b(wg5Var5.c)) {
                                    z8 = z;
                                }
                            }
                            z8 = false;
                        } else {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + wg5Var5 + r4.C());
                        }
                    }
                    if (!z8) {
                        wg5Var5.a(4);
                        if (wg5Var5.i()) {
                            r4.removeDetachedView(wg5Var5.a, false);
                            wg5Var5.n.p(wg5Var5);
                        } else if (wg5Var5.p()) {
                            wg5Var5.j &= -33;
                        }
                        m(wg5Var5);
                        wg5Var = wg5Var2;
                    } else {
                        wg5Var = wg5Var5;
                        z2 = z;
                    }
                } else {
                    wg5Var = wg5Var5;
                }
            } else {
                wg5Var2 = view;
            }
            if (wg5Var == null) {
                int g2 = r4.d0.g(i, 0);
                if (g2 >= 0 && g2 < r4.l0.a()) {
                    int c = r4.l0.c(g2);
                    wf5 wf5Var2 = r4.l0;
                    j2 = 3;
                    if (!wf5Var2.b) {
                        str = "RecyclerView";
                    } else {
                        long b2 = wf5Var2.b(g2);
                        int size5 = arrayList.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                wg5 wg5Var8 = (wg5) arrayList.get(size5);
                                str = str3;
                                long j4 = wg5Var8.e;
                                View view3 = wg5Var8.a;
                                if (j4 == b2 && !wg5Var8.p()) {
                                    if (c == wg5Var8.f) {
                                        wg5Var8.a(32);
                                        if (wg5Var8.h() && !sg5Var.g) {
                                            wg5Var8.j = (wg5Var8.j & (-15)) | 2;
                                        }
                                        wg5Var4 = wg5Var8;
                                    } else {
                                        arrayList.remove(size5);
                                        r4.removeDetachedView(view3, false);
                                        wg5 N3 = RecyclerView.N(view3);
                                        N3.n = wg5Var2;
                                        N3.o = false;
                                        N3.j &= -33;
                                        m(N3);
                                    }
                                }
                                size5--;
                                str3 = str;
                                wg5Var2 = null;
                            } else {
                                str = str3;
                                int size6 = arrayList2.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    wg5Var4 = (wg5) arrayList2.get(size6);
                                    long j5 = b2;
                                    if (wg5Var4.e == j5 && !wg5Var4.d()) {
                                        if (c == wg5Var4.f) {
                                            arrayList2.remove(size6);
                                        } else {
                                            k(size6);
                                        }
                                    } else {
                                        size6--;
                                        b2 = j5;
                                    }
                                }
                                wg5Var4 = null;
                            }
                        }
                        if (wg5Var4 != null) {
                            wg5Var4.c = g2;
                            wg5Var = wg5Var4;
                            z2 = z;
                        } else {
                            wg5Var = wg5Var4;
                        }
                    }
                    if (wg5Var == null) {
                        if (RecyclerView.z1) {
                            str2 = str;
                            Log.d(str2, "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        } else {
                            str2 = str;
                        }
                        kg5 kg5Var = (kg5) c().a.get(c);
                        if (kg5Var != null) {
                            ArrayList arrayList5 = kg5Var.a;
                            if (!arrayList5.isEmpty()) {
                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                    if (!((wg5) arrayList5.get(size7)).d()) {
                                        wg5Var3 = (wg5) arrayList5.remove(size7);
                                        break;
                                    }
                                }
                            }
                        }
                        wg5Var3 = null;
                        if (wg5Var3 != null) {
                            wg5Var3.m();
                            boolean z9 = RecyclerView.y1;
                        }
                        wg5Var = wg5Var3;
                    } else {
                        str2 = str;
                    }
                    if (wg5Var == null) {
                        long nanoTime = r4.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j6 = ((lg5) this.g).a(c).c;
                            if (j6 != 0 && j6 + nanoTime >= j) {
                                return null;
                            }
                        }
                        ?? r2 = r4.l0;
                        r2.getClass();
                        try {
                            if (v87.a()) {
                                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(c)));
                            }
                            wg5Var = r2.f(r4, c);
                            View view4 = wg5Var.a;
                            if (view4.getParent() == null) {
                                wg5Var.f = c;
                                Trace.endSection();
                                if (RecyclerView.D1 && (H = RecyclerView.H(view4)) != null) {
                                    wg5Var.b = new WeakReference(H);
                                }
                                long nanoTime2 = r4.getNanoTime() - nanoTime;
                                kg5 a = ((lg5) this.g).a(c);
                                long j7 = a.c;
                                if (j7 != 0) {
                                    nanoTime2 = (nanoTime2 / 4) + ((j7 / 4) * 3);
                                }
                                a.c = nanoTime2;
                                if (RecyclerView.z1) {
                                    Log.d(str2, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                            } else {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                        } finally {
                            Trace.endSection();
                        }
                    }
                } else {
                    StringBuilder q = i61.q(i, g2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                    q.append(sg5Var.b());
                    q.append(r4.C());
                    throw new IndexOutOfBoundsException(q.toString());
                }
            } else {
                j2 = 3;
            }
            View view5 = wg5Var.a;
            if (z2 && !sg5Var.g) {
                int i9 = wg5Var.j;
                if ((i9 & 8192) != 0) {
                    wg5Var.j = i9 & (-8193);
                    if (sg5Var.j) {
                        cg5.b(wg5Var);
                        cg5 cg5Var = r4.L0;
                        wg5Var.c();
                        cg5Var.getClass();
                        ?? obj = new Object();
                        obj.b(wg5Var);
                        r4.a0(wg5Var, obj);
                    }
                }
            }
            if (sg5Var.g && wg5Var.e()) {
                wg5Var.g = i;
            } else if (!wg5Var.e() || (wg5Var.j & 2) != 0 || wg5Var.f()) {
                if (RecyclerView.y1 && wg5Var.h()) {
                    StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb2.append(wg5Var);
                    u34.r(sb2, r4.C());
                    return null;
                }
                int g3 = r4.d0.g(i, 0);
                wg5Var.s = null;
                wg5Var.r = r4;
                int i10 = wg5Var.f;
                long nanoTime3 = r4.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j8 = ((lg5) this.g).a(i10).d;
                    if (j8 != 0 && j8 + nanoTime3 >= j) {
                        z6 = false;
                        z5 = z;
                        layoutParams = view5.getLayoutParams();
                        if (layoutParams == null) {
                            hg5Var = (hg5) r4.generateDefaultLayoutParams();
                            view5.setLayoutParams(hg5Var);
                        } else if (!r4.checkLayoutParams(layoutParams)) {
                            hg5Var = (hg5) r4.generateLayoutParams(layoutParams);
                            view5.setLayoutParams(hg5Var);
                        } else {
                            hg5Var = (hg5) layoutParams;
                        }
                        hg5Var.a = wg5Var;
                        if (!z2 && z6) {
                            z7 = z5;
                        } else {
                            z7 = false;
                        }
                        hg5Var.d = z7;
                        return wg5Var;
                    }
                }
                if (wg5Var.j()) {
                    r4.attachViewToParent(view5, r4.getChildCount(), view5.getLayoutParams());
                    z3 = z;
                } else {
                    z3 = false;
                }
                wf5 wf5Var3 = r4.l0;
                wf5Var3.getClass();
                if (wg5Var.s == null) {
                    z4 = z;
                } else {
                    z4 = false;
                }
                if (z4) {
                    wg5Var.c = g3;
                    j3 = nanoTime3;
                    if (wf5Var3.b) {
                        wg5Var.e = wf5Var3.b(g3);
                    }
                    wg5Var.j = (wg5Var.j & (-520)) | 1;
                    if (v87.a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(wg5Var.f)));
                    }
                } else {
                    j3 = nanoTime3;
                }
                wg5Var.s = wf5Var3;
                if (RecyclerView.y1) {
                    if (view5.getParent() == null && view5.isAttachedToWindow() != wg5Var.j()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + wg5Var.j() + ", attached to window: " + view5.isAttachedToWindow() + ", holder: " + wg5Var);
                    } else if (view5.getParent() == null && view5.isAttachedToWindow()) {
                        e41.y(wg5Var, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                xg5 xg5Var = null;
                wg5Var.c();
                wf5Var3.e(wg5Var, g3);
                if (z4) {
                    ArrayList arrayList6 = wg5Var.k;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    wg5Var.j &= -1025;
                    ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                    if (layoutParams2 instanceof hg5) {
                        ((hg5) layoutParams2).c = z;
                    }
                }
                if (z3) {
                    r4.detachViewFromParent(view5);
                }
                long nanoTime4 = r4.getNanoTime() - j3;
                kg5 a2 = ((lg5) this.g).a(wg5Var.f);
                long j9 = a2.d;
                if (j9 != 0) {
                    nanoTime4 = (nanoTime4 / 4) + ((j9 / 4) * j2);
                }
                a2.d = nanoTime4;
                AccessibilityManager accessibilityManager = r4.A0;
                if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                    z5 = true;
                    if (view5.getImportantForAccessibility() == 0) {
                        view5.setImportantForAccessibility(1);
                    }
                    yg5 yg5Var = r4.k1;
                    if (yg5Var != null) {
                        b2 j10 = yg5Var.j();
                        if (j10 instanceof xg5) {
                            xg5 xg5Var2 = (xg5) j10;
                            View.AccessibilityDelegate e = ao7.e(view5);
                            if (e != null) {
                                if (e instanceof a2) {
                                    xg5Var = ((a2) e).a;
                                } else {
                                    xg5Var = new b2(e);
                                }
                            }
                            if (xg5Var != null && xg5Var != xg5Var2) {
                                xg5Var2.X.put(view5, xg5Var);
                            }
                        }
                        ao7.n(view5, j10);
                    }
                } else {
                    z5 = true;
                }
                if (sg5Var.g) {
                    wg5Var.g = i;
                }
                z6 = z5;
                layoutParams = view5.getLayoutParams();
                if (layoutParams == null) {
                }
                hg5Var.a = wg5Var;
                if (!z2) {
                }
                z7 = false;
                hg5Var.d = z7;
                return wg5Var;
            }
            z5 = z;
            z6 = false;
            layoutParams = view5.getLayoutParams();
            if (layoutParams == null) {
            }
            hg5Var.a = wg5Var;
            if (!z2) {
            }
            z7 = false;
            hg5Var.d = z7;
            return wg5Var;
        }
        StringBuilder q2 = i61.q(i, i, "Invalid item position ", "(", "). Item count:");
        q2.append(sg5Var.b());
        q2.append(r4.C());
        throw new IndexOutOfBoundsException(q2.toString());
    }

    public void p(wg5 wg5Var) {
        if (wg5Var.o) {
            ((ArrayList) this.d).remove(wg5Var);
        } else {
            ((ArrayList) this.c).remove(wg5Var);
        }
        wg5Var.n = null;
        wg5Var.o = false;
        wg5Var.j &= -33;
    }

    public void q() {
        int i;
        ArrayList arrayList = (ArrayList) this.e;
        gg5 gg5Var = ((RecyclerView) this.h).m0;
        if (gg5Var != null) {
            i = gg5Var.j;
        } else {
            i = 0;
        }
        this.b = this.a + i;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            k(size);
        }
    }

    public mg5(gf6 gf6Var) {
        this.c = gf6Var;
        this.d = np2.Y(rf4.a);
        this.e = new ss4(0);
        this.f = qp6.NoRequest;
        this.h = new ss4(0);
    }
}
