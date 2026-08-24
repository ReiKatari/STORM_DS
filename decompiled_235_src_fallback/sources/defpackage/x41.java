package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x41  reason: default package */
/* loaded from: classes.dex */
public final class x41 implements defpackage.if3, defpackage.be3 {
    public final java.lang.reflect.Type a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: x41$a */
    /* loaded from: classes.dex */
    public static final class a extends defpackage.ie7<java.util.List<? extends defpackage.k63>> {
    }

    public x41() {
            r1 = this;
            r1.<init>()
            x41$a r0 = new x41$a
            r0.<init>()
            java.lang.reflect.Type r0 = r0.b
            r1.a = r0
            return
    }

    @Override // defpackage.be3
    public final java.lang.Object a(defpackage.ee3 r2, java.lang.reflect.Type r3, defpackage.j97 r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            boolean r3 = r2 instanceof defpackage.ze3
            r0 = 0
            if (r3 == 0) goto L13
            ze3 r2 = r2.b()
            goto L14
        L13:
            r2 = r0
        L14:
            if (r2 == 0) goto L5c
            aw3 r2 = r2.A
            java.lang.String r3 = "inputMapper"
            java.lang.Object r3 = r2.get(r3)
            ee3 r3 = (defpackage.ee3) r3
            if (r3 == 0) goto L54
            java.lang.reflect.Type r1 = r1.a
            java.lang.Object r1 = r4.d(r3, r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r3 = "slot2AnalogMapping"
            java.lang.Object r2 = r2.get(r3)
            ee3 r2 = (defpackage.ee3) r2
            if (r2 == 0) goto L46
            boolean r3 = r2 instanceof defpackage.ve3
            if (r3 != 0) goto L39
            r0 = r2
        L39:
            if (r0 == 0) goto L46
            java.lang.Class<v41$c> r2 = defpackage.v41.c.class
            java.lang.Object r2 = r4.d(r0, r2)
            v41$c r2 = (defpackage.v41.c) r2
            if (r2 == 0) goto L46
            goto L4b
        L46:
            v41$c r2 = new v41$c
            r2.<init>()
        L4b:
            v41 r3 = new v41
            r1.getClass()
            r3.<init>(r1, r2)
            return r3
        L54:
            ug r1 = new ug
            java.lang.String r2 = "Missing controller configuration field 'inputMapper'"
            r1.<init>(r2)
            throw r1
        L5c:
            ug r1 = new ug
            java.lang.String r2 = "Controller configuration must be an object"
            r1.<init>(r2)
            throw r1
    }

    @Override // defpackage.if3
    public final defpackage.ee3 b(java.lang.Object r5, java.lang.reflect.Type r6, defpackage.j97 r7) {
            r4 = this;
            v41 r5 = (defpackage.v41) r5
            r5.getClass()
            r6.getClass()
            r7.getClass()
            ze3 r6 = new ze3
            r6.<init>()
            java.util.List r0 = r5.a
            java.lang.Object r7 = r7.B
            yb7 r7 = (defpackage.yb7) r7
            su2 r1 = r7.c
            r1.getClass()
            tf3 r2 = new tf3
            r2.<init>()
            java.lang.reflect.Type r4 = r4.a
            r1.g(r0, r4, r2)
            java.util.ArrayList r4 = r2.k0
            boolean r0 = r4.isEmpty()
            r1 = 0
            java.lang.String r3 = "Expected one JSON element but was "
            if (r0 == 0) goto L5c
            ee3 r4 = r2.m0
            java.lang.String r0 = "inputMapper"
            r6.d(r0, r4)
            v41$c r4 = r5.b
            su2 r5 = r7.c
            r5.getClass()
            tf3 r7 = new tf3
            r7.<init>()
            java.lang.Class<v41$c> r0 = defpackage.v41.c.class
            r5.g(r4, r0, r7)
            java.util.ArrayList r4 = r7.k0
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L58
            ee3 r4 = r7.m0
            java.lang.String r5 = "slot2AnalogMapping"
            r6.d(r5, r4)
            return r6
        L58:
            defpackage.e41.y(r4, r3)
            return r1
        L5c:
            defpackage.e41.y(r4, r3)
            return r1
    }
}
