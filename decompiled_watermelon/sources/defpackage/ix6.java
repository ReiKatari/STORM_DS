package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ix6  reason: default package */
/* loaded from: classes.dex */
public abstract class ix6 implements Cloneable {
    public static final Animator[] v0 = new Animator[0];
    public static final int[] w0 = {2, 1, 3, 4};
    public static final so1 x0 = new so1(26);
    public static final ThreadLocal y0 = new ThreadLocal();
    public ArrayList f0;
    public ArrayList g0;
    public hx6[] h0;
    public me2 q0;
    public long s0;
    public dx6 t0;
    public long u0;
    public final String A = getClass().getName();
    public long B = -1;
    public long L = -1;
    public TimeInterpolator R = null;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public q9 Z = new q9(24);
    public q9 c0 = new q9(24);
    public tx6 d0 = null;
    public final int[] e0 = w0;
    public final ArrayList i0 = new ArrayList();
    public Animator[] j0 = v0;
    public int k0 = 0;
    public boolean l0 = false;
    public boolean m0 = false;
    public ix6 n0 = null;
    public ArrayList o0 = null;
    public ArrayList p0 = new ArrayList();
    public so1 r0 = x0;

    public static void c(q9 q9Var, View view, vx6 vx6Var) {
        eu euVar = (eu) q9Var.X;
        SparseArray sparseArray = (SparseArray) q9Var.L;
        cs3 cs3Var = (cs3) q9Var.R;
        ((eu) q9Var.B).put(view, vx6Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = aa7.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (euVar.containsKey(transitionName)) {
                euVar.put(transitionName, null);
            } else {
                euVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (cs3Var.c(itemIdAtPosition) >= 0) {
                    View view2 = (View) cs3Var.b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        cs3Var.g(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                cs3Var.g(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eu, java.lang.Object, m66] */
    public static eu s() {
        ThreadLocal threadLocal = y0;
        eu euVar = (eu) threadLocal.get();
        if (euVar == null) {
            ?? m66Var = new m66(0);
            threadLocal.set(m66Var);
            return m66Var;
        }
        return euVar;
    }

    public static boolean z(vx6 vx6Var, vx6 vx6Var2, String str) {
        Object obj = vx6Var.a.get(str);
        Object obj2 = vx6Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(ix6 ix6Var, vd6 vd6Var, boolean z) {
        ix6 ix6Var2 = this.n0;
        if (ix6Var2 != null) {
            ix6Var2.A(ix6Var, vd6Var, z);
        }
        ArrayList arrayList = this.o0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.o0.size();
            hx6[] hx6VarArr = this.h0;
            if (hx6VarArr == null) {
                hx6VarArr = new hx6[size];
            }
            this.h0 = null;
            hx6[] hx6VarArr2 = (hx6[]) this.o0.toArray(hx6VarArr);
            for (int i = 0; i < size; i++) {
                hx6 hx6Var = hx6VarArr2[i];
                switch (vd6Var.A) {
                    case 7:
                        hx6Var.f(ix6Var);
                        break;
                    case 8:
                        hx6Var.a(ix6Var);
                        break;
                    case 9:
                        hx6Var.e(ix6Var);
                        break;
                    case 10:
                        hx6Var.b();
                        break;
                    default:
                        hx6Var.c();
                        break;
                }
                hx6VarArr2[i] = null;
            }
            this.h0 = hx6VarArr2;
        }
    }

    public void B(View view) {
        if (!this.m0) {
            ArrayList arrayList = this.i0;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.j0);
            this.j0 = v0;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.j0 = animatorArr;
            A(this, vd6.X, false);
            this.l0 = true;
        }
    }

    public void C() {
        eu s = s();
        this.s0 = 0L;
        int i = 0;
        while (true) {
            int size = this.p0.size();
            ArrayList arrayList = this.p0;
            if (i < size) {
                Animator animator = (Animator) arrayList.get(i);
                yw6 yw6Var = (yw6) s.get(animator);
                if (animator != null && yw6Var != null) {
                    Animator animator2 = yw6Var.f;
                    long j = this.L;
                    if (j >= 0) {
                        animator2.setDuration(j);
                    }
                    long j2 = this.B;
                    if (j2 >= 0) {
                        animator2.setStartDelay(animator2.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.R;
                    if (timeInterpolator != null) {
                        animator2.setInterpolator(timeInterpolator);
                    }
                    this.i0.add(animator);
                    this.s0 = Math.max(this.s0, animator.getTotalDuration());
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public ix6 D(hx6 hx6Var) {
        ix6 ix6Var;
        ArrayList arrayList = this.o0;
        if (arrayList != null) {
            if (!arrayList.remove(hx6Var) && (ix6Var = this.n0) != null) {
                ix6Var.D(hx6Var);
            }
            if (this.o0.size() == 0) {
                this.o0 = null;
            }
        }
        return this;
    }

    public void E(View view) {
        this.Y.remove(view);
    }

    public void F(View view) {
        if (this.l0) {
            if (!this.m0) {
                ArrayList arrayList = this.i0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.j0);
                this.j0 = v0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.j0 = animatorArr;
                A(this, vd6.Y, false);
            }
            this.l0 = false;
        }
    }

    public void G() {
        O();
        eu s = s();
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (s.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new xw6(this, s));
                    long j = this.L;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.B;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.R;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new r7(5, this));
                    animator.start();
                }
            }
        }
        this.p0.clear();
        o();
    }

    public void H(long j, long j2) {
        boolean z;
        long j3 = this.s0;
        int i = 0;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if ((i2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.m0 = false;
            A(this, vd6.B, z);
        }
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.j0);
        this.j0 = v0;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.j0 = animatorArr;
        int i3 = (j > j4 ? 1 : (j == j4 ? 0 : -1));
        if ((i3 > 0 && j2 <= j4) || (j < 0 && i2 >= 0)) {
            if (i3 > 0) {
                this.m0 = true;
            }
            A(this, vd6.L, z);
        }
    }

    public void I(long j) {
        this.L = j;
    }

    public void J(me2 me2Var) {
        this.q0 = me2Var;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.R = timeInterpolator;
    }

    public void L(so1 so1Var) {
        if (so1Var == null) {
            this.r0 = x0;
        } else {
            this.r0 = so1Var;
        }
    }

    public void N(long j) {
        this.B = j;
    }

    public final void O() {
        if (this.k0 == 0) {
            A(this, vd6.B, false);
            this.m0 = false;
        }
        this.k0++;
    }

    public String P(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.L != -1) {
            sb.append("dur(");
            sb.append(this.L);
            sb.append(") ");
        }
        if (this.B != -1) {
            sb.append("dly(");
            sb.append(this.B);
            sb.append(") ");
        }
        if (this.R != null) {
            sb.append("interp(");
            sb.append(this.R);
            sb.append(") ");
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(hx6 hx6Var) {
        if (this.o0 == null) {
            this.o0 = new ArrayList();
        }
        this.o0.add(hx6Var);
    }

    public void b(View view) {
        this.Y.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.j0);
        this.j0 = v0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.j0 = animatorArr;
        A(this, vd6.R, false);
    }

    public abstract void e(vx6 vx6Var);

    public final void f(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                vx6 vx6Var = new vx6(view);
                if (z) {
                    h(vx6Var);
                } else {
                    e(vx6Var);
                }
                vx6Var.c.add(this);
                g(vx6Var);
                if (z) {
                    c(this.Z, view, vx6Var);
                } else {
                    c(this.c0, view, vx6Var);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public abstract void h(vx6 vx6Var);

    public final void j(ViewGroup viewGroup, boolean z) {
        k(z);
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                vx6 vx6Var = new vx6(findViewById);
                if (z) {
                    h(vx6Var);
                } else {
                    e(vx6Var);
                }
                vx6Var.c.add(this);
                g(vx6Var);
                if (z) {
                    c(this.Z, findViewById, vx6Var);
                } else {
                    c(this.c0, findViewById, vx6Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            vx6 vx6Var2 = new vx6(view);
            if (z) {
                h(vx6Var2);
            } else {
                e(vx6Var2);
            }
            vx6Var2.c.add(this);
            g(vx6Var2);
            if (z) {
                c(this.Z, view, vx6Var2);
            } else {
                c(this.c0, view, vx6Var2);
            }
        }
    }

    public final void k(boolean z) {
        if (z) {
            ((eu) this.Z.B).clear();
            ((SparseArray) this.Z.L).clear();
            ((cs3) this.Z.R).a();
            return;
        }
        ((eu) this.c0.B).clear();
        ((SparseArray) this.c0.L).clear();
        ((cs3) this.c0.R).a();
    }

    @Override // 
    /* renamed from: l */
    public ix6 clone() {
        try {
            ix6 ix6Var = (ix6) super.clone();
            ix6Var.p0 = new ArrayList();
            ix6Var.Z = new q9(24);
            ix6Var.c0 = new q9(24);
            ix6Var.f0 = null;
            ix6Var.g0 = null;
            ix6Var.t0 = null;
            ix6Var.n0 = this;
            ix6Var.o0 = null;
            return ix6Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator m(ViewGroup viewGroup, vx6 vx6Var, vx6 vx6Var2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [yw6, java.lang.Object] */
    public void n(ViewGroup viewGroup, q9 q9Var, q9 q9Var2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        int i;
        boolean z2;
        View view;
        vx6 vx6Var;
        Animator animator;
        vx6 vx6Var2;
        eu s = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        if (r().t0 != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < size) {
            vx6 vx6Var3 = (vx6) arrayList.get(i2);
            vx6 vx6Var4 = (vx6) arrayList2.get(i2);
            if (vx6Var3 != null && !vx6Var3.c.contains(this)) {
                vx6Var3 = null;
            }
            if (vx6Var4 != null && !vx6Var4.c.contains(this)) {
                vx6Var4 = null;
            }
            if ((vx6Var3 != null || vx6Var4 != null) && (vx6Var3 == null || vx6Var4 == null || x(vx6Var3, vx6Var4))) {
                Animator m = m(viewGroup, vx6Var3, vx6Var4);
                if (m != null) {
                    String str = this.A;
                    if (vx6Var4 != null) {
                        view = vx6Var4.b;
                        String[] t = t();
                        if (t != null && t.length > 0) {
                            vx6Var2 = new vx6(view);
                            vx6 vx6Var5 = (vx6) ((eu) q9Var2.B).get(view);
                            i = size;
                            z2 = z;
                            if (vx6Var5 != null) {
                                int i3 = 0;
                                while (i3 < t.length) {
                                    String str2 = t[i3];
                                    int i4 = i3;
                                    vx6Var2.a.put(str2, vx6Var5.a.get(str2));
                                    i3 = i4 + 1;
                                }
                            }
                            int i5 = s.L;
                            int i6 = 0;
                            while (true) {
                                if (i6 < i5) {
                                    yw6 yw6Var = (yw6) s.get((Animator) s.f(i6));
                                    if (yw6Var.c != null && yw6Var.a == view && yw6Var.b.equals(str) && yw6Var.c.equals(vx6Var2)) {
                                        animator = null;
                                        break;
                                    }
                                    i6++;
                                } else {
                                    animator = m;
                                    break;
                                }
                            }
                        } else {
                            i = size;
                            z2 = z;
                            animator = m;
                            vx6Var2 = null;
                        }
                        m = animator;
                        vx6Var = vx6Var2;
                    } else {
                        i = size;
                        z2 = z;
                        view = vx6Var3.b;
                        vx6Var = null;
                    }
                    if (m != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.a = view;
                        obj.b = str;
                        obj.c = vx6Var;
                        obj.d = windowId;
                        obj.e = this;
                        obj.f = m;
                        AnimatorSet animatorSet = m;
                        if (z2) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(m);
                            animatorSet = animatorSet2;
                        }
                        s.put(animatorSet, obj);
                        this.p0.add(animatorSet);
                    }
                    i2++;
                    size = i;
                    z = z2;
                }
            }
            i = size;
            z2 = z;
            i2++;
            size = i;
            z = z2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                yw6 yw6Var2 = (yw6) s.get((Animator) this.p0.get(sparseIntArray.keyAt(i7)));
                long startDelay = yw6Var2.f.getStartDelay();
                yw6Var2.f.setStartDelay(startDelay + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i = this.k0 - 1;
        this.k0 = i;
        if (i == 0) {
            A(this, vd6.L, false);
            for (int i2 = 0; i2 < ((cs3) this.Z.R).j(); i2++) {
                View view = (View) ((cs3) this.Z.R).k(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((cs3) this.c0.R).j(); i3++) {
                View view2 = (View) ((cs3) this.c0.R).k(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.m0 = true;
        }
    }

    public final vx6 q(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        tx6 tx6Var = this.d0;
        if (tx6Var != null) {
            return tx6Var.q(view, z);
        }
        if (z) {
            arrayList = this.f0;
        } else {
            arrayList = this.g0;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    vx6 vx6Var = (vx6) arrayList.get(i);
                    if (vx6Var != null) {
                        if (vx6Var.b == view) {
                            break;
                        }
                        i++;
                    } else {
                        return null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                if (z) {
                    arrayList2 = this.g0;
                } else {
                    arrayList2 = this.f0;
                }
                return (vx6) arrayList2.get(i);
            }
            return null;
        }
        return null;
    }

    public final ix6 r() {
        tx6 tx6Var = this.d0;
        if (tx6Var != null) {
            return tx6Var.r();
        }
        return this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return P("");
    }

    public final vx6 u(View view, boolean z) {
        q9 q9Var;
        tx6 tx6Var = this.d0;
        if (tx6Var != null) {
            return tx6Var.u(view, z);
        }
        if (z) {
            q9Var = this.Z;
        } else {
            q9Var = this.c0;
        }
        return (vx6) ((eu) q9Var.B).get(view);
    }

    public boolean v() {
        return !this.i0.isEmpty();
    }

    public abstract boolean w();

    public boolean x(vx6 vx6Var, vx6 vx6Var2) {
        if (vx6Var != null && vx6Var2 != null) {
            String[] t = t();
            if (t != null) {
                for (String str : t) {
                    if (z(vx6Var, vx6Var2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : vx6Var.a.keySet()) {
                    if (z(vx6Var, vx6Var2, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean y(View view) {
        int id = view.getId();
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public void M() {
    }

    public void g(vx6 vx6Var) {
    }
}
