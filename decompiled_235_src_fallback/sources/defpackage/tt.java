package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tt  reason: default package */
/* loaded from: classes.dex */
public final class tt implements defpackage.f34 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final java.util.Map d;
    public final defpackage.qn2 e;
    public final /* synthetic */ defpackage.qn2 f;
    public final /* synthetic */ defpackage.g34 g;

    public /* synthetic */ tt(int r1, int r2, java.util.Map r3, defpackage.qn2 r4, defpackage.qn2 r5, defpackage.g34 r6, int r7) {
            r0 = this;
            r0.a = r7
            r0.f = r5
            r0.g = r6
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            r0.<init>()
            return
    }

    @Override // defpackage.f34
    public final void a() {
            r2 = this;
            int r0 = r2.a
            g34 r1 = r2.g
            qn2 r2 = r2.f
            switch(r0) {
                case 0: goto L11;
                default: goto L9;
            }
        L9:
            kz3 r1 = (defpackage.kz3) r1
            lz3 r0 = r1.h0
            r2.g(r0)
            return
        L11:
            ut r1 = (defpackage.ut) r1
            mm3 r0 = r1.A
            lz3 r0 = r0.h0
            r2.g(r0)
            return
    }

    @Override // defpackage.f34
    public final java.util.Map b() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.util.Map r1 = r1.d
            return r1
        L8:
            java.util.Map r1 = r1.d
            return r1
    }

    @Override // defpackage.f34
    public final defpackage.qn2 c() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            qn2 r1 = r1.e
            return r1
        L8:
            qn2 r1 = r1.e
            return r1
    }

    @Override // defpackage.f34
    public final int getHeight() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.c
            return r1
        L8:
            int r1 = r1.c
            return r1
    }

    @Override // defpackage.f34
    public final int getWidth() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.b
            return r1
        L8:
            int r1 = r1.b
            return r1
    }
}
