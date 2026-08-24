package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g23  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g23 implements ImageDecoder.OnHeaderDecodedListener {
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        Size size2;
        Size size3;
        Size size4;
        Size size5;
        Size size6;
        vr4 vr4Var;
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
            int E = u24.E(((size8.getWidth() * height) / 2.0f) - 320.0f);
            size9 = imageInfo.getSize();
            Rect rect = new Rect(E, 0, u24.E(((size9.getWidth() * height) / 2.0f) + 320.0f), 480);
            size10 = imageInfo.getSize();
            vr4Var = new vr4(rect, new Point(u24.E(size10.getWidth() * height), 480));
        } else {
            size3 = imageInfo.getSize();
            float width = size3.getWidth() / 640.0f;
            size4 = imageInfo.getSize();
            int E2 = u24.E(((size4.getHeight() * width) / 2.0f) - 240.0f);
            size5 = imageInfo.getSize();
            Rect rect2 = new Rect(0, E2, 640, u24.E(((size5.getHeight() * width) / 2.0f) + 240.0f));
            size6 = imageInfo.getSize();
            vr4Var = new vr4(rect2, new Point(640, u24.E(size6.getHeight() * width)));
        }
        Point point = (Point) vr4Var.B;
        imageDecoder.setCrop((Rect) vr4Var.A);
        imageDecoder.setTargetSize(point.x, point.y);
    }
}
