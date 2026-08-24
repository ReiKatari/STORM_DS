package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t57  reason: default package */
/* loaded from: classes.dex */
public final class t57 {
    public final defpackage.w61 a;
    public final defpackage.w61 b;
    public final java.util.concurrent.Executor c;
    public final defpackage.n61 d;
    public final java.util.concurrent.Executor e;
    public final defpackage.n61 f;
    public final java.util.concurrent.Executor g;
    public final defpackage.n61 h;
    public final defpackage.ex6 i;
    public final defpackage.ex6 j;

    public t57(defpackage.w61 r1, defpackage.w61 r2, java.util.concurrent.Executor r3, defpackage.n61 r4, java.util.concurrent.Executor r5, defpackage.n61 r6, java.util.concurrent.Executor r7, defpackage.n61 r8, defpackage.on2 r9, defpackage.j57 r10) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            x7 r1 = new x7
            r2 = 20
            r1.<init>(r2, r9)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.i = r2
            t46 r1 = new t46
            r2 = 17
            r1.<init>(r10, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.j = r2
            return
    }

    public final android.os.Handler a() {
            r0 = this;
            ex6 r0 = r0.i
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
    }

    public final java.lang.Object b(long r9, defpackage.qn2 r11) {
            r8 = this;
            n61 r0 = r8.d     // Catch: java.lang.InterruptedException -> L11
            wk0 r1 = new wk0     // Catch: java.lang.InterruptedException -> L11
            r5 = 0
            r2 = 4
            r6 = r8
            r3 = r9
            r7 = r11
            r1.<init>(r2, r3, r5, r6, r7)     // Catch: java.lang.InterruptedException -> L11
            java.lang.Object r8 = defpackage.hv.V(r0, r1)     // Catch: java.lang.InterruptedException -> L11
            return r8
        L11:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "CXCP"
            java.lang.String r10 = "runBlockingCheckedOrNull cancelled by thread interruption"
            android.util.Log.i(r9, r10, r8)
            r8 = 0
            return r8
    }
}
