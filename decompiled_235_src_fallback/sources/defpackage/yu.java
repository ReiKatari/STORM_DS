package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu  reason: default package */
/* loaded from: classes.dex */
public class yu {
    public defpackage.en6 a;
    public float b;
    public final java.util.ArrayList c;
    public final defpackage.qu d;
    public boolean e;

    public yu(defpackage.bt r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.e = r0
            qu r0 = new qu
            r0.<init>(r1, r2)
            r1.d = r0
            return
    }

    public final void a(defpackage.jv3 r3, int r4) {
            r2 = this;
            en6 r0 = r3.j(r4)
            r1 = 1065353216(0x3f800000, float:1.0)
            qu r2 = r2.d
            r2.g(r0, r1)
            en6 r3 = r3.j(r4)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.g(r3, r4)
            return
    }

    public final void b(defpackage.en6 r3, defpackage.en6 r4, defpackage.en6 r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.b = r6
        Lb:
            qu r2 = r2.d
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L1d
            r2.g(r3, r1)
            r2.g(r4, r6)
            r2.g(r5, r6)
            return
        L1d:
            r2.g(r3, r6)
            r2.g(r4, r1)
            r2.g(r5, r1)
            return
    }

    public final void c(defpackage.en6 r3, defpackage.en6 r4, defpackage.en6 r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.b = r6
        Lb:
            qu r2 = r2.d
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L1d
            r2.g(r3, r1)
            r2.g(r4, r6)
            r2.g(r5, r1)
            return
        L1d:
            r2.g(r3, r6)
            r2.g(r4, r1)
            r2.g(r5, r6)
            return
    }

    public defpackage.en6 d(boolean[] r2) {
            r1 = this;
            r0 = 0
            en6 r1 = r1.f(r2, r0)
            return r1
    }

    public boolean e() {
            r2 = this;
            en6 r0 = r2.a
            if (r0 != 0) goto L15
            float r0 = r2.b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            qu r2 = r2.d
            int r2 = r2.d()
            if (r2 != 0) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public final defpackage.en6 f(boolean[] r10, defpackage.en6 r11) {
            r9 = this;
            qu r9 = r9.d
            int r0 = r9.d()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
        La:
            if (r3 >= r0) goto L35
            float r5 = r9.f(r3)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 >= 0) goto L32
            en6 r6 = r9.e(r3)
            if (r10 == 0) goto L20
            int r7 = r6.B
            boolean r7 = r10[r7]
            if (r7 != 0) goto L32
        L20:
            if (r6 == r11) goto L32
            dn6 r7 = r6.e0
            dn6 r8 = defpackage.dn6.SLACK
            if (r7 == r8) goto L2c
            dn6 r8 = defpackage.dn6.ERROR
            if (r7 != r8) goto L32
        L2c:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 >= 0) goto L32
            r4 = r5
            r2 = r6
        L32:
            int r3 = r3 + 1
            goto La
        L35:
            return r2
    }

    public final void g(defpackage.en6 r6) {
            r5 = this;
            en6 r0 = r5.a
            r1 = -1
            qu r2 = r5.d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L13
            r2.g(r0, r3)
            en6 r0 = r5.a
            r0.L = r1
            r0 = 0
            r5.a = r0
        L13:
            r0 = 1
            float r0 = r2.h(r6, r0)
            float r0 = r0 * r3
            r5.a = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 != 0) goto L22
            return
        L22:
            float r6 = r5.b
            float r6 = r6 / r0
            r5.b = r6
            int r5 = r2.h
            r6 = 0
        L2a:
            if (r5 == r1) goto L3e
            int r3 = r2.a
            if (r6 >= r3) goto L3e
            float[] r3 = r2.g
            r4 = r3[r5]
            float r4 = r4 / r0
            r3[r5] = r4
            int[] r3 = r2.f
            r5 = r3[r5]
            int r6 = r6 + 1
            goto L2a
        L3e:
            return
    }

    public final void h(defpackage.jv3 r5, defpackage.en6 r6, boolean r7) {
            r4 = this;
            boolean r0 = r6.Y
            if (r0 != 0) goto L5
            goto L26
        L5:
            qu r0 = r4.d
            float r1 = r0.c(r6)
            float r2 = r4.b
            float r3 = r6.X
            float r3 = r3 * r1
            float r3 = r3 + r2
            r4.b = r3
            r0.h(r6, r7)
            if (r7 == 0) goto L1b
            r6.b(r4)
        L1b:
            int r6 = r0.d()
            if (r6 != 0) goto L26
            r6 = 1
            r4.e = r6
            r5.b = r6
        L26:
            return
    }

    public void i(defpackage.jv3 r8, defpackage.yu r9, boolean r10) {
            r7 = this;
            qu r0 = r7.d
            r0.getClass()
            en6 r1 = r9.a
            float r1 = r0.c(r1)
            en6 r2 = r9.a
            r0.h(r2, r10)
            qu r2 = r9.d
            int r3 = r2.d()
            r4 = 0
        L17:
            if (r4 >= r3) goto L28
            en6 r5 = r2.e(r4)
            float r6 = r2.c(r5)
            float r6 = r6 * r1
            r0.a(r5, r6, r10)
            int r4 = r4 + 1
            goto L17
        L28:
            float r2 = r7.b
            float r3 = r9.b
            float r3 = r3 * r1
            float r3 = r3 + r2
            r7.b = r3
            if (r10 == 0) goto L37
            en6 r9 = r9.a
            r9.b(r7)
        L37:
            en6 r9 = r7.a
            if (r9 == 0) goto L46
            int r9 = r0.d()
            if (r9 != 0) goto L46
            r9 = 1
            r7.e = r9
            r8.b = r9
        L46:
            return
    }

    public java.lang.String toString() {
            r10 = this;
            en6 r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            en6 r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.lb1.s(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            qu r10 = r10.d
            int r5 = r10.d()
        L3c:
            if (r3 >= r5) goto L98
            en6 r6 = r10.e(r3)
            if (r6 != 0) goto L45
            goto L95
        L45:
            float r7 = r10.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L4e
            goto L95
        L4e:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L62
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L72
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
        L60:
            float r7 = r7 * r9
            goto L72
        L62:
            if (r8 <= 0) goto L6b
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L72
        L6b:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
            goto L60
        L72:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L7d
            java.lang.String r0 = r0.concat(r6)
            goto L94
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L94:
            r1 = r4
        L95:
            int r3 = r3 + 1
            goto L3c
        L98:
            if (r1 != 0) goto La1
            java.lang.String r10 = "0.0"
            java.lang.String r10 = r0.concat(r10)
            return r10
        La1:
            return r0
    }
}
