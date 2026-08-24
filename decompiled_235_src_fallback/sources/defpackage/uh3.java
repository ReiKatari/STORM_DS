package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh3  reason: default package */
/* loaded from: classes.dex */
public final class uh3 {
    public final defpackage.xm6 a;
    public defpackage.vh3 b;
    public defpackage.ah2 c;

    public uh3(defpackage.xm6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final defpackage.vh3 a() {
            r0 = this;
            vh3 r0 = r0.b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "keyboardActions"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final boolean b(int r9) {
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = 5
            r3 = 6
            r4 = 2
            r5 = 1
            r6 = 7
            if (r9 != r6) goto L10
            vh3 r7 = r8.a()
            qn2 r7 = r7.a
            goto L37
        L10:
            if (r9 != r4) goto L17
            r8.a()
        L15:
            r7 = r1
            goto L37
        L17:
            if (r9 != r3) goto L1d
            r8.a()
            goto L15
        L1d:
            if (r9 != r2) goto L23
            r8.a()
            goto L15
        L23:
            r7 = 3
            if (r9 != r7) goto L2a
            r8.a()
            goto L15
        L2a:
            r7 = 4
            if (r9 != r7) goto L31
            r8.a()
            goto L15
        L31:
            if (r9 != r5) goto L34
            goto L36
        L34:
            if (r9 != 0) goto L6c
        L36:
            goto L15
        L37:
            if (r7 == 0) goto L3d
            r7.g(r8)
            return r5
        L3d:
            java.lang.String r7 = "focusManager"
            if (r9 != r3) goto L4f
            ah2 r8 = r8.c
            if (r8 == 0) goto L4b
            eh2 r8 = (defpackage.eh2) r8
            r8.g(r5, r5)
            return r5
        L4b:
            defpackage.nb3.a0(r7)
            throw r1
        L4f:
            if (r9 != r2) goto L5f
            ah2 r8 = r8.c
            if (r8 == 0) goto L5b
            eh2 r8 = (defpackage.eh2) r8
            r8.g(r4, r5)
            return r5
        L5b:
            defpackage.nb3.a0(r7)
            throw r1
        L5f:
            if (r9 != r6) goto L6b
            xm6 r8 = r8.a
            if (r8 == 0) goto L6b
            bh1 r8 = (defpackage.bh1) r8
            r8.a()
            return r5
        L6b:
            return r0
        L6c:
            java.lang.String r8 = "invalid ImeAction"
            defpackage.i.m(r8)
            return r0
    }
}
