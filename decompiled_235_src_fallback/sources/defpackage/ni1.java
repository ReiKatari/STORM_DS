package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni1  reason: default package */
/* loaded from: classes.dex */
public final class ni1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    public static final defpackage.ni1 b = null;
    public static final defpackage.ni1 c = null;
    public final /* synthetic */ int a;

    static {
            ni1 r0 = new ni1
            r1 = 0
            r0.<init>(r1)
            defpackage.ni1.b = r0
            ni1 r0 = new ni1
            r1 = 1
            r0.<init>(r1)
            defpackage.ni1.c = r0
            return
    }

    public /* synthetic */ ni1(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.zy4 r4, defpackage.r41 r5) {
            r3 = this;
            int r3 = r3.a
            jg7 r0 = defpackage.jg7.a
            switch(r3) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            return r0
        L8:
            vn0 r3 = new vn0
            r1 = 22
            r3.<init>(r1)
            r1 = 7
            r2 = 0
            java.lang.Object r3 = defpackage.hz6.d(r4, r2, r3, r5, r1)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L1a
            r0 = r3
        L1a:
            return r0
    }
}
