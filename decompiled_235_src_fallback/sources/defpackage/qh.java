package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qh  reason: default package */
/* loaded from: classes.dex */
public abstract class qh {
    public static final float[] a = null;

    static {
            r0 = 101(0x65, float:1.42E-43)
            float[] r1 = new float[r0]
            defpackage.qh.a = r1
            float[] r0 = new float[r0]
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        Lc:
            r5 = 100
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 >= r5) goto L97
            float r5 = (float) r4
            r7 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r7
            r7 = r6
        L17:
            float r8 = r7 - r2
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            float r8 = r8 + r2
            r10 = 1077936128(0x40400000, float:3.0)
            float r11 = r8 * r10
            float r12 = r6 - r8
            float r11 = r11 * r12
            r13 = 1043542835(0x3e333333, float:0.175)
            float r14 = r12 * r13
            r15 = 1051931444(0x3eb33334, float:0.35000002)
            float r16 = r8 * r15
            float r16 = r16 + r14
            float r16 = r16 * r11
            float r14 = r8 * r8
            float r14 = r14 * r8
            float r16 = r16 + r14
            float r17 = r16 - r5
            r18 = r6
            float r6 = java.lang.Math.abs(r17)
            r17 = r9
            r19 = r10
            double r9 = (double) r6
            r20 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r6 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r6 < 0) goto L57
            int r6 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r6 <= 0) goto L55
            r7 = r8
        L52:
            r6 = r18
            goto L17
        L55:
            r2 = r8
            goto L52
        L57:
            r6 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r6
            float r12 = r12 + r8
            float r12 = r12 * r11
            float r12 = r12 + r14
            r1[r4] = r12
            r7 = r18
        L61:
            float r8 = r7 - r3
            float r8 = r8 / r17
            float r8 = r8 + r3
            float r10 = r8 * r19
            float r9 = r18 - r8
            float r10 = r10 * r9
            float r11 = r9 * r6
            float r11 = r11 + r8
            float r11 = r11 * r10
            float r12 = r8 * r8
            float r12 = r12 * r8
            float r11 = r11 + r12
            float r14 = r11 - r5
            float r14 = java.lang.Math.abs(r14)
            r22 = r7
            double r6 = (double) r14
            int r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r6 < 0) goto L8c
            int r6 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r6 <= 0) goto L88
            r7 = r8
        L85:
            r6 = 1056964608(0x3f000000, float:0.5)
            goto L61
        L88:
            r3 = r8
            r7 = r22
            goto L85
        L8c:
            float r9 = r9 * r13
            float r8 = r8 * r15
            float r8 = r8 + r9
            float r8 = r8 * r10
            float r8 = r8 + r12
            r0[r4] = r8
            int r4 = r4 + 1
            goto Lc
        L97:
            r18 = r6
            r0[r5] = r18
            r1[r5] = r18
            return
    }

    public static defpackage.ph a(float r5) {
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = defpackage.gi2.p(r5, r0, r1)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r3 = r2 * r5
            int r3 = (int) r3
            r4 = 100
            if (r3 >= r4) goto L25
            float r0 = (float) r3
            float r0 = r0 / r2
            int r1 = r3 + 1
            float r4 = (float) r1
            float r4 = r4 / r2
            float[] r2 = defpackage.qh.a
            r3 = r2[r3]
            r1 = r2[r1]
            float r1 = r1 - r3
            float r4 = r4 - r0
            float r1 = r1 / r4
            float r5 = defpackage.i61.a(r5, r0, r1, r3)
            r0 = r1
            r1 = r5
        L25:
            ph r5 = new ph
            r5.<init>(r1, r0)
            return r5
    }
}
