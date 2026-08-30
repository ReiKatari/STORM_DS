package c8;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends t {

    /* renamed from: z0  reason: collision with root package name */
    public static final String[] f2646z0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y0  reason: collision with root package name */
    public final int f2647y0;

    public h() {
        this.f2647y0 = 3;
    }

    public static void Q(b0 b0Var) {
        View view = b0Var.f2621b;
        int visibility = view.getVisibility();
        HashMap hashMap = b0Var.f2620a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float S(b0 b0Var, float f8) {
        Float f10;
        if (b0Var != null && (f10 = (Float) b0Var.f2620a.get("android:fade:transitionAlpha")) != null) {
            return f10.floatValue();
        }
        return f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [c8.j0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c8.j0 T(c8.b0 r8, c8.b0 r9) {
        /*
            c8.j0 r0 = new c8.j0
            r0.<init>()
            r1 = 0
            r0.f2659a = r1
            r0.f2660b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f2620a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f2661c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2663e = r6
            goto L33
        L2f:
            r0.f2661c = r3
            r0.f2663e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f2620a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f2662d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2664f = r2
            goto L56
        L52:
            r0.f2662d = r3
            r0.f2664f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f2661c
            int r9 = r0.f2662d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f2663e
            android.view.ViewGroup r4 = r0.f2664f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f2660b = r1
            r0.f2659a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f2660b = r2
            r0.f2659a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f2664f
            if (r8 != 0) goto L81
            r0.f2660b = r1
            r0.f2659a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f2663e
            if (r8 != 0) goto L9f
            r0.f2660b = r2
            r0.f2659a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f2662d
            if (r8 != 0) goto L95
            r0.f2660b = r2
            r0.f2659a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f2661c
            if (r8 != 0) goto L9f
            r0.f2660b = r1
            r0.f2659a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.h.T(c8.b0, c8.b0):c8.j0");
    }

    public final ObjectAnimator R(View view, float f8, float f10) {
        if (f8 == f10) {
            return null;
        }
        e0.f2636a.E(view, f8);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, e0.f2637b, f10);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        r().a(gVar);
        return ofFloat;
    }

    @Override // c8.t
    public final void e(b0 b0Var) {
        Q(b0Var);
    }

    @Override // c8.t
    public final void h(b0 b0Var) {
        Q(b0Var);
        View view = b0Var.f2621b;
        Float f8 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f8 == null) {
            if (view.getVisibility() == 0) {
                f8 = Float.valueOf(e0.f2636a.p(view));
            } else {
                f8 = Float.valueOf(0.0f);
            }
        }
        b0Var.f2620a.put("android:fade:transitionAlpha", f8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (T(q(r3, false), u(r3, false)).f2659a != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    @Override // c8.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator n(android.view.ViewGroup r25, c8.b0 r26, c8.b0 r27) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.h.n(android.view.ViewGroup, c8.b0, c8.b0):android.animation.Animator");
    }

    @Override // c8.t
    public final String[] t() {
        return f2646z0;
    }

    @Override // c8.t
    public final boolean w() {
        return true;
    }

    @Override // c8.t
    public final boolean x(b0 b0Var, b0 b0Var2) {
        if (b0Var != null || b0Var2 != null) {
            if (b0Var == null || b0Var2 == null || b0Var2.f2620a.containsKey("android:visibility:visibility") == b0Var.f2620a.containsKey("android:visibility:visibility")) {
                j0 T = T(b0Var, b0Var2);
                if (T.f2659a) {
                    if (T.f2661c == 0 || T.f2662d == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public h(int i2) {
        this();
        this.f2647y0 = i2;
    }
}
