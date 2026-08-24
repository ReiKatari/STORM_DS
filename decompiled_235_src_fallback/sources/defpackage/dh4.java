package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh4  reason: default package */
/* loaded from: classes.dex */
public final class dh4 extends java.net.ProxySelector {
    public static final defpackage.dh4 a = null;

    static {
            dh4 r0 = new dh4
            r0.<init>()
            defpackage.dh4.a = r0
            return
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI r1, java.net.SocketAddress r2, java.io.IOException r3) {
            r0 = this;
            return
    }

    @Override // java.net.ProxySelector
    public final java.util.List select(java.net.URI r1) {
            r0 = this;
            if (r1 == 0) goto L9
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY
            java.util.List r0 = defpackage.hf.b0(r0)
            return r0
        L9:
            java.lang.String r0 = "uri must not be null"
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }
}
