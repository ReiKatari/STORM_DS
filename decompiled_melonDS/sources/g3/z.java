package g3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b  reason: collision with root package name */
    public static final z f5551b = new z();

    /* renamed from: c  reason: collision with root package name */
    public static final z f5552c = new z();

    /* renamed from: d  reason: collision with root package name */
    public static final z f5553d = new z();

    /* renamed from: a  reason: collision with root package name */
    public final p2.b f5554a = new p2.b(new b0[16]);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0048, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(g3.z r12) {
        /*
            r12.getClass()
            g3.z r0 = g3.z.f5551b
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r12 == r0) goto Lc0
            g3.z r0 = g3.z.f5552c
            if (r12 == r0) goto Lbc
            p2.b r12 = r12.f5554a
            int r0 = r12.L
            if (r0 != 0) goto L1b
            java.lang.String r12 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r12)
            return
        L1b:
            java.lang.Object[] r12 = r12.A
            r1 = 0
            r2 = r1
        L1f:
            if (r2 >= r0) goto Lbb
            r3 = r12[r2]
            g3.b0 r3 = (g3.b0) r3
            b3.o r3 = (b3.o) r3
            b3.o r4 = r3.A
            boolean r4 = r4.f1777h0
            if (r4 != 0) goto L32
            java.lang.String r4 = "visitChildren called on an unattached node"
            x3.a.c(r4)
        L32:
            p2.b r4 = new p2.b
            r5 = 16
            b3.o[] r6 = new b3.o[r5]
            r4.<init>(r6)
            b3.o r3 = r3.A
            b3.o r6 = r3.Y
            if (r6 != 0) goto L45
            a4.l.b(r4, r3)
            goto L48
        L45:
            r4.b(r6)
        L48:
            int r3 = r4.L
            if (r3 == 0) goto Lb7
            int r3 = r3 + (-1)
            java.lang.Object r3 = r4.k(r3)
            b3.o r3 = (b3.o) r3
            int r6 = r3.R
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L5e
            a4.l.b(r4, r3)
            goto L48
        L5e:
            if (r3 == 0) goto L48
            int r6 = r3.L
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb4
            r6 = 0
            r7 = r6
        L68:
            if (r3 == 0) goto L48
            boolean r8 = r3 instanceof g3.g0
            if (r8 == 0) goto L78
            g3.g0 r3 = (g3.g0) r3
            r8 = 7
            boolean r3 = r3.V0(r8)
            if (r3 == 0) goto Laf
            goto Lb7
        L78:
            int r8 = r3.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Laf
            boolean r8 = r3 instanceof a4.k
            if (r8 == 0) goto Laf
            r8 = r3
            a4.k r8 = (a4.k) r8
            b3.o r8 = r8.f247j0
            r9 = r1
        L88:
            r10 = 1
            if (r8 == 0) goto Lac
            int r11 = r8.L
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto La9
            int r9 = r9 + 1
            if (r9 != r10) goto L97
            r3 = r8
            goto La9
        L97:
            if (r7 != 0) goto La0
            p2.b r7 = new p2.b
            b3.o[] r10 = new b3.o[r5]
            r7.<init>(r10)
        La0:
            if (r3 == 0) goto La6
            r7.b(r3)
            r3 = r6
        La6:
            r7.b(r8)
        La9:
            b3.o r8 = r8.Y
            goto L88
        Lac:
            if (r9 != r10) goto Laf
            goto L68
        Laf:
            b3.o r3 = a4.l.e(r7)
            goto L68
        Lb4:
            b3.o r3 = r3.Y
            goto L5e
        Lb7:
            int r2 = r2 + 1
            goto L1f
        Lbb:
            return
        Lbc:
            a0.j.p(r1)
            return
        Lc0:
            a0.j.p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.z.a(g3.z):void");
    }
}
