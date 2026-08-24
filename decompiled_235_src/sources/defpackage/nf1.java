package defpackage;

import android.transition.Transition;
import androidx.fragment.app.b0;
import androidx.fragment.app.f;
import androidx.fragment.app.o;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nf1  reason: default package */
/* loaded from: classes.dex */
public final class nf1 extends f {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf1(b0 b0Var, boolean z, boolean z2) {
        super(b0Var);
        Object exitTransition;
        boolean z3;
        Object obj;
        o oVar = b0Var.c;
        ao6 ao6Var = b0Var.a;
        ao6 ao6Var2 = ao6.VISIBLE;
        if (ao6Var == ao6Var2) {
            if (z) {
                exitTransition = oVar.getReenterTransition();
            } else {
                exitTransition = oVar.getEnterTransition();
            }
        } else if (z) {
            exitTransition = oVar.getReturnTransition();
        } else {
            exitTransition = oVar.getExitTransition();
        }
        this.b = exitTransition;
        if (b0Var.a == ao6Var2) {
            if (z) {
                z3 = oVar.getAllowReturnTransitionOverlap();
            } else {
                z3 = oVar.getAllowEnterTransitionOverlap();
            }
        } else {
            z3 = true;
        }
        this.c = z3;
        if (z2) {
            if (z) {
                obj = oVar.getSharedElementReturnTransition();
            } else {
                obj = oVar.getSharedElementEnterTransition();
            }
        } else {
            obj = null;
        }
        this.d = obj;
    }

    public final dm2 b() {
        Object obj = this.b;
        dm2 c = c(obj);
        Object obj2 = this.d;
        dm2 c2 = c(obj2);
        if (c != null && c2 != null && c != c2) {
            u34.n("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", this.a.c, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
            return null;
        } else if (c == null) {
            return c2;
        } else {
            return c;
        }
    }

    public final dm2 c(Object obj) {
        if (obj == null) {
            return null;
        }
        bm2 bm2Var = wl2.a;
        if (obj instanceof Transition) {
            return bm2Var;
        }
        dm2 dm2Var = wl2.b;
        if (dm2Var != null && dm2Var.g(obj)) {
            return dm2Var;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        o oVar = this.a.c;
        sb.append(" for fragment ");
        sb.append(oVar);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
