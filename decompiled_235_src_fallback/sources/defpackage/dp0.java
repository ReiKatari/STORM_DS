package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: dp0  reason: default package */
/* loaded from: classes.dex */
public final class dp0 extends defpackage.vy7 {
    public static final defpackage.dp0 INSTANCE = null;
    public static final /* synthetic */ defpackage.go3 h0 = null;

    static {
            dp0 r0 = new dp0
            r0.<init>()
            defpackage.dp0.INSTANCE = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            c5 r1 = new c5
            r2 = 15
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            defpackage.dp0.h0 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            if (r1 != r2) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof defpackage.dp0
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            r0 = -1298041755(0xffffffffb2a17465, float:-1.8795797E-8)
            return r0
    }

    public final defpackage.gg3 serializer() {
            r0 = this;
            go3 r0 = defpackage.dp0.h0
            java.lang.Object r0 = r0.getValue()
            gg3 r0 = (defpackage.gg3) r0
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "GameList"
            return r0
    }
}
