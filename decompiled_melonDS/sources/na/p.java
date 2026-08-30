package na;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final x[] f10211a = new x[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f10212b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f10213c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f10214d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f10215e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f10216f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final x f10217g = new x();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f10218h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f10219i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f10220j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f10221k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10222l = true;

    public p() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f10211a[i2] = new x();
            this.f10212b[i2] = new Matrix();
            this.f10213c[i2] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(n nVar, float[] fArr, float f8, RectF rectF, g gVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i2;
        x[] xVarArr;
        Matrix[] matrixArr2;
        ?? r16;
        float f10;
        f fVar;
        boolean z10;
        d cVar;
        k0.d dVar;
        int i10;
        path.rewind();
        Path path2 = this.f10215e;
        path2.rewind();
        Path path3 = this.f10216f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = this.f10213c;
            fArr2 = this.f10218h;
            xVarArr = this.f10211a;
            matrixArr2 = this.f10212b;
            r16 = 0;
            if (i11 >= 4) {
                break;
            }
            if (fArr == null) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            cVar = nVar.f10203f;
                        } else {
                            cVar = nVar.f10202e;
                        }
                    } else {
                        cVar = nVar.f10205h;
                    }
                } else {
                    cVar = nVar.f10204g;
                }
            } else {
                cVar = new c(fArr[i11]);
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        dVar = nVar.f10199b;
                    } else {
                        dVar = nVar.f10198a;
                    }
                } else {
                    dVar = nVar.f10201d;
                }
            } else {
                dVar = nVar.f10200c;
            }
            x xVar = xVarArr[i11];
            dVar.getClass();
            dVar.y(xVar, f8, cVar.a(rectF));
            int i12 = i11 + 1;
            float f11 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = this.f10214d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        i10 = i11;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i10 = i11;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i10 = i11;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i10 = i11;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f11);
            x xVar2 = xVarArr[i10];
            fArr2[0] = xVar2.f10242b;
            fArr2[1] = xVar2.f10243c;
            matrixArr2[i10].mapPoints(fArr2);
            matrixArr[i10].reset();
            matrixArr[i10].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i10].preRotate(f11);
            i11 = i12;
        }
        int i13 = 0;
        for (i2 = 4; i13 < i2; i2 = 4) {
            x xVar3 = xVarArr[i13];
            xVar3.getClass();
            fArr2[r16] = 0.0f;
            fArr2[1] = xVar3.f10241a;
            matrixArr2[i13].mapPoints(fArr2);
            if (i13 == 0) {
                path.moveTo(fArr2[r16], fArr2[1]);
            } else {
                path.lineTo(fArr2[r16], fArr2[1]);
            }
            xVarArr[i13].b(matrixArr2[i13], path);
            if (gVar != null) {
                x xVar4 = xVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                j jVar = gVar.f10143a;
                f10 = 0.0f;
                BitSet bitSet = jVar.X;
                xVar4.getClass();
                bitSet.set(i13, (boolean) r16);
                w[] wVarArr = jVar.L;
                xVar4.a(xVar4.f10245e);
                wVarArr[i13] = new q(new ArrayList(xVar4.f10247g), new Matrix(matrix));
            } else {
                f10 = 0.0f;
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            x xVar5 = xVarArr[i13];
            fArr2[0] = xVar5.f10242b;
            fArr2[1] = xVar5.f10243c;
            matrixArr2[i13].mapPoints(fArr2);
            x xVar6 = xVarArr[i15];
            xVar6.getClass();
            float[] fArr3 = this.f10219i;
            fArr3[0] = f10;
            fArr3[1] = xVar6.f10241a;
            matrixArr2[i15].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            x[] xVarArr2 = xVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f10);
            x xVar7 = xVarArr2[i13];
            fArr2[0] = xVar7.f10242b;
            fArr2[1] = xVar7.f10243c;
            matrixArr2[i13].mapPoints(fArr2);
            if (i13 != 1 && i13 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            x xVar8 = this.f10217g;
            xVar8.d(0.0f, 270.0f, 0.0f);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        fVar = nVar.f10207j;
                    } else {
                        fVar = nVar.f10206i;
                    }
                } else {
                    fVar = nVar.f10209l;
                }
            } else {
                fVar = nVar.f10208k;
            }
            fVar.getClass();
            xVar8.c(max, 0.0f);
            Path path4 = this.f10220j;
            path4.reset();
            xVar8.b(matrixArr3[i13], path4);
            if (this.f10222l && (b(path4, i13) || b(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = xVar8.f10241a;
                matrixArr3[i13].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                xVar8.b(matrixArr3[i13], path2);
            } else {
                xVar8.b(matrixArr3[i13], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr3[i13];
                j jVar2 = gVar.f10143a;
                z10 = false;
                jVar2.X.set(i13 + 4, false);
                w[] wVarArr2 = jVar2.R;
                xVar8.a(xVar8.f10245e);
                wVarArr2[i13] = new q(new ArrayList(xVar8.f10247g), new Matrix(matrix2));
            } else {
                z10 = false;
            }
            matrixArr = matrixArr3;
            i13 = i14;
            r16 = z10;
            xVarArr = xVarArr2;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i2) {
        Path path2 = this.f10221k;
        path2.reset();
        this.f10211a[i2].b(this.f10212b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }
}
