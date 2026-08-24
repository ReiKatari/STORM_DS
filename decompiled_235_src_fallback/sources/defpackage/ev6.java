package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev6  reason: default package */
/* loaded from: classes.dex */
public final class ev6 {
    public final java.util.ArrayList a;

    public ev6() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public static void b(java.util.ArrayList r4, int r5, int[] r6, int r7) {
            int r0 = r6.length
            if (r7 < r0) goto Ld
            java.lang.Object r5 = r6.clone()
            int[] r5 = (int[]) r5
            r4.add(r5)
            return
        Ld:
            r0 = 0
            r1 = r0
        Lf:
            if (r1 >= r5) goto L26
            r2 = r0
        L12:
            if (r2 >= r7) goto L1c
            r3 = r6[r2]
            if (r1 != r3) goto L19
            goto L23
        L19:
            int r2 = r2 + 1
            goto L12
        L1c:
            r6[r7] = r1
            int r2 = r7 + 1
            b(r4, r5, r6, r2)
        L23:
            int r1 = r1 + 1
            goto Lf
        L26:
            return
    }

    public final void a(defpackage.jv6 r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.a
            r0.add(r1)
            return
    }

    public final java.util.List c(java.util.ArrayList r14) {
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lc
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
        Lc:
            int r0 = r14.size()
            java.util.ArrayList r13 = r13.a
            int r1 = r13.size()
            if (r0 == r1) goto L1a
            goto La0
        L1a:
            int r0 = r13.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int[] r2 = new int[r0]
            r3 = 0
            b(r1, r0, r2, r3)
            int r0 = r14.size()
            jv6[] r0 = new defpackage.jv6[r0]
            int r2 = r1.size()
            r4 = r3
        L34:
            if (r4 >= r2) goto La0
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            int[] r5 = (int[]) r5
            r6 = 1
            r7 = r3
            r8 = r6
        L41:
            int r9 = r13.size()
            if (r7 >= r9) goto L99
            r9 = r5[r7]
            int r10 = r14.size()
            if (r9 >= r10) goto L96
            java.lang.Object r9 = r13.get(r7)
            jv6 r9 = (defpackage.jv6) r9
            r10 = r5[r7]
            java.lang.Object r10 = r14.get(r10)
            jv6 r10 = (defpackage.jv6) r10
            r9.getClass()
            r10.getClass()
            fv6 r11 = r10.b
            int r11 = r11.getId()
            fv6 r12 = r9.b
            int r12 = r12.getId()
            if (r11 <= r12) goto L73
        L71:
            r9 = r3
            goto L88
        L73:
            hv6 r11 = r10.a
            hv6 r12 = r9.a
            if (r11 == r12) goto L7a
            goto L71
        L7a:
            tr6 r9 = r9.c
            tr6 r11 = defpackage.tr6.DEFAULT
            if (r9 == r11) goto L87
            tr6 r10 = r10.c
            if (r10 == r11) goto L87
            if (r10 == r9) goto L87
            goto L71
        L87:
            r9 = r6
        L88:
            r8 = r8 & r9
            if (r8 != 0) goto L8c
            goto L99
        L8c:
            r9 = r5[r7]
            java.lang.Object r10 = r13.get(r7)
            jv6 r10 = (defpackage.jv6) r10
            r0[r9] = r10
        L96:
            int r7 = r7 + 1
            goto L41
        L99:
            if (r8 == 0) goto L34
            java.util.List r13 = java.util.Arrays.asList(r0)
            return r13
        La0:
            r13 = 0
            return r13
    }
}
