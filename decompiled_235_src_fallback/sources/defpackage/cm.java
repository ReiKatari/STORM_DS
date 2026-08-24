package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cm implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.hm B;

    public /* synthetic */ cm(defpackage.hm r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.A
            jg7 r1 = defpackage.jg7.a
            hm r3 = r3.B
            switch(r0) {
                case 0: goto L27;
                case 1: goto L1f;
                case 2: goto L17;
                default: goto L9;
            }
        L9:
            gl1 r4 = (defpackage.gl1) r4
            qm6 r4 = r3.e
            r4.e()
            z3 r4 = new z3
            r0 = 4
            r4.<init>(r3, r0)
            return r4
        L17:
            android.view.ActionMode r3 = r3.h
            if (r3 == 0) goto L1e
            r3.invalidateContentRect()
        L1e:
            return r1
        L1f:
            android.view.ActionMode r3 = r3.h
            if (r3 == 0) goto L26
            r3.invalidate()
        L26:
            return r1
        L27:
            on2 r4 = (defpackage.on2) r4
            android.view.View r3 = r3.a
            android.os.Handler r0 = r3.getHandler()
            if (r0 == 0) goto L36
            android.os.Looper r0 = r0.getLooper()
            goto L37
        L36:
            r0 = 0
        L37:
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r0 != r2) goto L41
            r4.c()
            goto L50
        L41:
            android.os.Handler r3 = r3.getHandler()
            if (r3 == 0) goto L50
            fe r0 = new fe
            r2 = 2
            r0.<init>(r2, r4)
            r3.post(r0)
        L50:
            return r1
    }
}
