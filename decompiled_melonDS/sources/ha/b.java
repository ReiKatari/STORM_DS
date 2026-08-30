package ha;

import a0.l;
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
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {
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

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f6376a;

    /* renamed from: a0  reason: collision with root package name */
    public float f6377a0;

    /* renamed from: b  reason: collision with root package name */
    public float f6378b;

    /* renamed from: b0  reason: collision with root package name */
    public float f6379b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f6380c;

    /* renamed from: c0  reason: collision with root package name */
    public float f6381c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f6382d;

    /* renamed from: d0  reason: collision with root package name */
    public CharSequence f6383d0;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f6384e;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f6394j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f6396k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f6397k0;

    /* renamed from: l  reason: collision with root package name */
    public int f6398l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public float f6399n;

    /* renamed from: o  reason: collision with root package name */
    public float f6400o;

    /* renamed from: p  reason: collision with root package name */
    public float f6401p;

    /* renamed from: q  reason: collision with root package name */
    public float f6402q;

    /* renamed from: r  reason: collision with root package name */
    public float f6403r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f6404s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f6405t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f6406u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f6407v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f6408w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f6409x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f6410y;

    /* renamed from: z  reason: collision with root package name */
    public ka.a f6411z;

    /* renamed from: f  reason: collision with root package name */
    public int f6386f = 16;

    /* renamed from: g  reason: collision with root package name */
    public int f6388g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f6390h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f6392i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0  reason: collision with root package name */
    public int f6385e0 = 1;

    /* renamed from: f0  reason: collision with root package name */
    public int f6387f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public final float f6389g0 = 1.0f;

    /* renamed from: h0  reason: collision with root package name */
    public final int f6391h0 = 1;

    /* renamed from: i0  reason: collision with root package name */
    public int f6393i0 = -1;

    /* renamed from: j0  reason: collision with root package name */
    public int f6395j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f6376a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f6382d = new Rect();
        this.f6380c = new Rect();
        this.f6384e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f8, int i2, int i10) {
        float f10 = 1.0f - f8;
        return Color.argb(Math.round((Color.alpha(i10) * f8) + (Color.alpha(i2) * f10)), Math.round((Color.red(i10) * f8) + (Color.red(i2) * f10)), Math.round((Color.green(i10) * f8) + (Color.green(i2) * f10)), Math.round((Color.blue(i10) * f8) + (Color.blue(i2) * f10)));
    }

    public static float h(float f8, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return u9.a.a(f8, f10, f11);
    }

    public final void b() {
        float f8 = this.f6378b;
        Rect rect = this.f6380c;
        Rect rect2 = this.f6382d;
        float h2 = h(rect.left, rect2.left, f8, this.Q);
        RectF rectF = this.f6384e;
        rectF.left = h2;
        rectF.top = h(this.m, this.f6399n, f8, this.Q);
        rectF.right = h(rect.right, rect2.right, f8, this.Q);
        rectF.bottom = h(rect.bottom, rect2.bottom, f8, this.Q);
        this.f6402q = h(this.f6400o, this.f6401p, f8, this.Q);
        this.f6403r = h(this.m, this.f6399n, f8, this.Q);
        d(f8, false);
        TextInputLayout textInputLayout = this.f6376a;
        textInputLayout.postInvalidateOnAnimation();
        t6.a aVar = u9.a.f13511b;
        this.f6379b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f8, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f6381c0 = h(1.0f, 0.0f, f8, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f6396k;
        ColorStateList colorStateList2 = this.f6394j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f8, g(colorStateList2), g(this.f6396k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f10 = this.W;
        float f11 = this.X;
        if (f10 != f11) {
            textPaint.setLetterSpacing(h(f11, f10, f8, aVar));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.H = u9.a.a(0.0f, this.S, f8);
        this.I = u9.a.a(0.0f, this.T, f8);
        this.J = u9.a.a(0.0f, this.U, f8);
        int a10 = a(f8, 0, g(this.V));
        this.K = a10;
        textPaint.setShadowLayer(this.H, this.I, this.J, a10);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        l lVar;
        boolean z10 = true;
        if (this.f6376a.getLayoutDirection() != 1) {
            z10 = false;
        }
        if (this.E) {
            if (z10) {
                lVar = x5.g.f14371d;
            } else {
                lVar = x5.g.f14370c;
            }
            return lVar.h(charSequence.length(), charSequence);
        }
        return z10;
    }

    public final void d(float f8, boolean z10) {
        float f10;
        Typeface typeface;
        float f11;
        int i2;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        StaticLayout staticLayout;
        boolean z14;
        boolean z15;
        boolean z16;
        float h2;
        if (this.B != null) {
            float width = this.f6382d.width();
            float width2 = this.f6380c.width();
            float f12 = 1.0f;
            if (Math.abs(f8 - 1.0f) < 1.0E-5f) {
                if (o()) {
                    f10 = this.f6392i;
                } else {
                    f10 = this.f6390h;
                }
                if (o()) {
                    f11 = this.W;
                } else {
                    f11 = this.X;
                }
                if (o()) {
                    h2 = 1.0f;
                } else {
                    h2 = h(this.f6390h, this.f6392i, f8, this.R) / this.f6390h;
                }
                this.F = h2;
                if (!o()) {
                    width = width2;
                }
                typeface = this.f6404s;
                width2 = width;
            } else {
                f10 = this.f6390h;
                float f13 = this.X;
                typeface = this.f6407v;
                if (Math.abs(f8 - 0.0f) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = h(this.f6390h, this.f6392i, f8, this.R) / this.f6390h;
                }
                float f14 = this.f6392i / this.f6390h;
                float f15 = width2 * f14;
                if (!z10 && f15 > width && o()) {
                    width2 = Math.min(width / f14, width2);
                }
                f11 = f13;
            }
            if (f8 < 0.5f) {
                i2 = this.f6385e0;
            } else {
                i2 = this.f6387f0;
            }
            int i11 = (width2 > 0.0f ? 1 : (width2 == 0.0f ? 0 : -1));
            TextPaint textPaint = this.O;
            boolean z17 = false;
            if (i11 > 0) {
                if (this.G != f10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y != f11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.f6410y != typeface) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.Z != null && width2 != staticLayout.getWidth()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.L != i2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z11 && !z12 && !z14 && !z13 && !z15 && !this.N) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                this.G = f10;
                this.Y = f11;
                this.f6410y = typeface;
                this.N = false;
                this.L = i2;
                if (this.F != 1.0f) {
                    z17 = true;
                }
                textPaint.setLinearText(z17);
                z17 = z16;
            }
            if (this.C != null && !z17) {
                return;
            }
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f6410y);
            textPaint.setLetterSpacing(this.Y);
            boolean c4 = c(this.B);
            this.D = c4;
            if ((this.f6385e0 <= 1 && this.f6387f0 <= 1) || c4) {
                i10 = 1;
            } else {
                i10 = i2;
            }
            CharSequence charSequence = this.B;
            if (!o()) {
                f12 = this.F;
            }
            StaticLayout e6 = e(i10, textPaint, charSequence, width2 * f12, this.D);
            this.Z = e6;
            this.C = e6.getText();
        }
    }

    public final StaticLayout e(int i2, TextPaint textPaint, CharSequence charSequence, float f8, boolean z10) {
        Layout.Alignment alignment;
        if (i2 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f6386f, this.D ? 1 : 0) & 7;
            if (absoluteGravity != 1) {
                boolean z11 = this.D;
                if (absoluteGravity != 5) {
                    if (z11) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                } else if (z11) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        f fVar = new f(charSequence, textPaint, (int) f8);
        fVar.f6430l = this.A;
        fVar.f6429k = z10;
        fVar.f6423e = alignment;
        fVar.f6428j = false;
        fVar.f6424f = i2;
        fVar.f6425g = 0.0f;
        fVar.f6426h = this.f6389g0;
        fVar.f6427i = this.f6391h0;
        fVar.m = null;
        StaticLayout a10 = fVar.a();
        a10.getClass();
        return a10;
    }

    public final float f() {
        int i2 = this.f6393i0;
        if (i2 != -1) {
            return i2;
        }
        float f8 = this.f6392i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f8);
        textPaint.setTypeface(this.f6404s);
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
            Typeface typeface = this.f6406u;
            if (typeface != null) {
                this.f6405t = pc.a.E(configuration, typeface);
            }
            Typeface typeface2 = this.f6409x;
            if (typeface2 != null) {
                this.f6408w = pc.a.E(configuration, typeface2);
            }
            Typeface typeface3 = this.f6405t;
            if (typeface3 == null) {
                typeface3 = this.f6406u;
            }
            this.f6404s = typeface3;
            Typeface typeface4 = this.f6408w;
            if (typeface4 == null) {
                typeface4 = this.f6409x;
            }
            this.f6407v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z10) {
        float f8;
        float f10;
        int i2;
        TextInputLayout textInputLayout = this.f6376a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z10) {
            d(1.0f, z10);
            CharSequence charSequence = this.C;
            TextPaint textPaint = this.O;
            if (charSequence != null && this.Z != null) {
                boolean o5 = o();
                CharSequence charSequence2 = this.C;
                if (o5) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint, this.Z.getWidth(), this.A);
                }
                this.f6383d0 = charSequence2;
            }
            CharSequence charSequence3 = this.f6383d0;
            float f11 = 0.0f;
            if (charSequence3 != null) {
                this.f6377a0 = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.f6377a0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f6388g, this.D ? 1 : 0);
            int i10 = absoluteGravity & 112;
            Rect rect = this.f6382d;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.f6399n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f6399n = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f6399n = rect.top;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    this.f6401p = rect.left;
                } else {
                    this.f6401p = rect.right - this.f6377a0;
                }
            } else {
                this.f6401p = rect.centerX() - (this.f6377a0 / 2.0f);
            }
            if (this.f6377a0 <= rect.width()) {
                float f12 = this.f6401p;
                float max = Math.max(0.0f, rect.left - f12) + f12;
                this.f6401p = max;
                this.f6401p = Math.min(0.0f, rect.right - (this.f6377a0 + max)) + max;
            }
            float f13 = this.f6392i;
            TextPaint textPaint2 = this.P;
            textPaint2.setTextSize(f13);
            textPaint2.setTypeface(this.f6404s);
            textPaint2.setLetterSpacing(this.W);
            if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
                float f14 = this.f6399n;
                float max2 = Math.max(0.0f, rect.top - f14) + f14;
                this.f6399n = max2;
                this.f6399n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
            }
            d(0.0f, z10);
            StaticLayout staticLayout = this.Z;
            if (staticLayout != null) {
                f8 = staticLayout.getHeight();
            } else {
                f8 = 0.0f;
            }
            StaticLayout staticLayout2 = this.Z;
            if (staticLayout2 != null && this.f6385e0 > 1) {
                f10 = staticLayout2.getWidth();
            } else {
                CharSequence charSequence4 = this.C;
                if (charSequence4 != null) {
                    f10 = textPaint.measureText(charSequence4, 0, charSequence4.length());
                } else {
                    f10 = 0.0f;
                }
            }
            StaticLayout staticLayout3 = this.Z;
            if (staticLayout3 != null) {
                i2 = staticLayout3.getLineCount();
            } else {
                i2 = 0;
            }
            this.f6398l = i2;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f6386f, this.D ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            Rect rect2 = this.f6380c;
            if (i12 != 48) {
                if (i12 != 80) {
                    this.m = rect2.centerY() - (f8 / 2.0f);
                } else {
                    float f15 = rect2.bottom - f8;
                    if (this.f6397k0) {
                        f11 = textPaint.descent();
                    }
                    this.m = f15 + f11;
                }
            } else {
                this.m = rect2.top;
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    this.f6400o = rect2.left;
                } else {
                    this.f6400o = rect2.right - f10;
                }
            } else {
                this.f6400o = rect2.centerX() - (f10 / 2.0f);
            }
            d(this.f6378b, false);
            textInputLayout.postInvalidateOnAnimation();
            b();
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f6396k == colorStateList && this.f6394j == colorStateList) {
            return;
        }
        this.f6396k = colorStateList;
        this.f6394j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        ka.a aVar = this.f6411z;
        if (aVar != null) {
            aVar.f8109e0 = true;
        }
        if (this.f6406u != typeface) {
            this.f6406u = typeface;
            Typeface E = pc.a.E(this.f6376a.getContext().getResources().getConfiguration(), typeface);
            this.f6405t = E;
            if (E == null) {
                E = this.f6406u;
            }
            this.f6404s = E;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r3 > 1.0f) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.f6378b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f6378b = r3
            r2.b()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.b.m(float):void");
    }

    public final void n(Typeface typeface) {
        boolean z10;
        boolean l10 = l(typeface);
        if (this.f6409x != typeface) {
            this.f6409x = typeface;
            Typeface E = pc.a.E(this.f6376a.getContext().getResources().getConfiguration(), typeface);
            this.f6408w = E;
            if (E == null) {
                E = this.f6409x;
            }
            this.f6407v = E;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!l10 && !z10) {
            return;
        }
        j(false);
    }

    public final boolean o() {
        if (this.f6387f0 == 1) {
            return true;
        }
        return false;
    }
}
