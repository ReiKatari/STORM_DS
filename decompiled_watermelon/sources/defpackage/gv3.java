package defpackage;

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
import androidx.recyclerview.widget.RecyclerView;
import java.util.BitSet;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gv3  reason: default package */
/* loaded from: classes.dex */
public class gv3 extends Drawable implements l36 {
    public static final fv3[] A0;
    public static final Paint z0;
    public final dv3 A;
    public ev3 B;
    public final j36[] L;
    public final j36[] R;
    public final BitSet X;
    public boolean Y;
    public boolean Z;
    public final Matrix c0;
    public final Path d0;
    public final Path e0;
    public final RectF f0;
    public final RectF g0;
    public final Region h0;
    public final Region i0;
    public final Paint j0;
    public final Paint k0;
    public final w26 l0;
    public final dv3 m0;
    public final c36 n0;
    public PorterDuffColorFilter o0;
    public PorterDuffColorFilter p0;
    public final RectF q0;
    public final boolean r0;
    public boolean s0;
    public a36 t0;
    public qc6 u0;
    public final pc6[] v0;
    public float[] w0;
    public float[] x0;
    public a31 y0;

    static {
        Paint paint = new Paint(1);
        z0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        A0 = new fv3[4];
        int i = 0;
        while (true) {
            fv3[] fv3VarArr = A0;
            if (i < fv3VarArr.length) {
                fv3VarArr[i] = new fv3(i);
                i++;
            } else {
                return;
            }
        }
    }

