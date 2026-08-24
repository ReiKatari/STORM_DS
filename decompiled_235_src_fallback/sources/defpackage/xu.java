package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xu  reason: default package */
/* loaded from: classes.dex */
public abstract class xu {
    public static final int a = 0;

    static {
            r0 = 0
            java.lang.String r1 = "kotlinx.serialization.json.pool.size"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            java.lang.Integer r1 = defpackage.xs6.h0(r1)     // Catch: java.lang.Throwable -> Le
            goto L18
        Le:
            r1 = move-exception
            goto L12
        L10:
            r1 = r0
            goto L18
        L12:
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L18:
            boolean r2 = r1 instanceof defpackage.em5
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L28
            int r0 = r0.intValue()
            goto L2a
        L28:
            r0 = 2097152(0x200000, float:2.938736E-39)
        L2a:
            defpackage.xu.a = r0
            return
    }
}
