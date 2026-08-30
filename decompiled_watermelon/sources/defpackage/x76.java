package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x76  reason: default package */
/* loaded from: classes.dex */
public abstract class x76 {
    public static final Size a = new Size(0, 0);
    public static final Size b;
    public static final Size c;
    public static final Size d;
    public static final Size e;
    public static final Size f;

    static {
        new Size(320, 240);
        b = new Size(640, 480);
        c = new Size(720, 480);
        d = new Size(1280, 720);
        e = new Size(1920, 1080);
        f = new Size(1920, 1440);
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
