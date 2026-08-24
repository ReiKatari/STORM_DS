package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ka0  reason: default package */
/* loaded from: classes.dex */
public final class ka0 {
    public boolean a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;

    public void a() {
            r2 = this;
            java.lang.Object r0 = r2.e
            la0 r0 = (defpackage.la0) r0
            monitor-enter(r0)
            boolean r1 = r2.a     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = 1
            r2.a = r1     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            java.lang.Object r0 = r2.c
            ui6 r0 = (defpackage.ui6) r0
            defpackage.yy7.b(r0)
            java.lang.Object r2 = r2.b     // Catch: java.io.IOException -> L1d
            bk1 r2 = (defpackage.bk1) r2     // Catch: java.io.IOException -> L1d
            r2.a()     // Catch: java.io.IOException -> L1d
        L1d:
            return
        L1e:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public int b(defpackage.ap3 r19, defpackage.te r20, boolean r21) {
            r18 = this;
            r1 = r18
            java.lang.Object r0 = r1.c
            wx2 r0 = (defpackage.wx2) r0
            java.lang.Object r2 = r1.e
            zx2 r2 = (defpackage.zx2) r2
            boolean r3 = r1.a
            r4 = 0
            if (r3 == 0) goto L10
            return r4
        L10:
            r3 = 1
            r1.a = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r1.d     // Catch: java.lang.Throwable -> L3c
            s63 r5 = (defpackage.s63) r5     // Catch: java.lang.Throwable -> L3c
            r6 = r19
            r7 = r20
            yc1 r5 = r5.y(r6, r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = r5.A     // Catch: java.lang.Throwable -> L3c
            hz3 r6 = (defpackage.hz3) r6     // Catch: java.lang.Throwable -> L3c
            int r7 = r6.i()     // Catch: java.lang.Throwable -> L3c
            r8 = r4
        L28:
            if (r8 >= r7) goto L41
            java.lang.Object r9 = r6.j(r8)     // Catch: java.lang.Throwable -> L3c
            vy4 r9 = (defpackage.vy4) r9     // Catch: java.lang.Throwable -> L3c
            boolean r10 = r9.d     // Catch: java.lang.Throwable -> L3c
            if (r10 != 0) goto L3f
            boolean r9 = r9.h     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L39
            goto L3f
        L39:
            int r8 = r8 + 1
            goto L28
        L3c:
            r0 = move-exception
            goto Lcf
        L3f:
            r7 = r4
            goto L42
        L41:
            r7 = r3
        L42:
            int r8 = r6.i()     // Catch: java.lang.Throwable -> L3c
            r9 = r4
        L47:
            if (r9 >= r8) goto L83
            java.lang.Object r10 = r6.j(r9)     // Catch: java.lang.Throwable -> L3c
            vy4 r10 = (defpackage.vy4) r10     // Catch: java.lang.Throwable -> L3c
            if (r7 != 0) goto L57
            boolean r11 = defpackage.ej2.n(r10)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L80
        L57:
            java.lang.Object r11 = r1.b     // Catch: java.lang.Throwable -> L3c
            r12 = r11
            sm3 r12 = (defpackage.sm3) r12     // Catch: java.lang.Throwable -> L3c
            long r13 = r10.c     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r11 = r1.e     // Catch: java.lang.Throwable -> L3c
            r15 = r11
            zx2 r15 = (defpackage.zx2) r15     // Catch: java.lang.Throwable -> L3c
            int r11 = r10.i     // Catch: java.lang.Throwable -> L3c
            r17 = 1
            r16 = r11
            r12.A(r13, r15, r16, r17)     // Catch: java.lang.Throwable -> L3c
            ca4 r11 = r2.A     // Catch: java.lang.Throwable -> L3c
            boolean r11 = r11.h()     // Catch: java.lang.Throwable -> L3c
            if (r11 != 0) goto L80
            long r11 = r10.a     // Catch: java.lang.Throwable -> L3c
            boolean r10 = defpackage.ej2.n(r10)     // Catch: java.lang.Throwable -> L3c
            r0.a(r11, r2, r10)     // Catch: java.lang.Throwable -> L3c
            r2.clear()     // Catch: java.lang.Throwable -> L3c
        L80:
            int r9 = r9 + 1
            goto L47
        L83:
            r2 = r21
            boolean r0 = r0.b(r5, r2)     // Catch: java.lang.Throwable -> L3c
            int r2 = r6.i()     // Catch: java.lang.Throwable -> L3c
            r5 = r4
        L8e:
            if (r5 >= r2) goto Lad
            java.lang.Object r7 = r6.j(r5)     // Catch: java.lang.Throwable -> L3c
            vy4 r7 = (defpackage.vy4) r7     // Catch: java.lang.Throwable -> L3c
            long r8 = defpackage.ej2.R(r7, r3)     // Catch: java.lang.Throwable -> L3c
            r10 = 0
            boolean r8 = defpackage.jk4.c(r8, r10)     // Catch: java.lang.Throwable -> L3c
            if (r8 != 0) goto Laa
            boolean r7 = r7.c()     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto Laa
            r2 = r3
            goto Lae
        Laa:
            int r5 = r5 + 1
            goto L8e
        Lad:
            r2 = r4
        Lae:
            int r5 = r6.i()     // Catch: java.lang.Throwable -> L3c
            r7 = r4
        Lb3:
            if (r7 >= r5) goto Lc6
            java.lang.Object r8 = r6.j(r7)     // Catch: java.lang.Throwable -> L3c
            vy4 r8 = (defpackage.vy4) r8     // Catch: java.lang.Throwable -> L3c
            boolean r8 = r8.c()     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto Lc3
            r5 = r3
            goto Lc7
        Lc3:
            int r7 = r7 + 1
            goto Lb3
        Lc6:
            r5 = r4
        Lc7:
            int r2 = r2 << r3
            r0 = r0 | r2
            int r2 = r5 << 2
            r0 = r0 | r2
            r1.a = r4
            return r0
        Lcf:
            r1.a = r4
            throw r0
    }
}
