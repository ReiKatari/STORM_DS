package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp  reason: default package */
/* loaded from: classes.dex */
public abstract class gp {
    public static final defpackage.fp a = null;

    static {
            fp r0 = new fp
            java.lang.String r1 = ""
            r0.<init>(r1)
            defpackage.gp.a = r0
            return
    }

    public static final java.util.List a(defpackage.fp r8, int r9, int r10, defpackage.k4 r11) {
            if (r9 != r10) goto L3
            goto L7
        L3:
            java.util.List r0 = r8.A
            if (r0 != 0) goto L9
        L7:
            r8 = 0
            return r8
        L9:
            r1 = 0
            if (r9 != 0) goto L42
            java.lang.String r8 = r8.B
            int r8 = r8.length()
            if (r10 < r8) goto L42
            if (r11 != 0) goto L17
            return r0
        L17:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = r0.size()
            r8.<init>(r9)
            int r9 = r0.size()
        L24:
            if (r1 >= r9) goto L41
            java.lang.Object r10 = r0.get(r1)
            r2 = r10
            ep r2 = (defpackage.ep) r2
            java.lang.Object r2 = r2.a
            java.lang.Object r2 = r11.g(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3e
            r8.add(r10)
        L3e:
            int r1 = r1 + 1
            goto L24
        L41:
            return r8
        L42:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = r0.size()
            r8.<init>(r2)
            int r2 = r0.size()
        L4f:
            if (r1 >= r2) goto L90
            java.lang.Object r3 = r0.get(r1)
            ep r3 = (defpackage.ep) r3
            if (r11 == 0) goto L66
            java.lang.Object r4 = r3.a
            java.lang.Object r4 = r11.g(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L67
        L66:
            r4 = 1
        L67:
            if (r4 == 0) goto L8d
            int r4 = r3.b
            int r5 = r3.c
            boolean r4 = b(r9, r10, r4, r5)
            if (r4 == 0) goto L8d
            java.lang.String r4 = r3.d
            java.lang.Object r6 = r3.a
            bp r6 = (defpackage.bp) r6
            int r3 = r3.b
            int r3 = defpackage.gi2.q(r3, r9, r10)
            int r3 = r3 - r9
            int r5 = defpackage.gi2.q(r5, r9, r10)
            int r5 = r5 - r9
            ep r7 = new ep
            r7.<init>(r6, r3, r5, r4)
            r8.add(r7)
        L8d:
            int r1 = r1 + 1
            goto L4f
        L90:
            return r8
    }

    public static final boolean b(int r4, int r5, int r6, int r7) {
            r0 = 0
            r1 = 1
            if (r4 != r5) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            if (r6 != r7) goto Lb
            r3 = r1
            goto Lc
        Lb:
            r3 = r0
        Lc:
            r2 = r2 | r3
            if (r4 != r6) goto L11
            r3 = r1
            goto L12
        L11:
            r3 = r0
        L12:
            r2 = r2 & r3
            if (r4 >= r7) goto L17
            r4 = r1
            goto L18
        L17:
            r4 = r0
        L18:
            if (r6 >= r5) goto L1b
            r0 = r1
        L1b:
            r4 = r4 & r0
            r4 = r4 | r2
            return r4
    }
}
