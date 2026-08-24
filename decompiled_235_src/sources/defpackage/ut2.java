package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut2  reason: default package */
/* loaded from: classes.dex */
public final class ut2 {
    public final wt2 a;
    public Outline f;
    public float j;
    public mp2 k;
    public hj l;
    public hj m;
    public boolean n;
    public zj0 o;
    public aj p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public qh1 b = hv.f;
    public kk3 c = kk3.Ltr;
    public qn2 d = hh2.X;
    public final mc e = new mc(this, 15);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final ka0 r = new Object();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ka0] */
    public ut2(wt2 wt2Var) {
        this.a = wt2Var;
        wt2Var.E(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        long j;
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            wt2 wt2Var = this.a;
            if (!z && wt2Var.M() <= RecyclerView.B1) {
                wt2Var.E(false);
                wt2Var.g(null, 0L);
            } else {
                hj hjVar = this.l;
                if (hjVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = hjVar instanceof hj;
                    if (z2) {
                        Path path = hjVar.a;
                        path.computeBounds(rectF, false);
                        int i = Build.VERSION.SDK_INT;
                        if (i <= 28 && !path.isConvex()) {
                            Outline outline3 = this.f;
                            if (outline3 != null) {
                                outline3.setEmpty();
                            }
                            this.n = true;
                            outline = null;
                        } else {
                            outline = this.f;
                            if (outline == null) {
                                outline = new Outline();
                                this.f = outline;
                            }
                            if (i >= 30) {
                                if (z2) {
                                    outline.setPath(path);
                                } else {
                                    fa6.h("Unable to obtain android.graphics.Path");
                                    return;
                                }
                            } else if (z2) {
                                outline.setConvexPath(path);
                            } else {
                                fa6.h("Unable to obtain android.graphics.Path");
                                return;
                            }
                            this.n = !outline.canClip();
                        }
                        this.l = hjVar;
                        if (outline != null) {
                            outline.setAlpha(wt2Var.a());
                            outline2 = outline;
                        }
                        wt2Var.g(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                        if (this.n && this.w) {
                            wt2Var.E(false);
                            wt2Var.i();
                        } else {
                            wt2Var.E(this.w);
                        }
                    } else {
                        fa6.h("Unable to obtain android.graphics.Path");
                        return;
                    }
                } else {
                    wt2Var.E(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long S = qo2.S(this.u);
                    long j2 = this.h;
                    long j3 = this.i;
                    if (j3 == 9205357640488583168L) {
                        j = S;
                    } else {
                        j = j3;
                    }
                    int i2 = (int) (j2 >> 32);
                    int i3 = (int) (j2 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(wt2Var.a());
                    wt2Var.g(outline5, qo2.Q(j));
                }
            }
        }
        this.g = false;
    }

    public final void b() {
        ut2 ut2Var;
        if (this.s && this.q == 0) {
            ka0 ka0Var = this.r;
            ut2 ut2Var2 = (ut2) ka0Var.b;
            if (ut2Var2 != null) {
                ut2Var2.q--;
                ut2Var2.b();
                ka0Var.b = null;
            }
            ka4 ka4Var = (ka4) ka0Var.d;
            if (ka4Var != null) {
                Object[] objArr = ka4Var.b;
                long[] jArr = ka4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ut2Var.q--;
                                    ((ut2) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                ka4Var.b();
            }
            this.a.i();
        }
    }

    public final void c(no1 no1Var) {
        ut2 ut2Var;
        ka0 ka0Var = this.r;
        ka0Var.c = (ut2) ka0Var.b;
        ka4 ka4Var = (ka4) ka0Var.d;
        if (ka4Var != null && ka4Var.h()) {
            ka4 ka4Var2 = (ka4) ka0Var.e;
            if (ka4Var2 == null) {
                ka4 ka4Var3 = c66.a;
                ka4Var2 = new ka4();
                ka0Var.e = ka4Var2;
            }
            ka4Var2.j(ka4Var);
            ka4Var.b();
        }
        ka0Var.a = true;
        this.d.g(no1Var);
        ka0Var.a = false;
        ut2 ut2Var2 = (ut2) ka0Var.c;
        if (ut2Var2 != null) {
            ut2Var2.q--;
            ut2Var2.b();
        }
        ka4 ka4Var4 = (ka4) ka0Var.e;
        if (ka4Var4 != null && ka4Var4.h()) {
            Object[] objArr = ka4Var4.b;
            long[] jArr = ka4Var4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ut2Var.q--;
                                ((ut2) objArr[(i << 3) + i3]).b();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            ka4Var4.b();
        }
    }

    public final mp2 d() {
        mp2 qo4Var;
        mp2 mp2Var = this.k;
        hj hjVar = this.l;
        if (mp2Var != null) {
            return mp2Var;
        }
        if (hjVar != null) {
            po4 po4Var = new po4(hjVar);
            this.k = po4Var;
            return po4Var;
        }
        long S = qo2.S(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            S = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (S >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (S & 4294967295L)) + intBitsToFloat2;
        float f = this.j;
        if (f > RecyclerView.B1) {
            qo4Var = new ro4(mp2.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f))));
        } else {
            qo4Var = new qo4(new of5(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = qo4Var;
        return qo4Var;
    }

    public final void e(qh1 qh1Var, kk3 kk3Var, long j, qn2 qn2Var) {
        boolean b = q93.b(this.u, j);
        wt2 wt2Var = this.a;
        if (!b) {
            this.u = j;
            long j2 = this.t;
            wt2Var.B(j, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = qh1Var;
        this.c = kk3Var;
        this.d = qn2Var;
        wt2Var.G(qh1Var, kk3Var, this, this.e);
    }

    public final void f(float f, long j, long j2) {
        if (jk4.c(this.h, j) && xi6.b(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
