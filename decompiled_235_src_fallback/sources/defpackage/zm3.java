package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zm3  reason: default package */
/* loaded from: classes.dex */
public final class zm3 implements defpackage.f34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.util.Map c;
    public final /* synthetic */ defpackage.qn2 d;
    public final /* synthetic */ defpackage.an3 e;
    public final /* synthetic */ defpackage.gn3 f;
    public final /* synthetic */ defpackage.qn2 g;

    public zm3(int r1, int r2, java.util.Map r3, defpackage.qn2 r4, defpackage.an3 r5, defpackage.gn3 r6, defpackage.qn2 r7) {
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

    @Override // defpackage.f34
    public final void a() {
            r2 = this;
            gn3 r0 = r2.f
            sm3 r0 = r0.A
            an3 r1 = r2.e
            boolean r1 = r1.a0()
            qn2 r2 = r2.g
            if (r1 == 0) goto L1e
            if0 r1 = r0.B0
            java.lang.Object r1 = r1.d
            y53 r1 = (defpackage.y53) r1
            x53 r1 = r1.Q0
            if (r1 == 0) goto L1e
            lz3 r0 = r1.h0
            r2.g(r0)
            return
        L1e:
            if0 r0 = r0.B0
            java.lang.Object r0 = r0.d
            y53 r0 = (defpackage.y53) r0
            lz3 r0 = r0.h0
            r2.g(r0)
            return
    }

    @Override // defpackage.f34
    public final java.util.Map b() {
            r0 = this;
            java.util.Map r0 = r0.c
            return r0
    }

    @Override // defpackage.f34
    public final defpackage.qn2 c() {
            r0 = this;
            qn2 r0 = r0.d
            return r0
    }

    @Override // defpackage.f34
    public final int getHeight() {
            r0 = this;
            int r0 = r0.b
            return r0
    }

    @Override // defpackage.f34
    public final int getWidth() {
            r0 = this;
            int r0 = r0.a
            return r0
    }
}
