package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cw2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cw2 implements ImageDecoder.OnHeaderDecodedListener {
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        Size size2;
        Size size3;
        Size size4;
        Size size5;
        Size size6;
        ti4 ti4Var;
        Size size7;
        Size size8;
        Size size9;
        Size size10;
        imageDecoder.getClass();
        imageInfo.getClass();
        source.getClass();
        size = imageInfo.getSize();
        size2 = imageInfo.getSize();
        if (size.getWidth() / size2.getHeight() > 1.3333334f) {
            size7 = imageInfo.getSize();
            float height = 480.0f / size7.getHeight();
            size8 = imageInfo.getSize();
            int X = jv3.X(((size8.getWidth() * height) / 2.0f) - 320.0f);
            size9 = imageInfo.getSize();
            Rect rect = new Rect(X, 0, jv3.X(((size9.getWidth() * height) / 2.0f) + 320.0f), 480);
            size10 = imageInfo.getSize();
            ti4Var = new ti4(rect, new Point(jv3.X(size10.getWidth() * height), 480));
        } else {
            size3 = imageInfo.getSize();
            float width = size3.getWidth() / 640.0f;
            size4 = imageInfo.getSize();
            int X2 = jv3.X(((size4.getHeight() * width) / 2.0f) - 240.0f);
            size5 = imageInfo.getSize();
            Rect rect2 = new Rect(0, X2, 640, jv3.X(((size5.getHeight() * width) / 2.0f) + 240.0f));
            size6 = imageInfo.getSize();
            ti4Var = new ti4(rect2, new Point(640, jv3.X(size6.getHeight() * width)));
        }
        Point point = (Point) ti4Var.B;
        imageDecoder.setCrop((Rect) ti4Var.A);
        imageDecoder.setTargetSize(point.x, point.y);
    }
}
