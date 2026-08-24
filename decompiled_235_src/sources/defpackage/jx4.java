package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx4  reason: default package */
/* loaded from: classes.dex */
public abstract class jx4 {
    public static final pi a;
    public static final jd1 b;
    public static final vs0 c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (!property.equals("RoboVM")) {
            if (!property.equals("Dalvik")) {
                a = null;
                b = new fh5(1);
                c = new vs0(25);
                return;
            }
            a = new pi();
            b = new fh5(0);
            c = new vs0(25);
            return;
        }
        a = null;
        b = new jd1(21);
        c = new vs0(25);
    }
}
