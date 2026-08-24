package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to6  reason: default package */
/* loaded from: classes.dex */
public abstract class to6 {
    public static final /* synthetic */ int a = 0;

    static {
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Class<vy7> r1 = defpackage.vy7.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r2 = 0
            r0 = r0[r2]
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = "_COROUTINE."
            java.lang.String r1 = r3.concat(r1)
            java.lang.String r3 = r0.getFileName()
            int r0 = r0.getLineNumber()
            java.lang.String r4 = "_"
            r2.<init>(r1, r4, r3, r0)
            java.lang.Class<d20> r0 = defpackage.d20.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L35:
            java.lang.Throwable r1 = defpackage.hm5.a(r0)
            if (r1 != 0) goto L3c
            goto L3e
        L3c:
            java.lang.String r0 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
        L3e:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<to6> r0 = defpackage.to6.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L47
            goto L4e
        L47:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L4e:
            java.lang.Throwable r1 = defpackage.hm5.a(r0)
            if (r1 != 0) goto L55
            goto L57
        L55:
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
        L57:
            java.lang.String r0 = (java.lang.String) r0
            return
    }
}
