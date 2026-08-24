package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e2  reason: default package */
/* loaded from: classes.dex */
public final class e2 extends defpackage.d2 {
    public static defpackage.e2 e;
    public static defpackage.e2 f;
    public final /* synthetic */ int c;
    public java.text.BreakIterator d;

    public /* synthetic */ e2(int r1) {
            r0 = this;
            r0.c = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.d2
    public final int[] f(int r6) {
            r5 = this;
            int r0 = r5.c
            r1 = 0
            r2 = 0
            java.lang.String r3 = "impl"
            r4 = -1
            switch(r0) {
                case 0: goto L63;
                default: goto La;
            }
        La:
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            if (r0 > 0) goto L15
            goto L5e
        L15:
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            if (r6 < r0) goto L20
            goto L5e
        L20:
            if (r6 >= 0) goto L23
            r6 = r1
        L23:
            boolean r0 = r5.u(r6)
            if (r0 != 0) goto L49
            boolean r0 = r5.u(r6)
            if (r0 == 0) goto L3a
            if (r6 == 0) goto L49
            int r0 = r6 + (-1)
            boolean r0 = r5.u(r0)
            if (r0 != 0) goto L3a
            goto L49
        L3a:
            java.text.BreakIterator r0 = r5.d
            if (r0 == 0) goto L45
            int r6 = r0.following(r6)
            if (r6 != r4) goto L23
            goto L5e
        L45:
            defpackage.nb3.a0(r3)
            throw r2
        L49:
            java.text.BreakIterator r0 = r5.d
            if (r0 == 0) goto L5f
            int r0 = r0.following(r6)
            if (r0 == r4) goto L5e
            boolean r1 = r5.t(r0)
            if (r1 != 0) goto L5a
            goto L5e
        L5a:
            int[] r2 = r5.i(r6, r0)
        L5e:
            return r2
        L5f:
            defpackage.nb3.a0(r3)
            throw r2
        L63:
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            if (r0 > 0) goto L6e
            goto L9a
        L6e:
            if (r6 < r0) goto L71
            goto L9a
        L71:
            if (r6 >= 0) goto L74
            r6 = r1
        L74:
            java.text.BreakIterator r0 = r5.d
            if (r0 == 0) goto L9f
            boolean r0 = r0.isBoundary(r6)
            java.text.BreakIterator r1 = r5.d
            if (r0 != 0) goto L8d
            if (r1 == 0) goto L89
            int r6 = r1.following(r6)
            if (r6 != r4) goto L74
            goto L9a
        L89:
            defpackage.nb3.a0(r3)
            throw r2
        L8d:
            if (r1 == 0) goto L9b
            int r0 = r1.following(r6)
            if (r0 != r4) goto L96
            goto L9a
        L96:
            int[] r2 = r5.i(r6, r0)
        L9a:
            return r2
        L9b:
            defpackage.nb3.a0(r3)
            throw r2
        L9f:
            defpackage.nb3.a0(r3)
            throw r2
    }

    @Override // defpackage.d2
    public final int[] q(int r6) {
            r5 = this;
            int r0 = r5.c
            r1 = 0
            java.lang.String r2 = "impl"
            r3 = -1
            switch(r0) {
                case 0: goto L5c;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            if (r0 > 0) goto L14
            goto L57
        L14:
            if (r6 > 0) goto L17
            goto L57
        L17:
            if (r6 <= r0) goto L1a
            r6 = r0
        L1a:
            if (r6 <= 0) goto L39
            int r0 = r6 + (-1)
            boolean r0 = r5.u(r0)
            if (r0 != 0) goto L39
            boolean r0 = r5.t(r6)
            if (r0 != 0) goto L39
            java.text.BreakIterator r0 = r5.d
            if (r0 == 0) goto L35
            int r6 = r0.preceding(r6)
            if (r6 != r3) goto L1a
            goto L57
        L35:
            defpackage.nb3.a0(r2)
            throw r1
        L39:
            java.text.BreakIterator r0 = r5.d
            if (r0 == 0) goto L58
            int r0 = r0.preceding(r6)
            if (r0 == r3) goto L57
            boolean r2 = r5.u(r0)
            if (r2 == 0) goto L57
            if (r0 == 0) goto L53
            int r2 = r0 + (-1)
            boolean r2 = r5.u(r2)
            if (r2 != 0) goto L57
        L53:
            int[] r1 = r5.i(r0, r6)
        L57:
            return r1
        L58:
            defpackage.nb3.a0(r2)
            throw r1
        L5c:
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            if (r0 > 0) goto L67
            goto L93
        L67:
            if (r6 > 0) goto L6a
            goto L93
        L6a:
            if (r6 <= r0) goto L6d
            r6 = r0
        L6d:
            java.text.BreakIterator r0 = r5.d
            if (r0 == 0) goto L98
            boolean r0 = r0.isBoundary(r6)
            java.text.BreakIterator r4 = r5.d
            if (r0 != 0) goto L86
            if (r4 == 0) goto L82
            int r6 = r4.preceding(r6)
            if (r6 != r3) goto L6d
            goto L93
        L82:
            defpackage.nb3.a0(r2)
            throw r1
        L86:
            if (r4 == 0) goto L94
            int r0 = r4.preceding(r6)
            if (r0 != r3) goto L8f
            goto L93
        L8f:
            int[] r1 = r5.i(r0, r6)
        L93:
            return r1
        L94:
            defpackage.nb3.a0(r2)
            throw r1
        L98:
            defpackage.nb3.a0(r2)
            throw r1
    }

    public final void s(java.lang.String r4) {
            r3 = this;
            int r0 = r3.c
            r1 = 0
            java.lang.String r2 = "impl"
            switch(r0) {
                case 0: goto L16;
                default: goto L8;
            }
        L8:
            r3.a = r4
            java.text.BreakIterator r3 = r3.d
            if (r3 == 0) goto L12
            r3.setText(r4)
            return
        L12:
            defpackage.nb3.a0(r2)
            throw r1
        L16:
            r3.a = r4
            java.text.BreakIterator r3 = r3.d
            if (r3 == 0) goto L20
            r3.setText(r4)
            return
        L20:
            defpackage.nb3.a0(r2)
            throw r1
    }

    public boolean t(int r2) {
            r1 = this;
            if (r2 <= 0) goto L1c
            int r0 = r2 + (-1)
            boolean r0 = r1.u(r0)
            if (r0 == 0) goto L1c
            java.lang.String r0 = r1.j()
            int r0 = r0.length()
            if (r2 == r0) goto L1a
            boolean r1 = r1.u(r2)
            if (r1 != 0) goto L1c
        L1a:
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public boolean u(int r2) {
            r1 = this;
            if (r2 < 0) goto L19
            java.lang.String r0 = r1.j()
            int r0 = r0.length()
            if (r2 >= r0) goto L19
            java.lang.String r1 = r1.j()
            int r1 = r1.codePointAt(r2)
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)
            return r1
        L19:
            r1 = 0
            return r1
    }
}
