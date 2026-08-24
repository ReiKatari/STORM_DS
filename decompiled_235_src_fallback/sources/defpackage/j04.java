package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j04  reason: default package */
/* loaded from: classes.dex */
public final class j04 extends defpackage.d9 {
    public final defpackage.e9 a;

    public j04(defpackage.e9 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.d9
    public final void a(java.lang.Object r1) {
            r0 = this;
            e9 r0 = r0.a
            i9 r0 = r0.a
            if (r0 == 0) goto La
            r0.a(r1)
            return
        La:
            java.lang.String r0 = "Launcher has not been initialized"
            defpackage.i.m(r0)
            return
    }
}
