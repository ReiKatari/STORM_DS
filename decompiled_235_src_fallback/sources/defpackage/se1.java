package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: se1  reason: default package */
/* loaded from: classes.dex */
public final class se1 implements defpackage.fu3 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final java.lang.Object L;

    public se1(defpackage.cl4 r1, defpackage.il4 r2, defpackage.ut3 r3) {
            r0 = this;
            r2 = 2
            r0.A = r2
            r0.<init>()
            r0.B = r1
            r0.L = r3
            return
    }

    public se1(defpackage.gu3 r3) {
            r2 = this;
            r0 = 3
            r2.A = r0
            r2.<init>()
            r2.B = r3
            fr0 r0 = defpackage.fr0.c
            java.lang.Class r3 = r3.getClass()
            java.util.HashMap r1 = r0.a
            java.lang.Object r1 = r1.get(r3)
            dr0 r1 = (defpackage.dr0) r1
            if (r1 == 0) goto L19
            goto L1e
        L19:
            r1 = 0
            dr0 r1 = r0.a(r3, r1)
        L1e:
            r2.L = r1
            return
    }

    public se1(defpackage.qe1 r2, defpackage.fu3 r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public se1(defpackage.ut3 r2, defpackage.d56 r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r4, defpackage.st3 r5) {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r1 = r3.B
            java.lang.Object r2 = r3.L
            switch(r0) {
                case 0: goto L57;
                case 1: goto L48;
                case 2: goto L22;
                default: goto L9;
            }
        L9:
            dr0 r2 = (defpackage.dr0) r2
            java.util.HashMap r3 = r2.a
            java.lang.Object r0 = r3.get(r5)
            java.util.List r0 = (java.util.List) r0
            defpackage.dr0.a(r0, r4, r5, r1)
            st3 r0 = defpackage.st3.ON_ANY
            java.lang.Object r3 = r3.get(r0)
            java.util.List r3 = (java.util.List) r3
            defpackage.dr0.a(r3, r4, r5, r1)
            return
        L22:
            cl4 r1 = (defpackage.cl4) r1
            int[] r4 = defpackage.hl4.a
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L44
            r5 = 2
            if (r4 == r5) goto L3f
            r5 = 3
            if (r4 == r5) goto L36
            goto L47
        L36:
            r1.e()
            ut3 r2 = (defpackage.ut3) r2
            r2.c(r3)
            goto L47
        L3f:
            r3 = 0
            r1.g(r3)
            goto L47
        L44:
            r1.g(r5)
        L47:
            return
        L48:
            st3 r4 = defpackage.st3.ON_START
            if (r5 != r4) goto L56
            ut3 r1 = (defpackage.ut3) r1
            r1.c(r3)
            d56 r2 = (defpackage.d56) r2
            r2.d()
        L56:
            return
        L57:
            qe1 r1 = (defpackage.qe1) r1
            int[] r3 = defpackage.re1.a
            int r0 = r5.ordinal()
            r3 = r3[r0]
            switch(r3) {
                case 1: goto L82;
                case 2: goto L7e;
                case 3: goto L7a;
                case 4: goto L76;
                case 5: goto L72;
                case 6: goto L6e;
                case 7: goto L68;
                default: goto L64;
            }
        L64:
            defpackage.i.d()
            goto L8c
        L68:
            java.lang.String r3 = "ON_ANY must not been send by anybody"
            defpackage.i.h(r3)
            goto L8c
        L6e:
            r1.onDestroy(r4)
            goto L85
        L72:
            r1.onStop(r4)
            goto L85
        L76:
            r1.getClass()
            goto L85
        L7a:
            r1.onResume(r4)
            goto L85
        L7e:
            r1.onStart(r4)
            goto L85
        L82:
            r1.getClass()
        L85:
            fu3 r2 = (defpackage.fu3) r2
            if (r2 == 0) goto L8c
            r2.h(r4, r5)
        L8c:
            return
    }
}
