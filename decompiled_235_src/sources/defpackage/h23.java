package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h23  reason: default package */
/* loaded from: classes.dex */
public final class h23 extends qu2 {
    public final int a = 1;
    public final da2 b = da2.IMAGE_FORMAT;

    @Override // defpackage.qu2
    public final da2 a() {
        return this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                str = xg6.o("UNDEFINED(", i, ')');
            } else {
                str = "JPEG_R";
            }
        } else {
            str = "JPEG";
        }
        return lb1.q(sb, str, ')');
    }
}
