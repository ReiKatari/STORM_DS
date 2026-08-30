package z9;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import l0.f;
import l6.g;
import me.magnum.melonds.R;
import na.b0;
import na.h;
import na.j;
import na.n;
import na.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f14979a;

    /* renamed from: b  reason: collision with root package name */
    public n f14980b;

    /* renamed from: c  reason: collision with root package name */
    public b0 f14981c;

    /* renamed from: d  reason: collision with root package name */
    public g f14982d;

    /* renamed from: e  reason: collision with root package name */
    public ah.e f14983e;

    /* renamed from: f  reason: collision with root package name */
    public int f14984f;

    /* renamed from: g  reason: collision with root package name */
    public int f14985g;

    /* renamed from: h  reason: collision with root package name */
    public int f14986h;

    /* renamed from: i  reason: collision with root package name */
    public int f14987i;

    /* renamed from: j  reason: collision with root package name */
    public int f14988j;

    /* renamed from: k  reason: collision with root package name */
    public int f14989k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f14990l;
    public ColorStateList m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f14991n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f14992o;

    /* renamed from: p  reason: collision with root package name */
    public j f14993p;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14997t;

    /* renamed from: v  reason: collision with root package name */
    public RippleDrawable f14999v;

    /* renamed from: w  reason: collision with root package name */
    public int f15000w;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14994q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f14995r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14996s = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14998u = true;

    public e(MaterialButton materialButton, n nVar) {
        this.f14979a = materialButton;
        this.f14980b = nVar;
    }

    public final j a(boolean z10) {
        RippleDrawable rippleDrawable = this.f14999v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (j) ((LayerDrawable) ((InsetDrawable) this.f14999v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    public final void b(int i2, int i10) {
        MaterialButton materialButton = this.f14979a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f14986h;
        int i12 = this.f14987i;
        this.f14987i = i10;
        this.f14986h = i2;
        if (!this.f14995r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void c() {
        int i2;
        j jVar = new j(this.f14980b);
        b0 b0Var = this.f14981c;
        if (b0Var != null) {
            jVar.o(b0Var);
        }
        g gVar = this.f14982d;
        if (gVar != null) {
            jVar.l(gVar);
        }
        ah.e eVar = this.f14983e;
        if (eVar != null) {
            jVar.f10184x0 = eVar;
        }
        MaterialButton materialButton = this.f14979a;
        jVar.k(materialButton.getContext());
        jVar.setTintList(this.m);
        PorterDuff.Mode mode = this.f14990l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        ColorStateList colorStateList = this.f14991n;
        jVar.B.f10154k = this.f14989k;
        jVar.invalidateSelf();
        h hVar = jVar.B;
        if (hVar.f10148e != colorStateList) {
            hVar.f10148e = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.f14980b);
        b0 b0Var2 = this.f14981c;
        if (b0Var2 != null) {
            jVar2.o(b0Var2);
        }
        g gVar2 = this.f14982d;
        if (gVar2 != null) {
            jVar2.l(gVar2);
        }
        jVar2.setTint(0);
        float f8 = this.f14989k;
        if (this.f14994q) {
            i2 = f.m(materialButton, R.attr.colorSurface);
        } else {
            i2 = 0;
        }
        jVar2.B.f10154k = f8;
        jVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        h hVar2 = jVar2.B;
        if (hVar2.f10148e != valueOf) {
            hVar2.f10148e = valueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.f14980b);
        this.f14993p = jVar3;
        b0 b0Var3 = this.f14981c;
        if (b0Var3 != null) {
            jVar3.o(b0Var3);
        }
        g gVar3 = this.f14982d;
        if (gVar3 != null) {
            this.f14993p.l(gVar3);
        }
        this.f14993p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(la.a.a(this.f14992o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f14984f, this.f14986h, this.f14985g, this.f14987i), this.f14993p);
        this.f14999v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        j a10 = a(false);
        if (a10 != null) {
            a10.m(this.f15000w);
            a10.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        y yVar;
        j a10 = a(false);
        if (a10 != null) {
            b0 b0Var = this.f14981c;
            if (b0Var != null) {
                a10.o(b0Var);
            } else {
                a10.setShapeAppearanceModel(this.f14980b);
            }
            g gVar = this.f14982d;
            if (gVar != null) {
                a10.l(gVar);
            }
        }
        j a11 = a(true);
        if (a11 != null) {
            b0 b0Var2 = this.f14981c;
            if (b0Var2 != null) {
                a11.o(b0Var2);
            } else {
                a11.setShapeAppearanceModel(this.f14980b);
            }
            g gVar2 = this.f14982d;
            if (gVar2 != null) {
                a11.l(gVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f14999v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            int numberOfLayers = this.f14999v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.f14999v;
            if (numberOfLayers > 2) {
                yVar = (y) rippleDrawable2.getDrawable(2);
            } else {
                yVar = (y) rippleDrawable2.getDrawable(1);
            }
        } else {
            yVar = null;
        }
        if (yVar != null) {
            yVar.setShapeAppearanceModel(this.f14980b);
            if (yVar instanceof j) {
                j jVar = (j) yVar;
                b0 b0Var3 = this.f14981c;
                if (b0Var3 != null) {
                    jVar.o(b0Var3);
                }
                g gVar3 = this.f14982d;
                if (gVar3 != null) {
                    jVar.l(gVar3);
                }
            }
        }
    }

    public final void e() {
        int i2 = 0;
        j a10 = a(false);
        j a11 = a(true);
        if (a10 != null) {
            ColorStateList colorStateList = this.f14991n;
            a10.B.f10154k = this.f14989k;
            a10.invalidateSelf();
            h hVar = a10.B;
            if (hVar.f10148e != colorStateList) {
                hVar.f10148e = colorStateList;
                a10.onStateChange(a10.getState());
            }
            if (a11 != null) {
                float f8 = this.f14989k;
                if (this.f14994q) {
                    i2 = f.m(this.f14979a, R.attr.colorSurface);
                }
                a11.B.f10154k = f8;
                a11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i2);
                h hVar2 = a11.B;
                if (hVar2.f10148e != valueOf) {
                    hVar2.f10148e = valueOf;
                    a11.onStateChange(a11.getState());
                }
            }
        }
    }
}
