package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t66  reason: default package */
/* loaded from: classes.dex */
public final class t66 implements gw4 {
    public static final Object c = new Object();
    public volatile gw4 a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v2, types: [t66, gw4, java.lang.Object] */
    public static gw4 a(gw4 gw4Var) {
        if (!(gw4Var instanceof t66)) {
            if (gw4Var instanceof ai1) {
                return gw4Var;
            }
            ?? obj = new Object();
            obj.b = c;
            obj.a = gw4Var;
            return obj;
        }
        return gw4Var;
    }

    @Override // defpackage.fw4
    public final Object get() {
        Object obj = this.b;
        if (obj == c) {
            gw4 gw4Var = this.a;
            if (gw4Var == null) {
                return this.b;
            }
            Object obj2 = gw4Var.get();
            this.b = obj2;
            this.a = null;
            return obj2;
        }
        return obj;
    }
}
