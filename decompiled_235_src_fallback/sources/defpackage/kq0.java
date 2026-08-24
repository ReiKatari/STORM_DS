package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq0  reason: default package */
/* loaded from: classes.dex */
public final class kq0 extends defpackage.gi2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ kq0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.e = r2
            r0.f = r1
            r0.<init>()
            return
    }

    private final void S(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.gi2
    public final void K(int r1) {
            r0 = this;
            int r1 = r0.e
            switch(r1) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r0.f
            h17 r0 = (defpackage.h17) r0
            r1 = 1
            r0.d = r1
            java.lang.ref.WeakReference r0 = r0.e
            java.lang.Object r0 = r0.get()
            nq0 r0 = (defpackage.nq0) r0
            if (r0 == 0) goto L1c
            r0.A()
            r0.invalidateSelf()
        L1c:
            return
    }

    @Override // defpackage.gi2
    public final void M(android.graphics.Typeface r1, boolean r2) {
            r0 = this;
            int r1 = r0.e
            java.lang.Object r0 = r0.f
            switch(r1) {
                case 0: goto L20;
                default: goto L7;
            }
        L7:
            if (r2 == 0) goto La
            goto L1f
        La:
            h17 r0 = (defpackage.h17) r0
            r1 = 1
            r0.d = r1
            java.lang.ref.WeakReference r0 = r0.e
            java.lang.Object r0 = r0.get()
            nq0 r0 = (defpackage.nq0) r0
            if (r0 == 0) goto L1f
            r0.A()
            r0.invalidateSelf()
        L1f:
            return
        L20:
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            nq0 r1 = r0.d0
            boolean r2 = r1.H1
            if (r2 == 0) goto L2b
            java.lang.CharSequence r1 = r1.J0
            goto L2f
        L2b:
            java.lang.CharSequence r1 = r0.getText()
        L2f:
            r0.setText(r1)
            r0.requestLayout()
            r0.invalidate()
            return
    }
}
