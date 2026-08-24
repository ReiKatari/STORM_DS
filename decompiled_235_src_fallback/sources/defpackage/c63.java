package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c63  reason: default package */
/* loaded from: classes.dex */
public final class c63 implements defpackage.if3, defpackage.be3 {
    public c63() {
            r0 = this;
            r0.<init>()
            return
    }

    public static defpackage.ee3 c(defpackage.ze3 r2, java.lang.String r3) {
            aw3 r2 = r2.A
            java.lang.Object r2 = r2.get(r3)
            ee3 r2 = (defpackage.ee3) r2
            if (r2 == 0) goto Lb
            return r2
        Lb:
            ug r2 = new ug
            java.lang.String r0 = "Missing input assignment field '"
            java.lang.String r1 = "'"
            java.lang.String r3 = defpackage.lb1.A(r0, r3, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // defpackage.be3
    public final java.lang.Object a(defpackage.ee3 r10, java.lang.reflect.Type r11, defpackage.j97 r12) {
            r9 = this;
            r10.getClass()
            r11.getClass()
            r12.getClass()
            boolean r9 = r10 instanceof defpackage.ze3
            r11 = 0
            if (r9 == 0) goto L13
            ze3 r9 = r10.b()
            goto L14
        L13:
            r9 = r11
        L14:
            if (r9 == 0) goto Ld4
            aw3 r10 = r9.A
            java.lang.String r0 = "type"
            java.lang.Object r0 = r10.get(r0)
            ee3 r0 = (defpackage.ee3) r0
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.c()
            goto L28
        L27:
            r0 = r11
        L28:
            java.lang.String r1 = "none"
            java.lang.String r2 = "axis"
            java.lang.String r3 = "axisCode"
            java.lang.String r4 = "key"
            java.lang.String r5 = "keyCode"
            if (r0 == 0) goto L3a
            boolean r6 = defpackage.qs6.v0(r0)
            if (r6 == 0) goto L4b
        L3a:
            boolean r0 = r10.containsKey(r5)
            if (r0 == 0) goto L42
            r0 = r4
            goto L4b
        L42:
            boolean r0 = r10.containsKey(r3)
            if (r0 == 0) goto L4a
            r0 = r2
            goto L4b
        L4a:
            r0 = r1
        L4b:
            int r6 = r0.hashCode()
            r7 = 106079(0x19e5f, float:1.48648E-40)
            java.lang.String r8 = "deviceId"
            if (r6 == r7) goto La3
            r4 = 3008417(0x2de7a1, float:4.21569E-39)
            if (r6 == r4) goto L69
            r9 = 3387192(0x33af38, float:4.746467E-39)
            if (r6 != r9) goto Lcc
            boolean r9 = r0.equals(r1)
            if (r9 == 0) goto Lcc
            k63$b$d r9 = defpackage.k63.b.d.INSTANCE
            return r9
        L69:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lcc
            k63$b$a r0 = new k63$b$a
            java.lang.Object r10 = r10.get(r8)
            ee3 r10 = (defpackage.ee3) r10
            if (r10 == 0) goto L86
            boolean r1 = r10 instanceof defpackage.ve3
            if (r1 == 0) goto L7e
            goto L86
        L7e:
            int r10 = r10.a()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
        L86:
            ee3 r10 = c(r9, r3)
            int r10 = r10.a()
            java.lang.String r1 = "direction"
            ee3 r9 = c(r9, r1)
            java.lang.Class<d63> r1 = defpackage.d63.class
            java.lang.Object r9 = r12.d(r9, r1)
            r9.getClass()
            d63 r9 = (defpackage.d63) r9
            r0.<init>(r11, r10, r9)
            return r0
        La3:
            boolean r12 = r0.equals(r4)
            if (r12 == 0) goto Lcc
            k63$b$c r12 = new k63$b$c
            java.lang.Object r10 = r10.get(r8)
            ee3 r10 = (defpackage.ee3) r10
            if (r10 == 0) goto Lc0
            boolean r0 = r10 instanceof defpackage.ve3
            if (r0 == 0) goto Lb8
            goto Lc0
        Lb8:
            int r10 = r10.a()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
        Lc0:
            ee3 r9 = c(r9, r5)
            int r9 = r9.a()
            r12.<init>(r9, r11)
            return r12
        Lcc:
            ug r9 = new ug
            java.lang.String r10 = "Unknown input assignment type"
            r9.<init>(r10)
            throw r9
        Ld4:
            ug r9 = new ug
            java.lang.String r10 = "Input assignment must be an object"
            r9.<init>(r10)
            throw r9
    }

    @Override // defpackage.if3
    public final defpackage.ee3 b(java.lang.Object r6, java.lang.reflect.Type r7, defpackage.j97 r8) {
            r5 = this;
            k63$b r6 = (defpackage.k63.b) r6
            r6.getClass()
            r7.getClass()
            r8.getClass()
            ze3 r5 = new ze3
            r5.<init>()
            boolean r7 = r6 instanceof defpackage.k63.b.d
            java.lang.String r0 = "type"
            if (r7 == 0) goto L21
            ef3 r6 = new ef3
            java.lang.String r7 = "none"
            r6.<init>(r7)
            r5.d(r0, r6)
            return r5
        L21:
            boolean r7 = r6 instanceof defpackage.k63.b.c
            java.lang.String r1 = "deviceId"
            ve3 r2 = defpackage.ve3.A
            if (r7 == 0) goto L56
            ef3 r7 = new ef3
            java.lang.String r8 = "key"
            r7.<init>(r8)
            r5.d(r0, r7)
            k63$b$c r6 = (defpackage.k63.b.c) r6
            java.lang.Integer r7 = r6.a
            if (r7 != 0) goto L3d
            r5.d(r1, r2)
            goto L45
        L3d:
            ef3 r8 = new ef3
            r8.<init>(r7)
            r5.d(r1, r8)
        L45:
            ef3 r7 = new ef3
            int r6 = r6.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r6)
            java.lang.String r6 = "keyCode"
            r5.d(r6, r7)
            return r5
        L56:
            boolean r7 = r6 instanceof defpackage.k63.b.a
            r3 = 0
            if (r7 == 0) goto Lb8
            ef3 r7 = new ef3
            java.lang.String r4 = "axis"
            r7.<init>(r4)
            r5.d(r0, r7)
            k63$b$a r6 = (defpackage.k63.b.a) r6
            java.lang.Integer r7 = r6.a
            if (r7 != 0) goto L6f
            r5.d(r1, r2)
            goto L77
        L6f:
            ef3 r0 = new ef3
            r0.<init>(r7)
            r5.d(r1, r0)
        L77:
            ef3 r7 = new ef3
            int r0 = r6.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.<init>(r0)
            java.lang.String r0 = "axisCode"
            r5.d(r0, r7)
            d63 r6 = r6.c
            java.lang.Object r7 = r8.B
            yb7 r7 = (defpackage.yb7) r7
            su2 r7 = r7.c
            if (r6 != 0) goto L95
            r7.getClass()
            goto Lac
        L95:
            r7.getClass()
            tf3 r8 = new tf3
            r8.<init>()
            java.lang.Class<d63> r0 = defpackage.d63.class
            r7.g(r6, r0, r8)
            java.util.ArrayList r6 = r8.k0
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto Lb2
            ee3 r2 = r8.m0
        Lac:
            java.lang.String r6 = "direction"
            r5.d(r6, r2)
            return r5
        Lb2:
            java.lang.String r5 = "Expected one JSON element but was "
            defpackage.e41.y(r6, r5)
            return r3
        Lb8:
            defpackage.i.d()
            return r3
    }
}
