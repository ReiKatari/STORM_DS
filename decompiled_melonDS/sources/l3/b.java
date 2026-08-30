package l3;

import a1.n0;
import a1.v0;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import cd.h1;
import i3.f0;
import i3.g0;
import i3.h0;
import i3.z;
import java.util.Locale;
import m9.o;
import q8.r;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f8682a;

    /* renamed from: f  reason: collision with root package name */
    public Outline f8687f;

    /* renamed from: j  reason: collision with root package name */
    public float f8691j;

    /* renamed from: k  reason: collision with root package name */
    public z f8692k;

    /* renamed from: l  reason: collision with root package name */
    public i3.h f8693l;
    public i3.h m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8694n;

    /* renamed from: o  reason: collision with root package name */
    public k3.b f8695o;

    /* renamed from: p  reason: collision with root package name */
    public h1 f8696p;

    /* renamed from: q  reason: collision with root package name */
    public int f8697q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8699s;

    /* renamed from: t  reason: collision with root package name */
    public long f8700t;

    /* renamed from: u  reason: collision with root package name */
    public long f8701u;

    /* renamed from: v  reason: collision with root package name */
    public long f8702v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8703w;

    /* renamed from: x  reason: collision with root package name */
    public RectF f8704x;

    /* renamed from: b  reason: collision with root package name */
    public x4.c f8683b = k3.c.f7959a;

    /* renamed from: c  reason: collision with root package name */
    public m f8684c = m.Ltr;

    /* renamed from: d  reason: collision with root package name */
    public mc.l f8685d = a.L;

    /* renamed from: e  reason: collision with root package name */
    public final a4.a f8686e = new a4.a(19, this);

    /* renamed from: g  reason: collision with root package name */
    public boolean f8688g = true;

    /* renamed from: h  reason: collision with root package name */
    public long f8689h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f8690i = 9205357640488583168L;

    /* renamed from: r  reason: collision with root package name */
    public final l2.g f8698r = new Object();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l2.g] */
    public b(d dVar) {
        this.f8682a = dVar;
        dVar.u(false);
        this.f8700t = 0L;
        this.f8701u = 0L;
        this.f8702v = 9205357640488583168L;
    }

    public final void a() {
        long j2;
        Outline outline;
        if (this.f8688g) {
            boolean z10 = this.f8703w;
            Outline outline2 = null;
            d dVar = this.f8682a;
            if (!z10 && dVar.F() <= 0.0f) {
                dVar.u(false);
                dVar.l(null, 0L);
            } else {
                i3.h hVar = this.f8693l;
                if (hVar != null) {
                    RectF rectF = this.f8704x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f8704x = rectF;
                    }
                    boolean z11 = hVar instanceof i3.h;
                    if (z11) {
                        hVar.f6635a.computeBounds(rectF, false);
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 <= 28 && !hVar.f6635a.isConvex()) {
                            Outline outline3 = this.f8687f;
                            if (outline3 != null) {
                                outline3.setEmpty();
                            }
                            this.f8694n = true;
                            outline = null;
                        } else {
                            outline = this.f8687f;
                            if (outline == null) {
                                outline = new Outline();
                                this.f8687f = outline;
                            }
                            if (i2 >= 30) {
                                if (z11) {
                                    outline.setPath(hVar.f6635a);
                                } else {
                                    o.v("Unable to obtain android.graphics.Path");
                                    return;
                                }
                            } else if (z11) {
                                outline.setConvexPath(hVar.f6635a);
                            } else {
                                o.v("Unable to obtain android.graphics.Path");
                                return;
                            }
                            this.f8694n = !outline.canClip();
                        }
                        this.f8693l = hVar;
                        if (outline != null) {
                            outline.setAlpha(dVar.a());
                            outline2 = outline;
                        }
                        dVar.l(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                        if (this.f8694n && this.f8703w) {
                            dVar.u(false);
                            dVar.q();
                        } else {
                            dVar.u(this.f8703w);
                        }
                    } else {
                        o.v("Unable to obtain android.graphics.Path");
                        return;
                    }
                } else {
                    dVar.u(this.f8703w);
                    Outline outline4 = this.f8687f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f8687f = outline4;
                    }
                    Outline outline5 = outline4;
                    long T = zb.k.T(this.f8701u);
                    long j10 = this.f8689h;
                    long j11 = this.f8690i;
                    if (j11 == 9205357640488583168L) {
                        j2 = T;
                    } else {
                        j2 = j11;
                    }
                    int i10 = (int) (j10 >> 32);
                    int i11 = (int) (j10 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i11)), this.f8691j);
                    outline5.setAlpha(dVar.a());
                    dVar.l(outline5, zb.k.I(j2));
                }
            }
        }
        this.f8688g = false;
    }

    public final void b() {
        b bVar;
        if (this.f8699s && this.f8697q == 0) {
            l2.g gVar = this.f8698r;
            b bVar2 = (b) gVar.f8678b;
            if (bVar2 != null) {
                bVar2.f8697q--;
                bVar2.b();
                gVar.f8678b = null;
            }
            n0 n0Var = (n0) gVar.f8680d;
            if (n0Var != null) {
                Object[] objArr = n0Var.f75b;
                long[] jArr = n0Var.f74a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j2) < 128) {
                                    bVar.f8697q--;
                                    ((b) objArr[(i2 << 3) + i11]).b();
                                }
                                j2 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                n0Var.b();
            }
            this.f8682a.q();
        }
    }

    public final void c(k3.d dVar) {
        b bVar;
        l2.g gVar = this.f8698r;
        gVar.f8679c = (b) gVar.f8678b;
        n0 n0Var = (n0) gVar.f8680d;
        if (n0Var != null && n0Var.h()) {
            n0 n0Var2 = (n0) gVar.f8681e;
            if (n0Var2 == null) {
                n0 n0Var3 = v0.f110a;
                n0Var2 = new n0();
                gVar.f8681e = n0Var2;
            }
            n0Var2.j(n0Var);
            n0Var.b();
        }
        gVar.f8677a = true;
        this.f8685d.k(dVar);
        gVar.f8677a = false;
        b bVar2 = (b) gVar.f8679c;
        if (bVar2 != null) {
            bVar2.f8697q--;
            bVar2.b();
        }
        n0 n0Var4 = (n0) gVar.f8681e;
        if (n0Var4 != null && n0Var4.h()) {
            Object[] objArr = n0Var4.f75b;
            long[] jArr = n0Var4.f74a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j2) < 128) {
                                bVar.f8697q--;
                                ((b) objArr[(i2 << 3) + i11]).b();
                            }
                            j2 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            n0Var4.b();
        }
    }

    public final z d() {
        z g0Var;
        z zVar = this.f8692k;
        i3.h hVar = this.f8693l;
        if (zVar != null) {
            return zVar;
        }
        if (hVar != null) {
            f0 f0Var = new f0(hVar);
            this.f8692k = f0Var;
            return f0Var;
        }
        long T = zb.k.T(this.f8701u);
        long j2 = this.f8689h;
        long j10 = this.f8690i;
        if (j10 != 9205357640488583168L) {
            T = j10;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (T >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (T & 4294967295L)) + intBitsToFloat2;
        float f8 = this.f8691j;
        if (f8 > 0.0f) {
            g0Var = new h0(r.d(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(f8) << 32) | (4294967295L & Float.floatToRawIntBits(f8))));
        } else {
            g0Var = new g0(new h3.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f8692k = g0Var;
        return g0Var;
    }

    public final void e(x4.c cVar, m mVar, long j2, mc.l lVar) {
        boolean b10 = x4.l.b(this.f8701u, j2);
        d dVar = this.f8682a;
        if (!b10) {
            this.f8701u = j2;
            long j10 = this.f8700t;
            dVar.r(j2, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            if (this.f8690i == 9205357640488583168L) {
                this.f8688g = true;
                a();
            }
        }
        this.f8683b = cVar;
        this.f8684c = mVar;
        this.f8685d = lVar;
        dVar.C(cVar, mVar, this, this.f8686e);
    }

    public final void f(float f8, long j2, long j10) {
        if (h3.b.b(this.f8689h, j2) && h3.e.b(this.f8690i, j10) && this.f8691j == f8 && this.f8693l == null) {
            return;
        }
        this.f8692k = null;
        this.f8693l = null;
        this.f8688g = true;
        this.f8694n = false;
        this.f8689h = j2;
        this.f8690i = j10;
        this.f8691j = f8;
        a();
    }
}
