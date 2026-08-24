package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep1  reason: default package */
/* loaded from: classes.dex */
public final class ep1 {
    public final defpackage.dd a;

    public ep1(defpackage.fp1 r7, defpackage.qn2 r8) {
            r6 = this;
            r6.<init>()
            sc7 r4 = defpackage.dp1.a
            dd r0 = new dd
            k0 r2 = new k0
            r1 = 23
            r2.<init>(r6, r1)
            a5 r3 = new a5
            r1 = 26
            r3.<init>(r6, r1)
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a = r0
            return
    }

    public final defpackage.qh1 a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The density on DrawerState ("
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ") was not set. Did you use DrawerState with the Drawer composable?"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
