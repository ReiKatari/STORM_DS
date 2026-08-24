package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g01  reason: default package */
/* loaded from: classes.dex */
public final class g01 implements defpackage.lg1 {
    @Override // defpackage.lg1
    public final boolean a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = defpackage.i01.b
            if (r0 == 0) goto Lc
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // defpackage.lg1
    public final defpackage.sm6 j(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            i01 r0 = new i01
            r0.<init>()
            return r0
    }
}
