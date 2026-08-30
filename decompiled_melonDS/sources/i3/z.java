package i3;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import cd.h1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static k0 f6702a;

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f6703b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static Method f6704c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f6705d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f6706e;

    public static final h3.c A(Rect rect) {
        return new h3.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final h3.c B(RectF rectF) {
        return new h3.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode C(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (i2 == 13) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static String D(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        if (i2 == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public static final int E(float f8, float[] fArr, int i2) {
        float f10 = 0.0f;
        if (f8 >= 0.0f) {
            f10 = f8;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f8) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        fArr[i2] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    public static final b a(f fVar) {
        Canvas canvas = c.f6619a;
        b bVar = new b();
        bVar.f6615a = new Canvas(i(fVar));
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, j3.c r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.z.b(float, float, float, float, j3.c):long");
    }

    public static final long c(int i2) {
        long j2 = i2 << 32;
        int i10 = s.f6688i;
        return j2;
    }

    public static final long d(long j2) {
        long j10 = j2 << 32;
        int i2 = s.f6688i;
        return j10;
    }

    public static f e(int i2, int i10, int i11, int i12) {
        Bitmap createBitmap;
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        j3.q qVar = j3.d.f7353e;
        Bitmap.Config z10 = z(i11);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = gk.q.d(i2, i10, z(i11), v.a(qVar));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i10, z10);
            createBitmap.setHasAlpha(true);
        }
        return new f(createBitmap);
    }

    public static final h1 f() {
        return new h1(new Paint(7));
    }

    public static final long g(float f8, float f10) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
        int i2 = q0.f6678c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long h(float r17, float r18, float r19, float r20, j3.c r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.z.h(float, float, float, float, j3.c):long");
    }

    public static final Bitmap i(f fVar) {
        if (fVar instanceof f) {
            return fVar.f6630a;
        }
        m9.o.v("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final long j(long j2, long j10) {
        float f8;
        float f10;
        long a10 = s.a(j2, s.f(j10));
        float d4 = s.d(j10);
        float d10 = s.d(a10);
        float f11 = 1.0f - d10;
        float f12 = (d4 * f11) + d10;
        float h2 = s.h(a10);
        float h10 = s.h(j10);
        float f13 = 0.0f;
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            f8 = 0.0f;
        } else {
            f8 = (((h10 * d4) * f11) + (h2 * d10)) / f12;
        }
        float g10 = s.g(a10);
        float g11 = s.g(j10);
        if (i2 == 0) {
            f10 = 0.0f;
        } else {
            f10 = (((g11 * d4) * f11) + (g10 * d10)) / f12;
        }
        float e6 = s.e(a10);
        float e10 = s.e(j10);
        if (i2 != 0) {
            f13 = (((e10 * d4) * f11) + (e6 * d10)) / f12;
        }
        return h(f8, f10, f13, f12, s.f(j10));
    }

    public static void k(Canvas canvas, boolean z10) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z10) {
                a.e(canvas);
                return;
            } else {
                a.p(canvas);
                return;
            }
        }
        if (!f6706e) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f6704c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f6705d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f6704c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f6705d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f6704c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f6705d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f6706e = true;
        }
        if (z10) {
            try {
                Method method4 = f6704c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z10 && (method = f6705d) != null) {
            method.invoke(canvas, null);
        }
    }

    public static final b3.p m(b3.p pVar, mc.l lVar) {
        return pVar.f(new m(lVar));
    }

    public static final b3.p n(b3.p pVar, float f8, float f10, float f11, float f12, long j2, n0 n0Var, boolean z10, long j10, long j11) {
        return pVar.f(new y(f8, f10, f11, f12, j2, n0Var, z10, j10, j11));
    }

    public static b3.p o(b3.p pVar, float f8, float f10, n0 n0Var, int i2) {
        float f11;
        float f12;
        j0 j0Var;
        boolean z10;
        if ((i2 & 4) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f8;
        }
        if ((i2 & 256) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f10;
        }
        long j2 = q0.f6677b;
        if ((i2 & 2048) != 0) {
            j0Var = f6703b;
        } else {
            j0Var = n0Var;
        }
        if ((i2 & 4096) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        long j10 = a0.f6614a;
        return n(pVar, 1.0f, 1.0f, f11, f12, j2, j0Var, z11, j10, j10);
    }

    public static final boolean p(float[] fArr) {
        if (fArr.length < 16 || fArr[0] != 1.0f || fArr[1] != 0.0f || fArr[2] != 0.0f || fArr[3] != 0.0f || fArr[4] != 0.0f || fArr[5] != 1.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 0.0f || fArr[9] != 0.0f || fArr[10] != 1.0f || fArr[11] != 0.0f || fArr[12] != 0.0f || fArr[13] != 0.0f || fArr[14] != 0.0f || fArr[15] != 1.0f) {
            return false;
        }
        return true;
    }

    public static final long q(float f8, long j2, long j10) {
        j3.l lVar = j3.d.f7371x;
        long a10 = s.a(j2, lVar);
        long a11 = s.a(j10, lVar);
        float d4 = s.d(a10);
        float h2 = s.h(a10);
        float g10 = s.g(a10);
        float e6 = s.e(a10);
        float d10 = s.d(a11);
        float h10 = s.h(a11);
        float g11 = s.g(a11);
        float e10 = s.e(a11);
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        return s.a(h(p7.l.w(h2, h10, f8), p7.l.w(g10, g11, f8), p7.l.w(e6, e10, f8), p7.l.w(d4, d10, f8), lVar), s.f(j10));
    }

    public static final float r(long j2) {
        j3.c f8 = s.f(j2);
        if (!j3.b.a(f8.f7347b, j3.b.f7341a)) {
            c0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) j3.b.b(f8.f7347b)));
        }
        j3.m mVar = ((j3.q) f8).f7403p;
        double a10 = mVar.a(s.h(j2));
        float a11 = (float) ((mVar.a(s.e(j2)) * 0.0722d) + (mVar.a(s.g(j2)) * 0.7152d) + (a10 * 0.2126d));
        if (a11 < 0.0f) {
            a11 = 0.0f;
        }
        if (a11 > 1.0f) {
            return 1.0f;
        }
        return a11;
    }

    public static final void s(Matrix matrix, float[] fArr) {
        float f8 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f8;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f8;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
    }

    public static final void t(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f8 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f8;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    public static final long u(h3.c cVar) {
        float f8 = cVar.f6054c - cVar.f6052a;
        float f10 = cVar.f6055d - cVar.f6053b;
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    public static final BlendMode v(int i2) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        if (i2 == 0) {
            blendMode20 = BlendMode.CLEAR;
            return blendMode20;
        } else if (i2 == 1) {
            blendMode19 = BlendMode.SRC;
            return blendMode19;
        } else if (i2 == 2) {
            blendMode18 = BlendMode.DST;
            return blendMode18;
        } else if (i2 == 3) {
            blendMode17 = BlendMode.SRC_OVER;
            return blendMode17;
        } else if (i2 == 4) {
            blendMode16 = BlendMode.DST_OVER;
            return blendMode16;
        } else if (i2 == 5) {
            blendMode15 = BlendMode.SRC_IN;
            return blendMode15;
        } else if (i2 == 6) {
            blendMode14 = BlendMode.DST_IN;
            return blendMode14;
        } else if (i2 == 7) {
            blendMode13 = BlendMode.SRC_OUT;
            return blendMode13;
        } else if (i2 == 8) {
            return a.b();
        } else {
            if (i2 == 9) {
                return a.o();
            }
            if (i2 == 10) {
                blendMode12 = BlendMode.DST_ATOP;
                return blendMode12;
            } else if (i2 == 11) {
                return a.t();
            } else {
                if (i2 == 12) {
                    return a.w();
                }
                if (i2 == 13) {
                    return a.y();
                }
                if (i2 == 14) {
                    return a.z();
                }
                if (i2 == 15) {
                    return a.A();
                }
                if (i2 == 16) {
                    return a.B();
                }
                if (i2 == 17) {
                    return a.C();
                }
                if (i2 == 18) {
                    return a.D();
                }
                if (i2 == 19) {
                    blendMode11 = BlendMode.COLOR_BURN;
                    return blendMode11;
                } else if (i2 == 20) {
                    blendMode10 = BlendMode.HARD_LIGHT;
                    return blendMode10;
                } else if (i2 == 21) {
                    blendMode9 = BlendMode.SOFT_LIGHT;
                    return blendMode9;
                } else if (i2 == 22) {
                    blendMode8 = BlendMode.DIFFERENCE;
                    return blendMode8;
                } else if (i2 == 23) {
                    blendMode7 = BlendMode.EXCLUSION;
                    return blendMode7;
                } else if (i2 == 24) {
                    blendMode6 = BlendMode.MULTIPLY;
                    return blendMode6;
                } else if (i2 == 25) {
                    blendMode5 = BlendMode.HUE;
                    return blendMode5;
                } else if (i2 == 26) {
                    blendMode4 = BlendMode.SATURATION;
                    return blendMode4;
                } else if (i2 == 27) {
                    blendMode3 = BlendMode.COLOR;
                    return blendMode3;
                } else if (i2 == 28) {
                    blendMode2 = BlendMode.LUMINOSITY;
                    return blendMode2;
                } else {
                    blendMode = BlendMode.SRC_OVER;
                    return blendMode;
                }
            }
        }
    }

    public static final Rect w(x4.k kVar) {
        return new Rect(kVar.f14342a, kVar.f14343b, kVar.f14344c, kVar.f14345d);
    }

    public static final RectF x(h3.c cVar) {
        return new RectF(cVar.f6052a, cVar.f6053b, cVar.f6054c, cVar.f6055d);
    }

    public static final int y(long j2) {
        float[] fArr = j3.d.f7349a;
        return (int) (s.a(j2, j3.d.f7353e) >>> 32);
    }

    public static final Bitmap.Config z(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i2 == 3) {
            return gk.q.c();
        }
        if (i10 >= 26 && i2 == 4) {
            return gk.q.y();
        }
        return Bitmap.Config.ARGB_8888;
    }

    public abstract h3.c l();
}
