package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td1  reason: default package */
/* loaded from: classes.dex */
public abstract class td1 {
    public static final ug1 a;

    static {
        String str;
        boolean z;
        ug1 ug1Var;
        int i = xx6.a;
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
            ug1Var = sd1.h0;
        } else {
            xe1 xe1Var = xk1.a;
            jv2 jv2Var = e04.a;
            jv2 jv2Var2 = jv2Var.Y;
            ug1Var = jv2Var;
            if (jv2Var == null) {
                ug1Var = sd1.h0;
            }
        }
        a = ug1Var;
    }
}
