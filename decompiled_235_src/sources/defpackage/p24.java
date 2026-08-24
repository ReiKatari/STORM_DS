package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.BitSet;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p24  reason: default package */
/* loaded from: classes.dex */
public class p24 extends Drawable implements xe6 {
    public static final Paint A0;
    public static final o24[] B0;
    public final m24 A;
    public n24 B;
    public final ve6[] L;
    public final ve6[] R;
    public final BitSet X;
    public boolean Y;
    public boolean Z;
    public final Matrix d0;
    public final Path e0;
    public final Path f0;
    public final RectF g0;
    public final RectF h0;
    public final Region i0;
    public final Region j0;
    public final Paint k0;
    public final Paint l0;
    public final ie6 m0;
    public final m24 n0;
    public final oe6 o0;
    public PorterDuffColorFilter p0;
    public PorterDuffColorFilter q0;
    public final RectF r0;
    public final boolean s0;
    public boolean t0;
    public me6 u0;
    public go6 v0;
    public final fo6[] w0;
    public float[] x0;
    public float[] y0;
    public h61 z0;

    static {
        Paint paint = new Paint(1);
        A0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        B0 = new o24[4];
        int i = 0;
        while (true) {
            o24[] o24VarArr = B0;
            if (i < o24VarArr.length) {
                o24VarArr[i] = new o24(i);
                i++;
            } else {
                return;
            }
        }
    }

