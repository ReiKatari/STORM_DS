package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz6  reason: default package */
/* loaded from: classes.dex */
public final class rz6 implements java.lang.Iterable {
    public final java.util.ArrayList A;
    public final android.content.Context B;

    public rz6(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A = r0
            r1.B = r2
            return
    }

    public final void a(android.content.ComponentName r3) {
            r2 = this;
            android.content.Context r0 = r2.B
            java.util.ArrayList r2 = r2.A
            int r1 = r2.size()
            android.content.Intent r3 = defpackage.ej2.E(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
        Lc:
            if (r3 == 0) goto L1a
            r2.add(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.content.ComponentName r3 = r3.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.content.Intent r3 = defpackage.ej2.E(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            goto Lc
        L1a:
            return
        L1b:
            r2 = move-exception
            java.lang.String r3 = "TaskStackBuilder"
            java.lang.String r0 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r3, r0)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
    }

    public final void b() {
            r4 = this;
            java.util.ArrayList r0 = r4.A
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L28
            r1 = 0
            android.content.Intent[] r2 = new android.content.Intent[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r2 = new android.content.Intent
            r3 = r0[r1]
            r2.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r2 = r2.addFlags(r3)
            r0[r1] = r2
            android.content.Context r4 = r4.B
            r1 = 0
            r4.startActivities(r0, r1)
            return
        L28:
            java.lang.String r4 = "No intents added to TaskStackBuilder; cannot startActivities"
            defpackage.i.m(r4)
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ArrayList r0 = r0.A
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
