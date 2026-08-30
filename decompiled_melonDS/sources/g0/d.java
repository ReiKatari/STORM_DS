package g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends e0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f5007a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final b f5008b = b.IMAGE_FORMAT;

    @Override // e0.b
    public final b a() {
        return this.f5008b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i2 = this.f5007a;
        if (i2 != 0) {
            if (i2 != 1) {
                str = "UNDEFINED(" + i2 + ')';
            } else {
                str = "JPEG_R";
            }
        } else {
            str = "JPEG";
        }
        return w.d.r(sb2, str, ')');
    }
}
