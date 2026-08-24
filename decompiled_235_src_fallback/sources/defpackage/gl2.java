package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl2  reason: default package */
/* loaded from: classes.dex */
public final class gl2 {
    public static final defpackage.ci6 b = null;
    public final /* synthetic */ androidx.fragment.app.u a;

    static {
            ci6 r0 = new ci6
            r1 = 0
            r0.<init>(r1)
            defpackage.gl2.b = r0
            return
    }

    public gl2(androidx.fragment.app.u r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.Class b(java.lang.String r3, java.lang.ClassLoader r4) {
            ci6 r0 = defpackage.gl2.b
            java.lang.Object r1 = r0.get(r4)
            ci6 r1 = (defpackage.ci6) r1
            r2 = 0
            if (r1 != 0) goto L13
            ci6 r1 = new ci6
            r1.<init>(r2)
            r0.put(r4, r1)
        L13:
            java.lang.Object r0 = r1.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L23
            java.lang.Class r4 = java.lang.Class.forName(r3, r2, r4)
            r1.put(r3, r4)
            return r4
        L23:
            return r0
    }

    public static java.lang.Class c(java.lang.String r3, java.lang.ClassLoader r4) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r3 = b(r3, r4)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L14
            return r3
        L7:
            r4 = move-exception
            ug r1 = new ug
            java.lang.String r2 = ": make sure class is a valid subclass of Fragment"
            java.lang.String r3 = defpackage.lb1.A(r0, r3, r2)
            r1.<init>(r3, r4)
            throw r1
        L14:
            r4 = move-exception
            ug r1 = new ug
            java.lang.String r2 = ": make sure class name exists"
            java.lang.String r3 = defpackage.lb1.A(r0, r3, r2)
            r1.<init>(r3, r4)
            throw r1
    }

    public final androidx.fragment.app.o a(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.u r1 = r1.a
            cl2 r1 = r1.w
            jq r1 = r1.B
            r0 = 0
            androidx.fragment.app.o r1 = androidx.fragment.app.o.instantiate(r1, r2, r0)
            return r1
    }
}
