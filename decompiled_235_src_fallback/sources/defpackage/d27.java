package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d27  reason: default package */
/* loaded from: classes.dex */
public final class d27 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    public final /* synthetic */ defpackage.w61 a;
    public final /* synthetic */ defpackage.qa4 b;
    public final /* synthetic */ defpackage.r94 c;
    public final /* synthetic */ defpackage.qa4 d;

    public d27(defpackage.w61 r1, defpackage.qa4 r2, defpackage.r94 r3, defpackage.qa4 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.zy4 r8, defpackage.r41 r9) {
            r7 = this;
            c27 r2 = new c27
            r94 r0 = r7.c
            r1 = 0
            w61 r3 = r7.a
            qa4 r4 = r7.b
            r2.<init>(r3, r4, r0, r1)
            j4 r3 = new j4
            r0 = 26
            qa4 r7 = r7.d
            r3.<init>(r7, r0)
            do1 r7 = defpackage.hz6.a
            j25 r4 = new j25
            r4.<init>(r8)
            ji r0 = new ji
            r5 = 0
            r6 = 15
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.g04.C(r0, r9)
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            jg7 r9 = defpackage.jg7.a
            if (r7 != r8) goto L30
            goto L31
        L30:
            r7 = r9
        L31:
            if (r7 != r8) goto L34
            return r7
        L34:
            return r9
    }
}
