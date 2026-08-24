package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g42  reason: default package */
/* loaded from: classes.dex */
public enum g42 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.g42[] $VALUES = null;
    public static final defpackage.g42 AES256_GCM_HKDF_4KB = null;
    private final defpackage.nh3 mStreamingAeadKeyTemplate;

    static {
            g42 r0 = new g42
            sw2 r1 = defpackage.sw2.SHA256
            ob r2 = defpackage.pb.t()
            r2.c()
            pr2 r3 = r2.B
            pb r3 = (defpackage.pb) r3
            defpackage.pb.m(r3)
            r2.c()
            pr2 r3 = r2.B
            pb r3 = (defpackage.pb) r3
            defpackage.pb.n(r3)
            r2.c()
            pr2 r3 = r2.B
            pb r3 = (defpackage.pb) r3
            defpackage.pb.o(r3, r1)
            pr2 r1 = r2.a()
            pb r1 = (defpackage.pb) r1
            lb r2 = defpackage.mb.q()
            r2.c()
            pr2 r3 = r2.B
            mb r3 = (defpackage.mb) r3
            defpackage.mb.n(r3)
            r2.c()
            pr2 r3 = r2.B
            mb r3 = (defpackage.mb) r3
            defpackage.mb.m(r3, r1)
            pr2 r1 = r2.a()
            mb r1 = (defpackage.mb) r1
            ya r2 = new ya
            r3 = 1
            r2.<init>(r3)
            ya[] r2 = new defpackage.ya[]{r2}
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = 0
            r6 = r2[r5]
            r6.getClass()
            java.lang.Class<xr6> r7 = defpackage.xr6.class
            boolean r8 = r4.containsKey(r7)
            if (r8 != 0) goto Ldc
            r4.put(r7, r6)
            r2 = r2[r5]
            r2.getClass()
            java.util.Collections.unmodifiableMap(r4)
            byte[] r1 = r1.c()
            lh3 r2 = defpackage.lh3.RAW
            nh3 r4 = new nh3
            kh3 r6 = defpackage.mh3.s()
            r6.c()
            pr2 r7 = r6.B
            mh3 r7 = (defpackage.mh3) r7
            defpackage.mh3.m(r7)
            int r7 = r1.length
            ca0 r1 = defpackage.ea0.c(r1, r5, r7)
            r6.c()
            pr2 r7 = r6.B
            mh3 r7 = (defpackage.mh3) r7
            defpackage.mh3.n(r7, r1)
            int[] r1 = defpackage.jh3.b
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r3) goto Lb9
            r2 = 2
            if (r1 == r2) goto Lb6
            r2 = 3
            if (r1 == r2) goto Lb3
            r2 = 4
            if (r1 != r2) goto Lad
            jp4 r1 = defpackage.jp4.CRUNCHY
            goto Lbb
        Lad:
            java.lang.String r0 = "Unknown output prefix type"
            defpackage.i.h(r0)
            return
        Lb3:
            jp4 r1 = defpackage.jp4.RAW
            goto Lbb
        Lb6:
            jp4 r1 = defpackage.jp4.LEGACY
            goto Lbb
        Lb9:
            jp4 r1 = defpackage.jp4.TINK
        Lbb:
            r6.c()
            pr2 r2 = r6.B
            mh3 r2 = (defpackage.mh3) r2
            defpackage.mh3.o(r2, r1)
            pr2 r1 = r6.a()
            mh3 r1 = (defpackage.mh3) r1
            r4.<init>(r1)
            java.lang.String r1 = "AES256_GCM_HKDF_4KB"
            r0.<init>(r1, r5, r4)
            defpackage.g42.AES256_GCM_HKDF_4KB = r0
            g42[] r0 = new defpackage.g42[]{r0}
            defpackage.g42.$VALUES = r0
            return
        Ldc:
            java.lang.String r0 = "KeyTypeManager constructed with duplicate factories for primitive "
            java.lang.String r1 = r7.getCanonicalName()
            defpackage.e41.A(r1, r0)
            return
    }

    g42(java.lang.String r1, int r2, defpackage.nh3 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mStreamingAeadKeyTemplate = r3
            return
    }

    public static defpackage.g42 valueOf(java.lang.String r1) {
            java.lang.Class<g42> r0 = defpackage.g42.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            g42 r1 = (defpackage.g42) r1
            return r1
    }

    public static defpackage.g42[] values() {
            g42[] r0 = defpackage.g42.$VALUES
            java.lang.Object r0 = r0.clone()
            g42[] r0 = (defpackage.g42[]) r0
            return r0
    }

    public defpackage.nh3 getKeyTemplate() {
            r0 = this;
            nh3 r0 = r0.mStreamingAeadKeyTemplate
            return r0
    }
}
