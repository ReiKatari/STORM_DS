package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: at0  reason: default package */
/* loaded from: classes.dex */
public final class at0 {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;
    public final TextInputLayout a;
    public float a0;
    public float b;
    public float b0;
    public final Rect c;
    public float c0;
    public final Rect d;
    public CharSequence d0;
    public final RectF e;
    public ColorStateList j;
    public ColorStateList k;
    public boolean k0;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public pj0 z;
    public int f = 16;
    public int g = 16;
    public float h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;
    public int e0 = 1;
    public int f0 = 1;
    public final float g0 = 1.0f;
    public final int h0 = 1;
    public int i0 = -1;
    public int j0 = -1;

    public at0(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float h(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return vo.a(f, f2, f3);
    }

    public final void b() {
        float f = this.b;
        Rect rect = this.c;
        Rect rect2 = this.d;
        float h = h(rect.left, rect2.left, f, this.Q);
        RectF rectF = this.e;
        rectF.left = h;
        rectF.top = h(this.m, this.n, f, this.Q);
        rectF.right = h(rect.right, rect2.right, f, this.Q);
        rectF.bottom = h(rect.bottom, rect2.bottom, f, this.Q);
        this.q = h(this.o, this.p, f, this.Q);
        this.r = h(this.m, this.n, f, this.Q);
        d(f, false);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.postInvalidateOnAnimation();
        q92 q92Var = vo.b;
        this.b0 = 1.0f - h(RecyclerView.B1, 1.0f, 1.0f - f, q92Var);
        textInputLayout.postInvalidateOnAnimation();
        this.c0 = h(1.0f, RecyclerView.B1, f, q92Var);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f, g(colorStateList2), g(this.k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f2 = this.W;
        float f3 = this.X;
        if (f2 != f3) {
            textPaint.setLetterSpacing(h(f3, f2, f, q92Var));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.H = vo.a(RecyclerView.B1, this.S, f);
        this.I = vo.a(RecyclerView.B1, this.T, f);
        this.J = vo.a(RecyclerView.B1, this.U, f);
        int a = a(f, 0, g(this.V));
        this.K = a;
        textPaint.setShadowLayer(this.H, this.I, this.J, a);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        g60 g60Var;
        boolean z = true;
        if (this.a.getLayoutDirection() != 1) {
            z = false;
        }
        if (this.E) {
            if (z) {
                g60Var = f17.d;
            } else {
                g60Var = f17.c;
            }
            return g60Var.e(charSequence.length(), charSequence);
        }
        return z;
    }

    public final void d(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        StaticLayout staticLayout;
        boolean z5;
        boolean z6;
        boolean z7;
        float h;
        if (this.B != null) {
            float width = this.d.width();
            float width2 = this.c.width();
            float f4 = 1.0f;
            if (Math.abs(f - 1.0f) < 1.0E-5f) {
                if (o()) {
                    f2 = this.i;
                } else {
                    f2 = this.h;
                }
                if (o()) {
                    f3 = this.W;
                } else {
                    f3 = this.X;
                }
                if (o()) {
                    h = 1.0f;
                } else {
                    h = h(this.h, this.i, f, this.R) / this.h;
                }
                this.F = h;
                if (!o()) {
                    width = width2;
                }
                typeface = this.s;
                width2 = width;
            } else {
                f2 = this.h;
                float f5 = this.X;
                typeface = this.v;
                if (Math.abs(f - RecyclerView.B1) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = h(this.h, this.i, f, this.R) / this.h;
                }
                float f6 = this.i / this.h;
                float f7 = width2 * f6;
                if (!z && f7 > width && o()) {
                    width2 = Math.min(width / f6, width2);
                }
                f3 = f5;
            }
            if (f < 0.5f) {
                i = this.e0;
            } else {
                i = this.f0;
            }
            int i3 = (width2 > RecyclerView.B1 ? 1 : (width2 == RecyclerView.B1 ? 0 : -1));
            TextPaint textPaint = this.O;
            boolean z8 = false;
            if (i3 > 0) {
                if (this.G != f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.Y != f3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.y != typeface) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.Z != null && width2 != staticLayout.getWidth()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.L != i) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z2 && !z3 && !z5 && !z4 && !z6 && !this.N) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                this.G = f2;
                this.Y = f3;
                this.y = typeface;
                this.N = false;
                this.L = i;
                if (this.F != 1.0f) {
                    z8 = true;
                }
                textPaint.setLinearText(z8);
                z8 = z7;
            }
            if (this.C != null && !z8) {
                return;
            }
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.y);
            textPaint.setLetterSpacing(this.Y);
            boolean c = c(this.B);
            this.D = c;
            if ((this.e0 <= 1 && this.f0 <= 1) || c) {
                i2 = 1;
            } else {
                i2 = i;
            }
            CharSequence charSequence = this.B;
            if (!o()) {
                f4 = this.F;
            }
            StaticLayout e = e(i2, textPaint, charSequence, width2 * f4, this.D);
            this.Z = e;
            this.C = e.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0) & 7;
            if (absoluteGravity != 1) {
                boolean z2 = this.D;
                if (absoluteGravity != 5) {
                    if (z2) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                } else if (z2) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        mq6 mq6Var = new mq6(charSequence, textPaint, (int) f);
        mq6Var.l = this.A;
        mq6Var.k = z;
        mq6Var.e = alignment;
        mq6Var.j = false;
        mq6Var.f = i;
        mq6Var.g = RecyclerView.B1;
        mq6Var.h = this.g0;
        mq6Var.i = this.h0;
        mq6Var.m = null;
        StaticLayout a = mq6Var.a();
        a.getClass();
        return a;
    }

    public final float f() {
        int i = this.i0;
        if (i != -1) {
            return i;
        }
        float f = this.i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.u;
            if (typeface != null) {
                this.t = ln2.P(configuration, typeface);
            }
            Typeface typeface2 = this.x;
            if (typeface2 != null) {
                this.w = ln2.P(configuration, typeface2);
            }
            Typeface typeface3 = this.t;
            if (typeface3 == null) {
                typeface3 = this.u;
            }
            this.s = typeface3;
            Typeface typeface4 = this.w;
            if (typeface4 == null) {
                typeface4 = this.x;
            }
            this.v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z) {
        float f;
        float f2;
        int i;
        TextInputLayout textInputLayout = this.a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z) {
            d(1.0f, z);
            CharSequence charSequence = this.C;
            TextPaint textPaint = this.O;
            if (charSequence != null && this.Z != null) {
                boolean o = o();
                CharSequence charSequence2 = this.C;
                if (o) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint, this.Z.getWidth(), this.A);
                }
                this.d0 = charSequence2;
            }
            CharSequence charSequence3 = this.d0;
            float f3 = RecyclerView.B1;
            if (charSequence3 != null) {
                this.a0 = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.a0 = RecyclerView.B1;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.D ? 1 : 0);
            int i2 = absoluteGravity & 112;
            Rect rect = this.d;
            if (i2 != 48) {
                if (i2 != 80) {
                    this.n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.n = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.n = rect.top;
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 != 1) {
                if (i3 != 5) {
                    this.p = rect.left;
                } else {
                    this.p = rect.right - this.a0;
                }
            } else {
                this.p = rect.centerX() - (this.a0 / 2.0f);
            }
            if (this.a0 <= rect.width()) {
                float f4 = this.p;
                float max = Math.max((float) RecyclerView.B1, rect.left - f4) + f4;
                this.p = max;
                this.p = Math.min((float) RecyclerView.B1, rect.right - (this.a0 + max)) + max;
            }
            float f5 = this.i;
            TextPaint textPaint2 = this.P;
            textPaint2.setTextSize(f5);
            textPaint2.setTypeface(this.s);
            textPaint2.setLetterSpacing(this.W);
            if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
                float f6 = this.n;
                float max2 = Math.max((float) RecyclerView.B1, rect.top - f6) + f6;
                this.n = max2;
                this.n = Math.min((float) RecyclerView.B1, rect.bottom - (f() + max2)) + max2;
            }
            d(RecyclerView.B1, z);
            StaticLayout staticLayout = this.Z;
            if (staticLayout != null) {
                f = staticLayout.getHeight();
            } else {
                f = 0.0f;
            }
            StaticLayout staticLayout2 = this.Z;
            if (staticLayout2 != null && this.e0 > 1) {
                f2 = staticLayout2.getWidth();
            } else {
                CharSequence charSequence4 = this.C;
                if (charSequence4 != null) {
                    f2 = textPaint.measureText(charSequence4, 0, charSequence4.length());
                } else {
                    f2 = 0.0f;
                }
            }
            StaticLayout staticLayout3 = this.Z;
            if (staticLayout3 != null) {
                i = staticLayout3.getLineCount();
            } else {
                i = 0;
            }
            this.l = i;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            Rect rect2 = this.c;
            if (i4 != 48) {
                if (i4 != 80) {
                    this.m = rect2.centerY() - (f / 2.0f);
                } else {
                    float f7 = rect2.bottom - f;
                    if (this.k0) {
                        f3 = textPaint.descent();
                    }
                    this.m = f7 + f3;
                }
            } else {
                this.m = rect2.top;
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 != 1) {
                if (i5 != 5) {
                    this.o = rect2.left;
                } else {
                    this.o = rect2.right - f2;
                }
            } else {
                this.o = rect2.centerX() - (f2 / 2.0f);
            }
            d(this.b, false);
            textInputLayout.postInvalidateOnAnimation();
            b();
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        pj0 pj0Var = this.z;
        if (pj0Var != null) {
            pj0Var.g = true;
        }
        if (this.u != typeface) {
            this.u = typeface;
            Typeface P = ln2.P(this.a.getContext().getResources().getConfiguration(), typeface);
            this.t = P;
            if (P == null) {
                P = this.u;
            }
            this.s = P;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r3 > 1.0f) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(float f) {
        float f2 = RecyclerView.B1;
        if (f >= RecyclerView.B1) {
            f2 = 1.0f;
        }
        f = f2;
        if (f != this.b) {
            this.b = f;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z;
        boolean l = l(typeface);
        if (this.x != typeface) {
            this.x = typeface;
            Typeface P = ln2.P(this.a.getContext().getResources().getConfiguration(), typeface);
            this.w = P;
            if (P == null) {
                P = this.x;
            }
            this.v = P;
            z = true;
        } else {
            z = false;
        }
        if (!l && !z) {
            return;
        }
        j(false);
    }

    public final boolean o() {
        if (this.f0 == 1) {
            return true;
        }
        return false;
    }
}
