package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z46  reason: default package */
/* loaded from: classes.dex */
public final class z46 implements defpackage.c56 {
    public final defpackage.d56 a;
    public boolean b;
    public android.os.Bundle c;
    public final defpackage.ex6 d;

    public z46(defpackage.d56 r2, defpackage.bp7 r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.a = r2
            t46 r2 = new t46
            r0 = 1
            r2.<init>(r3, r0)
            ex6 r3 = new ex6
            r3.<init>(r2)
            r1.d = r3
            return
    }

    @Override // defpackage.c56
    public final android.os.Bundle a() {
            r6 = this;
            r0 = 0
            vr4[] r1 = new defpackage.vr4[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            vr4[] r1 = (defpackage.vr4[]) r1
            android.os.Bundle r1 = defpackage.jw2.l(r1)
            android.os.Bundle r2 = r6.c
            if (r2 == 0) goto L14
            r1.putAll(r2)
        L14:
            ex6 r2 = r6.d
            java.lang.Object r2 = r2.getValue()
            a56 r2 = (defpackage.a56) r2
            java.util.LinkedHashMap r2 = r2.b
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            v46 r3 = (defpackage.v46) r3
            s9 r3 = r3.b
            java.lang.Object r3 = r3.e
            gv0 r3 = (defpackage.gv0) r3
            android.os.Bundle r3 = r3.a()
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L26
            r4.getClass()
            r1.putBundle(r4, r3)
            goto L26
        L55:
            r6.b = r0
            return r1
    }

    public final void b() {
            r3 = this;
            boolean r0 = r3.b
            if (r0 != 0) goto L32
            d56 r0 = r3.a
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r0 = r0.a(r1)
            r1 = 0
            vr4[] r2 = new defpackage.vr4[r1]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            vr4[] r1 = (defpackage.vr4[]) r1
            android.os.Bundle r1 = defpackage.jw2.l(r1)
            android.os.Bundle r2 = r3.c
            if (r2 == 0) goto L20
            r1.putAll(r2)
        L20:
            if (r0 == 0) goto L25
            r1.putAll(r0)
        L25:
            r3.c = r1
            r0 = 1
            r3.b = r0
            ex6 r3 = r3.d
            java.lang.Object r3 = r3.getValue()
            a56 r3 = (defpackage.a56) r3
        L32:
            return
    }
}
