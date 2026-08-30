package g2;

import android.graphics.Matrix;
import android.graphics.Path;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;

    public /* synthetic */ k2(int i2, y3.i1 i1Var, int i10) {
        this.A = 0;
        this.L = i2;
        this.B = i1Var;
        this.R = i10;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                y3.i1 i1Var = (y3.i1) this.B;
                y3.h1.k((y3.h1) obj, i1Var, pc.a.M((this.L - i1Var.A) / 2.0f), pc.a.M((this.R - i1Var.B) / 2.0f));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                y3.h1 h1Var = (y3.h1) obj;
                y3.h1.k(h1Var, (y3.i1) this.B, this.L, this.R);
                break;
            case 2:
                y3.h1 h1Var2 = (y3.h1) obj;
                y3.h1.k(h1Var2, (y3.i1) this.B, this.L, this.R);
                break;
            default:
                i3.h hVar = (i3.h) this.B;
                l4.s sVar = (l4.s) obj;
                l4.b bVar = sVar.f8890a;
                int d4 = sVar.d(this.L);
                int d10 = sVar.d(this.R);
                CharSequence charSequence = bVar.f8784e;
                if (d4 < 0 || d4 > d10 || d10 > charSequence.length()) {
                    StringBuilder j2 = kc.a.j("start(", d4, ") or end(", d10, ") is out of range [0..");
                    j2.append(charSequence.length());
                    j2.append("], or start > end!");
                    r4.a.a(j2.toString());
                }
                Path path = new Path();
                m4.k kVar = bVar.f8783d;
                kVar.f9221f.getSelectionPath(d4, d10, path);
                int i2 = kVar.f9223h;
                if (i2 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i2);
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(sVar.f8895f) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                hVar.f6635a.addPath(path, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ k2(Object obj, int i2, int i10, int i11) {
        this.A = i11;
        this.B = obj;
        this.L = i2;
        this.R = i10;
    }
}
