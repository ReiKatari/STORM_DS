package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx4  reason: default package */
/* loaded from: classes.dex */
public abstract class jx4 {
    public static final defpackage.pi a = null;
    public static final defpackage.jd1 b = null;
    public static final defpackage.vs0 c = null;

    static {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r0.getClass()
            java.lang.String r1 = "RoboVM"
            boolean r1 = r0.equals(r1)
            r2 = 25
            r3 = 0
            if (r1 != 0) goto L45
            java.lang.String r1 = "Dalvik"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            defpackage.jx4.a = r3
            fh5 r0 = new fh5
            r1 = 1
            r0.<init>(r1)
            defpackage.jx4.b = r0
            f90 r0 = new f90
            r0.<init>(r2)
            defpackage.jx4.c = r0
            return
        L2e:
            pi r0 = new pi
            r0.<init>()
            defpackage.jx4.a = r0
            fh5 r0 = new fh5
            r1 = 0
            r0.<init>(r1)
            defpackage.jx4.b = r0
            f90 r0 = new f90
            r0.<init>(r2)
            defpackage.jx4.c = r0
            return
        L45:
            defpackage.jx4.a = r3
            jd1 r0 = new jd1
            r1 = 21
            r0.<init>(r1)
            defpackage.jx4.b = r0
            vs0 r0 = new vs0
            r0.<init>(r2)
            defpackage.jx4.c = r0
            return
    }
}
