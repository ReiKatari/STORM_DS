package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl4  reason: default package */
/* loaded from: classes.dex */
public final class bl4 implements android.window.OnBackAnimationCallback {
    public final /* synthetic */ defpackage.al4 a;

    public bl4(defpackage.al4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void onBackCancelled() {
            r5 = this;
            al4 r5 = r5.a
            eb r0 = r5.a
            if (r0 == 0) goto L44
            boolean r1 = r5.b
            r2 = 0
            if (r1 != 0) goto Le
            r0.v(r5, r2)
        Le:
            java.lang.Object r0 = r0.L
            md4 r0 = (defpackage.md4) r0
            r0.getClass()
            ld4 r1 = r0.h
            boolean r1 = r5.equals(r1)
            r3 = 0
            if (r1 == 0) goto L41
            int r1 = r0.g
            r4 = -1
            if (r4 == r1) goto L24
            goto L41
        L24:
            jd4 r1 = r0.f
            if (r1 != 0) goto L2c
            jd4 r1 = r0.c(r4)
        L2c:
            r0.f = r2
            r0.g = r3
            r0.h = r2
            if (r1 == 0) goto L37
            r1.a()
        L37:
            tp6 r0 = r0.a
            r0.getClass()
            nd4 r1 = defpackage.nd4.i
            r0.m(r2, r1)
        L41:
            r5.b = r3
            return
        L44:
            java.lang.String r5 = "This input is not added to any dispatcher."
            defpackage.i.m(r5)
            return
    }

    public final void onBackInvoked() {
            r0 = this;
            al4 r0 = r0.a
            r0.a()
            return
    }

    public final void onBackProgressed(android.window.BackEvent r3) {
            r2 = this;
            r3.getClass()
            hd4 r3 = defpackage.uj2.e(r3)
            al4 r2 = r2.a
            eb r0 = r2.a
            if (r0 == 0) goto L42
            boolean r1 = r2.b
            if (r1 == 0) goto L41
            java.lang.Object r0 = r0.L
            md4 r0 = (defpackage.md4) r0
            r0.getClass()
            ld4 r1 = r0.h
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L41
            int r2 = r0.g
            r1 = -1
            if (r1 == r2) goto L26
            goto L41
        L26:
            jd4 r2 = r0.f
            if (r2 != 0) goto L2e
            jd4 r2 = r0.c(r1)
        L2e:
            if (r2 == 0) goto L33
            r2.c(r3)
        L33:
            tp6 r2 = r0.a
            od4 r0 = new od4
            r0.<init>(r3)
            r2.getClass()
            r3 = 0
            r2.m(r3, r0)
        L41:
            return
        L42:
            java.lang.String r2 = "This input is not added to any dispatcher."
            defpackage.i.m(r2)
            return
    }

    public final void onBackStarted(android.window.BackEvent r3) {
            r2 = this;
            r3.getClass()
            hd4 r3 = defpackage.uj2.e(r3)
            al4 r2 = r2.a
            eb r0 = r2.a
            if (r0 == 0) goto L18
            boolean r1 = r2.b
            if (r1 != 0) goto L17
            r0.v(r2, r3)
            r3 = 1
            r2.b = r3
        L17:
            return
        L18:
            java.lang.String r2 = "This input is not added to any dispatcher."
            defpackage.i.m(r2)
            return
    }
}
