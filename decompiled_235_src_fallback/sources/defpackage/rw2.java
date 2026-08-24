package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rw2  reason: default package */
/* loaded from: classes.dex */
public final class rw2 implements defpackage.y93 {
    public static final defpackage.rw2 b = null;
    public static final defpackage.rw2 c = null;
    public static final defpackage.rw2 d = null;
    public static final defpackage.rw2 e = null;
    public final /* synthetic */ int a;

    static {
            rw2 r0 = new rw2
            r1 = 0
            r0.<init>(r1)
            defpackage.rw2.b = r0
            rw2 r0 = new rw2
            r1 = 1
            r0.<init>(r1)
            defpackage.rw2.c = r0
            rw2 r0 = new rw2
            r1 = 2
            r0.<init>(r1)
            defpackage.rw2.d = r0
            rw2 r0 = new rw2
            r1 = 3
            r0.<init>(r1)
            defpackage.rw2.e = r0
            return
    }

    public /* synthetic */ rw2(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.y93
    public final boolean a(int r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L23;
                case 1: goto L19;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            jp4 r0 = defpackage.jp4.forNumber(r1)
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
        Lf:
            hh3 r0 = defpackage.hh3.forNumber(r1)
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
        L19:
            ug3 r0 = defpackage.ug3.forNumber(r1)
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
        L23:
            sw2 r0 = defpackage.sw2.forNumber(r1)
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }
}
