package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pn2  reason: default package */
/* loaded from: classes.dex */
public final class pn2 {
    public final rn2 a;
    public Outline f;
    public float j;
    public jk2 k;
    public vi l;
    public vi m;
    public boolean n;
    public rh0 o;
    public oi p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public od1 b = tq5.k;
    public sd3 c = sd3.Ltr;
    public mi2 d = qc2.R;
    public final yb e = new yb(16, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final c80 r = new Object();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, c80] */
    public pn2(rn2 rn2Var) {
        this.a = rn2Var;
        rn2Var.x(false);
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
            rn2 rn2Var = this.a;
            if (!z && rn2Var.I() <= RecyclerView.A1) {
                rn2Var.x(false);
                rn2Var.m(null, 0L);
            } else {
                vi viVar = this.l;
                if (viVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = viVar instanceof vi;
                    if (z2) {
                        Path path = viVar.a;
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
                                    vd6.i("Unable to obtain android.graphics.Path");
                                    return;
                                }
                            } else if (z2) {
                                outline.setConvexPath(path);
                            } else {
                                vd6.i("Unable to obtain android.graphics.Path");
                                return;
                            }
                            this.n = !outline.canClip();
                        }
                        this.l = viVar;
                        if (outline != null) {
                            outline.setAlpha(rn2Var.a());
                            outline2 = outline;
                        }
                        rn2Var.m(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                        if (this.n && this.w) {
                            rn2Var.x(false);
                            rn2Var.r();
                        } else {
                            rn2Var.x(this.w);
                        }
                    } else {
                        vd6.i("Unable to obtain android.graphics.Path");
                        return;
                    }
                } else {
                    rn2Var.x(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long U = hk2.U(this.u);
                    long j2 = this.h;
                    long j3 = this.i;
                    if (j3 == 9205357640488583168L) {
                        j = U;
                    } else {
                        j = j3;
                    }
                    int i2 = (int) (j2 >> 32);
                    int i3 = (int) (j2 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(rn2Var.a());
                    rn2Var.m(outline5, hk2.R(j));
                }
            }
        }
        this.g = false;
    }

    public final void b() {
        pn2 pn2Var;
        if (this.s && this.q == 0) {
            c80 c80Var = this.r;
            pn2 pn2Var2 = (pn2) c80Var.b;
            if (pn2Var2 != null) {
                pn2Var2.q--;
                pn2Var2.b();
                c80Var.b = null;
            }
            e24 e24Var = (e24) c80Var.d;
            if (e24Var != null) {
                Object[] objArr = e24Var.b;
                long[] jArr = e24Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    pn2Var.q--;
                                    ((pn2) objArr[(i << 3) + i3]).b();
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
                e24Var.b();
            }
            this.a.r();
        }
    }

    public final void c(hk1 hk1Var) {
        pn2 pn2Var;
        c80 c80Var = this.r;
        c80Var.c = (pn2) c80Var.b;
        e24 e24Var = (e24) c80Var.d;
        if (e24Var != null && e24Var.h()) {
            e24 e24Var2 = (e24) c80Var.e;
            if (e24Var2 == null) {
                e24 e24Var3 = xu5.a;
                e24Var2 = new e24();
                c80Var.e = e24Var2;
            }
            e24Var2.j(e24Var);
            e24Var.b();
        }
        c80Var.a = true;
        this.d.n(hk1Var);
        c80Var.a = false;
        pn2 pn2Var2 = (pn2) c80Var.c;
        if (pn2Var2 != null) {
            pn2Var2.q--;
            pn2Var2.b();
        }
        e24 e24Var4 = (e24) c80Var.e;
        if (e24Var4 != null && e24Var4.h()) {
            Object[] objArr = e24Var4.b;
            long[] jArr = e24Var4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                pn2Var.q--;
                                ((pn2) objArr[(i << 3) + i3]).b();
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
            e24Var4.b();
        }
    }

    public final jk2 d() {
        jk2 of4Var;
        jk2 jk2Var = this.k;
        vi viVar = this.l;
        if (jk2Var != null) {
            return jk2Var;
        }
        if (viVar != null) {
            nf4 nf4Var = new nf4(viVar);
            this.k = nf4Var;
            return nf4Var;
        }
        long U = hk2.U(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            U = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (U >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (U & 4294967295L)) + intBitsToFloat2;
        float f = this.j;
        if (f > RecyclerView.A1) {
            of4Var = new pf4(sn2.e(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f))));
        } else {
            of4Var = new of4(new y55(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = of4Var;
        return of4Var;
    }

    public final void e(od1 od1Var, sd3 sd3Var, long j, mi2 mi2Var) {
        boolean b = i33.b(this.u, j);
        rn2 rn2Var = this.a;
        if (!b) {
            this.u = j;
            long j2 = this.t;
            rn2Var.s(j, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = od1Var;
        this.c = sd3Var;
        this.d = mi2Var;
        rn2Var.A(od1Var, sd3Var, this, this.e);
    }

    public final void f(long j, long j2, float f) {
        if (mb4.b(this.h, j) && i76.b(this.i, j2) && this.j == f && this.l == null) {
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
