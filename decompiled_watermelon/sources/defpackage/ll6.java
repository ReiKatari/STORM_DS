package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ll6  reason: default package */
/* loaded from: classes.dex */
public final class ll6 {
    public final jl6 a;
    public final ArrayList b = new ArrayList();
    public x13 c;
    public x13 d;
    public int e;

    public ll6(ViewGroup viewGroup) {
        int i;
        View view;
        x13 x13Var = x13.e;
        this.c = x13Var;
        this.d = x13Var;
        Drawable background = viewGroup.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        this.e = i;
        jl6 jl6Var = new jl6(this, viewGroup.getContext(), viewGroup);
        this.a = jl6Var;
        jl6Var.setVisibility(8);
        jl6Var.setWillNotDraw(true);
        a31 a31Var = new a31(22, this);
        WeakHashMap weakHashMap = aa7.a;
        s97.c(jl6Var, a31Var);
        aa7.p(jl6Var, new kl6(this));
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
            viewGroup.addView(jl6Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new i66(viewGroup, jl6Var, 1));
        }
    }
}
