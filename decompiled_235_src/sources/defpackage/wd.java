package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wd  reason: default package */
/* loaded from: classes.dex */
public final class wd implements xj0 {
    public Canvas a = xd.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.xj0
    public final void a(zh zhVar, aj ajVar) {
        this.a.drawBitmap(l.h(zhVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) ajVar.L);
    }

    @Override // defpackage.xj0
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.xj0
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.xj0
    public final void d(float f, long j, aj ajVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) ajVar.L);
    }

    @Override // defpackage.xj0
    public final void e(zh zhVar, long j, long j2, long j3, aj ajVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap h = l.h(zhVar);
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
        canvas.drawBitmap(h, rect, rect2, (Paint) ajVar.L);
    }

    @Override // defpackage.xj0
    public final void f(hj hjVar, aj ajVar) {
        Canvas canvas = this.a;
        if (hjVar instanceof hj) {
            canvas.drawPath(hjVar.a, nc1.Q(ajVar));
        } else {
            fa6.h("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.xj0
    public final void g(float f, float f2, float f3, float f4, float f5, float f6, aj ajVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) ajVar.L);
    }

    @Override // defpackage.xj0
    public final void h() {
        this.a.save();
    }

    @Override // defpackage.xj0
    public final void i(long j, long j2, aj ajVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) ajVar.L);
    }

    @Override // defpackage.xj0
    public final void j() {
        nw7.X(this.a, false);
    }

    @Override // defpackage.xj0
    public final void k(float f, float f2, float f3, float f4, aj ajVar) {
        this.a.drawRect(f, f2, f3, f4, nc1.Q(ajVar));
    }

    @Override // defpackage.xj0
    public final void l(float[] fArr) {
        if (!nj2.w(fArr)) {
            Matrix matrix = new Matrix();
            hv.X(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    @Override // defpackage.xj0
    public final void m(hj hjVar) {
        Canvas canvas = this.a;
        if (hjVar instanceof hj) {
            canvas.clipPath(hjVar.a, Region.Op.INTERSECT);
        } else {
            fa6.h("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.xj0
    public final void n(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.a;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // defpackage.xj0
    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.xj0
    public final void p() {
        this.a.restore();
    }

    @Override // defpackage.xj0
    public final void r(ArrayList arrayList, aj ajVar) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((jk4) arrayList.get(i)).a;
            this.a.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), (Paint) ajVar.L);
        }
    }

    @Override // defpackage.xj0
    public final void s(of5 of5Var, aj ajVar) {
        this.a.saveLayer(of5Var.a, of5Var.b, of5Var.c, of5Var.d, (Paint) ajVar.L, 31);
    }

    @Override // defpackage.xj0
    public final void t() {
        nw7.X(this.a, true);
    }

    @Override // defpackage.xj0
    public final void u(float f, float f2, float f3, float f4, float f5, float f6, aj ajVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) ajVar.L);
    }
}
