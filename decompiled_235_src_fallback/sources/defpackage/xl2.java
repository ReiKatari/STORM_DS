package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xl2  reason: default package */
/* loaded from: classes.dex */
public final class xl2 extends android.transition.Transition.EpicenterCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.graphics.Rect b;

    public /* synthetic */ xl2(int r1, android.graphics.Rect r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
            r0 = this;
            int r1 = r0.a
            android.graphics.Rect r0 = r0.b
            switch(r1) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            r0 = 0
        Le:
            return r0
    }
}
