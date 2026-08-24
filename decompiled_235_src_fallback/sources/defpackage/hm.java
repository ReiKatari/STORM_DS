package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm  reason: default package */
/* loaded from: classes.dex */
public final class hm implements defpackage.u07 {
    public final android.view.View a;
    public final defpackage.qn2 b;
    public final defpackage.on2 c;
    public final defpackage.db4 d;
    public final defpackage.qm6 e;
    public final defpackage.cm f;
    public final defpackage.cm g;
    public android.view.ActionMode h;
    public defpackage.v i;
    public java.lang.Runnable j;

    public hm(android.view.View r1, defpackage.qn2 r2, defpackage.on2 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            db4 r1 = new db4
            r1.<init>()
            r0.d = r1
            qm6 r1 = new qm6
            cm r2 = new cm
            r3 = 0
            r2.<init>(r0, r3)
            r1.<init>(r2)
            r0.e = r1
            cm r1 = new cm
            r2 = 1
            r1.<init>(r0, r2)
            r0.f = r1
            cm r1 = new cm
            r2 = 2
            r1.<init>(r0, r2)
            r0.g = r1
            return
    }

    @Override // defpackage.u07
    public final java.lang.Object a(defpackage.m07 r4, defpackage.hw6 r5) {
            r3 = this;
            yc r0 = new yc
            r1 = 0
            r2 = 1
            r0.<init>(r3, r4, r1, r2)
            db4 r3 = r3.d
            java.lang.Object r3 = defpackage.db4.b(r3, r0, r5)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L12
            return r3
        L12:
            jg7 r3 = defpackage.jg7.a
            return r3
    }
}
