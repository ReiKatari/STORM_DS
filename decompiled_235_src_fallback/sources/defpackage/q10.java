package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: q10  reason: default package */
/* loaded from: classes.dex */
public final class q10 extends defpackage.l {
    public static final defpackage.q10 INSTANCE = null;
    public static final /* synthetic */ defpackage.go3 l = null;

    static {
            q10 r0 = new q10
            r0.<init>()
            defpackage.q10.INSTANCE = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            c5 r1 = new c5
            r2 = 9
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            defpackage.q10.l = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            if (r1 != r2) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof defpackage.q10
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            r0 = 1096934579(0x4161e4b3, float:14.118335)
            return r0
    }

    public final defpackage.gg3 serializer() {
            r0 = this;
            go3 r0 = defpackage.q10.l
            java.lang.Object r0 = r0.getValue()
            gg3 r0 = (defpackage.gg3) r0
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "BackgroundList"
            return r0
    }
}
