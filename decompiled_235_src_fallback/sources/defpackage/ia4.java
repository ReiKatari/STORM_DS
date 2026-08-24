package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia4  reason: default package */
/* loaded from: classes.dex */
public final class ia4 {
    public float a;
    public float b;
    public float c;
    public float d;

    public ia4() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            return
    }

    public final void a(float r2, float r3, float r4, float r5) {
            r1 = this;
            float r0 = r1.a
            float r2 = java.lang.Math.max(r2, r0)
            r1.a = r2
            float r2 = r1.b
            float r2 = java.lang.Math.max(r3, r2)
            r1.b = r2
            float r2 = r1.c
            float r2 = java.lang.Math.min(r4, r2)
            r1.c = r2
            float r2 = r1.d
            float r2 = java.lang.Math.min(r5, r2)
            r1.d = r2
            return
    }

    public final boolean b() {
            r4 = this;
            float r0 = r4.a
            float r1 = r4.c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 < 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            float r3 = r4.b
            float r4 = r4.d
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L16
            r1 = r2
        L16:
            r4 = r0 | r1
            return r4
    }

    public final void c(long r4) {
            r3 = this;
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r5 = r3.a
            float r5 = r5 + r0
            r3.a = r5
            float r5 = r3.b
            float r5 = r5 + r4
            r3.b = r5
            float r5 = r3.c
            float r5 = r5 + r0
            r3.c = r5
            float r5 = r3.d
            float r5 = r5 + r4
            r3.d = r5
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MutableRect("
            r0.<init>(r1)
            float r1 = r3.a
            java.lang.String r1 = defpackage.gi2.Q(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = r3.b
            java.lang.String r2 = defpackage.gi2.Q(r2)
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.c
            java.lang.String r2 = defpackage.gi2.Q(r2)
            r0.append(r2)
            r0.append(r1)
            float r3 = r3.d
            java.lang.String r3 = defpackage.gi2.Q(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
