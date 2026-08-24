package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac3  reason: default package */
/* loaded from: classes.dex */
public final class ac3 {
    public final java.lang.Object a;
    public final java.lang.reflect.Method b;
    public final java.util.List c;

    public ac3(java.lang.Object r1, java.lang.reflect.Method r2, java.util.ArrayList r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r0.c = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Class<yr2> r0 = defpackage.yr2.class
            java.lang.String r0 = r0.getName()
            java.lang.reflect.Method r1 = r2.b
            java.lang.String r1 = r1.getName()
            java.util.List r2 = r2.c
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r0 = "%s.%s() %s"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            return r2
    }
}
