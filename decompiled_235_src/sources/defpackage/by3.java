package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by3  reason: default package */
/* loaded from: classes.dex */
public abstract class by3 {
    public static final py0 a = new py0(new pi3(9));

    public static jl4 a(px0 px0Var) {
        jl4 jl4Var;
        xq2 xq2Var = (xq2) px0Var;
        jl4 jl4Var2 = (jl4) xq2Var.j(a);
        jl4 jl4Var3 = null;
        if (jl4Var2 == null) {
            xq2Var.b0(1208426157);
            View view = (View) xq2Var.j(kf.f);
            view.getClass();
            while (true) {
                if (view != null) {
                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    if (tag instanceof jl4) {
                        jl4Var = (jl4) tag;
                    } else {
                        jl4Var = null;
                    }
                    if (jl4Var != null) {
                        jl4Var2 = jl4Var;
                        break;
                    }
                    ViewParent s = xk2.s(view);
                    if (s instanceof View) {
                        view = (View) s;
                    } else {
                        view = null;
                    }
                } else {
                    jl4Var2 = null;
                    break;
                }
            }
        } else {
            xq2Var.b0(1208423708);
        }
        xq2Var.p(false);
        if (jl4Var2 == null) {
            xq2Var.b0(1208428160);
            Context context = (Context) xq2Var.j(kf.b);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof jl4) {
                    jl4Var3 = context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            jl4 jl4Var4 = jl4Var3;
            xq2Var.p(false);
            return jl4Var4;
        }
        xq2Var.b0(1208423789);
        xq2Var.p(false);
        return jl4Var2;
    }
}
