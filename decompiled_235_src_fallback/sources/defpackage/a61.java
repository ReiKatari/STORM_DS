package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a61  reason: default package */
/* loaded from: classes.dex */
public final class a61 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ a61(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.zy4 r10, defpackage.r41 r11) {
            r9 = this;
            int r0 = r9.a
            java.lang.Object r1 = r9.c
            java.lang.Object r9 = r9.b
            jg7 r2 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L2d;
                default: goto Lb;
            }
        Lb:
            o97 r9 = (defpackage.o97) r9
            v80 r6 = r9.q0
            r5 = r1
            os0 r5 = (defpackage.os0) r5
            l61 r4 = r11.b()
            kq3 r3 = new kq3
            r7 = 0
            r8 = 3
            r3.<init>(r4, r5, r6, r7, r8)
            ow6 r10 = (defpackage.ow6) r10
            java.lang.Object r9 = r10.R0(r3, r11)
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            if (r9 != r10) goto L28
            goto L29
        L28:
            r9 = r2
        L29:
            if (r9 != r10) goto L2c
            r2 = r9
        L2c:
            return r2
        L2d:
            la r3 = new la
            r5 = r9
            g17 r5 = (defpackage.g17) r5
            r6 = r1
            p27 r6 = (defpackage.p27) r6
            r7 = 0
            r8 = 1
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r9 = defpackage.g04.C(r3, r11)
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            if (r9 != r10) goto L44
            r2 = r9
        L44:
            return r2
    }
}
