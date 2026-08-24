package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kx2  reason: default package */
/* loaded from: classes.dex */
public final class kx2 implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ kx2(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            ow r0 = new ow
            r0.<init>(r1)
            return r0
        Lb:
            tk5 r0 = new tk5
            r0.<init>(r1)
            return r0
        L11:
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r1)
            r1 = 10
            r0.setPriority(r1)
            java.lang.String r1 = "CameraX-camerax_high_priority"
            r0.setName(r1)
            return r0
    }
}
