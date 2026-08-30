package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gx0  reason: default package */
/* loaded from: classes.dex */
public class gx0 {
    public final ar0 a;
    public final ar0 b;
    public final ar0 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gx0(defpackage.ar0 r9, defpackage.ar0 r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.dk7.s(r0, r2)
            if (r0 == 0) goto L12
            ar0 r0 = defpackage.l.q(r9)
            goto L13
        L12:
            r0 = r9
        L13:
            long r4 = r10.b
            boolean r1 = defpackage.dk7.s(r4, r2)
            if (r1 == 0) goto L20
            ar0 r1 = defpackage.l.q(r10)
            goto L21
        L20:
            r1 = r10
        L21:
            float[] r4 = defpackage.dk7.h
            r5 = 3
            if (r11 != r5) goto L6c
            long r6 = r9.b
            boolean r11 = defpackage.dk7.s(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.dk7.s(r6, r2)
            if (r11 == 0) goto L37
            if (r2 == 0) goto L37
            goto L6c
        L37:
            if (r11 != 0) goto L3b
            if (r2 == 0) goto L6c
        L3b:
            if (r11 == 0) goto L3e
            goto L3f
        L3e:
            r9 = r10
        L3f:
            eg5 r9 = (defpackage.eg5) r9
            xd7 r9 = r9.d
            if (r11 == 0) goto L4a
            float[] r11 = r9.a()
            goto L4b
        L4a:
            r11 = r4
        L4b:
            if (r2 == 0) goto L51
            float[] r4 = r9.a()
        L51:
            r9 = 0
            r2 = r11[r9]
            r3 = r4[r9]
            float r2 = r2 / r3
            r3 = 1
            r6 = r11[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r4 = r4[r7]
            float r11 = r11 / r4
            float[] r4 = new float[r5]
            r4[r9] = r2
            r4[r3] = r6
            r4[r7] = r11
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r8.<init>(r10, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx0.<init>(ar0, ar0, int):void");
    }

    public long a(long j) {
        float h = xq0.h(j);
        float g = xq0.g(j);
        float e = xq0.e(j);
        float d = xq0.d(j);
        ar0 ar0Var = this.b;
        long d2 = ar0Var.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = ar0Var.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public gx0(ar0 ar0Var, ar0 ar0Var2, ar0 ar0Var3, float[] fArr) {
        this.a = ar0Var;
        this.b = ar0Var2;
        this.c = ar0Var3;
        this.d = fArr;
    }
}
