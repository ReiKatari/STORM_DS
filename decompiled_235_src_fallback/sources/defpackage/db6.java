package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db6  reason: default package */
/* loaded from: classes.dex */
public final class db6 extends defpackage.aj3 implements defpackage.eo2 {
    public static final defpackage.db6 L = null;
    public static final defpackage.db6 R = null;
    public static final defpackage.db6 X = null;
    public final /* synthetic */ int B;

    static {
            db6 r0 = new db6
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.db6.L = r0
            db6 r0 = new db6
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.db6.R = r0
            db6 r0 = new db6
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.db6.X = r0
            return
    }

    public /* synthetic */ db6(int r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r1 = r1.B
            switch(r1) {
                case 0: goto L40;
                case 1: goto L3c;
                default: goto L5;
            }
        L5:
            xa6 r2 = (defpackage.xa6) r2
            xa6 r3 = (defpackage.xa6) r3
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            ta6 r2 = r2.d
            fb6 r0 = defpackage.bb6.u
            ja4 r2 = r2.A
            java.lang.Object r2 = r2.g(r0)
            if (r2 != 0) goto L1b
            r2 = r1
        L1b:
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            ta6 r3 = r3.d
            ja4 r3 = r3.A
            java.lang.Object r3 = r3.g(r0)
            if (r3 != 0) goto L2c
            goto L2d
        L2c:
            r1 = r3
        L2d:
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = java.lang.Float.compare(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L3c:
            if (r2 != 0) goto L3f
            r2 = r3
        L3f:
            return r2
        L40:
            y1 r2 = (defpackage.y1) r2
            y1 r3 = (defpackage.y1) r3
            y1 r1 = new y1
            if (r2 == 0) goto L4c
            java.lang.String r0 = r2.a
            if (r0 != 0) goto L4e
        L4c:
            java.lang.String r0 = r3.a
        L4e:
            if (r2 == 0) goto L54
            ao2 r2 = r2.b
            if (r2 != 0) goto L56
        L54:
            ao2 r2 = r3.b
        L56:
            r1.<init>(r0, r2)
            return r1
    }
}
