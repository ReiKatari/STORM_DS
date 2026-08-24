package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h23  reason: default package */
/* loaded from: classes.dex */
public final class h23 extends defpackage.qu2 {
    public final int a;
    public final defpackage.da2 b;

    public h23() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            da2 r0 = defpackage.da2.IMAGE_FORMAT
            r1.b = r0
            return
    }

    @Override // defpackage.qu2
    public final defpackage.da2 a() {
            r0 = this;
            da2 r0 = r0.b
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImageFormatFeature(imageCaptureOutputFormat="
            r0.<init>(r1)
            r1 = 41
            int r3 = r3.a
            if (r3 == 0) goto L1a
            r2 = 1
            if (r3 == r2) goto L17
            java.lang.String r2 = "UNDEFINED("
            java.lang.String r3 = defpackage.xg6.o(r2, r3, r1)
            goto L1c
        L17:
            java.lang.String r3 = "JPEG_R"
            goto L1c
        L1a:
            java.lang.String r3 = "JPEG"
        L1c:
            java.lang.String r3 = defpackage.lb1.q(r0, r3, r1)
            return r3
    }
}
