package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oy4  reason: default package */
/* loaded from: classes.dex */
public final class oy4 {
    public final java.util.List a;
    public final defpackage.yc1 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    public oy4(java.util.List r10, defpackage.yc1 r11) {
            r9 = this;
            r9.<init>()
            r9.a = r10
            r9.b = r11
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 0
            r1 = 29
            if (r11 < r1) goto L19
            android.view.MotionEvent r2 = r9.a()
            if (r2 == 0) goto L19
            int r2 = defpackage.r74.c(r2)
            goto L1a
        L19:
            r2 = r0
        L1a:
            r9.c = r2
            android.view.MotionEvent r2 = r9.a()
            if (r2 == 0) goto L27
            int r2 = r2.getButtonState()
            goto L28
        L27:
            r2 = r0
        L28:
            r9.d = r2
            android.view.MotionEvent r2 = r9.a()
            if (r2 == 0) goto L35
            int r2 = r2.getMetaState()
            goto L36
        L35:
            r2 = r0
        L36:
            r9.e = r2
            android.view.MotionEvent r2 = r9.a()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto La2
            if (r11 < r1) goto L4b
            int r10 = defpackage.r74.c(r2)
            if (r10 != r3) goto L4b
            r10 = r5
            goto L4c
        L4b:
            r10 = r0
        L4c:
            r6 = 5
            if (r11 < r1) goto L57
            int r11 = defpackage.r74.c(r2)
            if (r11 != r6) goto L57
            r11 = r5
            goto L58
        L57:
            r11 = r0
        L58:
            int r1 = r2.getActionMasked()
            r2 = 10
            if (r1 == 0) goto L9b
            r7 = 12
            if (r1 == r5) goto L93
            r8 = 8
            if (r1 == r4) goto L89
            switch(r1) {
                case 5: goto L80;
                case 6: goto L76;
                case 7: goto L89;
                case 8: goto L73;
                case 9: goto L70;
                case 10: goto L6d;
                default: goto L6b;
            }
        L6b:
            goto Lbf
        L6d:
            r0 = r6
            goto Lbf
        L70:
            r0 = 4
            goto Lbf
        L73:
            r0 = 6
            goto Lbf
        L76:
            if (r10 == 0) goto L7a
        L78:
            r0 = r7
            goto Lbf
        L7a:
            if (r11 == 0) goto L7e
        L7c:
            r0 = r8
            goto Lbf
        L7e:
            r0 = r4
            goto Lbf
        L80:
            if (r10 == 0) goto L84
        L82:
            r0 = r2
            goto Lbf
        L84:
            if (r11 == 0) goto L87
            goto L7c
        L87:
            r0 = r5
            goto Lbf
        L89:
            if (r10 == 0) goto L8e
            r0 = 11
            goto Lbf
        L8e:
            if (r11 == 0) goto L91
            goto L7c
        L91:
            r0 = r3
            goto Lbf
        L93:
            if (r10 == 0) goto L96
            goto L78
        L96:
            if (r11 == 0) goto L7e
            r0 = 9
            goto Lbf
        L9b:
            if (r10 == 0) goto L9e
            goto L82
        L9e:
            if (r11 == 0) goto L87
            r0 = 7
            goto Lbf
        La2:
            int r11 = r10.size()
        La6:
            if (r0 >= r11) goto L91
            java.lang.Object r1 = r10.get(r0)
            vy4 r1 = (defpackage.vy4) r1
            boolean r2 = defpackage.ej2.p(r1)
            if (r2 == 0) goto Lb5
            goto L7e
        Lb5:
            boolean r1 = defpackage.ej2.n(r1)
            if (r1 == 0) goto Lbc
            goto L87
        Lbc:
            int r0 = r0 + 1
            goto La6
        Lbf:
            r9.f = r0
            return
    }

    public final android.view.MotionEvent a() {
            r0 = this;
            yc1 r0 = r0.b
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.B
            ap3 r0 = (defpackage.ap3) r0
            java.lang.Object r0 = r0.L
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
