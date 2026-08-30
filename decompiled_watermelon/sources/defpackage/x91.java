package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x91  reason: default package */
/* loaded from: classes.dex */
public abstract class x91 {
    public static final sc1 a;

    static {
        String str;
        boolean z;
        sc1 sc1Var;
        int i = bm6.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            sc1Var = w91.g0;
        } else {
            bb1 bb1Var = tg1.a;
            ip2 ip2Var = bt3.a;
            ip2 ip2Var2 = ip2Var.Y;
            sc1Var = ip2Var;
            if (ip2Var == null) {
                sc1Var = w91.g0;
            }
        }
        a = sc1Var;
    }
}
