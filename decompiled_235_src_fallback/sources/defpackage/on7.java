package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: on7  reason: default package */
/* loaded from: classes.dex */
public final class on7 extends defpackage.o04 {
    public final /* synthetic */ int X;

    public on7(int r1, java.lang.Class r2, int r3, int r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.<init>()
            r0.A = r1
            r0.R = r2
            r0.L = r3
            r0.B = r4
            return
    }

    @Override // defpackage.o04
    public final java.lang.Object c(android.view.View r1) {
            r0 = this;
            int r0 = r0.X
            switch(r0) {
                case 0: goto L18;
                case 1: goto L13;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            boolean r0 = defpackage.vn7.b(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Le:
            java.lang.CharSequence r0 = defpackage.xn7.b(r1)
            return r0
        L13:
            java.lang.CharSequence r0 = defpackage.vn7.a(r1)
            return r0
        L18:
            boolean r0 = defpackage.vn7.c(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // defpackage.o04
    public final void d(android.view.View r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.X
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L15;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            defpackage.vn7.d(r1, r0)
            return
        Lf:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            defpackage.xn7.c(r1, r2)
            return
        L15:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            defpackage.vn7.e(r1, r2)
            return
        L1b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            defpackage.vn7.f(r1, r0)
            return
    }

    @Override // defpackage.o04
    public final boolean g(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r2 = r2.X
            r0 = 0
            r1 = 1
            switch(r2) {
                case 0: goto L3a;
                case 1: goto L31;
                case 2: goto L27;
                default: goto L7;
            }
        L7:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r3 == 0) goto L15
            boolean r2 = r3.booleanValue()
            if (r2 == 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            if (r4 == 0) goto L20
            boolean r3 = r4.booleanValue()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r0
        L21:
            if (r2 != r3) goto L24
            r0 = r1
        L24:
            r2 = r0 ^ 1
            return r2
        L27:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r2 = android.text.TextUtils.equals(r3, r4)
        L2f:
            r2 = r2 ^ r1
            return r2
        L31:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r2 = android.text.TextUtils.equals(r3, r4)
            goto L2f
        L3a:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r3 == 0) goto L48
            boolean r2 = r3.booleanValue()
            if (r2 == 0) goto L48
            r2 = r1
            goto L49
        L48:
            r2 = r0
        L49:
            if (r4 == 0) goto L53
            boolean r3 = r4.booleanValue()
            if (r3 == 0) goto L53
            r3 = r1
            goto L54
        L53:
            r3 = r0
        L54:
            if (r2 != r3) goto L57
            r0 = r1
        L57:
            r2 = r0 ^ 1
            return r2
    }
}
