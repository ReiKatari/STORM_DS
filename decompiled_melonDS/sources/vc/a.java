package vc;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f13781a;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f13782b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f13783c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Charset f13784d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Charset f13785e;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        f13781a = forName;
        Charset.forName("UTF-16").getClass();
        Charset forName2 = Charset.forName("UTF-16BE");
        forName2.getClass();
        f13782b = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        forName3.getClass();
        f13783c = forName3;
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
