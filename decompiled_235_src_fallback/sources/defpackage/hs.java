package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs  reason: default package */
/* loaded from: classes.dex */
public final class hs extends defpackage.gi2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ java.lang.ref.WeakReference g;
    public final /* synthetic */ defpackage.ms h;

    public hs(defpackage.ms r1, int r2, int r3, java.lang.ref.WeakReference r4) {
            r0 = this;
            r0.<init>()
            r0.h = r1
            r0.e = r2
            r0.f = r3
            r0.g = r4
            return
    }

    @Override // defpackage.gi2
    public final void K(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.gi2
    public final void L(android.graphics.Typeface r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L18
            r0 = -1
            int r1 = r2.e
            if (r1 == r0) goto L18
            int r0 = r2.f
            r0 = r0 & 2
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            android.graphics.Typeface r3 = defpackage.ls.a(r3, r1, r0)
        L18:
            ms r0 = r2.h
            boolean r1 = r0.m
            if (r1 == 0) goto L3e
            r0.l = r3
            java.lang.ref.WeakReference r2 = r2.g
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L3e
            boolean r1 = r2.isAttachedToWindow()
            int r0 = r0.j
            if (r1 == 0) goto L3b
            is r1 = new is
            r1.<init>(r2, r3, r0)
            r2.post(r1)
            return
        L3b:
            r2.setTypeface(r3, r0)
        L3e:
            return
    }
}
