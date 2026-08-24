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
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id5  reason: default package */
/* loaded from: classes.dex */
public abstract class id5 extends ConstraintLayout {
    public final rk3 p0;
    public int q0;
    public final p24 r0;

    public id5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        p24 p24Var = new p24();
        this.r0 = p24Var;
        ei5 ei5Var = new ei5(0.5f);
        le6 f = p24Var.B.a.f();
        f.e = ei5Var;
        f.f = ei5Var;
        f.g = ei5Var;
        f.h = ei5Var;
        p24Var.setShapeAppearanceModel(f.a());
        this.r0.n(ColorStateList.valueOf(-1));
        setBackground(this.r0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.w, R.attr.materialClockStyle, 0);
        this.q0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.p0 = new rk3(this, 8);
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
            rk3 rk3Var = this.p0;
            handler.removeCallbacks(rk3Var);
            handler.post(rk3Var);
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
            rk3 rk3Var = this.p0;
            handler.removeCallbacks(rk3Var);
            handler.post(rk3Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.r0.n(ColorStateList.valueOf(i));
    }
}
