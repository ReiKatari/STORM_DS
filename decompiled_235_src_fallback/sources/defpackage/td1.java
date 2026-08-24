package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td1  reason: default package */
/* loaded from: classes.dex */
public abstract class td1 {
    public static final defpackage.ug1 a = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            int r1 = defpackage.xx6.a
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L17
            sd1 r0 = defpackage.sd1.h0
            goto L21
        L17:
            xe1 r0 = defpackage.xk1.a
            jv2 r0 = defpackage.e04.a
            jv2 r1 = r0.Y
            if (r0 != 0) goto L21
            sd1 r0 = defpackage.sd1.h0
        L21:
            defpackage.td1.a = r0
            return
    }
}
