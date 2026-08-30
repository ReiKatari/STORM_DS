package defpackage;

import android.transition.Transition;
import androidx.fragment.app.b0;
import androidx.fragment.app.f;
import androidx.fragment.app.o;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pb1  reason: default package */
/* loaded from: classes.dex */
public final class pb1 extends f {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb1(b0 b0Var, boolean z, boolean z2) {
        super(b0Var);
        Object exitTransition;
        boolean z3;
        Object obj;
        o oVar = b0Var.c;
        kc6 kc6Var = b0Var.a;
        kc6 kc6Var2 = kc6.VISIBLE;
        if (kc6Var == kc6Var2) {
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
        if (b0Var.a == kc6Var2) {
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

    public final dh2 b() {
        Object obj = this.b;
        dh2 c = c(obj);
        Object obj2 = this.d;
        dh2 c2 = c(obj2);
        if (c != null && c2 != null && c != c2) {
            c44.m("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", this.a.c, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
            return null;
        } else if (c == null) {
            return c2;
        } else {
            return c;
        }
    }

    public final dh2 c(Object obj) {
        if (obj == null) {
            return null;
        }
        bh2 bh2Var = wg2.a;
        if (obj instanceof Transition) {
            return bh2Var;
        }
        dh2 dh2Var = wg2.b;
        if (dh2Var != null && dh2Var.g(obj)) {
            return dh2Var;
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
