package i3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import cd.h1;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f6615a = c.f6619a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f6616b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f6617c;

    @Override // i3.q
    public final void a(h hVar, h1 h1Var) {
        Canvas canvas = this.f6615a;
        if (hVar instanceof h) {
            canvas.drawPath(hVar.f6635a, (Paint) h1Var.B);
        } else {
            m9.o.v("Unable to obtain android.graphics.Path");
        }
    }

    @Override // i3.q
    public final void b(long j2, long j10, h1 h1Var) {
        this.f6615a.drawLine(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), (Paint) h1Var.B);
    }

    @Override // i3.q
    public final void c(float f8, float f10, float f11, float f12, float f13, float f14, h1 h1Var) {
        this.f6615a.drawRoundRect(f8, f10, f11, f12, f13, f14, (Paint) h1Var.B);
    }

    @Override // i3.q
    public final void d(float f8, float f10) {
        this.f6615a.scale(f8, f10);
    }

    @Override // i3.q
    public final void f(float f8, float f10, float f11, float f12, h1 h1Var) {
        this.f6615a.drawRect(f8, f10, f11, f12, (Paint) h1Var.B);
    }

    @Override // i3.q
    public final void g(f fVar, h1 h1Var) {
        this.f6615a.drawBitmap(z.i(fVar), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) h1Var.B);
    }

    @Override // i3.q
    public final void h(h hVar) {
        Canvas canvas = this.f6615a;
        if (hVar instanceof h) {
            canvas.clipPath(hVar.f6635a, Region.Op.INTERSECT);
        } else {
            m9.o.v("Unable to obtain android.graphics.Path");
        }
    }

    @Override // i3.q
    public final void i(float f8, long j2, h1 h1Var) {
        this.f6615a.drawCircle(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f8, (Paint) h1Var.B);
    }

    @Override // i3.q
    public final void j(float f8, float f10, float f11, float f12, int i2) {
        Region.Op op;
        Canvas canvas = this.f6615a;
        if (i2 == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f8, f10, f11, f12, op);
    }

    @Override // i3.q
    public final void k(float f8, float f10) {
        this.f6615a.translate(f8, f10);
    }

    @Override // i3.q
    public final void l() {
        this.f6615a.rotate(45.0f);
    }

    @Override // i3.q
    public final void m() {
        this.f6615a.restore();
    }

    @Override // i3.q
    public final void n(f fVar, long j2, long j10, long j11, h1 h1Var) {
        if (this.f6616b == null) {
            this.f6616b = new Rect();
            this.f6617c = new Rect();
        }
        Canvas canvas = this.f6615a;
        Bitmap i2 = z.i(fVar);
        Rect rect = this.f6616b;
        rect.getClass();
        int i10 = (int) (j2 >> 32);
        rect.left = i10;
        int i11 = (int) (j2 & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j10 >> 32));
        rect.bottom = i11 + ((int) (j10 & 4294967295L));
        Rect rect2 = this.f6617c;
        rect2.getClass();
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j11 >> 32));
        rect2.bottom = i13 + ((int) (4294967295L & j11));
        canvas.drawBitmap(i2, rect, rect2, (Paint) h1Var.B);
    }

    @Override // i3.q
    public final void o(h3.c cVar, h1 h1Var) {
        this.f6615a.saveLayer(cVar.f6052a, cVar.f6053b, cVar.f6054c, cVar.f6055d, (Paint) h1Var.B, 31);
    }

    @Override // i3.q
    public final void p() {
        this.f6615a.save();
    }

    @Override // i3.q
    public final void q() {
        z.k(this.f6615a, false);
    }

    @Override // i3.q
    public final void r(float f8, float f10, float f11, float f12, float f13, float f14, h1 h1Var) {
        this.f6615a.drawArc(f8, f10, f11, f12, f13, f14, false, (Paint) h1Var.B);
    }

    @Override // i3.q
    public final void s(float[] fArr) {
        if (!z.p(fArr)) {
            Matrix matrix = new Matrix();
            z.s(matrix, fArr);
            this.f6615a.concat(matrix);
        }
    }

    @Override // i3.q
    public final void t() {
        z.k(this.f6615a, true);
    }

    @Override // i3.q
    public final void u(ArrayList arrayList, h1 h1Var) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            long j2 = ((h3.b) arrayList.get(i2)).f6050a;
            this.f6615a.drawPoint(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) h1Var.B);
        }
    }
}
