package q0;

import android.util.Size;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Size f12087a = new Size(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Size f12088b;

    /* renamed from: c  reason: collision with root package name */
    public static final Size f12089c;

    /* renamed from: d  reason: collision with root package name */
    public static final Size f12090d;

    /* renamed from: e  reason: collision with root package name */
    public static final Size f12091e;

    /* renamed from: f  reason: collision with root package name */
    public static final Size f12092f;

    static {
        new Size(320, 240);
        f12088b = new Size(640, 480);
        f12089c = new Size(720, 480);
        f12090d = new Size(1280, 720);
        f12091e = new Size(1920, 1080);
        f12092f = new Size(1920, 1440);
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
