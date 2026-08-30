package h5;

import android.graphics.Rect;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements Comparable {
    public int L;
    public float A = 0.0f;
    public int B = 0;
    public final LinkedHashMap R = new LinkedHashMap();
    public float X = 1.0f;
    public float Y = 0.0f;
    public float Z = 0.0f;

    /* renamed from: b0  reason: collision with root package name */
    public float f6198b0 = 0.0f;

    /* renamed from: c0  reason: collision with root package name */
    public float f6199c0 = 1.0f;

    /* renamed from: d0  reason: collision with root package name */
    public float f6200d0 = 1.0f;

    /* renamed from: e0  reason: collision with root package name */
    public float f6201e0 = Float.NaN;

    /* renamed from: f0  reason: collision with root package name */
    public float f6202f0 = Float.NaN;

    /* renamed from: g0  reason: collision with root package name */
    public float f6203g0 = 0.0f;

    /* renamed from: h0  reason: collision with root package name */
    public float f6204h0 = 0.0f;

    /* renamed from: i0  reason: collision with root package name */
    public float f6205i0 = 0.0f;

    /* renamed from: j0  reason: collision with root package name */
    public float f6206j0 = Float.NaN;

    /* renamed from: k0  reason: collision with root package name */
    public float f6207k0 = Float.NaN;

    public static boolean b(float f8, float f10) {
        if (!Float.isNaN(f8) && !Float.isNaN(f10)) {
            if (Math.abs(f8 - f10) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f8) != Float.isNaN(f10)) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(HashMap hashMap, int i2) {
        for (String str : hashMap.keySet()) {
            g5.l lVar = (g5.l) hashMap.get(str);
            if (lVar != null) {
                str.getClass();
                char c4 = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c4 = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c4 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c4 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c4 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c4 = 7;
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            c4 = '\b';
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            c4 = '\t';
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c4 = '\n';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c4 = 11;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c4 = '\f';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c4 = '\r';
                            break;
                        }
                        break;
                }
                float f8 = 1.0f;
                float f10 = 0.0f;
                switch (c4) {
                    case 0:
                        if (!Float.isNaN(this.f6198b0)) {
                            f10 = this.f6198b0;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        if (!Float.isNaN(this.A)) {
                            f10 = this.A;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case 2:
                        if (!Float.isNaN(this.f6203g0)) {
                            f10 = this.f6203g0;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case 3:
                        if (!Float.isNaN(this.f6204h0)) {
                            f10 = this.f6204h0;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case 4:
                        if (!Float.isNaN(this.f6205i0)) {
                            f10 = this.f6205i0;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case l1.c.f8511g /* 5 */:
                        if (!Float.isNaN(this.f6207k0)) {
                            f10 = this.f6207k0;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case l1.c.f8509e /* 6 */:
                        if (!Float.isNaN(this.f6199c0)) {
                            f8 = this.f6199c0;
                        }
                        lVar.b(i2, f8);
                        continue;
                    case 7:
                        if (!Float.isNaN(this.f6200d0)) {
                            f8 = this.f6200d0;
                        }
                        lVar.b(i2, f8);
                        continue;
                    case '\b':
                        if (!Float.isNaN(this.f6201e0)) {
                            f10 = this.f6201e0;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case l1.c.f8508d /* 9 */:
                        if (!Float.isNaN(this.f6202f0)) {
                            f10 = this.f6202f0;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case l1.c.f8510f /* 10 */:
                        if (!Float.isNaN(this.Z)) {
                            f10 = this.Z;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case 11:
                        if (!Float.isNaN(this.Y)) {
                            f10 = this.Y;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case '\f':
                        if (!Float.isNaN(this.f6206j0)) {
                            f10 = this.f6206j0;
                        }
                        lVar.b(i2, f10);
                        continue;
                    case '\r':
                        if (!Float.isNaN(this.X)) {
                            f8 = this.X;
                        }
                        lVar.b(i2, f8);
                        continue;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.R;
                            if (linkedHashMap.containsKey(str2)) {
                                i5.b bVar = (i5.b) linkedHashMap.get(str2);
                                if (lVar instanceof g5.i) {
                                    ((g5.i) lVar).f5576f.append(i2, bVar);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i2 + ", value" + bVar.a() + lVar);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                            continue;
                        }
                }
            }
        }
    }

    public final void c(Rect rect, i5.q qVar, int i2, int i10) {
        float f8;
        rect.width();
        rect.height();
        i5.l h2 = qVar.h(i10);
        i5.o oVar = h2.f6904c;
        i5.n nVar = h2.f6905d;
        int i11 = oVar.f6966c;
        this.B = i11;
        int i12 = oVar.f6965b;
        this.L = i12;
        if (i12 != 0 && i11 == 0) {
            f8 = 0.0f;
        } else {
            f8 = oVar.f6967d;
        }
        this.X = f8;
        i5.p pVar = h2.f6907f;
        boolean z10 = pVar.m;
        this.Y = pVar.f6982n;
        this.Z = pVar.f6971b;
        this.f6198b0 = pVar.f6972c;
        this.A = pVar.f6973d;
        this.f6199c0 = pVar.f6974e;
        this.f6200d0 = pVar.f6975f;
        this.f6201e0 = pVar.f6976g;
        this.f6202f0 = pVar.f6977h;
        this.f6203g0 = pVar.f6979j;
        this.f6204h0 = pVar.f6980k;
        this.f6205i0 = pVar.f6981l;
        d5.e.d(nVar.f6955d);
        this.f6206j0 = nVar.f6959h;
        this.f6207k0 = h2.f6904c.f6968e;
        for (String str : h2.f6908g.keySet()) {
            i5.b bVar = (i5.b) h2.f6908g.get(str);
            int ordinal = bVar.f6816c.ordinal();
            if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
                this.R.put(str, bVar);
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.Z + 90.0f;
            this.Z = f10;
            if (f10 > 180.0f) {
                this.Z = f10 - 360.0f;
                return;
            }
            return;
        }
        this.Z -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((n) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
