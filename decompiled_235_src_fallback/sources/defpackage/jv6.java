package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv6  reason: default package */
/* loaded from: classes.dex */
public final class jv6 {
    public static final defpackage.tr6 e = null;
    public static final defpackage.fv6[] f = null;
    public static final java.util.Map g = null;
    public static final java.util.LinkedHashMap h = null;
    public final defpackage.hv6 a;
    public final defpackage.fv6 b;
    public final defpackage.tr6 c;
    public final int d;

    static {
            tr6 r0 = defpackage.tr6.DEFAULT
            defpackage.jv6.e = r0
            fv6 r1 = defpackage.fv6.S720P_16_9
            fv6 r2 = defpackage.fv6.S1080P_4_3
            fv6 r3 = defpackage.fv6.S1080P_16_9
            fv6 r4 = defpackage.fv6.S1440P_16_9
            fv6 r5 = defpackage.fv6.UHD
            fv6 r6 = defpackage.fv6.X_VGA
            fv6[] r0 = new defpackage.fv6[]{r1, r2, r3, r4, r5, r6}
            defpackage.jv6.f = r0
            hv6 r0 = defpackage.hv6.YUV
            r1 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            vr4 r2 = new vr4
            r2.<init>(r0, r1)
            hv6 r0 = defpackage.hv6.JPEG
            r1 = 256(0x100, float:3.59E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            vr4 r3 = new vr4
            r3.<init>(r0, r1)
            hv6 r0 = defpackage.hv6.JPEG_R
            r1 = 4101(0x1005, float:5.747E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            vr4 r4 = new vr4
            r4.<init>(r0, r1)
            hv6 r0 = defpackage.hv6.RAW
            r1 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            vr4 r5 = new vr4
            r5.<init>(r0, r1)
            hv6 r0 = defpackage.hv6.PRIV
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            vr4 r6 = new vr4
            r6.<init>(r0, r1)
            vr4[] r0 = new defpackage.vr4[]{r2, r3, r4, r5, r6}
            java.util.Map r0 = defpackage.c14.m0(r0)
            defpackage.jv6.g = r0
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 10
            int r1 = defpackage.ht0.v0(r0, r1)
            int r1 = defpackage.c14.k0(r1)
            r2 = 16
            if (r1 >= r2) goto L76
            r1 = r2
        L76:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.getKey()
            hv6 r1 = (defpackage.hv6) r1
            r2.put(r3, r1)
            goto L7f
        La3:
            defpackage.jv6.h = r2
            return
    }

    public jv6(defpackage.hv6 r1, defpackage.fv6 r2, defpackage.tr6 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            java.util.Map r2 = defpackage.jv6.g
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L21
            int r1 = r1.intValue()
            goto L22
        L21:
            r1 = 0
        L22:
            r0.d = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.jv6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            jv6 r5 = (defpackage.jv6) r5
            hv6 r1 = r4.a
            hv6 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            fv6 r1 = r4.b
            fv6 r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            tr6 r4 = r4.c
            tr6 r5 = r5.c
            if (r4 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            hv6 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            fv6 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            tr6 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SurfaceConfig(configType="
            r0.<init>(r1)
            hv6 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", configSize="
            r0.append(r1)
            fv6 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", streamUseCase="
            r0.append(r1)
            tr6 r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
