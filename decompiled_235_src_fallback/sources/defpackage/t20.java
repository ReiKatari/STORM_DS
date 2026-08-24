package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t20  reason: default package */
/* loaded from: classes.dex */
public final class t20 implements android.view.View.OnTouchListener {
    public final /* synthetic */ int A;

    public /* synthetic */ t20(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto L9;
                case 1: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            r0 = 1
            return r0
        L9:
            r0 = 1
            return r0
    }
}
