package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi1  reason: default package */
/* loaded from: classes.dex */
public abstract class wi1 {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "DiagnosticsWrkr"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.wi1.a = r0
            return
    }

    public static final java.lang.String a(defpackage.qw7 r17, defpackage.fx7 r18, defpackage.px6 r19, java.util.List r20) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t"
            r0.<init>(r1)
            java.util.Iterator r1 = r20.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r1.next()
            yw7 r2 = (defpackage.yw7) r2
            gw7 r3 = defpackage.rr7.a(r2)
            java.lang.String r4 = r2.a
            r19.getClass()
            java.lang.String r5 = r3.a
            int r3 = r3.b
            r5.getClass()
            r6 = r19
            m16 r7 = r6.a
            ox6 r8 = new ox6
            r9 = 0
            r8.<init>(r5, r3, r9)
            r3 = 1
            java.lang.Object r5 = defpackage.hv.Q(r7, r3, r9, r8)
            nx6 r5 = (defpackage.nx6) r5
            if (r5 == 0) goto L41
            int r5 = r5.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L42
        L41:
            r5 = 0
        L42:
            r17.getClass()
            r4.getClass()
            r7 = r17
            m16 r8 = r7.a
            c70 r10 = new c70
            r11 = 19
            r10.<init>(r4, r11)
            java.lang.Object r8 = defpackage.hv.Q(r8, r3, r9, r10)
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r14 = 0
            r15 = 62
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            java.lang.String r8 = defpackage.gt0.P0(r10, r11, r12, r13, r14, r15)
            r18.getClass()
            r10 = r18
            m16 r11 = r10.a
            cx7 r12 = new cx7
            r12.<init>(r4, r3)
            java.lang.Object r3 = defpackage.hv.Q(r11, r3, r9, r12)
            r11 = r3
            java.util.List r11 = (java.util.List) r11
            r15 = 0
            r16 = 62
            java.lang.String r12 = ","
            java.lang.String r3 = defpackage.gt0.P0(r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = "\n"
            java.lang.String r11 = "\t "
            java.lang.StringBuilder r4 = defpackage.i61.t(r9, r4, r11)
            java.lang.String r9 = r2.c
            r4.append(r9)
            r4.append(r11)
            r4.append(r5)
            r4.append(r11)
            iw7 r2 = r2.b
            java.lang.String r2 = r2.name()
            r4.append(r2)
            r4.append(r11)
            r4.append(r8)
            r4.append(r11)
            r4.append(r3)
            r2 = 9
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.append(r2)
            goto Lb
        Lba:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
