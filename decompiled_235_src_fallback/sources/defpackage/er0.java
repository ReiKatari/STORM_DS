package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er0  reason: default package */
/* loaded from: classes.dex */
public final class er0 {
    public final int a;
    public final java.lang.reflect.Method b;

    public er0(java.lang.reflect.Method r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            r0 = 1
            r1.setAccessible(r0)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L22
        L3:
            boolean r0 = r3 instanceof defpackage.er0
            if (r0 != 0) goto L8
            goto L24
        L8:
            er0 r3 = (defpackage.er0) r3
            int r0 = r2.a
            int r1 = r3.a
            if (r0 != r1) goto L24
            java.lang.reflect.Method r2 = r2.b
            java.lang.String r2 = r2.getName()
            java.lang.reflect.Method r3 = r3.b
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r1.b
            java.lang.String r1 = r1.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
