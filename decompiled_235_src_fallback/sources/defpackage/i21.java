package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i21  reason: default package */
/* loaded from: classes.dex */
public abstract class i21 {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "ConstraintTrkngWrkr"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.i21.a = r0
            return
    }

    public static final java.lang.Object a(defpackage.ww2 r5, defpackage.yw7 r6, defpackage.s41 r7) {
            boolean r0 = r7 instanceof defpackage.h21
            if (r0 == 0) goto L13
            r0 = r7
            h21 r0 = (defpackage.h21) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            h21 r0 = new h21
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r7)
            goto L50
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r7)
            le2 r5 = r5.s(r6)
            y3 r7 = new y3
            r2 = 6
            r7.<init>(r6, r3, r2)
            cf2 r6 = new cf2
            r2 = 2
            r6.<init>(r5, r7, r2)
            g21 r5 = new g21
            r7 = 0
            r5.<init>(r6, r7)
            r0.X = r4
            java.lang.Object r7 = defpackage.f04.B(r5, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            w21 r7 = (defpackage.w21) r7
            int r5 = r7.a
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
    }
}