    public p24(n24 n24Var) {
        oe6 oe6Var;
        this.A = new m24(this);
        this.L = new ve6[4];
        this.R = new ve6[4];
        this.X = new BitSet(8);
        this.d0 = new Matrix();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new Region();
        this.j0 = new Region();
        Paint paint = new Paint(1);
        this.k0 = paint;
        Paint paint2 = new Paint(1);
        this.l0 = paint2;
        this.m0 = new ie6();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oe6Var = ne6.a;
        } else {
            oe6Var = new oe6();
        }
        this.o0 = oe6Var;
        this.r0 = new RectF();
        this.s0 = true;
        this.t0 = true;
        this.w0 = new fo6[4];
        this.B = n24Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.n0 = new m24(this);
    }

    public static float b(RectF rectF, me6 me6Var, float[] fArr) {
        if (fArr == null) {
            if (me6Var.e(rectF)) {
                return me6Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (me6Var.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        n24 n24Var = this.B;
        this.o0.a(n24Var.a, this.x0, n24Var.j, rectF, this.n0, path);
        if (this.B.i != 1.0f) {
            Matrix matrix = this.d0;
            matrix.reset();
            float f = this.B.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.r0, true);
    }

    public final int c(int i) {
        float f;
        float f2;
        int i2;
        n24 n24Var = this.B;
        float f3 = n24Var.n + RecyclerView.B1 + n24Var.m;
        ps1 ps1Var = n24Var.c;
        if (ps1Var != null && ps1Var.a && tt0.d(i, 255) == ps1Var.d) {
            if (ps1Var.e > RecyclerView.B1 && f3 > RecyclerView.B1) {
                f2 = Math.min(((((float) Math.log1p(f3 / f)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f2 = 0.0f;
            }
            int alpha = Color.alpha(i);
            int Q = mp2.Q(f2, tt0.d(i, 255), ps1Var.b);
            if (f2 > RecyclerView.B1 && (i2 = ps1Var.c) != 0) {
                Q = tt0.b(tt0.d(i2, ps1.f), Q);
            }
            return tt0.d(Q, alpha);
        }
        return i;
    }

    public final void d(Canvas canvas) {
        if (this.X.cardinality() > 0) {
            Log.w("p24", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.B.p;
        Path path = this.e0;
        ie6 ie6Var = this.m0;
        if (i != 0) {
            canvas.drawPath(path, ie6Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ve6 ve6Var = this.L[i2];
            int i3 = this.B.o;
            Matrix matrix = ve6.b;
            ve6Var.a(matrix, ie6Var, i3, canvas);
            this.R[i2].a(matrix, ie6Var, this.B.o, canvas);
        }
        if (this.s0) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.B.p);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.B.p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, A0);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r19.B.a.d() != false) goto L60;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.p0;
        Paint paint2 = this.k0;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.B.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.q0;
        Paint paint3 = this.l0;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.B.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.B.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.B.q;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            paint = paint2;
        } else {
            boolean z = this.Y;
            paint = paint2;
            Path path = this.e0;
            if (z) {
                a(g(), path);
                this.Y = false;
            }
            n24 n24Var = this.B;
            n24Var.getClass();
            if (n24Var.o > 0 && !n24Var.a.e(g())) {
                float[] fArr = this.x0;
                if (fArr != null) {
                    if (fArr.length > 1) {
                        float f = fArr[0];
                        for (int i3 = 1; i3 < fArr.length; i3++) {
                            if (fArr[i3] != f) {
                                break;
                            }
                        }
                    }
                }
                if (!path.isConvex() && Build.VERSION.SDK_INT < 29) {
                    canvas.save();
                    canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * this.B.p), (int) (Math.cos(Math.toRadians(0.0d)) * this.B.p));
                    if (!this.s0) {
                        d(canvas);
                        canvas.restore();
                    } else {
                        RectF rectF = this.r0;
                        int width = (int) (rectF.width() - getBounds().width());
                        int height = (int) (rectF.height() - getBounds().height());
                        if (width >= 0 && height >= 0) {
                            Bitmap createBitmap = Bitmap.createBitmap((this.B.o * 2) + ((int) rectF.width()) + width, (this.B.o * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap);
                            float f2 = (getBounds().left - this.B.o) - width;
                            float f3 = (getBounds().top - this.B.o) - height;
                            canvas2.translate(-f2, -f3);
                            d(canvas2);
                            canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
                            createBitmap.recycle();
                            canvas.restore();
                        } else {
                            i.m("Invalid shadow bounds. Check that the treatments result in a valid path.");
                            return;
                        }
                    }
                }
            }
            e(canvas, paint, path, this.B.a, this.x0, g());
        }
        if (j()) {
            if (this.Z) {
                me6 me6Var = this.B.a;
                le6 f4 = me6Var.f();
                f61 f61Var = me6Var.e;
                m24 m24Var = this.A;
                f4.e = m24Var.a(f61Var);
                f4.f = m24Var.a(me6Var.f);
                f4.h = m24Var.a(me6Var.h);
                f4.g = m24Var.a(me6Var.g);
                this.u0 = f4.a();
                float[] fArr2 = this.x0;
                if (fArr2 == null) {
                    this.y0 = null;
                } else {
                    if (this.y0 == null) {
                        this.y0 = new float[fArr2.length];
                    }
                    float i4 = i();
                    int i5 = 0;
                    while (true) {
                        float[] fArr3 = this.x0;
                        if (i5 >= fArr3.length) {
                            break;
                        }
                        this.y0[i5] = Math.max((float) RecyclerView.B1, fArr3[i5] - i4);
                        i5++;
                    }
                }
                me6 me6Var2 = this.u0;
                float[] fArr4 = this.y0;
                float f5 = this.B.j;
                RectF g = g();
                RectF rectF2 = this.h0;
                rectF2.set(g);
                float i6 = i();
                rectF2.inset(i6, i6);
                this.o0.a(me6Var2, fArr4, f5, rectF2, null, this.f0);
                this.Z = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, me6 me6Var, float[] fArr, RectF rectF) {
        float b = b(rectF, me6Var, fArr);
        if (b >= RecyclerView.B1) {
            float f = b * this.B.j;
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void f(Canvas canvas) {
        me6 me6Var = this.u0;
        float[] fArr = this.y0;
        RectF g = g();
        RectF rectF = this.h0;
        rectF.set(g);
        float i = i();
        rectF.inset(i, i);
        e(canvas, this.l0, this.f0, me6Var, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.g0;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.B.l;
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
        RectF g = g();
        if (!g.isEmpty()) {
            float b = b(g, this.B.a, this.x0);
            if (b >= RecyclerView.B1) {
                outline.setRoundRect(getBounds(), b * this.B.j);
                return;
            }
            boolean z = this.Y;
            Path path = this.e0;
            if (z) {
                a(g, path);
                this.Y = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                ap1.a(outline, path);
            } else if (i >= 29) {
                try {
                    zo1.a(outline, path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                zo1.a(outline, path);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.B.h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.i0;
        region.set(bounds);
        RectF g = g();
        Path path = this.e0;
        a(g, path);
        Region region2 = this.j0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.x0;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g = g();
        me6 me6Var = this.B.a;
        oe6 oe6Var = this.o0;
        oe6Var.getClass();
        float a = me6Var.e.a(g);
        me6 me6Var2 = this.B.a;
        oe6Var.getClass();
        float a2 = me6Var2.h.a(g) + a;
        me6 me6Var3 = this.B.a;
        oe6Var.getClass();
        me6 me6Var4 = this.B.a;
        oe6Var.getClass();
        return ((a2 - me6Var3.g.a(g)) - me6Var4.f.a(g)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.l0.getStrokeWidth() / 2.0f;
        }
        return RecyclerView.B1;
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
            ColorStateList colorStateList = this.B.f;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.B.getClass();
                ColorStateList colorStateList2 = this.B.e;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.B.d;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        xp6 xp6Var = this.B.b;
                        if (xp6Var == null || !xp6Var.d()) {
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
        Paint.Style style = this.B.q;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.l0.getStrokeWidth() > RecyclerView.B1) {
            return true;
        }
        return false;
    }

    public final void k(Context context) {
        this.B.c = new ps1(context);
        s();
    }

    public final void l(go6 go6Var) {
        if (this.v0 != go6Var) {
            this.v0 = go6Var;
            int i = 0;
            while (true) {
                fo6[] fo6VarArr = this.w0;
                if (i < fo6VarArr.length) {
                    if (fo6VarArr[i] == null) {
                        fo6VarArr[i] = new fo6(this, B0[i]);
                    }
                    fo6 fo6Var = fo6VarArr[i];
                    go6 go6Var2 = new go6();
                    go6Var2.a((float) go6Var.b);
                    double d = go6Var.a;
                    go6Var2.b((float) (d * d));
                    fo6Var.m = go6Var2;
                    i++;
                } else {
                    q(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    public final void m(float f) {
        n24 n24Var = this.B;
        if (n24Var.n != f) {
            n24Var.n = f;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.B = new n24(this.B);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        n24 n24Var = this.B;
        if (n24Var.d != colorStateList) {
            n24Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(xp6 xp6Var) {
        n24 n24Var = this.B;
        if (n24Var.b != xp6Var) {
            n24Var.b = xp6Var;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.Y = true;
        this.Z = true;
        super.onBoundsChange(rect);
        if (this.B.b != null && !rect.isEmpty()) {
            q(getState(), this.t0);
        }
        this.t0 = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        if (this.B.b != null) {
            q(iArr, false);
        }
        z = (p(iArr) || r()) ? true : true;
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.B.d != null && color2 != (colorForState2 = this.B.d.getColorForState(iArr, (color2 = (paint2 = this.k0).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.B.e != null && color != (colorForState = this.B.e.getColorForState(iArr, (color = (paint = this.l0).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z;
    }

    public final void q(int[] iArr, boolean z) {
        boolean z2;
        me6 a;
        f61 f61Var;
        int i;
        RectF g = g();
        if (this.B.b != null && !g.isEmpty()) {
            if (this.v0 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z | z2;
            if (this.x0 == null) {
                this.x0 = new float[4];
            }
            xp6 xp6Var = this.B.b;
            me6[] me6VarArr = xp6Var.d;
            int i2 = xp6Var.a;
            int[][] iArr2 = xp6Var.c;
            wp6 wp6Var = xp6Var.h;
            wp6 wp6Var2 = xp6Var.g;
            wp6 wp6Var3 = xp6Var.f;
            wp6 wp6Var4 = xp6Var.e;
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 < 0) {
                int[] iArr3 = StateSet.WILD_CARD;
                int i4 = 0;
                while (true) {
                    if (i4 < i2) {
                        if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                            i = i4;
                            break;
                        }
                        i4++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                i3 = i;
            }
            if (wp6Var4 == null && wp6Var3 == null && wp6Var2 == null && wp6Var == null) {
                a = me6VarArr[i3];
            } else {
                le6 f = me6VarArr[i3].f();
                if (wp6Var4 != null) {
                    f.e = wp6Var4.c(iArr);
                }
                if (wp6Var3 != null) {
                    f.f = wp6Var3.c(iArr);
                }
                if (wp6Var2 != null) {
                    f.h = wp6Var2.c(iArr);
                }
                if (wp6Var != null) {
                    f.g = wp6Var.c(iArr);
                }
                a = f.a();
            }
            for (int i5 = 0; i5 < 4; i5++) {
                this.o0.getClass();
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            f61Var = a.f;
                        } else {
                            f61Var = a.e;
                        }
                    } else {
                        f61Var = a.h;
                    }
                } else {
                    f61Var = a.g;
                }
                float a2 = f61Var.a(g);
                if (z3) {
                    this.x0[i5] = a2;
                }
                fo6[] fo6VarArr = this.w0;
                fo6 fo6Var = fo6VarArr[i5];
                if (fo6Var != null) {
                    fo6Var.a(a2);
                    if (z3) {
                        fo6VarArr[i5].d();
                    }
                }
            }
            if (z3) {
                invalidateSelf();
            }
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.p0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.q0;
        n24 n24Var = this.B;
        ColorStateList colorStateList = n24Var.f;
        PorterDuff.Mode mode = n24Var.g;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = this.k0.getColor();
            int c = c(color);
            if (c != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.p0 = porterDuffColorFilter;
        this.B.getClass();
        this.q0 = null;
        this.B.getClass();
        if (Objects.equals(porterDuffColorFilter2, this.p0) && Objects.equals(porterDuffColorFilter3, this.q0)) {
            return false;
        }
        return true;
    }

    public final void s() {
        n24 n24Var = this.B;
        float f = n24Var.n + RecyclerView.B1;
        n24Var.o = (int) Math.ceil(0.75f * f);
        this.B.p = (int) Math.ceil(f * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        n24 n24Var = this.B;
        if (n24Var.l != i) {
            n24Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.xe6
    public final void setShapeAppearanceModel(me6 me6Var) {
        n24 n24Var = this.B;
        n24Var.a = me6Var;
        n24Var.b = null;
        this.x0 = null;
        this.y0 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.B.f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        n24 n24Var = this.B;
        if (n24Var.g != mode) {
            n24Var.g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public p24(Context context, AttributeSet attributeSet, int i, int i2) {
        this(me6.b(context, attributeSet, i, i2).a());
    }

    public p24(me6 me6Var) {
        this(new n24(me6Var));
    }

    public p24() {
        this(new me6());
    }
}
