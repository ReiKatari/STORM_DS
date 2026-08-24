package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih5  reason: default package */
/* loaded from: classes.dex */
public final class ih5 extends defpackage.kh5 {
    public final /* synthetic */ java.lang.reflect.Method b;

    public ih5(java.lang.reflect.Method r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // defpackage.kh5
    public final boolean a(java.lang.Object r1, java.lang.reflect.AccessibleObject r2) {
            r0 = this;
            java.lang.reflect.Method r0 = r0.b     // Catch: java.lang.Exception -> L11
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L11
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L11
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L11
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.String r1 = "Failed invoking canAccess"
            defpackage.u34.p(r1, r0)
            r0 = 0
            return r0
    }
}
