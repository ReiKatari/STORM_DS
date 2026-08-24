package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm0  reason: default package */
/* loaded from: classes.dex */
public abstract class qm0 {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static volatile Charset e;
    public static volatile Charset f;

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
        Charset forName4 = Charset.forName("US-ASCII");
        forName4.getClass();
        d = forName4;
        Charset.forName("ISO-8859-1").getClass();
    }
}
