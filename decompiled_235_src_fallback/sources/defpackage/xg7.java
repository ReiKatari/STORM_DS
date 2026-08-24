package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg7  reason: default package */
/* loaded from: classes.dex */
public final class xg7 extends defpackage.ah7 {
    public final /* synthetic */ java.lang.reflect.Method b;
    public final /* synthetic */ int c;

    public xg7(java.lang.reflect.Method r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            return
    }

    @Override // defpackage.ah7
    public final java.lang.Object a(java.lang.Class r2) {
            r1 = this;
            java.lang.String r0 = defpackage.ci.i(r2)
            if (r0 != 0) goto L18
            int r0 = r1.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.reflect.Method r1 = r1.b
            r0 = 0
            java.lang.Object r1 = r1.invoke(r0, r2)
            return r1
        L18:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "UnsafeAllocator is used for non-instantiable type: "
            java.lang.String r2 = r2.concat(r0)
            r1.<init>(r2)
            throw r1
    }
}
