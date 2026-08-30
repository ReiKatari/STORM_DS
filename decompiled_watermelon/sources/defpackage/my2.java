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
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: my2  reason: default package */
/* loaded from: classes.dex */
public final class my2 {
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
    public ds r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public ds y;
    public int z;

    public my2(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.a = me2.M(context, R.attr.motionDurationShort4, 217);
        this.b = me2.M(context, R.attr.motionDurationMedium4, 167);
        this.c = me2.M(context, R.attr.motionDurationShort4, 167);
        this.d = me2.N(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, jo.d);
        LinearInterpolator linearInterpolator = jo.a;
        this.e = me2.N(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = me2.N(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(ds dsVar, int i) {
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
            this.i.addView(dsVar, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.k.setVisibility(0);
            this.k.addView(dsVar);
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
                boolean K = nk2.K(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (K) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (K) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (K) {
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

    public final void d(ArrayList arrayList, boolean z, ds dsVar, int i, int i2, int i3) {
        boolean z2;
        float f;
        long j;
        TimeInterpolator timeInterpolator;
        if (dsVar != null && z) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dsVar, View.ALPHA, f);
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
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dsVar, View.TRANSLATION_Y, -this.m, RecyclerView.A1);
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

    public final void g(ds dsVar, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            if ((i == 0 || i == 1) && (frameLayout = this.k) != null) {
                frameLayout.removeView(dsVar);
            } else {
                linearLayout.removeView(dsVar);
            }
            int i2 = this.j - 1;
            this.j = i2;
            LinearLayout linearLayout2 = this.i;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(ds dsVar, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.o != this.n || dsVar == null || !TextUtils.equals(dsVar.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(int i, boolean z, int i2) {
        TextView e;
        TextView e2;
        my2 my2Var = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            my2Var.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            my2Var.d(arrayList, my2Var.x, my2Var.y, 2, i, i2);
            my2Var.d(arrayList, my2Var.q, my2Var.r, 1, i, i2);
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
            my2Var = this;
            animatorSet.addListener(new ky2(this, i2, e(i), i, my2Var.e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = my2Var.e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((CharSequence) null);
                }
            }
            my2Var.n = i2;
        }
        TextInputLayout textInputLayout = my2Var.h;
        textInputLayout.t();
        textInputLayout.w(z, false);
        textInputLayout.z();
    }
}
