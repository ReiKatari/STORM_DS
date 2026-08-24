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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea7  reason: default package */
/* loaded from: classes.dex */
public abstract class ea7 implements Cloneable {
    public static final Animator[] w0 = new Animator[0];
    public static final int[] x0 = {2, 1, 3, 4};
    public static final x31 y0 = new x31(29);
    public static final ThreadLocal z0 = new ThreadLocal();
    public ArrayList g0;
    public ArrayList h0;
    public da7[] i0;
    public yh2 r0;
    public long t0;
    public z97 u0;
    public long v0;
    public final String A = getClass().getName();
    public long B = -1;
    public long L = -1;
    public TimeInterpolator R = null;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public eb Z = new eb(24);
    public eb d0 = new eb(24);
    public qa7 e0 = null;
    public final int[] f0 = x0;
    public final ArrayList j0 = new ArrayList();
    public Animator[] k0 = w0;
    public int l0 = 0;
    public boolean m0 = false;
    public boolean n0 = false;
    public ea7 o0 = null;
    public ArrayList p0 = null;
    public ArrayList q0 = new ArrayList();
    public x31 s0 = y0;

    public static void c(eb ebVar, View view, sa7 sa7Var) {
        wu wuVar = (wu) ebVar.X;
        SparseArray sparseArray = (SparseArray) ebVar.L;
        hz3 hz3Var = (hz3) ebVar.R;
        ((wu) ebVar.B).put(view, sa7Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = ao7.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (wuVar.containsKey(transitionName)) {
                wuVar.put(transitionName, null);
            } else {
                wuVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (hz3Var.c(itemIdAtPosition) >= 0) {
                    View view2 = (View) hz3Var.b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        hz3Var.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                hz3Var.f(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ci6, java.lang.Object, wu] */
    public static wu q() {
        ThreadLocal threadLocal = z0;
        wu wuVar = (wu) threadLocal.get();
        if (wuVar == null) {
            ?? ci6Var = new ci6(0);
            threadLocal.set(ci6Var);
            return ci6Var;
        }
        return wuVar;
    }

    public static boolean z(sa7 sa7Var, sa7 sa7Var2, String str) {
        Object obj = sa7Var.a.get(str);
        Object obj2 = sa7Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(ea7 ea7Var, fa6 fa6Var, boolean z) {
        ea7 ea7Var2 = this.o0;
        if (ea7Var2 != null) {
            ea7Var2.A(ea7Var, fa6Var, z);
        }
        ArrayList arrayList = this.p0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.p0.size();
            da7[] da7VarArr = this.i0;
            if (da7VarArr == null) {
                da7VarArr = new da7[size];
            }
            this.i0 = null;
            da7[] da7VarArr2 = (da7[]) this.p0.toArray(da7VarArr);
            for (int i = 0; i < size; i++) {
                da7 da7Var = da7VarArr2[i];
                switch (fa6Var.A) {
                    case 8:
                        da7Var.d(ea7Var);
                        break;
                    case 9:
                        da7Var.a(ea7Var);
                        break;
                    case 10:
                        da7Var.f(ea7Var);
                        break;
                    case 11:
                        da7Var.b();
                        break;
                    default:
                        da7Var.e();
                        break;
                }
                da7VarArr2[i] = null;
            }
            this.i0 = da7VarArr2;
        }
    }

    public void B(View view) {
        if (!this.n0) {
            ArrayList arrayList = this.j0;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.k0);
            this.k0 = w0;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.k0 = animatorArr;
            A(this, fa6.X, false);
            this.m0 = true;
        }
    }

    public void C() {
        wu q = q();
        this.t0 = 0L;
        int i = 0;
        while (true) {
            int size = this.q0.size();
            ArrayList arrayList = this.q0;
            if (i < size) {
                Animator animator = (Animator) arrayList.get(i);
                u97 u97Var = (u97) q.get(animator);
                if (animator != null && u97Var != null) {
                    Animator animator2 = u97Var.f;
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
                    this.j0.add(animator);
                    this.t0 = Math.max(this.t0, animator.getTotalDuration());
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public ea7 D(da7 da7Var) {
        ea7 ea7Var;
        ArrayList arrayList = this.p0;
        if (arrayList != null) {
            if (!arrayList.remove(da7Var) && (ea7Var = this.o0) != null) {
                ea7Var.D(da7Var);
            }
            if (this.p0.size() == 0) {
                this.p0 = null;
            }
        }
        return this;
    }

    public void E(View view) {
        this.Y.remove(view);
    }

    public void F(View view) {
        if (this.m0) {
            if (!this.n0) {
                ArrayList arrayList = this.j0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.k0);
                this.k0 = w0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.k0 = animatorArr;
                A(this, fa6.Y, false);
            }
            this.m0 = false;
        }
    }

    public void G() {
        O();
        wu q = q();
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (q.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new t97(this, q));
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
                    animator.addListener(new s7(this, 8));
                    animator.start();
                }
            }
        }
        this.q0.clear();
        n();
    }

    public void H(long j, long j2) {
        boolean z;
        long j3 = this.t0;
        int i = 0;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if ((i2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.n0 = false;
            A(this, fa6.B, z);
        }
        ArrayList arrayList = this.j0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.k0);
        this.k0 = w0;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.k0 = animatorArr;
        int i3 = (j > j4 ? 1 : (j == j4 ? 0 : -1));
        if ((i3 > 0 && j2 <= j4) || (j < 0 && i2 >= 0)) {
            if (i3 > 0) {
                this.n0 = true;
            }
            A(this, fa6.L, z);
        }
    }

    public void I(long j) {
        this.L = j;
    }

    public void J(yh2 yh2Var) {
        this.r0 = yh2Var;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.R = timeInterpolator;
    }

    public void L(x31 x31Var) {
        if (x31Var == null) {
            this.s0 = y0;
        } else {
            this.s0 = x31Var;
        }
    }

    public void N(long j) {
        this.B = j;
    }

    public final void O() {
        if (this.l0 == 0) {
            A(this, fa6.B, false);
            this.n0 = false;
        }
        this.l0++;
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

    public void a(da7 da7Var) {
        if (this.p0 == null) {
            this.p0 = new ArrayList();
        }
        this.p0.add(da7Var);
    }

    public void b(View view) {
        this.Y.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.j0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.k0);
        this.k0 = w0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.k0 = animatorArr;
        A(this, fa6.R, false);
    }

    public abstract void d(sa7 sa7Var);

    public final void e(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                sa7 sa7Var = new sa7(view);
                if (z) {
                    g(sa7Var);
                } else {
                    d(sa7Var);
                }
                sa7Var.c.add(this);
                f(sa7Var);
                if (z) {
                    c(this.Z, view, sa7Var);
                } else {
                    c(this.d0, view, sa7Var);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public abstract void g(sa7 sa7Var);

    public final void i(ViewGroup viewGroup, boolean z) {
        j(z);
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                sa7 sa7Var = new sa7(findViewById);
                if (z) {
                    g(sa7Var);
                } else {
                    d(sa7Var);
                }
                sa7Var.c.add(this);
                f(sa7Var);
                if (z) {
                    c(this.Z, findViewById, sa7Var);
                } else {
                    c(this.d0, findViewById, sa7Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            sa7 sa7Var2 = new sa7(view);
            if (z) {
                g(sa7Var2);
            } else {
                d(sa7Var2);
            }
            sa7Var2.c.add(this);
            f(sa7Var2);
            if (z) {
                c(this.Z, view, sa7Var2);
            } else {
                c(this.d0, view, sa7Var2);
            }
        }
    }

    public final void j(boolean z) {
        if (z) {
            ((wu) this.Z.B).clear();
            ((SparseArray) this.Z.L).clear();
            ((hz3) this.Z.R).a();
            return;
        }
        ((wu) this.d0.B).clear();
        ((SparseArray) this.d0.L).clear();
        ((hz3) this.d0.R).a();
    }

    @Override // 
    /* renamed from: k */
    public ea7 clone() {
        try {
            ea7 ea7Var = (ea7) super.clone();
            ea7Var.q0 = new ArrayList();
            ea7Var.Z = new eb(24);
            ea7Var.d0 = new eb(24);
            ea7Var.g0 = null;
            ea7Var.h0 = null;
            ea7Var.u0 = null;
            ea7Var.o0 = this;
            ea7Var.p0 = null;
            return ea7Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator l(ViewGroup viewGroup, sa7 sa7Var, sa7 sa7Var2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [u97, java.lang.Object] */
    public void m(ViewGroup viewGroup, eb ebVar, eb ebVar2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        int i;
        boolean z2;
        View view;
        sa7 sa7Var;
        Animator animator;
        sa7 sa7Var2;
        wu q = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        if (p().u0 != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < size) {
            sa7 sa7Var3 = (sa7) arrayList.get(i2);
            sa7 sa7Var4 = (sa7) arrayList2.get(i2);
            if (sa7Var3 != null && !sa7Var3.c.contains(this)) {
                sa7Var3 = null;
            }
            if (sa7Var4 != null && !sa7Var4.c.contains(this)) {
                sa7Var4 = null;
            }
            if ((sa7Var3 != null || sa7Var4 != null) && (sa7Var3 == null || sa7Var4 == null || w(sa7Var3, sa7Var4))) {
                Animator l = l(viewGroup, sa7Var3, sa7Var4);
                if (l != null) {
                    String str = this.A;
                    if (sa7Var4 != null) {
                        view = sa7Var4.b;
                        String[] s = s();
                        if (s != null && s.length > 0) {
                            sa7Var2 = new sa7(view);
                            sa7 sa7Var5 = (sa7) ((wu) ebVar2.B).get(view);
                            i = size;
                            z2 = z;
                            if (sa7Var5 != null) {
                                int i3 = 0;
                                while (i3 < s.length) {
                                    String str2 = s[i3];
                                    int i4 = i3;
                                    sa7Var2.a.put(str2, sa7Var5.a.get(str2));
                                    i3 = i4 + 1;
                                }
                            }
                            int i5 = q.L;
                            int i6 = 0;
                            while (true) {
                                if (i6 < i5) {
                                    u97 u97Var = (u97) q.get((Animator) q.f(i6));
                                    if (u97Var.c != null && u97Var.a == view && u97Var.b.equals(str) && u97Var.c.equals(sa7Var2)) {
                                        animator = null;
                                        break;
                                    }
                                    i6++;
                                } else {
                                    animator = l;
                                    break;
                                }
                            }
                        } else {
                            i = size;
                            z2 = z;
                            animator = l;
                            sa7Var2 = null;
                        }
                        l = animator;
                        sa7Var = sa7Var2;
                    } else {
                        i = size;
                        z2 = z;
                        view = sa7Var3.b;
                        sa7Var = null;
                    }
                    if (l != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.a = view;
                        obj.b = str;
                        obj.c = sa7Var;
                        obj.d = windowId;
                        obj.e = this;
                        obj.f = l;
                        AnimatorSet animatorSet = l;
                        if (z2) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(l);
                            animatorSet = animatorSet2;
                        }
                        q.put(animatorSet, obj);
                        this.q0.add(animatorSet);
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
                u97 u97Var2 = (u97) q.get((Animator) this.q0.get(sparseIntArray.keyAt(i7)));
                long startDelay = u97Var2.f.getStartDelay();
                u97Var2.f.setStartDelay(startDelay + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i = this.l0 - 1;
        this.l0 = i;
        if (i == 0) {
            A(this, fa6.L, false);
            for (int i2 = 0; i2 < ((hz3) this.Z.R).i(); i2++) {
                View view = (View) ((hz3) this.Z.R).j(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((hz3) this.d0.R).i(); i3++) {
                View view2 = (View) ((hz3) this.d0.R).j(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.n0 = true;
        }
    }

    public final sa7 o(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        qa7 qa7Var = this.e0;
        if (qa7Var != null) {
            return qa7Var.o(view, z);
        }
        if (z) {
            arrayList = this.g0;
        } else {
            arrayList = this.h0;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    sa7 sa7Var = (sa7) arrayList.get(i);
                    if (sa7Var != null) {
                        if (sa7Var.b == view) {
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
                    arrayList2 = this.h0;
                } else {
                    arrayList2 = this.g0;
                }
                return (sa7) arrayList2.get(i);
            }
            return null;
        }
        return null;
    }

    public final ea7 p() {
        qa7 qa7Var = this.e0;
        if (qa7Var != null) {
            return qa7Var.p();
        }
        return this;
    }

    public String[] s() {
        return null;
    }

    public final sa7 t(View view, boolean z) {
        eb ebVar;
        qa7 qa7Var = this.e0;
        if (qa7Var != null) {
            return qa7Var.t(view, z);
        }
        if (z) {
            ebVar = this.Z;
        } else {
            ebVar = this.d0;
        }
        return (sa7) ((wu) ebVar.B).get(view);
    }

    public final String toString() {
        return P("");
    }

    public boolean u() {
        return !this.j0.isEmpty();
    }

    public abstract boolean v();

    public boolean w(sa7 sa7Var, sa7 sa7Var2) {
        if (sa7Var != null && sa7Var2 != null) {
            String[] s = s();
            if (s != null) {
                for (String str : s) {
                    if (z(sa7Var, sa7Var2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : sa7Var.a.keySet()) {
                    if (z(sa7Var, sa7Var2, str2)) {
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

    public void f(sa7 sa7Var) {
    }
}
