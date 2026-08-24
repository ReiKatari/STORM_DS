package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt0  reason: default package */
/* loaded from: classes.dex */
public abstract class nt0 {
    public final java.lang.String a;
    public final long b;
    public final int c;

    public nt0(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r2
            int r0 = r1.length()
            r1 = 0
            if (r0 == 0) goto L1e
            r0 = -1
            if (r2 < r0) goto L18
            r0 = 63
            if (r2 > r0) goto L18
            return
        L18:
            java.lang.String r0 = "The id must be between -1 and 63"
            defpackage.i.h(r0)
            throw r1
        L1e:
            java.lang.String r0 = "The name of a color space cannot be null and must contain at least 1 character"
            defpackage.i.h(r0)
            throw r1
    }

    public abstract float a(int r1);

    public abstract float b(int r1);

    public boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract long d(float r1, float r2, float r3);

    public abstract float e(float r1, float r2, float r3);

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L2e
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L2e
        L11:
            nt0 r3 = (defpackage.nt0) r3
            int r0 = r2.c
            int r1 = r3.c
            if (r0 == r1) goto L1a
            goto L2e
        L1a:
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            goto L2e
        L25:
            long r0 = r2.b
            long r2 = r3.b
            boolean r2 = defpackage.q60.A(r0, r2)
            return r2
        L2e:
            r2 = 0
            return r2
    }

    public abstract long f(float r1, float r2, float r3, float r4, defpackage.nt0 r5);

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r4 = r4.c
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = " (id="
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r3 = defpackage.q60.a0(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
