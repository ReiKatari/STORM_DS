package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx6  reason: default package */
/* loaded from: classes.dex */
public final class hx6 {
    public final fx6 a;
    public final ArrayList b = new ArrayList();
    public e83 c;
    public e83 d;
    public int e;

    public hx6(ViewGroup viewGroup) {
        int i;
        View view;
        e83 e83Var = e83.e;
        this.c = e83Var;
        this.d = e83Var;
        Drawable background = viewGroup.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        this.e = i;
        fx6 fx6Var = new fx6(this, viewGroup.getContext(), viewGroup);
        this.a = fx6Var;
        fx6Var.setVisibility(8);
        fx6Var.setWillNotDraw(true);
        h61 h61Var = new h61(this, 21);
        WeakHashMap weakHashMap = ao7.a;
        sn7.c(fx6Var, h61Var);
        ao7.p(fx6Var, new gx6(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount >= 0) {
                view = viewGroup.getChildAt(childCount);
                if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                    break;
                }
                childCount--;
            } else {
                view = null;
                break;
            }
        }
        if (view == null) {
            viewGroup.addView(fx6Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new wh6(viewGroup, fx6Var, 1));
        }
    }
}
