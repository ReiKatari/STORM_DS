package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip2  reason: default package */
/* loaded from: classes.dex */
public final class ip2 {
    public final defpackage.m16 a;
    public final defpackage.tm0 b;

    public ip2(defpackage.m16 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            tm0 r2 = new tm0
            r0 = 5
            r2.<init>(r0)
            r1.b = r2
            return
    }

    public final void a(defpackage.e36 r20, defpackage.hz3 r21) {
            r19 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1.d()
            if (r2 == 0) goto Lb
            return
        Lb:
            int r2 = r1.i()
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 4
            if (r2 <= r3) goto L1f
            bi2 r2 = new bi2
            r3 = r19
            r2.<init>(r4, r3, r0)
            defpackage.ln2.U(r1, r2)
            return
        L1f:
            java.lang.String r2 = "SELECT `id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled` FROM `cheat` WHERE `cheat_folder_id` IN ("
            java.lang.StringBuilder r2 = defpackage.lb1.s(r2)
            int r3 = r1.i()
            defpackage.gi2.k(r2, r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            j36 r2 = r0.i0(r2)
            int r0 = r1.i()
            r3 = 0
            r5 = 1
            r6 = r3
            r7 = r5
        L41:
            if (r6 >= r0) goto L4e
            long r8 = r1.e(r6)
            r2.c(r7, r8)
            int r7 = r7 + r5
            int r6 = r6 + 1
            goto L41
        L4e:
            java.lang.String r0 = "cheat_folder_id"
            int r0 = defpackage.ej2.A(r2, r0)     // Catch: java.lang.Throwable -> Lb6
            r6 = -1
            if (r0 != r6) goto L5b
            r2.close()
            return
        L5b:
            boolean r6 = r2.f0()     // Catch: java.lang.Throwable -> Lb6
            if (r6 == 0) goto Lb8
            long r6 = r2.getLong(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r6 = r1.b(r6)     // Catch: java.lang.Throwable -> Lb6
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Lb6
            if (r6 == 0) goto L5b
            boolean r7 = r2.isNull(r3)     // Catch: java.lang.Throwable -> Lb6
            r8 = 0
            if (r7 == 0) goto L76
            r10 = r8
            goto L7f
        L76:
            long r9 = r2.getLong(r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lb6
            r10 = r7
        L7f:
            long r11 = r2.getLong(r5)     // Catch: java.lang.Throwable -> Lb6
            r7 = 2
            long r13 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb6
            r7 = 3
            java.lang.String r15 = r2.R(r7)     // Catch: java.lang.Throwable -> Lb6
            boolean r7 = r2.isNull(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto L96
        L93:
            r16 = r8
            goto L9b
        L96:
            java.lang.String r8 = r2.R(r4)     // Catch: java.lang.Throwable -> Lb6
            goto L93
        L9b:
            r7 = 5
            java.lang.String r17 = r2.R(r7)     // Catch: java.lang.Throwable -> Lb6
            r7 = 6
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb6
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto Lab
            r18 = r5
            goto Lad
        Lab:
            r18 = r3
        Lad:
            zm0 r9 = new zm0     // Catch: java.lang.Throwable -> Lb6
            r9.<init>(r10, r11, r13, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lb6
            r6.add(r9)     // Catch: java.lang.Throwable -> Lb6
            goto L5b
        Lb6:
            r0 = move-exception
            goto Lbc
        Lb8:
            r2.close()
            return
        Lbc:
            r2.close()
            throw r0
    }

    public final java.lang.Object b(java.lang.String r3, defpackage.s41 r4) {
            r2 = this;
            c70 r0 = new c70
            r1 = 7
            r0.<init>(r3, r1)
            m16 r2 = r2.a
            r3 = 1
            r1 = 0
            java.lang.Object r2 = defpackage.hv.S(r4, r2, r3, r1, r0)
            return r2
    }

    public final java.lang.Object c(java.lang.String r3, defpackage.s41 r4) {
            r2 = this;
            c70 r0 = new c70
            r1 = 8
            r0.<init>(r3, r1)
            m16 r2 = r2.a
            r3 = 1
            r1 = 0
            java.lang.Object r2 = defpackage.hv.S(r4, r2, r3, r1, r0)
            return r2
    }
}
