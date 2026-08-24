package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id3  reason: default package */
/* loaded from: classes.dex */
public abstract class id3 {
    public static final defpackage.hd3 d = null;
    public final defpackage.td3 a;
    public final defpackage.jd1 b;
    public final defpackage.d51 c;

    static {
            hd3 r0 = new hd3
            td3 r1 = new td3
            zq0 r7 = defpackage.zq0.POLYMORPHIC
            r8 = 1
            r2 = 0
            r3 = 1
            java.lang.String r4 = "    "
            java.lang.String r5 = "type"
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            jd1 r2 = defpackage.ic6.a
            r0.<init>(r1, r2)
            defpackage.id3.d = r0
            return
    }

    public id3(defpackage.td3 r1, defpackage.jd1 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            d51 r1 = new d51
            r2 = 8
            r1.<init>(r2)
            r0.c = r1
            return
    }

    public final java.lang.Object a(defpackage.gg3 r4, java.lang.String r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            ns6 r5 = defpackage.np2.i(r3, r5)
            fs6 r0 = new fs6
            by7 r1 = defpackage.by7.OBJ
            wb6 r2 = r4.e()
            r0.<init>(r3, r1, r5, r2)
            java.lang.Object r3 = r0.k(r4)
            r5.o()
            return r3
    }

    public final java.lang.String b(defpackage.gg3 r4, java.lang.Object r5) {
            r3 = this;
            r4.getClass()
            zb r0 = new zb
            r1 = 7
            r2 = 0
            r0.<init>(r2, r1)
            jm0 r1 = defpackage.jm0.c
            r2 = 128(0x80, float:1.8E-43)
            char[] r2 = r1.d(r2)
            r0.L = r2
            defpackage.oi2.v(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r0.L
            char[] r4 = (char[]) r4
            r1.getClass()
            r4.getClass()
            r1.b(r4)
            return r3
        L29:
            r3 = move-exception
            jm0 r4 = defpackage.jm0.c
            java.lang.Object r5 = r0.L
            char[] r5 = (char[]) r5
            r4.getClass()
            r5.getClass()
            r4.b(r5)
            throw r3
    }
}
