package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: id  reason: default package */
/* loaded from: classes.dex */
public final class id implements oh0 {
    public Canvas a = jd.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.oh0
    public final void a(nh nhVar, oi oiVar) {
        this.a.drawBitmap(f34.s(nhVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) oiVar.L);
    }

    @Override // defpackage.oh0
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.oh0
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.oh0
    public final void d(float f, long j, oi oiVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) oiVar.L);
    }

    @Override // defpackage.oh0
    public final void e(nh nhVar, long j, long j2, long j3, oi oiVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap s = f34.s(nhVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(s, rect, rect2, (Paint) oiVar.L);
    }

    @Override // defpackage.oh0
    public final void f(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.a;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // defpackage.oh0
    public final void g(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.oh0
    public final void h(vi viVar, oi oiVar) {
        Canvas canvas = this.a;
        if (viVar instanceof vi) {
            canvas.drawPath(viVar.a, dk7.z(oiVar));
        } else {
            vd6.i("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.oh0
    public final void i(float f, float f2, float f3, float f4, oi oiVar) {
        this.a.drawOval(f, f2, f3, f4, (Paint) oiVar.L);
    }

    @Override // defpackage.oh0
    public final void j() {
        this.a.restore();
    }

    @Override // defpackage.oh0
    public final void k(float f, float f2, float f3, float f4, float f5, float f6, oi oiVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) oiVar.L);
    }

    @Override // defpackage.oh0
    public final void m() {
        this.a.save();
    }

    @Override // defpackage.oh0
    public final void n(long j, long j2, oi oiVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) oiVar.L);
    }

    @Override // defpackage.oh0
    public final void o(ArrayList arrayList, oi oiVar) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((mb4) arrayList.get(i)).a;
            this.a.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), (Paint) oiVar.L);
        }
    }

    @Override // defpackage.oh0
    public final void p() {
        jv3.t(this.a, false);
    }

    @Override // defpackage.oh0
    public final void q(y55 y55Var, oi oiVar) {
        this.a.saveLayer(y55Var.a, y55Var.b, y55Var.c, y55Var.d, (Paint) oiVar.L, 31);
    }

    @Override // defpackage.oh0
    public final void r(float f, float f2, float f3, float f4, oi oiVar) {
        this.a.drawRect(f, f2, f3, f4, dk7.z(oiVar));
    }

    @Override // defpackage.oh0
    public final void s(float[] fArr) {
        if (!yf2.B(fArr)) {
            Matrix matrix = new Matrix();
            l07.p0(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    @Override // defpackage.oh0
    public final void t() {
        jv3.t(this.a, true);
    }

    @Override // defpackage.oh0
    public final void u(vi viVar) {
        Canvas canvas = this.a;
        if (viVar instanceof vi) {
            canvas.clipPath(viVar.a, Region.Op.INTERSECT);
        } else {
            vd6.i("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.oh0
    public final void v(float f, float f2, float f3, float f4, float f5, float f6, oi oiVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) oiVar.L);
    }
}
