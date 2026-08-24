package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j37  reason: default package */
/* loaded from: classes.dex */
public final class j37 {
    public final defpackage.vs4 a;
    public final defpackage.vs4 b;
    public final defpackage.vs4 c;
    public final defpackage.vs4 d;
    public final defpackage.vs4 e;

    public j37() {
            r5 = this;
            r5.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r5.a = r0
            c37 r0 = new c37
            r1 = 0
            r2 = 7
            r3 = 0
            r0.<init>(r1, r2, r3)
            vs4 r0 = defpackage.np2.Y(r0)
            r5.b = r0
            xh3 r0 = new xh3
            r3 = 0
            r4 = 119(0x77, float:1.67E-43)
            r0.<init>(r3, r3, r2, r4)
            vs4 r0 = defpackage.np2.Y(r0)
            r5.c = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r5.d = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r5.e = r0
            return
    }

    public static void c(defpackage.j37 r7, java.lang.String r8, defpackage.qn2 r9) {
            c5 r0 = new c5
            r1 = 17
            r0.<init>(r1)
            xh3 r1 = new xh3
            r2 = 7
            r3 = 119(0x77, float:1.67E-43)
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r7.getClass()
            r8.getClass()
            vs4 r2 = r7.a
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L25
            return
        L25:
            c37 r3 = new c37
            int r4 = r8.length()
            long r4 = defpackage.jx2.f(r4, r4)
            r6 = 4
            r3.<init>(r8, r6, r4)
            vs4 r8 = r7.b
            r8.setValue(r3)
            vs4 r8 = r7.d
            r8.setValue(r9)
            vs4 r8 = r7.e
            r8.setValue(r0)
            vs4 r7 = r7.c
            r7.setValue(r1)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r2.setValue(r7)
            return
    }

    public final void a() {
            r2 = this;
            vs4 r0 = r2.a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            vs4 r0 = r2.e
            java.lang.Object r1 = r0.getValue()
            on2 r1 = (defpackage.on2) r1
            if (r1 == 0) goto L14
            r1.c()
        L14:
            vs4 r2 = r2.d
            r1 = 0
            r2.setValue(r1)
            r0.setValue(r1)
            return
    }

    public final void b() {
            r3 = this;
            vs4 r0 = r3.d
            java.lang.Object r1 = r0.getValue()
            qn2 r1 = (defpackage.qn2) r1
            if (r1 == 0) goto L19
            vs4 r2 = r3.b
            java.lang.Object r2 = r2.getValue()
            c37 r2 = (defpackage.c37) r2
            fp r2 = r2.a
            java.lang.String r2 = r2.B
            r1.g(r2)
        L19:
            vs4 r1 = r3.a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            r1 = 0
            r0.setValue(r1)
            vs4 r3 = r3.e
            r3.setValue(r1)
            return
    }
}
