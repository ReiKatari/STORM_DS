package i3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Path f6635a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f6636b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f6637c;

    /* renamed from: d  reason: collision with root package name */
    public Matrix f6638d;

    public h(Path path) {
        this.f6635a = path;
    }

    public static void a(h hVar, h hVar2) {
        hVar.f6635a.addPath(hVar2.f6635a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void b(h hVar, h3.c cVar) {
        Path.Direction direction;
        i0 i0Var = i0.CounterClockwise;
        float f8 = cVar.f6052a;
        float f10 = cVar.f6055d;
        float f11 = cVar.f6054c;
        float f12 = cVar.f6053b;
        if (Float.isNaN(f8) || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
            k.b("Invalid rectangle, make sure no value is NaN");
        }
        if (hVar.f6636b == null) {
            hVar.f6636b = new RectF();
        }
        RectF rectF = hVar.f6636b;
        rectF.getClass();
        rectF.set(f8, f12, f11, f10);
        Path path = hVar.f6635a;
        RectF rectF2 = hVar.f6636b;
        rectF2.getClass();
        int i2 = j.f6642a[i0Var.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                direction = Path.Direction.CW;
            } else {
                m9.o.o();
                return;
            }
        } else {
            direction = Path.Direction.CCW;
        }
        path.addRect(rectF2, direction);
    }

    public static void c(h hVar, h3.d dVar) {
        Path.Direction direction;
        i0 i0Var = i0.CounterClockwise;
        if (hVar.f6636b == null) {
            hVar.f6636b = new RectF();
        }
        RectF rectF = hVar.f6636b;
        rectF.getClass();
        float f8 = dVar.f6056a;
        long j2 = dVar.f6063h;
        long j10 = dVar.f6062g;
        long j11 = dVar.f6061f;
        long j12 = dVar.f6060e;
        rectF.set(f8, dVar.f6057b, dVar.f6058c, dVar.f6059d);
        if (hVar.f6637c == null) {
            hVar.f6637c = new float[8];
        }
        float[] fArr = hVar.f6637c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        Path path = hVar.f6635a;
        RectF rectF2 = hVar.f6636b;
        rectF2.getClass();
        float[] fArr2 = hVar.f6637c;
        fArr2.getClass();
        int i2 = j.f6642a[i0Var.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                direction = Path.Direction.CW;
            } else {
                m9.o.o();
                return;
            }
        } else {
            direction = Path.Direction.CCW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    public final h3.c d() {
        if (this.f6636b == null) {
            this.f6636b = new RectF();
        }
        RectF rectF = this.f6636b;
        rectF.getClass();
        this.f6635a.computeBounds(rectF, true);
        return new h3.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean e(h hVar, h hVar2, int i2) {
        Path.Op op;
        if (i2 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i2 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i2 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i2 == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (hVar instanceof h) {
            Path path = hVar.f6635a;
            if (hVar2 instanceof h) {
                return this.f6635a.op(path, hVar2.f6635a, op);
            }
            m9.o.v("Unable to obtain android.graphics.Path");
            return false;
        }
        m9.o.v("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void f() {
        this.f6635a.reset();
    }
}
