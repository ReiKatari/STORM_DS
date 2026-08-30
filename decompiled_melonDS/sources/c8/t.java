package c8;

import a1.w0;
import a6.e1;
import a6.i1;
import a6.p0;
import a6.x0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t implements Cloneable {

    /* renamed from: u0  reason: collision with root package name */
    public static final Animator[] f2693u0 = new Animator[0];

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f2694v0 = {2, 1, 3, 4};

    /* renamed from: w0  reason: collision with root package name */
    public static final na.f f2695w0 = new Object();

    /* renamed from: x0  reason: collision with root package name */
    public static final ThreadLocal f2696x0 = new ThreadLocal();

    /* renamed from: e0  reason: collision with root package name */
    public ArrayList f2700e0;

    /* renamed from: f0  reason: collision with root package name */
    public ArrayList f2701f0;

    /* renamed from: g0  reason: collision with root package name */
    public r[] f2702g0;
    public k0.d p0;

    /* renamed from: r0  reason: collision with root package name */
    public long f2712r0;

    /* renamed from: s0  reason: collision with root package name */
    public q f2713s0;

    /* renamed from: t0  reason: collision with root package name */
    public long f2714t0;
    public final String A = getClass().getName();
    public long B = -1;
    public long L = -1;
    public TimeInterpolator R = null;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public b9.e Z = new b9.e(3);

    /* renamed from: b0  reason: collision with root package name */
    public b9.e f2697b0 = new b9.e(3);

    /* renamed from: c0  reason: collision with root package name */
    public z f2698c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    public final int[] f2699d0 = f2694v0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f2703h0 = new ArrayList();

    /* renamed from: i0  reason: collision with root package name */
    public Animator[] f2704i0 = f2693u0;

    /* renamed from: j0  reason: collision with root package name */
    public int f2705j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f2706k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2707l0 = false;

    /* renamed from: m0  reason: collision with root package name */
    public t f2708m0 = null;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f2709n0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f2710o0 = new ArrayList();

    /* renamed from: q0  reason: collision with root package name */
    public na.f f2711q0 = f2695w0;

    public static void c(b9.e eVar, View view, b0 b0Var) {
        a1.e eVar2 = (a1.e) eVar.X;
        SparseArray sparseArray = (SparseArray) eVar.L;
        a1.q qVar = (a1.q) eVar.R;
        ((a1.e) eVar.B).put(view, b0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = x0.f533a;
        String e6 = p0.e(view);
        if (e6 != null) {
            if (eVar2.containsKey(e6)) {
                eVar2.put(e6, null);
            } else {
                eVar2.put(e6, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (qVar.c(itemIdAtPosition) >= 0) {
                    View view2 = (View) qVar.b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        qVar.g(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                qVar.g(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [a1.w0, java.lang.Object, a1.e] */
    public static a1.e s() {
        ThreadLocal threadLocal = f2696x0;
        a1.e eVar = (a1.e) threadLocal.get();
        if (eVar == null) {
            ?? w0Var = new w0(0);
            threadLocal.set(w0Var);
            return w0Var;
        }
        return eVar;
    }

    public static boolean z(b0 b0Var, b0 b0Var2, String str) {
        Object obj = b0Var.f2620a.get(str);
        Object obj2 = b0Var2.f2620a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(t tVar, s sVar, boolean z10) {
        t tVar2 = this.f2708m0;
        if (tVar2 != null) {
            tVar2.A(tVar, sVar, z10);
        }
        ArrayList arrayList = this.f2709n0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f2709n0.size();
            r[] rVarArr = this.f2702g0;
            if (rVarArr == null) {
                rVarArr = new r[size];
            }
            this.f2702g0 = null;
            r[] rVarArr2 = (r[]) this.f2709n0.toArray(rVarArr);
            for (int i2 = 0; i2 < size; i2++) {
                sVar.b(rVarArr2[i2], tVar, z10);
                rVarArr2[i2] = null;
            }
            this.f2702g0 = rVarArr2;
        }
    }

    public void B(View view) {
        if (!this.f2707l0) {
            ArrayList arrayList = this.f2703h0;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2704i0);
            this.f2704i0 = f2693u0;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                Animator animator = animatorArr[i2];
                animatorArr[i2] = null;
                animator.pause();
            }
            this.f2704i0 = animatorArr;
            A(this, s.f2691f, false);
            this.f2706k0 = true;
        }
    }

    public void C() {
        a1.e s10 = s();
        this.f2712r0 = 0L;
        int i2 = 0;
        while (true) {
            int size = this.f2710o0.size();
            ArrayList arrayList = this.f2710o0;
            if (i2 < size) {
                Animator animator = (Animator) arrayList.get(i2);
                o oVar = (o) s10.get(animator);
                if (animator != null && oVar != null) {
                    Animator animator2 = oVar.f2678f;
                    long j2 = this.L;
                    if (j2 >= 0) {
                        animator2.setDuration(j2);
                    }
                    long j10 = this.B;
                    if (j10 >= 0) {
                        animator2.setStartDelay(animator2.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.R;
                    if (timeInterpolator != null) {
                        animator2.setInterpolator(timeInterpolator);
                    }
                    this.f2703h0.add(animator);
                    this.f2712r0 = Math.max(this.f2712r0, animator.getTotalDuration());
                }
                i2++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public t D(r rVar) {
        t tVar;
        ArrayList arrayList = this.f2709n0;
        if (arrayList != null) {
            if (!arrayList.remove(rVar) && (tVar = this.f2708m0) != null) {
                tVar.D(rVar);
            }
            if (this.f2709n0.size() == 0) {
                this.f2709n0 = null;
            }
        }
        return this;
    }

    public void E(View view) {
        this.Y.remove(view);
    }

    public void F(View view) {
        if (this.f2706k0) {
            if (!this.f2707l0) {
                ArrayList arrayList = this.f2703h0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2704i0);
                this.f2704i0 = f2693u0;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f2704i0 = animatorArr;
                A(this, s.f2692g, false);
            }
            this.f2706k0 = false;
        }
    }

    public void G() {
        O();
        a1.e s10 = s();
        ArrayList arrayList = this.f2710o0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Animator animator = (Animator) obj;
            if (s10.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new i1(this, s10));
                    long j2 = this.L;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j10 = this.B;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.R;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new e1(1, this));
                    animator.start();
                }
            }
        }
        this.f2710o0.clear();
        p();
    }

    public void H(long j2, long j10) {
        boolean z10;
        long j11 = this.f2712r0;
        int i2 = 0;
        if (j2 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if ((i10 < 0 && j2 >= 0) || (j10 > j11 && j2 <= j11)) {
            this.f2707l0 = false;
            A(this, s.f2688c, z10);
        }
        ArrayList arrayList = this.f2703h0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2704i0);
        this.f2704i0 = f2693u0;
        while (i2 < size) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j2), animator.getTotalDuration()));
            i2++;
            j11 = j11;
        }
        long j12 = j11;
        this.f2704i0 = animatorArr;
        int i11 = (j2 > j12 ? 1 : (j2 == j12 ? 0 : -1));
        if ((i11 > 0 && j10 <= j12) || (j2 < 0 && i10 >= 0)) {
            if (i11 > 0) {
                this.f2707l0 = true;
            }
            A(this, s.f2689d, z10);
        }
    }

    public void I(long j2) {
        this.L = j2;
    }

    public void J(k0.d dVar) {
        this.p0 = dVar;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.R = timeInterpolator;
    }

    public void L(na.f fVar) {
        if (fVar == null) {
            this.f2711q0 = f2695w0;
        } else {
            this.f2711q0 = fVar;
        }
    }

    public void N(long j2) {
        this.B = j2;
    }

    public final void O() {
        if (this.f2705j0 == 0) {
            A(this, s.f2688c, false);
            this.f2707l0 = false;
        }
        this.f2705j0++;
    }

    public String P(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.L != -1) {
            sb2.append("dur(");
            sb2.append(this.L);
            sb2.append(") ");
        }
        if (this.B != -1) {
            sb2.append("dly(");
            sb2.append(this.B);
            sb2.append(") ");
        }
        if (this.R != null) {
            sb2.append("interp(");
            sb2.append(this.R);
            sb2.append(") ");
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i10));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(r rVar) {
        if (this.f2709n0 == null) {
            this.f2709n0 = new ArrayList();
        }
        this.f2709n0.add(rVar);
    }

    public void b(View view) {
        this.Y.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f2703h0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2704i0);
        this.f2704i0 = f2693u0;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f2704i0 = animatorArr;
        A(this, s.f2690e, false);
    }

    public abstract void e(b0 b0Var);

    public final void f(View view, boolean z10) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                b0 b0Var = new b0(view);
                if (z10) {
                    h(b0Var);
                } else {
                    e(b0Var);
                }
                b0Var.f2622c.add(this);
                g(b0Var);
                if (z10) {
                    c(this.Z, view, b0Var);
                } else {
                    c(this.f2697b0, view, b0Var);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    f(viewGroup.getChildAt(i2), z10);
                }
            }
        }
    }

    public abstract void h(b0 b0Var);

    public final void j(ViewGroup viewGroup, boolean z10) {
        k(z10);
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z10);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (findViewById != null) {
                b0 b0Var = new b0(findViewById);
                if (z10) {
                    h(b0Var);
                } else {
                    e(b0Var);
                }
                b0Var.f2622c.add(this);
                g(b0Var);
                if (z10) {
                    c(this.Z, findViewById, b0Var);
                } else {
                    c(this.f2697b0, findViewById, b0Var);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            b0 b0Var2 = new b0(view);
            if (z10) {
                h(b0Var2);
            } else {
                e(b0Var2);
            }
            b0Var2.f2622c.add(this);
            g(b0Var2);
            if (z10) {
                c(this.Z, view, b0Var2);
            } else {
                c(this.f2697b0, view, b0Var2);
            }
        }
    }

    public final void k(boolean z10) {
        if (z10) {
            ((a1.e) this.Z.B).clear();
            ((SparseArray) this.Z.L).clear();
            ((a1.q) this.Z.R).a();
            return;
        }
        ((a1.e) this.f2697b0.B).clear();
        ((SparseArray) this.f2697b0.L).clear();
        ((a1.q) this.f2697b0.R).a();
    }

    @Override // 
    /* renamed from: l */
    public t clone() {
        try {
            t tVar = (t) super.clone();
            tVar.f2710o0 = new ArrayList();
            tVar.Z = new b9.e(3);
            tVar.f2697b0 = new b9.e(3);
            tVar.f2700e0 = null;
            tVar.f2701f0 = null;
            tVar.f2713s0 = null;
            tVar.f2708m0 = this;
            tVar.f2709n0 = null;
            return tVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public Animator n(ViewGroup viewGroup, b0 b0Var, b0 b0Var2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, c8.o] */
    public void o(ViewGroup viewGroup, b9.e eVar, b9.e eVar2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z10;
        int i2;
        boolean z11;
        View view;
        b0 b0Var;
        Animator animator;
        b0 b0Var2;
        a1.e s10 = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        if (r().f2713s0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = 0;
        while (i10 < size) {
            b0 b0Var3 = (b0) arrayList.get(i10);
            b0 b0Var4 = (b0) arrayList2.get(i10);
            if (b0Var3 != null && !b0Var3.f2622c.contains(this)) {
                b0Var3 = null;
            }
            if (b0Var4 != null && !b0Var4.f2622c.contains(this)) {
                b0Var4 = null;
            }
            if ((b0Var3 != null || b0Var4 != null) && (b0Var3 == null || b0Var4 == null || x(b0Var3, b0Var4))) {
                Animator n10 = n(viewGroup, b0Var3, b0Var4);
                if (n10 != null) {
                    String str = this.A;
                    if (b0Var4 != null) {
                        view = b0Var4.f2621b;
                        String[] t5 = t();
                        if (t5 != null && t5.length > 0) {
                            b0Var2 = new b0(view);
                            b0 b0Var5 = (b0) ((a1.e) eVar2.B).get(view);
                            i2 = size;
                            z11 = z10;
                            if (b0Var5 != null) {
                                int i11 = 0;
                                while (i11 < t5.length) {
                                    String str2 = t5[i11];
                                    int i12 = i11;
                                    b0Var2.f2620a.put(str2, b0Var5.f2620a.get(str2));
                                    i11 = i12 + 1;
                                }
                            }
                            int i13 = s10.L;
                            int i14 = 0;
                            while (true) {
                                if (i14 < i13) {
                                    o oVar = (o) s10.get((Animator) s10.f(i14));
                                    if (oVar.f2675c != null && oVar.f2673a == view && oVar.f2674b.equals(str) && oVar.f2675c.equals(b0Var2)) {
                                        animator = null;
                                        break;
                                    }
                                    i14++;
                                } else {
                                    animator = n10;
                                    break;
                                }
                            }
                        } else {
                            i2 = size;
                            z11 = z10;
                            animator = n10;
                            b0Var2 = null;
                        }
                        n10 = animator;
                        b0Var = b0Var2;
                    } else {
                        i2 = size;
                        z11 = z10;
                        view = b0Var3.f2621b;
                        b0Var = null;
                    }
                    if (n10 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f2673a = view;
                        obj.f2674b = str;
                        obj.f2675c = b0Var;
                        obj.f2676d = windowId;
                        obj.f2677e = this;
                        obj.f2678f = n10;
                        AnimatorSet animatorSet = n10;
                        if (z11) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(n10);
                            animatorSet = animatorSet2;
                        }
                        s10.put(animatorSet, obj);
                        this.f2710o0.add(animatorSet);
                    }
                    i10++;
                    size = i2;
                    z10 = z11;
                }
            }
            i2 = size;
            z11 = z10;
            i10++;
            size = i2;
            z10 = z11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                o oVar2 = (o) s10.get((Animator) this.f2710o0.get(sparseIntArray.keyAt(i15)));
                long startDelay = oVar2.f2678f.getStartDelay();
                oVar2.f2678f.setStartDelay(startDelay + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void p() {
        int i2 = this.f2705j0 - 1;
        this.f2705j0 = i2;
        if (i2 == 0) {
            A(this, s.f2689d, false);
            for (int i10 = 0; i10 < ((a1.q) this.Z.R).j(); i10++) {
                View view = (View) ((a1.q) this.Z.R).k(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((a1.q) this.f2697b0.R).j(); i11++) {
                View view2 = (View) ((a1.q) this.f2697b0.R).k(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2707l0 = true;
        }
    }

    public final b0 q(View view, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        z zVar = this.f2698c0;
        if (zVar != null) {
            return zVar.q(view, z10);
        }
        if (z10) {
            arrayList = this.f2700e0;
        } else {
            arrayList = this.f2701f0;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    b0 b0Var = (b0) arrayList.get(i2);
                    if (b0Var != null) {
                        if (b0Var.f2621b == view) {
                            break;
                        }
                        i2++;
                    } else {
                        return null;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                if (z10) {
                    arrayList2 = this.f2701f0;
                } else {
                    arrayList2 = this.f2700e0;
                }
                return (b0) arrayList2.get(i2);
            }
            return null;
        }
        return null;
    }

    public final t r() {
        z zVar = this.f2698c0;
        if (zVar != null) {
            return zVar.r();
        }
        return this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return P("");
    }

    public final b0 u(View view, boolean z10) {
        b9.e eVar;
        z zVar = this.f2698c0;
        if (zVar != null) {
            return zVar.u(view, z10);
        }
        if (z10) {
            eVar = this.Z;
        } else {
            eVar = this.f2697b0;
        }
        return (b0) ((a1.e) eVar.B).get(view);
    }

    public boolean v() {
        return !this.f2703h0.isEmpty();
    }

    public abstract boolean w();

    public boolean x(b0 b0Var, b0 b0Var2) {
        if (b0Var != null && b0Var2 != null) {
            String[] t5 = t();
            if (t5 != null) {
                for (String str : t5) {
                    if (z(b0Var, b0Var2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : b0Var.f2620a.keySet()) {
                    if (z(b0Var, b0Var2, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean y(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public void M() {
    }

    public void g(b0 b0Var) {
    }
}
