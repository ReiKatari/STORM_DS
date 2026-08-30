package d5;

import a1.x0;
import a1.z0;
import a7.w;
import a7.x;
import a7.z;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import h1.c3;
import j7.i0;
import j7.j1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
import o1.r;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3859a;

    /* renamed from: b  reason: collision with root package name */
    public int f3860b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3861c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3862d;

    /* renamed from: e  reason: collision with root package name */
    public Serializable f3863e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3864f;

    public j(o1.g gVar) {
        this.f3859a = 3;
        this.f3861c = gVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new l7.a(0, 0));
        this.f3862d = arrayList;
        this.f3863e = new ArrayList();
        this.f3864f = q.A;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [double[], java.io.Serializable] */
    public void a(double d4, float f8) {
        int length = ((float[]) this.f3861c).length + 1;
        int binarySearch = Arrays.binarySearch((double[]) this.f3862d, d4);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f3862d = Arrays.copyOf((double[]) this.f3862d, length);
        this.f3861c = Arrays.copyOf((float[]) this.f3861c, length);
        this.f3863e = new double[length];
        double[] dArr = (double[]) this.f3862d;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        ((double[]) this.f3862d)[binarySearch] = d4;
        ((float[]) this.f3861c)[binarySearch] = f8;
    }

    public void b(View view, int i2, boolean z10) {
        int l10;
        RecyclerView recyclerView = ((i0) this.f3861c).A;
        if (i2 < 0) {
            l10 = recyclerView.getChildCount();
        } else {
            l10 = l(i2);
        }
        ((c3) this.f3862d).f(l10, z10);
        if (z10) {
            p(view);
        }
        recyclerView.addView(view, l10);
        RecyclerView.M(view);
    }

    public void c(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int l10;
        RecyclerView recyclerView = ((i0) this.f3861c).A;
        if (i2 < 0) {
            l10 = recyclerView.getChildCount();
        } else {
            l10 = l(i2);
        }
        ((c3) this.f3862d).f(l10, z10);
        if (z10) {
            p(view);
        }
        j1 M = RecyclerView.M(view);
        if (M != null) {
            if (!M.j() && !M.o()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(M);
                m9.o.n(sb2, recyclerView.B());
                return;
            }
            if (RecyclerView.f1617w1) {
                Log.d("RecyclerView", "reAttach " + M);
            }
            M.f7603j &= -257;
        } else if (RecyclerView.f1616v1) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            String B = recyclerView.B();
            sb3.append(", index: ");
            sb3.append(l10);
            sb3.append(B);
            throw new IllegalArgumentException(sb3.toString());
        }
        recyclerView.attachViewToParent(view, l10, layoutParams);
    }

    public void d(int i2) {
        int l10 = l(i2);
        ((c3) this.f3862d).h(l10);
        RecyclerView recyclerView = ((i0) this.f3861c).A;
        View childAt = recyclerView.getChildAt(l10);
        if (childAt != null) {
            j1 M = RecyclerView.M(childAt);
            if (M != null) {
                if (M.j() && !M.o()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(M);
                    m9.o.n(sb2, recyclerView.B());
                    return;
                }
                if (RecyclerView.f1617w1) {
                    Log.d("RecyclerView", "tmpDetach " + M);
                }
                M.a(256);
            }
        } else if (RecyclerView.f1616v1) {
            String B = recyclerView.B();
            throw new IllegalArgumentException("No view at offset " + l10 + B);
        }
        recyclerView.detachViewFromParent(l10);
    }

    public x e(int i2) {
        return g(i2, (z) this.f3861c, null, false);
    }

    public x f(String str, boolean z10) {
        Object obj;
        z zVar;
        str.getClass();
        x0 x0Var = (x0) this.f3862d;
        x0Var.getClass();
        Iterator it = ((uc.a) uc.h.I(new z0(0, x0Var))).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                x xVar = (x) obj;
                if (!vc.o.P((String) xVar.B.f252e, str, false)) {
                    if (xVar.B.l(str) != null) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        x xVar2 = (x) obj;
        if (xVar2 == null) {
            if (!z10 || (zVar = ((z) this.f3861c).L) == null) {
                return null;
            }
            j jVar = zVar.Y;
            jVar.getClass();
            if (vc.h.j0(str)) {
                return null;
            }
            return jVar.f(str, true);
        }
        return xVar2;
    }

    public x g(int i2, x xVar, x xVar2, boolean z10) {
        z zVar = (z) this.f3861c;
        x0 x0Var = (x0) this.f3862d;
        x xVar3 = (x) x0Var.c(i2);
        if (xVar2 != null) {
            if (nc.k.a(xVar3, xVar2) && nc.k.a(xVar3.L, xVar2.L)) {
                return xVar3;
            }
            xVar3 = null;
        } else if (xVar3 != null) {
            return xVar3;
        }
        if (z10) {
            Iterator it = ((uc.a) uc.h.I(new z0(0, x0Var))).iterator();
            while (true) {
                if (it.hasNext()) {
                    x xVar4 = (x) it.next();
                    if ((xVar4 instanceof z) && !xVar4.equals(xVar)) {
                        xVar3 = ((z) xVar4).Y.g(i2, zVar, xVar2, true);
                        continue;
                    } else {
                        xVar3 = null;
                        continue;
                    }
                    if (xVar3 != null) {
                        break;
                    }
                } else {
                    xVar3 = null;
                    break;
                }
            }
        }
        if (xVar3 == null) {
            z zVar2 = zVar.L;
            if (zVar2 == null || zVar2.equals(xVar)) {
                return null;
            }
            z zVar3 = zVar.L;
            zVar3.getClass();
            return zVar3.Y.g(i2, zVar, xVar2, z10);
        }
        return xVar3;
    }

    public View h(int i2) {
        return ((i0) this.f3861c).A.getChildAt(l(i2));
    }

    public int i() {
        return ((i0) this.f3861c).A.getChildCount() - ((ArrayList) this.f3863e).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public r j(int i2) {
        ArrayList arrayList;
        int i10 = this.f3860b;
        int i11 = i2 * i10;
        int m = m() - i11;
        if (i10 > m) {
            i10 = m;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 == this.f3864f.size()) {
            arrayList = this.f3864f;
        } else {
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList2.add(new o1.b(1));
            }
            this.f3864f = arrayList2;
            arrayList = arrayList2;
        }
        return new r(i11, arrayList);
    }

    public int k(int i2) {
        if (m() <= 0) {
            return 0;
        }
        if (i2 >= m()) {
            k1.b.a("ItemIndex > total count");
        }
        return i2 / this.f3860b;
    }

    public int l(int i2) {
        c3 c3Var = (c3) this.f3862d;
        if (i2 >= 0) {
            int childCount = ((i0) this.f3861c).A.getChildCount();
            int i10 = i2;
            while (i10 < childCount) {
                int c4 = i2 - (i10 - c3Var.c(i10));
                if (c4 == 0) {
                    while (c3Var.e(i10)) {
                        i10++;
                    }
                    return i10;
                }
                i10 += c4;
            }
            return -1;
        }
        return -1;
    }

    public int m() {
        return ((o1.g) this.f3861c).f10511c.f2624b;
    }

    public View n(int i2) {
        return ((i0) this.f3861c).A.getChildAt(i2);
    }

    public int o() {
        return ((i0) this.f3861c).A.getChildCount();
    }

    public void p(View view) {
        ((ArrayList) this.f3863e).add(view);
        i0 i0Var = (i0) this.f3861c;
        j1 M = RecyclerView.M(view);
        if (M != null) {
            View view2 = M.f7594a;
            RecyclerView recyclerView = i0Var.A;
            int i2 = M.f7609q;
            if (i2 != -1) {
                M.f7608p = i2;
            } else {
                M.f7608p = view2.getImportantForAccessibility();
            }
            if (recyclerView.Q()) {
                M.f7609q = 4;
                recyclerView.f1647n1.add(M);
                return;
            }
            view2.setImportantForAccessibility(4);
        }
    }

    public w q(w wVar, a4.n nVar, boolean z10, x xVar) {
        w wVar2;
        z zVar = (z) this.f3861c;
        ArrayList arrayList = new ArrayList();
        Iterator it = zVar.iterator();
        while (true) {
            d7.h hVar = (d7.h) it;
            wVar2 = null;
            if (!hVar.hasNext()) {
                break;
            }
            x xVar2 = (x) hVar.next();
            if (!nc.k.a(xVar2, xVar)) {
                wVar2 = xVar2.d(nVar);
            }
            if (wVar2 != null) {
                arrayList.add(wVar2);
            }
        }
        w wVar3 = (w) zb.l.b0(arrayList);
        z zVar2 = zVar.L;
        if (zVar2 != null && z10 && !zVar2.equals(xVar)) {
            wVar2 = zVar2.e(nVar, zVar);
        }
        return (w) zb.l.b0(zb.k.v(new w[]{wVar, wVar3, wVar2}));
    }

    public int r(int i2) {
        p1.h d4 = ((o1.g) this.f3861c).f10511c.d(i2);
        return (int) ((o1.b) ((o1.f) d4.f11214c).f10506a.j(o1.q.f10584a, Integer.valueOf(i2 - d4.f11212a))).f10497a;
    }

    public void s(View view) {
        if (((ArrayList) this.f3863e).remove(view)) {
            i0 i0Var = (i0) this.f3861c;
            j1 M = RecyclerView.M(view);
            if (M != null) {
                RecyclerView recyclerView = i0Var.A;
                int i2 = M.f7608p;
                if (recyclerView.Q()) {
                    M.f7609q = i2;
                    recyclerView.f1647n1.add(M);
                } else {
                    M.f7594a.setImportantForAccessibility(i2);
                }
                M.f7608p = 0;
            }
        }
    }

    public String toString() {
        switch (this.f3859a) {
            case 0:
                return "pos =" + Arrays.toString((double[]) this.f3862d) + " period=" + Arrays.toString((float[]) this.f3861c);
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                return super.toString();
            case 2:
                return ((c3) this.f3862d).toString() + ", hidden list:" + ((ArrayList) this.f3863e).size();
        }
    }

    public /* synthetic */ j() {
        this.f3859a = 0;
    }

    public j(z zVar) {
        this.f3859a = 1;
        this.f3861c = zVar;
        this.f3862d = new x0(0);
    }

    public j(i0 i0Var) {
        this.f3859a = 2;
        this.f3860b = 0;
        this.f3861c = i0Var;
        this.f3862d = new c3();
        this.f3863e = new ArrayList();
    }
}
