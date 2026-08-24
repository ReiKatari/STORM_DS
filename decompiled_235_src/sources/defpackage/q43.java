package defpackage;

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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.stormds.emulator.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q43  reason: default package */
/* loaded from: classes.dex */
public final class q43 {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public qs r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public qs y;
    public int z;

    public q43(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.a = kj2.W(context, R.attr.motionDurationShort4, 217);
        this.b = kj2.W(context, R.attr.motionDurationMedium4, 167);
        this.c = kj2.W(context, R.attr.motionDurationShort4, 167);
        this.d = kj2.X(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, vo.d);
        LinearInterpolator linearInterpolator = vo.a;
        this.e = kj2.X(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = kj2.X(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(qs qsVar, int i) {
        if (this.i == null && this.k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i != 0 && i != 1) {
            this.i.addView(qsVar, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.k.setVisibility(0);
            this.k.addView(qsVar);
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean W = np2.W(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (W) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (W) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (W) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, qs qsVar, int i, int i2, int i3) {
        boolean z2;
        float f;
        long j;
        TimeInterpolator timeInterpolator;
        if (qsVar != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qsVar, View.ALPHA, f);
                int i4 = this.c;
                if (z2) {
                    j = this.b;
                } else {
                    j = i4;
                }
                ofFloat.setDuration(j);
                if (z2) {
                    timeInterpolator = this.e;
                } else {
                    timeInterpolator = this.f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    ofFloat.setStartDelay(i4);
                }
                arrayList.add(ofFloat);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qsVar, View.TRANSLATION_Y, -this.m, RecyclerView.B1);
                    ofFloat2.setDuration(this.a);
                    ofFloat2.setInterpolator(this.d);
                    ofFloat2.setStartDelay(i4);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.y;
        }
        return this.r;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) {
            if (this.x && !TextUtils.isEmpty(this.w)) {
                this.o = 2;
            } else {
                this.o = 0;
            }
        }
        i(this.n, h(this.r, ""), this.o);
    }

    public final void g(qs qsVar, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            if ((i == 0 || i == 1) && (frameLayout = this.k) != null) {
                frameLayout.removeView(qsVar);
            } else {
                linearLayout.removeView(qsVar);
            }
            int i2 = this.j - 1;
            this.j = i2;
            LinearLayout linearLayout2 = this.i;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(qs qsVar, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.o != this.n || qsVar == null || !TextUtils.equals(qsVar.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(int i, boolean z, int i2) {
        TextView e;
        TextView e2;
        q43 q43Var = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            q43Var.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            q43Var.d(arrayList, q43Var.x, q43Var.y, 2, i, i2);
            q43Var.d(arrayList, q43Var.q, q43Var.r, 1, i, i2);
            int size = arrayList.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            q43Var = this;
            animatorSet.addListener(new o43(this, i2, e(i), i, q43Var.e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = q43Var.e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((CharSequence) null);
                }
            }
            q43Var.n = i2;
        }
        TextInputLayout textInputLayout = q43Var.h;
        textInputLayout.t();
        textInputLayout.w(z, false);
        textInputLayout.z();
    }
}
