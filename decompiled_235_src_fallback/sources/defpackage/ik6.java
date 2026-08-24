package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik6  reason: default package */
/* loaded from: classes.dex */
public final class ik6 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ defpackage.qa4 c;
    public final /* synthetic */ defpackage.pp6 d;
    public final /* synthetic */ defpackage.w61 e;
    public final /* synthetic */ defpackage.go1 f;
    public final /* synthetic */ defpackage.qa4 g;

    public ik6(boolean r1, float r2, defpackage.qa4 r3, defpackage.pp6 r4, defpackage.w61 r5, defpackage.go1 r6, defpackage.qa4 r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.zy4 r7, defpackage.r41 r8) {
            r6 = this;
            hk6 r0 = new hk6
            pp6 r4 = r6.d
            r5 = 0
            boolean r1 = r6.a
            float r2 = r6.b
            qa4 r3 = r6.c
            r0.<init>(r1, r2, r3, r4, r5)
            t00 r1 = new t00
            r2 = 25
            w61 r3 = r6.e
            go1 r4 = r6.f
            qa4 r6 = r6.g
            r1.<init>(r3, r4, r6, r2)
            r6 = 3
            java.lang.Object r6 = defpackage.hz6.d(r7, r0, r1, r8, r6)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            if (r6 != r7) goto L25
            return r6
        L25:
            jg7 r6 = defpackage.jg7.a
            return r6
    }
}
