package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wc1  reason: default package */
/* loaded from: classes.dex */
public final class wc1 implements gw4 {
    public gw4 a;

    public static void a(wc1 wc1Var, gw4 gw4Var) {
        if (wc1Var.a == null) {
            wc1Var.a = gw4Var;
        } else {
            f81.o();
        }
    }

    @Override // defpackage.fw4
    public final Object get() {
        gw4 gw4Var = this.a;
        if (gw4Var != null) {
            return gw4Var.get();
        }
        f81.o();
        return null;
    }
}
