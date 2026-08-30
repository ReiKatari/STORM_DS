package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final c f7376a;

    /* renamed from: b  reason: collision with root package name */
    public final c f7377b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7378c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f7379d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(j3.c r9, j3.c r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f7347b
            long r2 = j3.b.f7341a
            boolean r0 = j3.b.a(r0, r2)
            if (r0 == 0) goto Lf
            j3.c r0 = j3.j.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f7347b
            boolean r1 = j3.b.a(r4, r2)
            if (r1 == 0) goto L1d
            j3.c r1 = j3.j.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f7347b
            boolean r11 = j3.b.a(r5, r2)
            long r5 = r10.f7347b
            boolean r2 = j3.b.a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            j3.q r9 = (j3.q) r9
            j3.s r9 = r9.f7392d
            float[] r3 = j3.j.f7385e
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.<init>(j3.c, j3.c, int):void");
    }

    public long a(long j2) {
        float h2 = i3.s.h(j2);
        float g10 = i3.s.g(j2);
        float e6 = i3.s.e(j2);
        float d4 = i3.s.d(j2);
        c cVar = this.f7377b;
        long d10 = cVar.d(h2, g10, e6);
        float intBitsToFloat = Float.intBitsToFloat((int) (d10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d10 & 4294967295L));
        float e10 = cVar.e(h2, g10, e6);
        float[] fArr = this.f7379d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e10 *= fArr[2];
        }
        float f8 = intBitsToFloat;
        float f10 = intBitsToFloat2;
        return this.f7378c.f(f8, f10, e10, d4, this.f7376a);
    }

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f7376a = cVar;
        this.f7377b = cVar2;
        this.f7378c = cVar3;
        this.f7379d = fArr;
    }
}
