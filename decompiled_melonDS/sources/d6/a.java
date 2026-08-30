package d6;

import a0.j;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3890a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3891b;

    /* renamed from: c  reason: collision with root package name */
    public q5.b f3892c;

    /* renamed from: d  reason: collision with root package name */
    public q5.b f3893d;

    /* renamed from: e  reason: collision with root package name */
    public c f3894e;

    /* renamed from: f  reason: collision with root package name */
    public final ColorDrawable f3895f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3896g;

    /* renamed from: h  reason: collision with root package name */
    public int f3897h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.b, java.lang.Object] */
    public a(int i2, int i10) {
        ?? obj = new Object();
        obj.f3898a = -1;
        obj.f3899b = -1;
        q5.b bVar = q5.b.f12282e;
        obj.f3900c = bVar;
        obj.f3901d = false;
        obj.f3902e = null;
        obj.f3903f = 0.0f;
        obj.f3904g = 0.0f;
        obj.f3905h = 1.0f;
        this.f3891b = obj;
        this.f3892c = bVar;
        this.f3893d = bVar;
        this.f3894e = null;
        if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 8) {
            j.h(w.d.l(i2, "Unexpected side: "));
            throw null;
        }
        this.f3890a = i2;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f3895f = colorDrawable;
        this.f3897h = 0;
        this.f3896g = true;
        if (i10 != 0) {
            this.f3897h = i10;
            colorDrawable.setColor(i10);
            obj.f3902e = colorDrawable;
            a0.g gVar = obj.f3906i;
            if (gVar != null) {
                ((View) gVar.L).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f8) {
        float f10 = f8 * 1.0f;
        b bVar = this.f3891b;
        if (bVar.f3905h != f10) {
            bVar.f3905h = f10;
            a0.g gVar = bVar.f3906i;
            if (gVar != null) {
                ((View) gVar.L).setAlpha(f10);
            }
        }
    }

    public final void b(float f8) {
        float f10 = f8 * 1.0f;
        b bVar = this.f3891b;
        int i2 = this.f3890a;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 == 8) {
                        float f11 = (1.0f - f10) * bVar.f3899b;
                        if (bVar.f3904g != f11) {
                            bVar.f3904g = f11;
                            a0.g gVar = bVar.f3906i;
                            if (gVar != null) {
                                ((View) gVar.L).setTranslationY(f11);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                float f12 = (1.0f - f10) * bVar.f3898a;
                if (bVar.f3903f != f12) {
                    bVar.f3903f = f12;
                    a0.g gVar2 = bVar.f3906i;
                    if (gVar2 != null) {
                        ((View) gVar2.L).setTranslationX(f12);
                        return;
                    }
                    return;
                }
                return;
            }
            float f13 = (-(1.0f - f10)) * bVar.f3899b;
            if (bVar.f3904g != f13) {
                bVar.f3904g = f13;
                a0.g gVar3 = bVar.f3906i;
                if (gVar3 != null) {
                    ((View) gVar3.L).setTranslationY(f13);
                    return;
                }
                return;
            }
            return;
        }
        float f14 = (-(1.0f - f10)) * bVar.f3898a;
        if (bVar.f3903f != f14) {
            bVar.f3903f = f14;
            a0.g gVar4 = bVar.f3906i;
            if (gVar4 != null) {
                ((View) gVar4.L).setTranslationX(f14);
            }
        }
    }
}
