package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bp0  reason: default package */
/* loaded from: classes.dex */
public final class bp0 extends zz1 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final xo0 j;
    public final yo0 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public bp0(yz1 yz1Var) {
        super(yz1Var);
        this.j = new xo0(0, this);
        this.k = new yo0(0, this);
        this.e = me2.M(yz1Var.getContext(), R.attr.motionDurationShort3, 100);
        this.f = me2.M(yz1Var.getContext(), R.attr.motionDurationShort3, 150);
        this.g = me2.N(yz1Var.getContext(), R.attr.motionEasingLinearInterpolator, jo.a);
        this.h = me2.N(yz1Var.getContext(), R.attr.motionEasingEmphasizedInterpolator, jo.d);
    }

    @Override // defpackage.zz1
    public final void a() {
        if (this.b.n0 != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.zz1
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.zz1
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.zz1
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.zz1
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.zz1
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.zz1
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.zz1
    public final void o(boolean z) {
        if (this.b.n0 == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.zz1
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zo0
            public final /* synthetic */ bp0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = r2;
                bp0 bp0Var = this.b;
                switch (i) {
                    case 0:
                        bp0Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = bp0Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.A1, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        ofFloat2.setDuration(i);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zo0
            public final /* synthetic */ bp0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = r2;
                bp0 bp0Var = this.b;
                switch (i2) {
                    case 0:
                        bp0Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = bp0Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new ap0(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.A1);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zo0
            public final /* synthetic */ bp0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = r2;
                bp0 bp0Var = this.b;
                switch (i2) {
                    case 0:
                        bp0Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = bp0Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new ap0(this, 1));
    }

    @Override // defpackage.zz1
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new m0(11, this));
        }
    }

    public final void s(boolean z) {
        boolean z2;
        if (this.b.d() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
            }
        } else if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            if ((editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
