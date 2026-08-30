package defpackage;

import android.view.ViewConfiguration;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oc6  reason: default package */
/* loaded from: classes.dex */
public abstract class oc6 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final x81 a(tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        od1 od1Var = (od1) sk2Var.j(ov0.h);
        boolean c = sk2Var.c(od1Var.b());
        Object L = sk2Var.L();
        if (c || L == su0.a) {
            L = new x81(new dz4(od1Var));
            sk2Var.h0(L);
        }
        return (x81) L;
    }
}
