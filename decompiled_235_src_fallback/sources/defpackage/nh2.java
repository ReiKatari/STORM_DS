package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh2  reason: default package */
/* loaded from: classes.dex */
public final class nh2 {
    public static final defpackage.nh2 b = null;
    public static final defpackage.nh2 c = null;
    public static final defpackage.nh2 d = null;
    public final defpackage.ua4 a;

    static {
            nh2 r0 = new nh2
            r0.<init>()
            defpackage.nh2.b = r0
            nh2 r0 = new nh2
            r0.<init>()
            defpackage.nh2.c = r0
            nh2 r0 = new nh2
            r0.<init>()
            defpackage.nh2.d = r0
            return
    }

    public nh2() {
            r2 = this;
            r2.<init>()
            ua4 r0 = new ua4
            r1 = 16
            ph2[] r1 = new defpackage.ph2[r1]
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public static boolean a(defpackage.nh2 r13) {
            r13.getClass()
            nh2 r0 = defpackage.nh2.b
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            r2 = 0
            if (r13 == r0) goto Lc5
            nh2 r0 = defpackage.nh2.c
            if (r13 == r0) goto Lc1
            ua4 r13 = r13.a
            int r0 = r13.L
            if (r0 != 0) goto L1c
            java.lang.String r13 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r13)
            return r2
        L1c:
            java.lang.Object[] r13 = r13.A
            r1 = r2
            r3 = r1
        L20:
            if (r1 >= r0) goto Lc0
            r4 = r13[r1]
            ph2 r4 = (defpackage.ph2) r4
            r5 = r4
            z64 r5 = (defpackage.z64) r5
            z64 r5 = r5.A
            boolean r5 = r5.j0
            if (r5 != 0) goto L34
            java.lang.String r5 = "visitChildren called on an unattached node"
            defpackage.p53.c(r5)
        L34:
            ua4 r5 = new ua4
            r6 = 16
            z64[] r7 = new defpackage.z64[r6]
            r5.<init>(r7)
            z64 r4 = (defpackage.z64) r4
            z64 r4 = r4.A
            z64 r7 = r4.Y
            if (r7 != 0) goto L49
            defpackage.nc1.z(r5, r4)
            goto L4c
        L49:
            r5.b(r7)
        L4c:
            int r4 = r5.L
            if (r4 == 0) goto Lbc
            int r4 = r4 + (-1)
            java.lang.Object r4 = r5.l(r4)
            z64 r4 = (defpackage.z64) r4
            int r7 = r4.R
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 != 0) goto L62
            defpackage.nc1.z(r5, r4)
            goto L4c
        L62:
            if (r4 == 0) goto L4c
            int r7 = r4.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto Lb9
            r7 = 0
            r8 = r7
        L6c:
            if (r4 == 0) goto L4c
            boolean r9 = r4 instanceof defpackage.vh2
            r10 = 1
            if (r9 == 0) goto L7e
            vh2 r4 = (defpackage.vh2) r4
            r9 = 7
            boolean r4 = r4.Y0(r9)
            if (r4 == 0) goto Lb4
            r3 = r10
            goto Lbc
        L7e:
            int r9 = r4.L
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Lb4
            boolean r9 = r4 instanceof defpackage.zg1
            if (r9 == 0) goto Lb4
            r9 = r4
            zg1 r9 = (defpackage.zg1) r9
            z64 r9 = r9.l0
            r11 = r2
        L8e:
            if (r9 == 0) goto Lb1
            int r12 = r9.L
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto Lae
            int r11 = r11 + 1
            if (r11 != r10) goto L9c
            r4 = r9
            goto Lae
        L9c:
            if (r8 != 0) goto La5
            ua4 r8 = new ua4
            z64[] r12 = new defpackage.z64[r6]
            r8.<init>(r12)
        La5:
            if (r4 == 0) goto Lab
            r8.b(r4)
            r4 = r7
        Lab:
            r8.b(r9)
        Lae:
            z64 r9 = r9.Y
            goto L8e
        Lb1:
            if (r11 != r10) goto Lb4
            goto L6c
        Lb4:
            z64 r4 = defpackage.nc1.A(r8)
            goto L6c
        Lb9:
            z64 r4 = r4.Y
            goto L62
        Lbc:
            int r1 = r1 + 1
            goto L20
        Lc0:
            return r3
        Lc1:
            defpackage.i.m(r1)
            return r2
        Lc5:
            defpackage.i.m(r1)
            return r2
    }
}
