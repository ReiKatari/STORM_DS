package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qh5  reason: default package */
/* loaded from: classes.dex */
public final class qh5 {
    public final java.lang.String a;
    public final java.lang.reflect.Field b;
    public final java.lang.String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ java.lang.reflect.Method e;
    public final /* synthetic */ defpackage.yc7 f;
    public final /* synthetic */ defpackage.yc7 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public qh5(java.lang.String r1, java.lang.reflect.Field r2, boolean r3, java.lang.reflect.Method r4, defpackage.yc7 r5, defpackage.yc7 r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>()
            r0.d = r3
            r0.e = r4
            r0.f = r5
            r0.g = r6
            r0.h = r7
            r0.i = r8
            r0.a = r1
            r0.b = r2
            java.lang.String r1 = r2.getName()
            r0.c = r1
            return
    }

    public final void a(defpackage.vf3 r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.d
            java.lang.reflect.Field r1 = r3.b
            java.lang.reflect.Method r2 = r3.e
            if (r0 == 0) goto L11
            if (r2 != 0) goto Le
            defpackage.vh5.b(r5, r1)
            goto L11
        Le:
            defpackage.vh5.b(r5, r2)
        L11:
            if (r2 == 0) goto L31
            r0 = 0
            java.lang.Object r0 = r2.invoke(r5, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L19
            goto L35
        L19:
            r3 = move-exception
            r4 = 0
            java.lang.String r4 = defpackage.oh5.d(r2, r4)
            ne3 r5 = new ne3
            java.lang.String r0 = "Accessor "
            java.lang.String r1 = " threw exception"
            java.lang.String r4 = defpackage.lb1.A(r0, r4, r1)
            java.lang.Throwable r3 = r3.getCause()
            r5.<init>(r4, r3)
            throw r5
        L31:
            java.lang.Object r0 = r1.get(r5)
        L35:
            if (r0 != r5) goto L38
            return
        L38:
            java.lang.String r5 = r3.a
            r4.v(r5)
            yc7 r3 = r3.f
            r3.c(r4, r0)
            return
    }
}
