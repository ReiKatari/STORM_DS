package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h60  reason: default package */
/* loaded from: classes.dex */
public final class h60 extends oi2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ e51 f;

    public /* synthetic */ h60(e51 e51Var, int i) {
        this.e = i;
        this.f = e51Var;
    }

    @Override // defpackage.oi2
    public int E(View view) {
        switch (this.e) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.E(view);
        }
    }

    @Override // defpackage.oi2
    public int F() {
        switch (this.e) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f;
                if (bottomSheetBehavior.I) {
                    return bottomSheetBehavior.V;
                }
                return bottomSheetBehavior.G;
            default:
                return super.F();
        }
    }

    @Override // defpackage.oi2
    public final void Q(int i) {
        int i2 = this.e;
        e51 e51Var = this.f;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) e51Var;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.J(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) e51Var;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.w(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.oi2
    public final void R(View view, int i, int i2) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.e;
        e51 e51Var = this.f;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) e51Var).y(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) e51Var;
                WeakReference weakReference = sideSheetBehavior.q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.h0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.a.j(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw i61.j(it);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r6.a.J(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (java.lang.Math.abs(r8 - r6.a.u()) < java.lang.Math.abs(r8 - r6.a.v())) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r8 > r6.E) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
        if (java.lang.Math.abs(r7.getTop() - r6.C()) < java.lang.Math.abs(r7.getTop() - r6.E)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
        if (java.lang.Math.abs(r8 - r6.E) < java.lang.Math.abs(r8 - r6.G)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0115, code lost:
        if (java.lang.Math.abs(r8 - r6.D) < java.lang.Math.abs(r8 - r6.G)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0124, code lost:
        if (r8 < java.lang.Math.abs(r8 - r6.G)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0134, code lost:
        if (java.lang.Math.abs(r8 - r9) < java.lang.Math.abs(r8 - r6.G)) goto L27;
     */
    @Override // defpackage.oi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(View view, float f, float f2) {
        int i = this.e;
        int i2 = 3;
        e51 e51Var = this.f;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) e51Var;
                if (f2 < RecyclerView.B1) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        break;
                    }
                    bottomSheetBehavior.L(view, i2, true);
                    return;
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.K(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.C() + bottomSheetBehavior.V) / 2) {
                            if (!bottomSheetBehavior.b) {
                                break;
                            }
                            bottomSheetBehavior.L(view, i2, true);
                            return;
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.L(view, i2, true);
                    return;
                } else {
                    if (f2 != RecyclerView.B1 && Math.abs(f) <= Math.abs(f2)) {
                        if (!bottomSheetBehavior.b) {
                            int top2 = view.getTop();
                            break;
                        }
                        i2 = 4;
                    } else {
                        int top3 = view.getTop();
                        if (bottomSheetBehavior.b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.E;
                            if (top3 >= i3) {
                                break;
                            } else {
                                break;
                            }
                            i2 = 6;
                        }
                    }
                    bottomSheetBehavior.L(view, i2, true);
                    return;
                }
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) e51Var;
                if (!sideSheetBehavior.a.I(f)) {
                    if (sideSheetBehavior.a.c0(view, f)) {
                        if (!sideSheetBehavior.a.K(f, f2)) {
                            break;
                        }
                        i2 = 5;
                    } else {
                        if (f == RecyclerView.B1 || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            break;
                        }
                        i2 = 5;
                    }
                }
                sideSheetBehavior.y(view, i2, true);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r6.canScrollVertically(-1) != false) goto L33;
     */
    @Override // defpackage.oi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0(View view, int i) {
        View view2;
        WeakReference weakReference;
        int i2 = this.e;
        e51 e51Var = this.f;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) e51Var;
                int i3 = bottomSheetBehavior.N;
                if (i3 != 1 && !bottomSheetBehavior.d0) {
                    if (i3 == 3 && bottomSheetBehavior.b0 == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.X;
                        if (weakReference2 != null) {
                            view2 = (View) weakReference2.get();
                        } else {
                            view2 = null;
                        }
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.W;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        return true;
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) e51Var;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.p) != null && weakReference.get() == view) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.oi2
    public final int m(View view, int i) {
        switch (this.e) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                return ej2.q(i, sideSheetBehavior.a.x(), sideSheetBehavior.a.w());
        }
    }

    @Override // defpackage.oi2
    public final int n(View view, int i) {
        switch (this.e) {
            case 0:
                return ej2.q(i, ((BottomSheetBehavior) this.f).C(), F());
            default:
                return view.getTop();
        }
    }
}
