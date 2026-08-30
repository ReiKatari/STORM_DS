package qa;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e  reason: collision with root package name */
    public final int f12414e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12415f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f12416g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f12417h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f12418i;

    /* renamed from: j  reason: collision with root package name */
    public final ah.f f12419j;

    /* renamed from: k  reason: collision with root package name */
    public final jh.a f12420k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f12421l;
    public ValueAnimator m;

    public c(m mVar) {
        super(mVar);
        this.f12419j = new ah.f(3, this);
        this.f12420k = new jh.a(1, this);
        this.f12414e = a.a.T(mVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f12415f = a.a.T(mVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f12416g = a.a.U(mVar.getContext(), R.attr.motionEasingLinearInterpolator, u9.a.f13510a);
        this.f12417h = a.a.U(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f13513d);
    }

    @Override // qa.n
    public final void a() {
        if (this.f12457b.f12450m0 != null) {
            return;
        }
        s(t());
    }

    @Override // qa.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // qa.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // qa.n
    public final View.OnFocusChangeListener e() {
        return this.f12420k;
    }

    @Override // qa.n
    public final View.OnClickListener f() {
        return this.f12419j;
    }

    @Override // qa.n
    public final View.OnFocusChangeListener g() {
        return this.f12420k;
    }

    @Override // qa.n
    public final void l(EditText editText) {
        this.f12418i = editText;
        this.f12456a.setEndIconVisible(t());
    }

    @Override // qa.n
    public final void o(boolean z10) {
        if (this.f12457b.f12450m0 == null) {
            return;
        }
        s(z10);
    }

    @Override // qa.n
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f12417h);
        ofFloat.setDuration(this.f12415f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qa.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c f12411b;

            {
                this.f12411b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f12411b.f12459d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f12411b.f12459d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f12416g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f12414e;
        ofFloat2.setDuration(i2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qa.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c f12411b;

            {
                this.f12411b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f12411b.f12459d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f12411b.f12459d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12421l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f12421l.addListener(new b(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qa.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c f12411b;

            {
                this.f12411b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f12411b.f12459d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = this.f12411b.f12459d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new b(this, 1));
    }

    @Override // qa.n
    public final void r() {
        EditText editText = this.f12418i;
        if (editText != null) {
            editText.post(new a8.f(27, this));
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        if (this.f12457b.d() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f12421l.isRunning()) {
            this.m.cancel();
            this.f12421l.start();
            if (z11) {
                this.f12421l.end();
            }
        } else if (!z10) {
            this.f12421l.cancel();
            this.m.start();
            if (z11) {
                this.m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.f12418i;
        if (editText != null) {
            if ((editText.hasFocus() || this.f12459d.hasFocus()) && this.f12418i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
