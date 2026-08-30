package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hk0  reason: default package */
/* loaded from: classes.dex */
public abstract class hk0 {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static volatile Charset d;
    public static volatile Charset e;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        a = forName;
        Charset.forName("UTF-16").getClass();
        Charset forName2 = Charset.forName("UTF-16BE");
        forName2.getClass();
        b = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        forName3.getClass();
        c = forName3;
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
