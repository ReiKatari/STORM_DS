package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a24  reason: default package */
/* loaded from: classes.dex */
public final class a24 {
    public final MaterialButton a;
    public me6 b;
    public xp6 c;
    public go6 d;
    public h61 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public p24 p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public a24(MaterialButton materialButton, me6 me6Var) {
        this.a = materialButton;
        this.b = me6Var;
    }

    public final p24 a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (p24) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        int i;
        p24 p24Var = new p24(this.b);
        xp6 xp6Var = this.c;
        if (xp6Var != null) {
            p24Var.o(xp6Var);
        }
        go6 go6Var = this.d;
        if (go6Var != null) {
            p24Var.l(go6Var);
        }
        h61 h61Var = this.e;
        if (h61Var != null) {
            p24Var.z0 = h61Var;
        }
        MaterialButton materialButton = this.a;
        p24Var.k(materialButton.getContext());
        p24Var.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            p24Var.setTintMode(mode);
        }
        ColorStateList colorStateList = this.n;
        p24Var.B.k = this.k;
        p24Var.invalidateSelf();
        n24 n24Var = p24Var.B;
        if (n24Var.e != colorStateList) {
            n24Var.e = colorStateList;
            p24Var.onStateChange(p24Var.getState());
        }
        p24 p24Var2 = new p24(this.b);
        xp6 xp6Var2 = this.c;
        if (xp6Var2 != null) {
            p24Var2.o(xp6Var2);
        }
        go6 go6Var2 = this.d;
        if (go6Var2 != null) {
            p24Var2.l(go6Var2);
        }
        p24Var2.setTint(0);
        float f = this.k;
        if (this.q) {
            i = mp2.B(materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        p24Var2.B.k = f;
        p24Var2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        n24 n24Var2 = p24Var2.B;
        if (n24Var2.e != valueOf) {
            n24Var2.e = valueOf;
            p24Var2.onStateChange(p24Var2.getState());
        }
        p24 p24Var3 = new p24(this.b);
        this.p = p24Var3;
        xp6 xp6Var3 = this.c;
        if (xp6Var3 != null) {
            p24Var3.o(xp6Var3);
        }
        go6 go6Var3 = this.d;
        if (go6Var3 != null) {
            this.p.l(go6Var3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(lq5.a(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{p24Var2, p24Var}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        p24 a = a(false);
        if (a != null) {
            a.m(this.w);
            a.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        xe6 xe6Var;
        p24 a = a(false);
        if (a != null) {
            xp6 xp6Var = this.c;
            if (xp6Var != null) {
                a.o(xp6Var);
            } else {
                a.setShapeAppearanceModel(this.b);
            }
            go6 go6Var = this.d;
            if (go6Var != null) {
                a.l(go6Var);
            }
        }
        p24 a2 = a(true);
        if (a2 != null) {
            xp6 xp6Var2 = this.c;
            if (xp6Var2 != null) {
                a2.o(xp6Var2);
            } else {
                a2.setShapeAppearanceModel(this.b);
            }
            go6 go6Var2 = this.d;
            if (go6Var2 != null) {
                a2.l(go6Var2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            if (numberOfLayers > 2) {
                xe6Var = (xe6) rippleDrawable2.getDrawable(2);
            } else {
                xe6Var = (xe6) rippleDrawable2.getDrawable(1);
            }
        } else {
            xe6Var = null;
        }
        if (xe6Var != null) {
            xe6Var.setShapeAppearanceModel(this.b);
            if (xe6Var instanceof p24) {
                p24 p24Var = (p24) xe6Var;
                xp6 xp6Var3 = this.c;
                if (xp6Var3 != null) {
                    p24Var.o(xp6Var3);
                }
                go6 go6Var3 = this.d;
                if (go6Var3 != null) {
                    p24Var.l(go6Var3);
                }
            }
        }
    }

    public final void e() {
        int i = 0;
        p24 a = a(false);
        p24 a2 = a(true);
        if (a != null) {
            ColorStateList colorStateList = this.n;
            a.B.k = this.k;
            a.invalidateSelf();
            n24 n24Var = a.B;
            if (n24Var.e != colorStateList) {
                n24Var.e = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f = this.k;
                if (this.q) {
                    i = mp2.B(this.a, R.attr.colorSurface);
                }
                a2.B.k = f;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                n24 n24Var2 = a2.B;
                if (n24Var2.e != valueOf) {
                    n24Var2.e = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
