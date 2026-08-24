package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er5  reason: default package */
/* loaded from: classes.dex */
public final class er5 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    public final /* synthetic */ defpackage.qa4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ defpackage.on2 d;
    public final /* synthetic */ java.util.List e;
    public final /* synthetic */ java.util.Map f;
    public final /* synthetic */ defpackage.qa4 g;
    public final /* synthetic */ defpackage.qa4 h;
    public final /* synthetic */ defpackage.qa4 i;
    public final /* synthetic */ defpackage.eo2 j;

    public er5(defpackage.qa4 r1, int r2, boolean r3, defpackage.on2 r4, java.util.List r5, java.util.Map r6, defpackage.qa4 r7, defpackage.qa4 r8, defpackage.qa4 r9, defpackage.eo2 r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.zy4 r14, defpackage.r41 r15) {
            r13 = this;
            br5 r0 = new br5
            qa4 r1 = r13.a
            int r2 = r13.b
            boolean r3 = r13.c
            on2 r4 = r13.d
            java.util.List r5 = r13.e
            java.util.Map r6 = r13.f
            qa4 r7 = r13.g
            qa4 r8 = r13.h
            qa4 r9 = r13.i
            eo2 r10 = r13.j
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            cr5 r13 = new cr5
            r11 = 0
            r13.<init>(r1, r9, r8, r11)
            cr5 r12 = new cr5
            r11 = 1
            r12.<init>(r1, r9, r8, r11)
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            dr5 r2 = new dr5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r1 = defpackage.sn1.a
            r1 = r0
            on1 r0 = new on1
            r5 = 0
            r6 = 1
            r3 = r13
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = defpackage.uj2.o(r14, r0, r15)
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            jg7 r15 = defpackage.jg7.a
            if (r13 != r14) goto L4a
            goto L4b
        L4a:
            r13 = r15
        L4b:
            if (r13 != r14) goto L4e
            return r13
        L4e:
            return r15
    }
}
