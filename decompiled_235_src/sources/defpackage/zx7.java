package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zx7  reason: default package */
/* loaded from: classes.dex */
public abstract class zx7 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final xx7 a(p0 p0Var, mx0 mx0Var, zv0 zv0Var) {
        te teVar;
        Object tag;
        xx7 xx7Var = null;
        if (ps2.a.compareAndSet(false, true)) {
            v80 c = nb3.c(1, null, null, 6);
            hv.L(g04.i((l61) sm.i0.getValue()), null, null, new u12(c, null), 3);
            mc mcVar = new mc(c, 14);
            synchronized (bm6.c) {
                bm6.i = gt0.U0(mcVar, bm6.i);
            }
            bm6.a();
        }
        if (p0Var.getChildCount() > 0) {
            View childAt = p0Var.getChildAt(0);
            if (childAt instanceof te) {
                teVar = (te) childAt;
            } else {
                teVar = null;
            }
            if (teVar != null) {
                teVar.setComposeViewContext(mx0Var);
                if (teVar == null) {
                    teVar = new te(p0Var.getContext(), mx0Var);
                    p0Var.addView(teVar.getView(), a);
                }
                teVar.setComposeViewContext(mx0Var);
                if (p0Var.getComposeViewContext$ui() != null) {
                    mx0Var.c();
                    teVar.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                tag = teVar.getTag(R.id.wrapped_composition_tag);
                if (tag instanceof xx7) {
                    xx7Var = (xx7) tag;
                }
                if (xx7Var == null) {
                    xx7Var = new xx7(teVar, new ey0(mx0Var.b, new cg7(teVar.getRoot())));
                    teVar.setTag(R.id.wrapped_composition_tag, xx7Var);
                }
                xx7Var.b(zv0Var);
                teVar.setFrameEndScheduler$ui(new yx7(mx0Var.b));
                return xx7Var;
            }
        } else {
            p0Var.removeAllViews();
        }
        teVar = null;
        if (teVar == null) {
        }
        teVar.setComposeViewContext(mx0Var);
        if (p0Var.getComposeViewContext$ui() != null) {
        }
        tag = teVar.getTag(R.id.wrapped_composition_tag);
        if (tag instanceof xx7) {
        }
        if (xx7Var == null) {
        }
        xx7Var.b(zv0Var);
        teVar.setFrameEndScheduler$ui(new yx7(mx0Var.b));
        return xx7Var;
    }
}
