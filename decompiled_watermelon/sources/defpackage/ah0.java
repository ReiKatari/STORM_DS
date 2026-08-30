package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ah0  reason: default package */
/* loaded from: classes.dex */
public final class ah0 implements oc2 {
    public static final ah0 a = new Object();
    public static Boolean b;

    @Override // defpackage.oc2
    public final void b() {
        b = Boolean.FALSE;
    }

    @Override // defpackage.oc2
    public final boolean c() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw b31.e("canFocus is read before it is written");
    }
}
