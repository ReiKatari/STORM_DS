package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il4  reason: default package */
/* loaded from: classes.dex */
public final class il4 {
    public final java.lang.Runnable a;
    public final defpackage.ex6 b;

    public il4(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            er2 r2 = new er2
            r0 = 11
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final void a(defpackage.hu3 r4, defpackage.dl4 r5) {
            r3 = this;
            r5.getClass()
            ut3 r0 = r4.getLifecycle()
            tt3 r1 = r0.b()
            tt3 r2 = defpackage.tt3.DESTROYED
            if (r1 != r2) goto L10
            return
        L10:
            el4 r1 = new el4
            r1.<init>(r4, r5)
            cl4 r4 = new cl4
            r4.<init>(r5, r1)
            java.util.ArrayList r1 = r5.a
            r1.add(r4)
            r1 = 0
            r4.g(r1)
            gl4 r1 = r3.c()
            eb r1 = r1.c
            defpackage.eb.e(r1, r4)
            se1 r1 = new se1
            r1.<init>(r4, r3, r0)
            r0.a(r1)
            fl4 r3 = new fl4
            r3.<init>(r0, r1)
            java.util.concurrent.CopyOnWriteArrayList r4 = r5.c
            r4.add(r3)
            return
    }

    public final void b(defpackage.dl4 r3) {
            r2 = this;
            r3.getClass()
            el4 r0 = new el4
            r1 = 0
            r0.<init>(r1, r3)
            cl4 r1 = new cl4
            r1.<init>(r3, r0)
            java.util.ArrayList r3 = r3.a
            r3.add(r1)
            gl4 r2 = r2.c()
            eb r2 = r2.c
            defpackage.eb.e(r2, r1)
            return
    }

    public final defpackage.gl4 c() {
            r0 = this;
            ex6 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            gl4 r0 = (defpackage.gl4) r0
            return r0
    }

    public final void d(android.window.OnBackInvokedDispatcher r5) {
            r4 = this;
            gl4 r0 = r4.c()
            eb r0 = r0.c
            al4 r1 = new al4
            r2 = 0
            r1.<init>(r5, r2)
            r3 = 1
            r0.g(r1, r3)
            gl4 r4 = r4.c()
            eb r4 = r4.c
            al4 r0 = new al4
            r1 = 1000000(0xf4240, float:1.401298E-39)
            r0.<init>(r5, r1)
            r4.g(r0, r2)
            return
    }
}
