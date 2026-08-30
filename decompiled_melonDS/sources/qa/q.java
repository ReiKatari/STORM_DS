package qa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import me.magnum.melonds.R;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f12466a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12467b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12468c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f12469d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f12470e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f12471f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f12472g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f12473h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f12474i;

    /* renamed from: j  reason: collision with root package name */
    public int f12475j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f12476k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f12477l;
    public final float m;

    /* renamed from: n  reason: collision with root package name */
    public int f12478n;

    /* renamed from: o  reason: collision with root package name */
    public int f12479o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f12480p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12481q;

    /* renamed from: r  reason: collision with root package name */
    public z0 f12482r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f12483s;

    /* renamed from: t  reason: collision with root package name */
    public int f12484t;

    /* renamed from: u  reason: collision with root package name */
    public int f12485u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f12486v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f12487w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12488x;

    /* renamed from: y  reason: collision with root package name */
    public z0 f12489y;

    /* renamed from: z  reason: collision with root package name */
    public int f12490z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f12472g = context;
        this.f12473h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f12466a = a.a.T(context, R.attr.motionDurationShort4, 217);
        this.f12467b = a.a.T(context, R.attr.motionDurationMedium4, 167);
        this.f12468c = a.a.T(context, R.attr.motionDurationShort4, 167);
        this.f12469d = a.a.U(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, u9.a.f13513d);
        LinearInterpolator linearInterpolator = u9.a.f13510a;
        this.f12470e = a.a.U(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f12471f = a.a.U(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(z0 z0Var, int i2) {
        if (this.f12474i == null && this.f12476k == null) {
            Context context = this.f12472g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f12474i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f12474i;
            TextInputLayout textInputLayout = this.f12473h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f12476k = new FrameLayout(context);
            this.f12474i.addView(this.f12476k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 != 0 && i2 != 1) {
            this.f12474i.addView(z0Var, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f12476k.setVisibility(0);
            this.f12476k.addView(z0Var);
        }
        this.f12474i.setVisibility(0);
        this.f12475j++;
    }

    public final void b() {
        if (this.f12474i != null) {
            TextInputLayout textInputLayout = this.f12473h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f12472g;
                boolean w10 = k7.w.w(context);
                LinearLayout linearLayout = this.f12474i;
                int paddingStart = editText.getPaddingStart();
                if (w10) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (w10) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (w10) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f12477l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, z0 z0Var, int i2, int i10, int i11) {
        boolean z11;
        float f8;
        long j2;
        TimeInterpolator timeInterpolator;
        if (z0Var != null && z10) {
            if (i2 == i11 || i2 == i10) {
                if (i11 == i2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z0Var, View.ALPHA, f8);
                int i12 = this.f12468c;
                if (z11) {
                    j2 = this.f12467b;
                } else {
                    j2 = i12;
                }
                ofFloat.setDuration(j2);
                if (z11) {
                    timeInterpolator = this.f12470e;
                } else {
                    timeInterpolator = this.f12471f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i2 == i11 && i10 != 0) {
                    ofFloat.setStartDelay(i12);
                }
                arrayList.add(ofFloat);
                if (i11 == i2 && i10 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z0Var, View.TRANSLATION_Y, -this.m, 0.0f);
                    ofFloat2.setDuration(this.f12466a);
                    ofFloat2.setInterpolator(this.f12469d);
                    ofFloat2.setStartDelay(i12);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return this.f12489y;
        }
        return this.f12482r;
    }

    public final void f() {
        this.f12480p = null;
        c();
        if (this.f12478n == 1) {
            if (this.f12488x && !TextUtils.isEmpty(this.f12487w)) {
                this.f12479o = 2;
            } else {
                this.f12479o = 0;
            }
        }
        i(this.f12478n, h(this.f12482r, ""), this.f12479o);
    }

    public final void g(z0 z0Var, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f12474i;
        if (linearLayout != null) {
            if ((i2 == 0 || i2 == 1) && (frameLayout = this.f12476k) != null) {
                frameLayout.removeView(z0Var);
            } else {
                linearLayout.removeView(z0Var);
            }
            int i10 = this.f12475j - 1;
            this.f12475j = i10;
            LinearLayout linearLayout2 = this.f12474i;
            if (i10 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(z0 z0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f12473h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.f12479o != this.f12478n || z0Var == null || !TextUtils.equals(z0Var.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(int i2, boolean z10, int i10) {
        TextView e6;
        TextView e10;
        q qVar = this;
        if (i2 == i10) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            qVar.f12477l = animatorSet;
            ArrayList arrayList = new ArrayList();
            qVar.d(arrayList, qVar.f12488x, qVar.f12489y, 2, i2, i10);
            qVar.d(arrayList, qVar.f12481q, qVar.f12482r, 1, i2, i10);
            int size = arrayList.size();
            long j2 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Animator animator = (Animator) arrayList.get(i11);
                j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j2);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            qVar = this;
            animatorSet.addListener(new o(this, i10, e(i2), i2, qVar.e(i10)));
            animatorSet.start();
        } else if (i2 != i10) {
            if (i10 != 0 && (e10 = qVar.e(i10)) != null) {
                e10.setVisibility(0);
                e10.setAlpha(1.0f);
            }
            if (i2 != 0 && (e6 = e(i2)) != null) {
                e6.setVisibility(4);
                if (i2 == 1) {
                    e6.setText((CharSequence) null);
                }
            }
            qVar.f12478n = i10;
        }
        TextInputLayout textInputLayout = qVar.f12473h;
        textInputLayout.t();
        textInputLayout.w(z10, false);
        textInputLayout.z();
    }
}
