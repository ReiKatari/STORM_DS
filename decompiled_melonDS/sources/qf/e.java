package qf;

import android.graphics.ImageDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import yb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ImageDecoder.OnHeaderDecodedListener {
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        Size size2;
        Size size3;
        Size size4;
        Size size5;
        Size size6;
        j jVar;
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
            float f8 = 2;
            float f10 = 320;
            int M = pc.a.M(((size8.getWidth() * height) / f8) - f10);
            size9 = imageInfo.getSize();
            Rect rect = new Rect(M, 0, pc.a.M(((size9.getWidth() * height) / f8) + f10), 480);
            size10 = imageInfo.getSize();
            jVar = new j(rect, new Point(pc.a.M(size10.getWidth() * height), 480));
        } else {
            size3 = imageInfo.getSize();
            float width = size3.getWidth() / 640.0f;
            size4 = imageInfo.getSize();
            float f11 = 240;
            int M2 = pc.a.M(((size4.getHeight() * width) / 2.0f) - f11);
            size5 = imageInfo.getSize();
            Rect rect2 = new Rect(0, M2, 640, pc.a.M(((size5.getHeight() * width) / 2.0f) + f11));
            size6 = imageInfo.getSize();
            jVar = new j(rect2, new Point(640, pc.a.M(size6.getHeight() * width)));
        }
        Point point = (Point) jVar.B;
        imageDecoder.setCrop((Rect) jVar.A);
        imageDecoder.setTargetSize(point.x, point.y);
    }
}
