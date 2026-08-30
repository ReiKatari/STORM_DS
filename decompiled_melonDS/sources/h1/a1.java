package h1;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f5841a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f5842b;

    /* renamed from: c  reason: collision with root package name */
    public y0 f5843c;

    /* renamed from: d  reason: collision with root package name */
    public x0 f5844d;

    /* renamed from: e  reason: collision with root package name */
    public w0 f5845e;

    /* renamed from: f  reason: collision with root package name */
    public b3 f5846f;

    /* renamed from: g  reason: collision with root package name */
    public rd.k f5847g;

    /* renamed from: h  reason: collision with root package name */
    public long f5848h = 9205357640488583168L;

    /* renamed from: i  reason: collision with root package name */
    public c3 f5849i;

    /* renamed from: j  reason: collision with root package name */
    public final b1 f5850j;

    /* renamed from: k  reason: collision with root package name */
    public final b1 f5851k;

    /* renamed from: l  reason: collision with root package name */
    public long f5852l;

    /* JADX WARN: Type inference failed for: r3v1, types: [h1.b1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h1.b1, java.lang.Object] */
    public a1(k0 k0Var) {
        this.f5841a = k0Var;
        ?? obj = new Object();
        obj.f5859b = new ArrayList();
        this.f5850j = obj;
        ?? obj2 = new Object();
        obj2.f5859b = new ArrayList();
        this.f5851k = obj2;
        this.f5852l = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h1.x0] */
    public static void c(a1 a1Var, s3.b bVar, long j2, long j10, int i2) {
        if ((i2 & 4) != 0) {
            j10 = 0;
        }
        k0 k0Var = a1Var.f5841a;
        x0 x0Var = a1Var.f5844d;
        x0 x0Var2 = x0Var;
        if (x0Var == null) {
            ?? obj = new Object();
            obj.f6037b = null;
            obj.f6038c = Long.MAX_VALUE;
            obj.f6039d = false;
            a1Var.f5844d = obj;
            x0Var2 = obj;
        }
        x0Var2.f6037b = bVar;
        x0Var2.f6038c = j2;
        c3 c3Var = a1Var.f5849i;
        n1 n1Var = k0Var.f5931k0;
        if (c3Var == null) {
            a1Var.f5849i = new c3(n1Var);
        } else {
            c3Var.f5883c = n1Var;
            c3Var.f5882b = j10;
        }
        x0Var2.f6039d = false;
        a1Var.f5846f = x0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h1.v0] */
    public final void a() {
        v0 v0Var = this.f5842b;
        v0 v0Var2 = v0Var;
        if (v0Var == null) {
            u0 u0Var = u0.NotInitialized;
            ?? obj = new Object();
            obj.f6016b = u0Var;
            obj.f6017c = false;
            this.f5842b = obj;
            v0Var2 = obj;
        }
        v0Var2.f6016b = u0.NotInitialized;
        v0Var2.f6017c = false;
        this.f5846f = v0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h1.w0] */
    public final void b(s3.b bVar, long j2, c3 c3Var) {
        w0 w0Var = this.f5845e;
        w0 w0Var2 = w0Var;
        if (w0Var == null) {
            ?? obj = new Object();
            obj.f6024b = null;
            obj.f6025c = Long.MAX_VALUE;
            this.f5845e = obj;
            w0Var2 = obj;
        }
        w0Var2.f6024b = bVar;
        w0Var2.f6025c = j2;
        c3Var.f5882b = 0L;
        this.f5846f = w0Var2;
    }

    public final rd.k d() {
        rd.k kVar = this.f5847g;
        if (kVar != null) {
            return kVar;
        }
        a0.j.h("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(s3.b bVar, s3.a aVar, long j2) {
        long j10;
        k0 k0Var = this.f5841a;
        long a10 = a4.l.s(k0Var).a(0L);
        if (!h3.b.b(this.f5848h, 9205357640488583168L) && !h3.b.b(a10, this.f5848h)) {
            this.f5852l = h3.b.e(this.f5852l, h3.b.d(a10, this.f5848h));
        }
        this.f5848h = a10;
        n1 n1Var = k0Var.f5931k0;
        n1Var.getClass();
        m0 m0Var = n0.f5983a;
        if (n1Var == n1.Vertical) {
            j10 = j2 & 4294967295L;
        } else {
            j10 = j2 >> 32;
        }
        if (Math.abs(Float.intBitsToFloat((int) j10)) > 2.0f) {
            b3.a(d(), bVar, k0Var.f5931k0, aVar, this.f5850j, this.f5852l);
            b1 b1Var = this.f5851k;
            ArrayList arrayList = b1Var.f5859b;
            if (arrayList.size() == 3) {
                int i2 = b1Var.f5858a;
                b1Var.f5858a = i2 + 1;
                arrayList.set(i2, new h3.b(j2));
            } else {
                arrayList.add(new h3.b(j2));
            }
            if (b1Var.f5858a == 3) {
                b1Var.f5858a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((h3.b) arrayList.get(i10)).f6050a >> 32))));
            }
            float M = (float) zb.l.M(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((h3.b) arrayList.get(i11)).f6050a & 4294967295L))));
            }
            float M2 = (float) zb.l.M(arrayList3);
            k0Var.Z0(new u((Float.floatToRawIntBits(M2) & 4294967295L) | (Float.floatToRawIntBits(M) << 32), true));
        }
    }

    public final void f(s3.b bVar, s3.b bVar2, s3.a aVar, long j2) {
        if (this.f5847g == null) {
            this.f5847g = new rd.k(15);
        }
        this.f5852l = 0L;
        rd.k d4 = d();
        k0 k0Var = this.f5841a;
        b3.a(d4, bVar, k0Var.f5931k0, aVar, this.f5850j, this.f5852l);
        long d10 = h3.b.d(b3.f(bVar2, k0Var.f5931k0, aVar), j2);
        if (((Boolean) k0Var.f5932l0.k(new v3.y(1))).booleanValue()) {
            this.f5848h = a4.l.s(k0Var).a(0L);
            k0Var.Z0(new v(d10));
        }
        b1 b1Var = this.f5851k;
        b1Var.f5858a = 0;
        b1Var.f5859b.clear();
    }
}
