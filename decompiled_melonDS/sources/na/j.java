package na;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class j extends Drawable implements y {

    /* renamed from: y0  reason: collision with root package name */
    public static final Paint f10161y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final i[] f10162z0;
    public final g A;
    public h B;
    public final w[] L;
    public final w[] R;
    public final BitSet X;
    public boolean Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public final Matrix f10163b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Path f10164c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Path f10165d0;

    /* renamed from: e0  reason: collision with root package name */
    public final RectF f10166e0;

    /* renamed from: f0  reason: collision with root package name */
    public final RectF f10167f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Region f10168g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Region f10169h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Paint f10170i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Paint f10171j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ma.a f10172k0;

    /* renamed from: l0  reason: collision with root package name */
    public final g f10173l0;

    /* renamed from: m0  reason: collision with root package name */
    public final p f10174m0;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuffColorFilter f10175n0;

    /* renamed from: o0  reason: collision with root package name */
    public PorterDuffColorFilter f10176o0;
    public final RectF p0;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f10177q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f10178r0;

    /* renamed from: s0  reason: collision with root package name */
    public n f10179s0;

    /* renamed from: t0  reason: collision with root package name */
    public l6.g f10180t0;

    /* renamed from: u0  reason: collision with root package name */
    public final l6.f[] f10181u0;

    /* renamed from: v0  reason: collision with root package name */
    public float[] f10182v0;

    /* renamed from: w0  reason: collision with root package name */
    public float[] f10183w0;

    /* renamed from: x0  reason: collision with root package name */
    public ah.e f10184x0;

    static {
        Paint paint = new Paint(1);
        f10161y0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f10162z0 = new i[4];
        int i2 = 0;
        while (true) {
            i[] iVarArr = f10162z0;
            if (i2 < iVarArr.length) {
                iVarArr[i2] = new i(i2);
                i2++;
            } else {
                return;
            }
        }
    }

    public j(h hVar) {
        p pVar;
        this.A = new g(this);
        this.L = new w[4];
        this.R = new w[4];
        this.X = new BitSet(8);
        this.f10163b0 = new Matrix();
        this.f10164c0 = new Path();
        this.f10165d0 = new Path();
        this.f10166e0 = new RectF();
        this.f10167f0 = new RectF();
        this.f10168g0 = new Region();
        this.f10169h0 = new Region();
        Paint paint = new Paint(1);
        this.f10170i0 = paint;
        Paint paint2 = new Paint(1);
        this.f10171j0 = paint2;
        this.f10172k0 = new ma.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = o.f10210a;
        } else {
            pVar = new p();
        }
        this.f10174m0 = pVar;
        this.p0 = new RectF();
        this.f10177q0 = true;
        this.f10178r0 = true;
        this.f10181u0 = new l6.f[4];
        this.B = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.f10173l0 = new g(this);
    }

    public static float b(RectF rectF, n nVar, float[] fArr) {
        if (fArr == null) {
            if (nVar.e(rectF)) {
                return nVar.f10202e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f8 = fArr[0];
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] != f8) {
                    return -1.0f;
                }
            }
        }
        if (nVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        h hVar = this.B;
        this.f10174m0.a(hVar.f10144a, this.f10182v0, hVar.f10153j, rectF, this.f10173l0, path);
        if (this.B.f10152i != 1.0f) {
            Matrix matrix = this.f10163b0;
            matrix.reset();
            float f8 = this.B.f10152i;
            matrix.setScale(f8, f8, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.p0, true);
    }

    public final int c(int i2) {
        float f8;
        float f10;
        int i10;
        h hVar = this.B;
        float f11 = hVar.f10156n + 0.0f + hVar.m;
        ga.a aVar = hVar.f10146c;
        if (aVar != null && aVar.f5631a && q5.a.d(i2, 255) == aVar.f5634d) {
            if (aVar.f5635e > 0.0f && f11 > 0.0f) {
                f10 = Math.min(((((float) Math.log1p(f11 / f8)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f10 = 0.0f;
            }
            int alpha = Color.alpha(i2);
            int u4 = l0.f.u(f10, q5.a.d(i2, 255), aVar.f5632b);
            if (f10 > 0.0f && (i10 = aVar.f5633c) != 0) {
                u4 = q5.a.b(q5.a.d(i10, ga.a.f5630f), u4);
            }
            return q5.a.d(u4, alpha);
        }
        return i2;
    }

    public final void d(Canvas canvas) {
        if (this.X.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.B.f10158p;
        Path path = this.f10164c0;
        ma.a aVar = this.f10172k0;
        if (i2 != 0) {
            canvas.drawPath(path, aVar.f9456a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            w wVar = this.L[i10];
            int i11 = this.B.f10157o;
            Matrix matrix = w.f10239b;
            wVar.a(matrix, aVar, i11, canvas);
            this.R[i10].a(matrix, aVar, this.B.f10157o, canvas);
        }
        if (this.f10177q0) {
            double d4 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d4)) * this.B.f10158p);
            int cos = (int) (Math.cos(Math.toRadians(d4)) * this.B.f10158p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f10161y0);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r19.B.f10144a.d() != false) goto L60;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na.j.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, n nVar, float[] fArr, RectF rectF) {
        float b10 = b(rectF, nVar, fArr);
        if (b10 >= 0.0f) {
            float f8 = b10 * this.B.f10153j;
            canvas.drawRoundRect(rectF, f8, f8, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void f(Canvas canvas) {
        n nVar = this.f10179s0;
        float[] fArr = this.f10183w0;
        RectF g10 = g();
        RectF rectF = this.f10167f0;
        rectF.set(g10);
        float i2 = i();
        rectF.inset(i2, i2);
        e(canvas, this.f10171j0, this.f10165d0, nVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f10166e0;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.B.f10155l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.B.getClass();
        RectF g10 = g();
        if (!g10.isEmpty()) {
            float b10 = b(g10, this.B.f10144a, this.f10182v0);
            if (b10 >= 0.0f) {
                outline.setRoundRect(getBounds(), b10 * this.B.f10153j);
                return;
            }
            boolean z10 = this.Y;
            Path path = this.f10164c0;
            if (z10) {
                a(g10, path);
                this.Y = false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                fa.b.a(outline, path);
            } else if (i2 >= 29) {
                try {
                    fa.a.a(outline, path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                fa.a.a(outline, path);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.B.f10151h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f10168g0;
        region.set(bounds);
        RectF g10 = g();
        Path path = this.f10164c0;
        a(g10, path);
        Region region2 = this.f10169h0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.f10182v0;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g10 = g();
        n nVar = this.B.f10144a;
        p pVar = this.f10174m0;
        pVar.getClass();
        float a10 = nVar.f10202e.a(g10);
        n nVar2 = this.B.f10144a;
        pVar.getClass();
        float a11 = nVar2.f10205h.a(g10) + a10;
        n nVar3 = this.B.f10144a;
        pVar.getClass();
        float a12 = a11 - nVar3.f10204g.a(g10);
        n nVar4 = this.B.f10144a;
        pVar.getClass();
        return (a12 - nVar4.f10203f.a(g10)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.f10171j0.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.Y = true;
        this.Z = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.B.f10149f;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.B.getClass();
                ColorStateList colorStateList2 = this.B.f10148e;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.B.f10147d;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        b0 b0Var = this.B.f10145b;
                        if (b0Var == null || !b0Var.d()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Paint.Style style = this.B.f10159q;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f10171j0.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void k(Context context) {
        this.B.f10146c = new ga.a(context);
        s();
    }

    public final void l(l6.g gVar) {
        if (this.f10180t0 != gVar) {
            this.f10180t0 = gVar;
            int i2 = 0;
            while (true) {
                l6.f[] fVarArr = this.f10181u0;
                if (i2 < fVarArr.length) {
                    if (fVarArr[i2] == null) {
                        fVarArr[i2] = new l6.f(this, f10162z0[i2]);
                    }
                    l6.f fVar = fVarArr[i2];
                    l6.g gVar2 = new l6.g();
                    gVar2.a((float) gVar.f8959b);
                    double d4 = gVar.f8958a;
                    gVar2.b((float) (d4 * d4));
                    fVar.m = gVar2;
                    i2++;
                } else {
                    q(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    public final void m(float f8) {
        h hVar = this.B;
        if (hVar.f10156n != f8) {
            hVar.f10156n = f8;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.B = new h(this.B);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        h hVar = this.B;
        if (hVar.f10147d != colorStateList) {
            hVar.f10147d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(b0 b0Var) {
        h hVar = this.B;
        if (hVar.f10145b != b0Var) {
            hVar.f10145b = b0Var;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.Y = true;
        this.Z = true;
        super.onBoundsChange(rect);
        if (this.B.f10145b != null && !rect.isEmpty()) {
            q(getState(), this.f10178r0);
        }
        this.f10178r0 = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10 = false;
        if (this.B.f10145b != null) {
            q(iArr, false);
        }
        z10 = (p(iArr) || r()) ? true : true;
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final boolean p(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.B.f10147d != null && color2 != (colorForState2 = this.B.f10147d.getColorForState(iArr, (color2 = (paint2 = this.f10170i0).getColor())))) {
            paint2.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.B.f10148e != null && color != (colorForState = this.B.f10148e.getColorForState(iArr, (color = (paint = this.f10171j0).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z10;
    }

    public final void q(int[] iArr, boolean z10) {
        boolean z11;
        n a10;
        d dVar;
        int i2;
        RectF g10 = g();
        if (this.B.f10145b != null && !g10.isEmpty()) {
            if (this.f10180t0 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            if (this.f10182v0 == null) {
                this.f10182v0 = new float[4];
            }
            b0 b0Var = this.B.f10145b;
            n[] nVarArr = b0Var.f10131d;
            int i10 = b0Var.f10128a;
            int[][] iArr2 = b0Var.f10130c;
            z zVar = b0Var.f10135h;
            z zVar2 = b0Var.f10134g;
            z zVar3 = b0Var.f10133f;
            z zVar4 = b0Var.f10132e;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 < 0) {
                int[] iArr3 = StateSet.WILD_CARD;
                int i12 = 0;
                while (true) {
                    if (i12 < i10) {
                        if (StateSet.stateSetMatches(iArr2[i12], iArr3)) {
                            i2 = i12;
                            break;
                        }
                        i12++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                i11 = i2;
            }
            if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
                a10 = nVarArr[i11];
            } else {
                m f8 = nVarArr[i11].f();
                if (zVar4 != null) {
                    f8.f10190e = zVar4.c(iArr);
                }
                if (zVar3 != null) {
                    f8.f10191f = zVar3.c(iArr);
                }
                if (zVar2 != null) {
                    f8.f10193h = zVar2.c(iArr);
                }
                if (zVar != null) {
                    f8.f10192g = zVar.c(iArr);
                }
                a10 = f8.a();
            }
            for (int i13 = 0; i13 < 4; i13++) {
                this.f10174m0.getClass();
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            dVar = a10.f10203f;
                        } else {
                            dVar = a10.f10202e;
                        }
                    } else {
                        dVar = a10.f10205h;
                    }
                } else {
                    dVar = a10.f10204g;
                }
                float a11 = dVar.a(g10);
                if (z12) {
                    this.f10182v0[i13] = a11;
                }
                l6.f[] fVarArr = this.f10181u0;
                l6.f fVar = fVarArr[i13];
                if (fVar != null) {
                    fVar.a(a11);
                    if (z12) {
                        fVarArr[i13].d();
                    }
                }
            }
            if (z12) {
                invalidateSelf();
            }
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10175n0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f10176o0;
        h hVar = this.B;
        ColorStateList colorStateList = hVar.f10149f;
        PorterDuff.Mode mode = hVar.f10150g;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = this.f10170i0.getColor();
            int c4 = c(color);
            if (c4 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c4, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.f10175n0 = porterDuffColorFilter;
        this.B.getClass();
        this.f10176o0 = null;
        this.B.getClass();
        if (!Objects.equals(porterDuffColorFilter2, this.f10175n0) || !Objects.equals(porterDuffColorFilter3, this.f10176o0)) {
            return true;
        }
        return false;
    }

    public final void s() {
        h hVar = this.B;
        float f8 = hVar.f10156n + 0.0f;
        hVar.f10157o = (int) Math.ceil(0.75f * f8);
        this.B.f10158p = (int) Math.ceil(f8 * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        h hVar = this.B;
        if (hVar.f10155l != i2) {
            hVar.f10155l = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.getClass();
        super.invalidateSelf();
    }

    @Override // na.y
    public final void setShapeAppearanceModel(n nVar) {
        h hVar = this.B;
        hVar.f10144a = nVar;
        hVar.f10145b = null;
        this.f10182v0 = null;
        this.f10183w0 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.B.f10149f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.B;
        if (hVar.f10150g != mode) {
            hVar.f10150g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public j(Context context, AttributeSet attributeSet, int i2, int i10) {
        this(n.b(context, attributeSet, i2, i10).a());
    }

    public j(n nVar) {
        this(new h(nVar));
    }

    public j() {
        this(new n());
    }
}
