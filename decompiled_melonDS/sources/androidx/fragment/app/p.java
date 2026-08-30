package androidx.fragment.app;

import android.transition.Transition;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends k {

    /* renamed from: b  reason: collision with root package name */
    public final Object f1385b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1386c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e2 e2Var, boolean z10, boolean z11) {
        super(e2Var);
        Object exitTransition;
        boolean z12;
        Object obj;
        j0 j0Var = e2Var.f1273c;
        i2 i2Var = e2Var.f1271a;
        i2 i2Var2 = i2.VISIBLE;
        if (i2Var == i2Var2) {
            if (z10) {
                exitTransition = j0Var.getReenterTransition();
            } else {
                exitTransition = j0Var.getEnterTransition();
            }
        } else if (z10) {
            exitTransition = j0Var.getReturnTransition();
        } else {
            exitTransition = j0Var.getExitTransition();
        }
        this.f1385b = exitTransition;
        if (e2Var.f1271a == i2Var2) {
            if (z10) {
                z12 = j0Var.getAllowReturnTransitionOverlap();
            } else {
                z12 = j0Var.getAllowEnterTransitionOverlap();
            }
        } else {
            z12 = true;
        }
        this.f1386c = z12;
        if (z11) {
            if (z10) {
                obj = j0Var.getSharedElementReturnTransition();
            } else {
                obj = j0Var.getSharedElementEnterTransition();
            }
        } else {
            obj = null;
        }
        this.f1387d = obj;
    }

    public final z1 b() {
        Object obj = this.f1385b;
        z1 c4 = c(obj);
        Object obj2 = this.f1387d;
        z1 c10 = c(obj2);
        if (c4 != null && c10 != null && c4 != c10) {
            j0 j0Var = this.f1343a.f1273c;
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + j0Var + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        } else if (c4 == null) {
            return c10;
        } else {
            return c4;
        }
    }

    public final z1 c(Object obj) {
        if (obj == null) {
            return null;
        }
        x1 x1Var = s1.f1414a;
        if (obj instanceof Transition) {
            return x1Var;
        }
        z1 z1Var = s1.f1415b;
        if (z1Var != null && z1Var.g(obj)) {
            return z1Var;
        }
        StringBuilder sb2 = new StringBuilder("Transition ");
        sb2.append(obj);
        j0 j0Var = this.f1343a.f1273c;
        sb2.append(" for fragment ");
        sb2.append(j0Var);
        sb2.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb2.toString());
    }
}
