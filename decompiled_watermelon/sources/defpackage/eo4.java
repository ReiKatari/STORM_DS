package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eo4  reason: default package */
/* loaded from: classes.dex */
public abstract class eo4 {
    public static final di a;
    public static final so1 b;
    public static final k45 c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (!property.equals("RoboVM")) {
            if (!property.equals("Dalvik")) {
                a = null;
                b = new p75(1);
                c = new k45(23);
                return;
            }
            a = new di();
            b = new p75(0);
            c = new k45(23);
            return;
        }
        a = null;
        b = new so1(19);
        c = new k45(23);
    }
}