    public gv3(ev3 ev3Var) {
        c36 c36Var;
        this.A = new dv3(this);
        this.L = new j36[4];
        this.R = new j36[4];
        this.X = new BitSet(8);
        this.c0 = new Matrix();
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new RectF();
        this.g0 = new RectF();
        this.h0 = new Region();
        this.i0 = new Region();
        Paint paint = new Paint(1);
        this.j0 = paint;
        Paint paint2 = new Paint(1);
        this.k0 = paint2;
        this.l0 = new w26();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c36Var = b36.a;
        } else {
            c36Var = new c36();
        }
        this.n0 = c36Var;
        this.q0 = new RectF();
        this.r0 = true;
        this.s0 = true;
        this.v0 = new pc6[4];
        this.B = ev3Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.m0 = new dv3(this);
    }

    public static float b(RectF rectF, a36 a36Var, float[] fArr) {
        if (fArr == null) {
            if (a36Var.e(rectF)) {
                return a36Var.e.a(rectF);
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
        if (a36Var.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        ev3 ev3Var = this.B;
        this.n0.a(ev3Var.a, this.w0, ev3Var.j, rectF, this.m0, path);
        if (this.B.i != 1.0f) {
            Matrix matrix = this.c0;
            matrix.reset();
            float f = this.B.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.q0, true);
    }

    public final int c(int i) {
        float f;
        float f2;
        int i2;
        ev3 ev3Var = this.B;
        float f3 = ev3Var.n + RecyclerView.A1 + ev3Var.m;
        fo1 fo1Var = ev3Var.c;
        if (fo1Var != null && fo1Var.a && gr0.d(i, 255) == fo1Var.d) {
            if (fo1Var.e > RecyclerView.A1 && f3 > RecyclerView.A1) {
                f2 = Math.min(((((float) Math.log1p(f3 / f)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f2 = 0.0f;
            }
            int alpha = Color.alpha(i);
            int I = jk2.I(f2, gr0.d(i, 255), fo1Var.b);
            if (f2 > RecyclerView.A1 && (i2 = fo1Var.c) != 0) {
                I = gr0.b(gr0.d(i2, fo1.f), I);
            }
            return gr0.d(I, alpha);
        }
        return i;
    }

    public final void d(Canvas canvas) {
        if (this.X.cardinality() > 0) {
            Log.w("gv3", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.B.p;
        Path path = this.d0;
        w26 w26Var = this.l0;
        if (i != 0) {
            canvas.drawPath(path, w26Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            j36 j36Var = this.L[i2];
            int i3 = this.B.o;
            Matrix matrix = j36.b;
            j36Var.a(matrix, w26Var, i3, canvas);
            this.R[i2].a(matrix, w26Var, this.B.o, canvas);
        }
        if (this.r0) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.B.p);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.B.p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, z0);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r19.B.a.d() != false) goto L60;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv3.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, a36 a36Var, float[] fArr, RectF rectF) {
        float b = b(rectF, a36Var, fArr);
        if (b >= RecyclerView.A1) {
            float f = b * this.B.j;
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void f(Canvas canvas) {
        a36 a36Var = this.t0;
        float[] fArr = this.x0;
        RectF g = g();
        RectF rectF = this.g0;
        rectF.set(g);
        float i = i();
        rectF.inset(i, i);
        e(canvas, this.k0, this.e0, a36Var, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f0;
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
            float b = b(g, this.B.a, this.w0);
            if (b >= RecyclerView.A1) {
                outline.setRoundRect(getBounds(), b * this.B.j);
                return;
            }
            boolean z = this.Y;
            Path path = this.d0;
            if (z) {
                a(g, path);
                this.Y = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                uk1.a(outline, path);
            } else if (i >= 29) {
                try {
                    tk1.a(outline, path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                tk1.a(outline, path);
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
        Region region = this.h0;
        region.set(bounds);
        RectF g = g();
        Path path = this.d0;
        a(g, path);
        Region region2 = this.i0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.w0;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g = g();
        a36 a36Var = this.B.a;
        c36 c36Var = this.n0;
        c36Var.getClass();
        float a = a36Var.e.a(g);
        a36 a36Var2 = this.B.a;
        c36Var.getClass();
        float a2 = a36Var2.h.a(g) + a;
        a36 a36Var3 = this.B.a;
        c36Var.getClass();
        a36 a36Var4 = this.B.a;
        c36Var.getClass();
        return ((a2 - a36Var3.g.a(g)) - a36Var4.f.a(g)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.k0.getStrokeWidth() / 2.0f;
        }
        return RecyclerView.A1;
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
                        ie6 ie6Var = this.B.b;
                        if (ie6Var == null || !ie6Var.d()) {
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
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.k0.getStrokeWidth() > RecyclerView.A1) {
            return true;
        }
        return false;
    }

    public final void k(Context context) {
        this.B.c = new fo1(context);
        s();
    }

    public final void l(qc6 qc6Var) {
        if (this.u0 != qc6Var) {
            this.u0 = qc6Var;
            int i = 0;
            while (true) {
                pc6[] pc6VarArr = this.v0;
                if (i < pc6VarArr.length) {
                    if (pc6VarArr[i] == null) {
                        pc6VarArr[i] = new pc6(this, A0[i]);
                    }
                    pc6 pc6Var = pc6VarArr[i];
                    qc6 qc6Var2 = new qc6();
                    qc6Var2.a((float) qc6Var.b);
                    double d = qc6Var.a;
                    qc6Var2.b((float) (d * d));
                    pc6Var.m = qc6Var2;
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
        ev3 ev3Var = this.B;
        if (ev3Var.n != f) {
            ev3Var.n = f;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.B = new ev3(this.B);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        ev3 ev3Var = this.B;
        if (ev3Var.d != colorStateList) {
            ev3Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(ie6 ie6Var) {
        ev3 ev3Var = this.B;
        if (ev3Var.b != ie6Var) {
            ev3Var.b = ie6Var;
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
            q(getState(), this.s0);
        }
        this.s0 = rect.isEmpty();
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
        if (this.B.d != null && color2 != (colorForState2 = this.B.d.getColorForState(iArr, (color2 = (paint2 = this.j0).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.B.e != null && color != (colorForState = this.B.e.getColorForState(iArr, (color = (paint = this.k0).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z;
    }

    public final void q(int[] iArr, boolean z) {
        boolean z2;
        a36 a;
        y21 y21Var;
        int i;
        RectF g = g();
        if (this.B.b != null && !g.isEmpty()) {
            if (this.u0 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z | z2;
            if (this.w0 == null) {
                this.w0 = new float[4];
            }
            ie6 ie6Var = this.B.b;
            a36[] a36VarArr = ie6Var.d;
            int i2 = ie6Var.a;
            int[][] iArr2 = ie6Var.c;
            he6 he6Var = ie6Var.h;
            he6 he6Var2 = ie6Var.g;
            he6 he6Var3 = ie6Var.f;
            he6 he6Var4 = ie6Var.e;
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
            if (he6Var4 == null && he6Var3 == null && he6Var2 == null && he6Var == null) {
                a = a36VarArr[i3];
            } else {
                z26 f = a36VarArr[i3].f();
                if (he6Var4 != null) {
                    f.e = he6Var4.c(iArr);
                }
                if (he6Var3 != null) {
                    f.f = he6Var3.c(iArr);
                }
                if (he6Var2 != null) {
                    f.h = he6Var2.c(iArr);
                }
                if (he6Var != null) {
                    f.g = he6Var.c(iArr);
                }
                a = f.a();
            }
            for (int i5 = 0; i5 < 4; i5++) {
                this.n0.getClass();
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            y21Var = a.f;
                        } else {
                            y21Var = a.e;
                        }
                    } else {
                        y21Var = a.h;
                    }
                } else {
                    y21Var = a.g;
                }
                float a2 = y21Var.a(g);
                if (z3) {
                    this.w0[i5] = a2;
                }
                pc6[] pc6VarArr = this.v0;
                pc6 pc6Var = pc6VarArr[i5];
                if (pc6Var != null) {
                    pc6Var.a(a2);
                    if (z3) {
                        pc6VarArr[i5].d();
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
        PorterDuffColorFilter porterDuffColorFilter2 = this.o0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.p0;
        ev3 ev3Var = this.B;
        ColorStateList colorStateList = ev3Var.f;
        PorterDuff.Mode mode = ev3Var.g;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = this.j0.getColor();
            int c = c(color);
            if (c != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.o0 = porterDuffColorFilter;
        this.B.getClass();
        this.p0 = null;
        this.B.getClass();
        if (Objects.equals(porterDuffColorFilter2, this.o0) && Objects.equals(porterDuffColorFilter3, this.p0)) {
            return false;
        }
        return true;
    }

    public final void s() {
        ev3 ev3Var = this.B;
        float f = ev3Var.n + RecyclerView.A1;
        ev3Var.o = (int) Math.ceil(0.75f * f);
        this.B.p = (int) Math.ceil(f * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ev3 ev3Var = this.B;
        if (ev3Var.l != i) {
            ev3Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.l36
    public final void setShapeAppearanceModel(a36 a36Var) {
        ev3 ev3Var = this.B;
        ev3Var.a = a36Var;
        ev3Var.b = null;
        this.w0 = null;
        this.x0 = null;
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
        ev3 ev3Var = this.B;
        if (ev3Var.g != mode) {
            ev3Var.g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public gv3(Context context, AttributeSet attributeSet, int i, int i2) {
        this(a36.b(context, attributeSet, i, i2).a());
    }

    public gv3(a36 a36Var) {
        this(new ev3(a36Var));
    }

    public gv3() {
        this(new a36());
    }
}
