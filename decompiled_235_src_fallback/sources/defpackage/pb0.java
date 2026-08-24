package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb0  reason: default package */
/* loaded from: classes.dex */
public final class pb0 extends defpackage.wl0 {
    public final defpackage.eo2 R;
    public final defpackage.eo2 X;

    public pb0(defpackage.eo2 r1, defpackage.l61 r2, int r3, defpackage.m80 r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.R = r1
            r0.X = r1
            return
    }

    @Override // defpackage.wl0
    public final java.lang.Object e(defpackage.r35 r7, defpackage.r41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ob0
            if (r0 == 0) goto L13
            r0 = r8
            ob0 r0 = (defpackage.ob0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L1a
        L13:
            ob0 r0 = new ob0
            s41 r8 = (defpackage.s41) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2e
            r35 r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L48
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L34:
            defpackage.oi2.Y(r8)
            r0.R = r7
            r0.Z = r5
            eo2 r6 = r6.R
            java.lang.Object r6 = r6.o(r7, r0)
            if (r6 != r1) goto L44
            goto L45
        L44:
            r6 = r4
        L45:
            if (r6 != r1) goto L48
            return r1
        L48:
            v80 r6 = r7.Y
            boolean r6 = r6.G()
            if (r6 == 0) goto L51
            return r4
        L51:
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.i.m(r6)
            return r3
    }

    @Override // defpackage.wl0
    public final defpackage.wl0 f(defpackage.l61 r2, int r3, defpackage.m80 r4) {
            r1 = this;
            pb0 r0 = new pb0
            eo2 r1 = r1.X
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // defpackage.wl0
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "block["
            r0.<init>(r1)
            eo2 r1 = r2.R
            r0.append(r1)
            java.lang.String r1 = "] -> "
            r0.append(r1)
            java.lang.String r2 = super.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
