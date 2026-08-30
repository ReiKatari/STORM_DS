package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y35  reason: default package */
/* loaded from: classes.dex */
public abstract class y35 extends ConstraintLayout {
    public final tm3 o0;
    public int p0;
    public final gv3 q0;

    public y35(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        gv3 gv3Var = new gv3();
        this.q0 = gv3Var;
        p85 p85Var = new p85(0.5f);
        z26 f = gv3Var.B.a.f();
        f.e = p85Var;
        f.f = p85Var;
        f.g = p85Var;
        f.h = p85Var;
        gv3Var.setShapeAppearanceModel(f.a());
        this.q0.n(ColorStateList.valueOf(-1));
        setBackground(this.q0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.w, R.attr.materialClockStyle, 0);
        this.p0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.o0 = new tm3(6, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            tm3 tm3Var = this.o0;
            handler.removeCallbacks(tm3Var);
            handler.post(tm3Var);
        }
    }

    public abstract void o();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            tm3 tm3Var = this.o0;
            handler.removeCallbacks(tm3Var);
            handler.post(tm3Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.q0.n(ColorStateList.valueOf(i));
    }
}
