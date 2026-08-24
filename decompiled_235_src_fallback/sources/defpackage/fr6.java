package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fr6  reason: default package */
/* loaded from: classes.dex */
public final class fr6 {
    public final int a;

    public /* synthetic */ fr6(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final java.lang.String a(int r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = "UNKNOWN"
            return r4
        L5:
            r0 = 34
            if (r4 != r0) goto Lc
            java.lang.String r4 = "PRIVATE"
            return r4
        Lc:
            r0 = 1144402265(0x44363159, float:728.77106)
            if (r4 != r0) goto L14
            java.lang.String r4 = "DEPTH16"
            return r4
        L14:
            r0 = 1768253795(0x69656963, float:1.7333855E25)
            if (r4 != r0) goto L1c
            java.lang.String r4 = "DEPTH_JPEG"
            return r4
        L1c:
            r0 = 257(0x101, float:3.6E-43)
            if (r4 != r0) goto L23
            java.lang.String r4 = "DEPTH_POINT_CLOUD"
            return r4
        L23:
            r0 = 41
            if (r4 != r0) goto L2a
            java.lang.String r4 = "FLEX_RGB_888"
            return r4
        L2a:
            r1 = 42
            if (r4 != r1) goto L31
            java.lang.String r4 = "FLEX_RGBA_8888"
            return r4
        L31:
            r1 = 1212500294(0x48454946, float:202021.1)
            if (r4 != r1) goto L39
            java.lang.String r4 = "HEIC"
            return r4
        L39:
            r1 = 256(0x100, float:3.59E-43)
            if (r4 != r1) goto L40
            java.lang.String r4 = "JPEG"
            return r4
        L40:
            r1 = 4101(0x1005, float:5.747E-42)
            if (r4 != r1) goto L47
            java.lang.String r4 = "JPEG_R"
            return r4
        L47:
            r1 = 16
            if (r4 != r1) goto L4e
            java.lang.String r4 = "NV16"
            return r4
        L4e:
            r2 = 17
            if (r4 != r2) goto L55
            java.lang.String r4 = "NV21"
            return r4
        L55:
            r2 = 37
            if (r4 != r2) goto L5c
            java.lang.String r4 = "RAW10"
            return r4
        L5c:
            r2 = 38
            if (r4 != r2) goto L63
            java.lang.String r4 = "RAW12"
            return r4
        L63:
            r2 = 4098(0x1002, float:5.743E-42)
            if (r4 != r2) goto L6a
            java.lang.String r4 = "RAW_DEPTH"
            return r4
        L6a:
            r2 = 36
            if (r4 != r2) goto L71
            java.lang.String r4 = "RAW_PRIVATE"
            return r4
        L71:
            r2 = 32
            if (r4 != r2) goto L78
            java.lang.String r4 = "RAW_SENSOR"
            return r4
        L78:
            r2 = 4
            if (r4 != r2) goto L7e
            java.lang.String r4 = "RGB_565"
            return r4
        L7e:
            r2 = 842094169(0x32315659, float:1.0322389E-8)
            if (r4 != r2) goto L86
            java.lang.String r4 = "Y12"
            return r4
        L86:
            r3 = 540422489(0x20363159, float:1.5432327E-19)
            if (r4 != r3) goto L8e
            java.lang.String r4 = "Y16"
            return r4
        L8e:
            r3 = 538982489(0x20203859, float:1.3571171E-19)
            if (r4 != r3) goto L96
            java.lang.String r4 = "Y8"
            return r4
        L96:
            r3 = 54
            if (r4 != r3) goto L9d
            java.lang.String r4 = "YCBCR_P010"
            return r4
        L9d:
            r3 = 35
            if (r4 != r3) goto La4
            java.lang.String r4 = "YUV_420_888"
            return r4
        La4:
            r3 = 39
            if (r4 != r3) goto Lab
            java.lang.String r4 = "YUV_422_888"
            return r4
        Lab:
            r3 = 40
            if (r4 != r3) goto Lb2
            java.lang.String r4 = "YUV_444_888"
            return r4
        Lb2:
            r3 = 20
            if (r4 != r3) goto Lb9
            java.lang.String r4 = "YUY2"
            return r4
        Lb9:
            if (r4 != r2) goto Lbe
            java.lang.String r4 = "YV12"
            return r4
        Lbe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UNKNOWN("
            r2.<init>(r3)
            defpackage.g04.y(r1)
            java.lang.String r4 = java.lang.Integer.toString(r4, r1)
            r4.getClass()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            return r4
    }

    public static java.lang.String b(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StreamFormat("
            r0.<init>(r1)
            java.lang.String r2 = a(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.fr6
            if (r0 != 0) goto L5
            goto Ld
        L5:
            fr6 r2 = (defpackage.fr6) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.a
            java.lang.String r0 = b(r0)
            return r0
    }
}
