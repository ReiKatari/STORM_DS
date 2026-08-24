package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj2  reason: default package */
/* loaded from: classes.dex */
public final class oj2 implements java.lang.Comparable {
    public static final defpackage.oj2 B = null;
    public static final defpackage.oj2 L = null;
    public static final defpackage.oj2 R = null;
    public static final defpackage.oj2 X = null;
    public static final defpackage.oj2 Y = null;
    public static final defpackage.oj2 Z = null;
    public static final defpackage.oj2 d0 = null;
    public static final defpackage.oj2 e0 = null;
    public static final defpackage.oj2 f0 = null;
    public static final defpackage.oj2 g0 = null;
    public static final java.util.List h0 = null;
    public final int A;

    static {
            oj2 r0 = new oj2
            r1 = 100
            r0.<init>(r1)
            oj2 r1 = new oj2
            r2 = 200(0xc8, float:2.8E-43)
            r1.<init>(r2)
            oj2 r2 = new oj2
            r3 = 300(0x12c, float:4.2E-43)
            r2.<init>(r3)
            oj2 r3 = new oj2
            r4 = 400(0x190, float:5.6E-43)
            r3.<init>(r4)
            defpackage.oj2.B = r3
            oj2 r4 = new oj2
            r5 = 500(0x1f4, float:7.0E-43)
            r4.<init>(r5)
            defpackage.oj2.L = r4
            oj2 r5 = new oj2
            r6 = 600(0x258, float:8.41E-43)
            r5.<init>(r6)
            defpackage.oj2.R = r5
            oj2 r6 = new oj2
            r7 = 700(0x2bc, float:9.81E-43)
            r6.<init>(r7)
            oj2 r7 = new oj2
            r8 = 800(0x320, float:1.121E-42)
            r7.<init>(r8)
            oj2 r8 = new oj2
            r9 = 900(0x384, float:1.261E-42)
            r8.<init>(r9)
            defpackage.oj2.X = r2
            defpackage.oj2.Y = r3
            defpackage.oj2.Z = r4
            defpackage.oj2.d0 = r5
            defpackage.oj2.e0 = r6
            defpackage.oj2.f0 = r7
            defpackage.oj2.g0 = r8
            oj2[] r0 = new defpackage.oj2[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.oj2.h0 = r0
            return
    }

    public oj2(int r3) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            r2 = 0
            r0 = 1
            if (r0 > r3) goto Le
            r1 = 1001(0x3e9, float:1.403E-42)
            if (r3 >= r1) goto Le
            r2 = r0
        Le:
            if (r2 != 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Font weight can be in range [1, 1000]. Current value: "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            defpackage.q53.a(r2)
        L21:
            return
    }

    public final int a(defpackage.oj2 r1) {
            r0 = this;
            int r0 = r0.A
            int r1 = r1.A
            int r0 = defpackage.nb3.p(r0, r1)
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            oj2 r1 = (defpackage.oj2) r1
            int r0 = r0.a(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.oj2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oj2 r4 = (defpackage.oj2) r4
            int r4 = r4.A
            int r3 = r3.A
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.A
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FontWeight(weight="
            r0.<init>(r1)
            int r2 = r2.A
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
