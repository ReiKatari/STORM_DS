package j3;

import i3.z;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r  reason: collision with root package name */
    public static final fj.j f7391r = new fj.j(20);

    /* renamed from: d  reason: collision with root package name */
    public final s f7392d;

    /* renamed from: e  reason: collision with root package name */
    public final float f7393e;

    /* renamed from: f  reason: collision with root package name */
    public final float f7394f;

    /* renamed from: g  reason: collision with root package name */
    public final r f7395g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f7396h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f7397i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f7398j;

    /* renamed from: k  reason: collision with root package name */
    public final i f7399k;

    /* renamed from: l  reason: collision with root package name */
    public final p f7400l;
    public final m m;

    /* renamed from: n  reason: collision with root package name */
    public final i f7401n;

    /* renamed from: o  reason: collision with root package name */
    public final p f7402o;

    /* renamed from: p  reason: collision with root package name */
    public final m f7403p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f7404q;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01d9, code lost:
        if ((((r24 - r12) * r10) - ((r1 - r14) * r3)) >= 0.0f) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r33, float[] r34, j3.s r35, float[] r36, j3.i r37, j3.i r38, float r39, float r40, j3.r r41, int r42) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.q.<init>(java.lang.String, float[], j3.s, float[], j3.i, j3.i, float, float, j3.r, int):void");
    }

    @Override // j3.c
    public final float a(int i2) {
        return this.f7394f;
    }

    @Override // j3.c
    public final float b(int i2) {
        return this.f7393e;
    }

    @Override // j3.c
    public final boolean c() {
        return this.f7404q;
    }

    @Override // j3.c
    public final long d(float f8, float f10, float f11) {
        double d4 = f8;
        m mVar = this.f7403p;
        float a10 = (float) mVar.a(d4);
        float a11 = (float) mVar.a(f10);
        float a12 = (float) mVar.a(f11);
        float[] fArr = this.f7397i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f12 = (fArr[6] * a12) + (fArr[3] * a11) + (fArr[0] * a10);
        float f13 = (fArr[7] * a12) + (fArr[4] * a11) + (fArr[1] * a10);
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // j3.c
    public final float e(float f8, float f10, float f11) {
        double d4 = f8;
        m mVar = this.f7403p;
        float a10 = (float) mVar.a(f10);
        float a11 = (float) mVar.a(f11);
        float[] fArr = this.f7397i;
        return (fArr[8] * a11) + (fArr[5] * a10) + (fArr[2] * ((float) mVar.a(d4)));
    }

    @Override // j3.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.f7393e, this.f7393e) != 0 || Float.compare(qVar.f7394f, this.f7394f) != 0 || !nc.k.a(this.f7392d, qVar.f7392d) || !Arrays.equals(this.f7396h, qVar.f7396h)) {
            return false;
        }
        r rVar = qVar.f7395g;
        r rVar2 = this.f7395g;
        if (rVar2 != null) {
            return nc.k.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (!nc.k.a(this.f7399k, qVar.f7399k)) {
            return false;
        }
        return nc.k.a(this.f7401n, qVar.f7401n);
    }

    @Override // j3.c
    public final long f(float f8, float f10, float f11, float f12, c cVar) {
        float[] fArr = this.f7398j;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f8);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f8);
        float f15 = fArr[2] * f8;
        float f16 = (fArr[8] * f11) + (fArr[5] * f10) + f15;
        m mVar = this.m;
        return z.b((float) mVar.a(f13), (float) mVar.a(f14), (float) mVar.a(f16), f12, cVar);
    }

    @Override // j3.c
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.f7396h) + ((this.f7392d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f8 = this.f7393e;
        int i2 = 0;
        if (f8 == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f8);
        }
        int i10 = (hashCode + floatToIntBits) * 31;
        float f10 = this.f7394f;
        if (f10 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f10);
        }
        int i11 = (i10 + floatToIntBits2) * 31;
        r rVar = this.f7395g;
        if (rVar != null) {
            i2 = rVar.hashCode();
        }
        int i12 = i11 + i2;
        if (rVar == null) {
            return this.f7401n.hashCode() + ((this.f7399k.hashCode() + (i12 * 31)) * 31);
        }
        return i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r16, float[] r17, j3.s r18, final j3.r r19, int r20) {
        /*
            r15 = this;
            r9 = r19
            double r0 = r9.f7405a
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            double r5 = r9.f7411g
            double r7 = r9.f7410f
            r10 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r12 = 0
            if (r4 == 0) goto L1e
            j3.o r4 = new j3.o
            r14 = 4
            r4.<init>()
            goto L3e
        L1e:
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L29
            j3.o r4 = new j3.o
            r14 = 5
            r4.<init>()
            goto L3e
        L29:
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            j3.o r4 = new j3.o
            r14 = 6
            r4.<init>()
            goto L3e
        L38:
            j3.o r4 = new j3.o
            r14 = 7
            r4.<init>()
        L3e:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4a
            j3.o r0 = new j3.o
            r1 = 0
            r0.<init>()
        L48:
            r6 = r0
            goto L6b
        L4a:
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L55
            j3.o r0 = new j3.o
            r1 = 1
            r0.<init>()
            goto L48
        L55:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            j3.o r0 = new j3.o
            r1 = 2
            r0.<init>()
            goto L48
        L64:
            j3.o r0 = new j3.o
            r1 = 3
            r0.<init>()
            goto L48
        L6b:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.q.<init>(java.lang.String, float[], j3.s, j3.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r18, float[] r19, j3.s r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            fj.j r3 = j3.q.f7391r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            j3.n r4 = new j3.n
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            j3.n r3 = new j3.n
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            j3.r r15 = new j3.r
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.q.<init>(java.lang.String, float[], j3.s, double, float, float, int):void");
    }
}
