package defpackage;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na7  reason: default package */
/* loaded from: classes.dex */
public final class na7 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ea7 A;
    public ViewGroup B;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ea A[EDGE_INSN: B:161:0x01ea->B:88:0x01ea ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        wu wuVar;
        wu wuVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        int i6;
        u97 u97Var;
        int i7;
        int i8;
        sa7 sa7Var;
        View view;
        View view2;
        int i9;
        int i10;
        ea7 ea7Var = this.A;
        ViewGroup viewGroup = this.B;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        int i11 = true;
        if (!oa7.c.remove(viewGroup)) {
            return true;
        }
        wu b = oa7.b();
        ArrayList arrayList3 = (ArrayList) b.get(viewGroup);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b.put(viewGroup, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            arrayList3.add(ea7Var);
            ea7Var.a(new ma7(this, b));
            i = 0;
            ea7Var.i(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((ea7) obj).F(viewGroup);
                }
            }
            ea7Var.g0 = new ArrayList();
            ea7Var.h0 = new ArrayList();
            eb ebVar = ea7Var.Z;
            eb ebVar2 = ea7Var.d0;
            wuVar = new wu((wu) ebVar.B);
            wuVar2 = new wu((wu) ebVar2.B);
            i2 = 0;
            while (true) {
                iArr = ea7Var.f0;
                if (i2 < iArr.length) {
                    break;
                }
                int i13 = iArr[i2];
                if (i13 != i11) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                hz3 hz3Var = (hz3) ebVar.R;
                                hz3 hz3Var2 = (hz3) ebVar2.R;
                                int i14 = hz3Var.i();
                                int i15 = i;
                                while (i15 < i14) {
                                    View view3 = (View) hz3Var.j(i15);
                                    if (view3 != null && ea7Var.y(view3)) {
                                        i10 = i2;
                                        View view4 = (View) hz3Var2.b(hz3Var.e(i15));
                                        if (view4 != null && ea7Var.y(view4)) {
                                            sa7 sa7Var2 = (sa7) wuVar.get(view3);
                                            i9 = i11;
                                            sa7 sa7Var3 = (sa7) wuVar2.get(view4);
                                            if (sa7Var2 != null && sa7Var3 != null) {
                                                ea7Var.g0.add(sa7Var2);
                                                ea7Var.h0.add(sa7Var3);
                                                wuVar.remove(view3);
                                                wuVar2.remove(view4);
                                            }
                                        } else {
                                            i9 = i11;
                                        }
                                    } else {
                                        i9 = i11;
                                        i10 = i2;
                                    }
                                    i15++;
                                    i2 = i10;
                                    i11 = i9;
                                }
                            }
                            i7 = i11;
                            i8 = i2;
                        } else {
                            i7 = i11;
                            i8 = i2;
                            SparseArray sparseArray = (SparseArray) ebVar.L;
                            SparseArray sparseArray2 = (SparseArray) ebVar2.L;
                            int size2 = sparseArray.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                View view5 = (View) sparseArray.valueAt(i16);
                                if (view5 != null && ea7Var.y(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i16))) != null && ea7Var.y(view2)) {
                                    sa7 sa7Var4 = (sa7) wuVar.get(view5);
                                    sa7 sa7Var5 = (sa7) wuVar2.get(view2);
                                    if (sa7Var4 != null && sa7Var5 != null) {
                                        ea7Var.g0.add(sa7Var4);
                                        ea7Var.h0.add(sa7Var5);
                                        wuVar.remove(view5);
                                        wuVar2.remove(view2);
                                    }
                                }
                            }
                        }
                    } else {
                        i7 = i11;
                        i8 = i2;
                        wu wuVar3 = (wu) ebVar.X;
                        wu wuVar4 = (wu) ebVar2.X;
                        int i17 = wuVar3.L;
                        for (int i18 = 0; i18 < i17; i18++) {
                            View view6 = (View) wuVar3.i(i18);
                            if (view6 != null && ea7Var.y(view6) && (view = (View) wuVar4.get((String) wuVar3.f(i18))) != null && ea7Var.y(view)) {
                                sa7 sa7Var6 = (sa7) wuVar.get(view6);
                                sa7 sa7Var7 = (sa7) wuVar2.get(view);
                                if (sa7Var6 != null && sa7Var7 != null) {
                                    ea7Var.g0.add(sa7Var6);
                                    ea7Var.h0.add(sa7Var7);
                                    wuVar.remove(view6);
                                    wuVar2.remove(view);
                                }
                            }
                        }
                    }
                } else {
                    i7 = i11;
                    i8 = i2;
                    for (int i19 = wuVar.L - 1; i19 >= 0; i19--) {
                        View view7 = (View) wuVar.f(i19);
                        if (view7 != null && ea7Var.y(view7) && (sa7Var = (sa7) wuVar2.remove(view7)) != null && ea7Var.y(sa7Var.b)) {
                            ea7Var.g0.add((sa7) wuVar.g(i19));
                            ea7Var.h0.add(sa7Var);
                        }
                    }
                }
                i2 = i8 + 1;
                i11 = i7;
                i = 0;
            }
            int i20 = i11;
            for (i3 = 0; i3 < wuVar.L; i3++) {
                sa7 sa7Var8 = (sa7) wuVar.i(i3);
                if (ea7Var.y(sa7Var8.b)) {
                    ea7Var.g0.add(sa7Var8);
                    ea7Var.h0.add(null);
                }
            }
            for (i4 = 0; i4 < wuVar2.L; i4++) {
                sa7 sa7Var9 = (sa7) wuVar2.i(i4);
                if (ea7Var.y(sa7Var9.b)) {
                    ea7Var.h0.add(sa7Var9);
                    ea7Var.g0.add(null);
                }
            }
            wu q = ea7.q();
            int i21 = q.L;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i21 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) q.f(i5);
                if (animator != null && (u97Var = (u97) q.get(animator)) != null) {
                    ea7 ea7Var2 = u97Var.e;
                    View view8 = u97Var.a;
                    if (view8 != null && windowId.equals(u97Var.d)) {
                        sa7 sa7Var10 = u97Var.c;
                        boolean z = i20;
                        sa7 t = ea7Var.t(view8, z);
                        sa7 o = ea7Var.o(view8, z);
                        if (t == null && o == null) {
                            o = (sa7) ((wu) ea7Var.d0.B).get(view8);
                        }
                        if ((t != null || o != null) && ea7Var2.w(sa7Var10, o)) {
                            ea7 p = ea7Var2.p();
                            ArrayList arrayList4 = ea7Var2.j0;
                            if (p.u0 != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                q.g(i5);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(ea7Var2);
                                }
                            } else if (!animator.isRunning() && !animator.isStarted()) {
                                q.g(i5);
                            } else {
                                animator.cancel();
                            }
                        }
                    }
                }
                i5--;
                i20 = true;
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                ea7 ea7Var3 = (ea7) arrayList2.get(i6);
                ea7Var3.A(ea7Var3, fa6.R, false);
                if (!ea7Var3.n0) {
                    ea7Var3.n0 = true;
                    ea7Var3.A(ea7Var3, fa6.L, false);
                }
            }
            ea7Var.m(viewGroup, ea7Var.Z, ea7Var.d0, ea7Var.g0, ea7Var.h0);
            if (ea7Var.u0 != null) {
                ea7Var.G();
                return true;
            } else if (Build.VERSION.SDK_INT >= 34) {
                ea7Var.C();
                z97 z97Var = ea7Var.u0;
                qa7 qa7Var = z97Var.h;
                long j = 0;
                if (qa7Var.t0 == 0) {
                    j = 1;
                }
                qa7Var.H(j, z97Var.a);
                z97Var.a = j;
                z97 z97Var2 = ea7Var.u0;
                z97Var2.b = true;
                int i22 = z97Var2.d;
                if (i22 == 1) {
                    z97Var2.d = 0;
                    z97Var2.g();
                    return true;
                } else if (i22 != 2) {
                    return true;
                } else {
                    z97Var2.d = 0;
                    z97Var2.g = z97Var2.g;
                    z97Var2.h();
                    z97Var2.e.a(RecyclerView.B1);
                    return true;
                }
            } else {
                return true;
            }
        }
        arrayList = null;
        arrayList3.add(ea7Var);
        ea7Var.a(new ma7(this, b));
        i = 0;
        ea7Var.i(viewGroup, false);
        if (arrayList != null) {
        }
        ea7Var.g0 = new ArrayList();
        ea7Var.h0 = new ArrayList();
        eb ebVar3 = ea7Var.Z;
        eb ebVar22 = ea7Var.d0;
        wuVar = new wu((wu) ebVar3.B);
        wuVar2 = new wu((wu) ebVar22.B);
        i2 = 0;
        while (true) {
            iArr = ea7Var.f0;
            if (i2 < iArr.length) {
            }
            i2 = i8 + 1;
            i11 = i7;
            i = 0;
        }
        int i202 = i11;
        while (i3 < wuVar.L) {
        }
        while (i4 < wuVar2.L) {
        }
        wu q2 = ea7.q();
        int i212 = q2.L;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i5 = i212 - 1;
        while (i5 >= 0) {
        }
        while (i6 < arrayList2.size()) {
        }
        ea7Var.m(viewGroup, ea7Var.Z, ea7Var.d0, ea7Var.g0, ea7Var.h0);
        if (ea7Var.u0 != null) {
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.B;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        oa7.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) oa7.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ea7) obj).F(viewGroup);
            }
        }
        this.A.j(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
