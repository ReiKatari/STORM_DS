package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx1  reason: default package */
/* loaded from: classes.dex */
public final class sx1 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public defpackage.lb4 e;

    public final boolean a() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto La
            boolean r1 = r1.c
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public final boolean b() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto Ld
            boolean r1 = r1.a()
            if (r1 != 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public final boolean c() {
            r0 = this;
            boolean r0 = r0.a
            return r0
    }

    public final void d(defpackage.dp2 r3) {
            r2 = this;
            r3.getClass()
            dp2 r0 = defpackage.dp2.ENABLED_FULL
            r1 = 0
            if (r3 != r0) goto La
            r3 = 1
            goto Lb
        La:
            r3 = r1
        Lb:
            r2.c = r3
            if (r3 != 0) goto L11
            r2.d = r1
        L11:
            return
    }

    public final void e(boolean r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = r0.a()
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.d = r1
            return
    }

    public final java.util.ArrayList f(boolean r3, boolean r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r2.b
            if (r1 == r3) goto L18
            if (r3 == 0) goto L11
            ux1 r1 = defpackage.ux1.a
            r0.add(r1)
            goto L16
        L11:
            tx1 r1 = defpackage.tx1.a
            r0.add(r1)
        L16:
            r2.b = r3
        L18:
            if (r3 == 0) goto L23
            boolean r2 = r2.a
            if (r2 == r4) goto L23
            vx1 r2 = defpackage.vx1.a
            r0.add(r2)
        L23:
            return r0
    }
}
