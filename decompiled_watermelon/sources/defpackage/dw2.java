package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dw2  reason: default package */
/* loaded from: classes.dex */
public final class dw2 extends no2 {
    public final int a = 1;
    public final k52 b = k52.IMAGE_FORMAT;

    @Override // defpackage.no2
    public final k52 a() {
        return this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                str = ej6.e("UNDEFINED(", i, ')');
            } else {
                str = "JPEG_R";
            }
        } else {
            str = "JPEG";
        }
        return wh1.o(sb, str, ')');
    }
}
