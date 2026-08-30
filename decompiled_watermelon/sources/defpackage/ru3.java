package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ru3  reason: default package */
/* loaded from: classes.dex */
public final class ru3 {
    public final MaterialButton a;
    public a36 b;
    public ie6 c;
    public qc6 d;
    public a31 e;
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
    public gv3 p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public ru3(MaterialButton materialButton, a36 a36Var) {
        this.a = materialButton;
        this.b = a36Var;
    }

    public final gv3 a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (gv3) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
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
        gv3 gv3Var = new gv3(this.b);
        ie6 ie6Var = this.c;
        if (ie6Var != null) {
            gv3Var.o(ie6Var);
        }
        qc6 qc6Var = this.d;
        if (qc6Var != null) {
            gv3Var.l(qc6Var);
        }
        a31 a31Var = this.e;
        if (a31Var != null) {
            gv3Var.y0 = a31Var;
        }
        MaterialButton materialButton = this.a;
        gv3Var.k(materialButton.getContext());
        gv3Var.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            gv3Var.setTintMode(mode);
        }
        ColorStateList colorStateList = this.n;
        gv3Var.B.k = this.k;
        gv3Var.invalidateSelf();
        ev3 ev3Var = gv3Var.B;
        if (ev3Var.e != colorStateList) {
            ev3Var.e = colorStateList;
            gv3Var.onStateChange(gv3Var.getState());
        }
        gv3 gv3Var2 = new gv3(this.b);
        ie6 ie6Var2 = this.c;
        if (ie6Var2 != null) {
            gv3Var2.o(ie6Var2);
        }
        qc6 qc6Var2 = this.d;
        if (qc6Var2 != null) {
            gv3Var2.l(qc6Var2);
        }
        gv3Var2.setTint(0);
        float f = this.k;
        if (this.q) {
            i = jk2.x(materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        gv3Var2.B.k = f;
        gv3Var2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        ev3 ev3Var2 = gv3Var2.B;
        if (ev3Var2.e != valueOf) {
            ev3Var2.e = valueOf;
            gv3Var2.onStateChange(gv3Var2.getState());
        }
        gv3 gv3Var3 = new gv3(this.b);
        this.p = gv3Var3;
        ie6 ie6Var3 = this.c;
        if (ie6Var3 != null) {
            gv3Var3.o(ie6Var3);
        }
        qc6 qc6Var3 = this.d;
        if (qc6Var3 != null) {
            this.p.l(qc6Var3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(ng5.a(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gv3Var2, gv3Var}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        gv3 a = a(false);
        if (a != null) {
            a.m(this.w);
            a.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        l36 l36Var;
        gv3 a = a(false);
        if (a != null) {
            ie6 ie6Var = this.c;
            if (ie6Var != null) {
                a.o(ie6Var);
            } else {
                a.setShapeAppearanceModel(this.b);
            }
            qc6 qc6Var = this.d;
            if (qc6Var != null) {
                a.l(qc6Var);
            }
        }
        gv3 a2 = a(true);
        if (a2 != null) {
            ie6 ie6Var2 = this.c;
            if (ie6Var2 != null) {
                a2.o(ie6Var2);
            } else {
                a2.setShapeAppearanceModel(this.b);
            }
            qc6 qc6Var2 = this.d;
            if (qc6Var2 != null) {
                a2.l(qc6Var2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            if (numberOfLayers > 2) {
                l36Var = (l36) rippleDrawable2.getDrawable(2);
            } else {
                l36Var = (l36) rippleDrawable2.getDrawable(1);
            }
        } else {
            l36Var = null;
        }
        if (l36Var != null) {
            l36Var.setShapeAppearanceModel(this.b);
            if (l36Var instanceof gv3) {
                gv3 gv3Var = (gv3) l36Var;
                ie6 ie6Var3 = this.c;
                if (ie6Var3 != null) {
                    gv3Var.o(ie6Var3);
                }
                qc6 qc6Var3 = this.d;
                if (qc6Var3 != null) {
                    gv3Var.l(qc6Var3);
                }
            }
        }
    }

    public final void e() {
        int i = 0;
        gv3 a = a(false);
        gv3 a2 = a(true);
        if (a != null) {
            ColorStateList colorStateList = this.n;
            a.B.k = this.k;
            a.invalidateSelf();
            ev3 ev3Var = a.B;
            if (ev3Var.e != colorStateList) {
                ev3Var.e = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f = this.k;
                if (this.q) {
                    i = jk2.x(this.a, R.attr.colorSurface);
                }
                a2.B.k = f;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                ev3 ev3Var2 = a2.B;
                if (ev3Var2.e != valueOf) {
                    ev3Var2.e = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
