package i3;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class v {
    public static final ColorSpace a(j3.c cVar) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (nc.k.a(cVar, j3.d.f7353e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (nc.k.a(cVar, j3.d.f7364q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (nc.k.a(cVar, j3.d.f7365r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (nc.k.a(cVar, j3.d.f7362o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (nc.k.a(cVar, j3.d.f7358j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (nc.k.a(cVar, j3.d.f7357i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (nc.k.a(cVar, j3.d.f7367t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (nc.k.a(cVar, j3.d.f7366s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (nc.k.a(cVar, j3.d.f7359k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (nc.k.a(cVar, j3.d.f7360l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (nc.k.a(cVar, j3.d.f7355g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (nc.k.a(cVar, j3.d.f7356h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (nc.k.a(cVar, j3.d.f7354f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (nc.k.a(cVar, j3.d.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (nc.k.a(cVar, j3.d.f7363p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (nc.k.a(cVar, j3.d.f7361n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            ColorSpace.Rgb.TransferParameters transferParameters = null;
            if (Build.VERSION.SDK_INT >= 34) {
                if (nc.k.a(cVar, j3.d.f7369v)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace2 = ColorSpace.get(named2);
                } else if (nc.k.a(cVar, j3.d.f7370w)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace2 = ColorSpace.get(named);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (cVar instanceof j3.q) {
                String str = cVar.f7346a;
                j3.q qVar = (j3.q) cVar;
                float[] a10 = qVar.f7392d.a();
                j3.r rVar = qVar.f7395g;
                if (rVar != null) {
                    transferParameters = new ColorSpace.Rgb.TransferParameters(rVar.f7406b, rVar.f7407c, rVar.f7408d, rVar.f7409e, rVar.f7410f, rVar.f7411g, rVar.f7405a);
                }
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, qVar.f7396h, a10, transferParameters);
                }
                float[] fArr = qVar.f7396h;
                final j3.p pVar = qVar.f7400l;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: i3.u
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d4) {
                        switch (r2) {
                            case 0:
                                return ((Number) pVar.k(Double.valueOf(d4))).doubleValue();
                            default:
                                return ((Number) pVar.k(Double.valueOf(d4))).doubleValue();
                        }
                    }
                };
                final j3.p pVar2 = qVar.f7402o;
                return new ColorSpace.Rgb(str, fArr, a10, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: i3.u
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d4) {
                        switch (r2) {
                            case 0:
                                return ((Number) pVar2.k(Double.valueOf(d4))).doubleValue();
                            default:
                                return ((Number) pVar2.k(Double.valueOf(d4))).doubleValue();
                        }
                    }
                }, qVar.f7393e, qVar.f7394f);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }
}
