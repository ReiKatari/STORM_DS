package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m57  reason: default package */
/* loaded from: classes.dex */
public abstract class m57 {
    public static final java.lang.ThreadLocal a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.m57.a = r0
            return
    }

    public static defpackage.l62 a() {
            java.lang.ThreadLocal r0 = defpackage.m57.a
            java.lang.Object r1 = r0.get()
            l62 r1 = (defpackage.l62) r1
            if (r1 != 0) goto L16
            l50 r1 = new l50
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.<init>(r2)
            r0.set(r1)
        L16:
            return r1
    }
}
