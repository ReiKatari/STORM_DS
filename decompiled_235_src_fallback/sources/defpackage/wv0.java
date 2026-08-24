package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wv0 implements defpackage.o55 {
    public static final defpackage.wv0 b = null;
    public static final defpackage.wv0 c = null;
    public final /* synthetic */ int a;

    static {
            wv0 r0 = new wv0
            r1 = 0
            r0.<init>(r1)
            defpackage.wv0.b = r0
            wv0 r0 = new wv0
            r1 = 1
            r0.<init>(r1)
            defpackage.wv0.c = r0
            return
    }

    public /* synthetic */ wv0(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.o55
    public final java.lang.Object get() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }
}
