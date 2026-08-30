package defpackage;

import defpackage.n11;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p11  reason: default package */
/* loaded from: classes.dex */
public final class p11 implements p83, i73 {
    public final Type a = new n07().b;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: p11$a */
    /* loaded from: classes.dex */
    public static final class a extends n07<List<? extends h03>> {
    }

    @Override // defpackage.p83
    public final l73 a(Object obj, Type type, dz4 dz4Var) {
        n11 n11Var = (n11) obj;
        n11Var.getClass();
        type.getClass();
        dz4Var.getClass();
        g83 g83Var = new g83();
        List list = n11Var.a;
        dy6 dy6Var = (dy6) dz4Var.A;
        qo2 qo2Var = dy6Var.c;
        qo2Var.getClass();
        a93 a93Var = new a93();
        qo2Var.g(list, this.a, a93Var);
        ArrayList arrayList = a93Var.j0;
        if (arrayList.isEmpty()) {
            g83Var.i("inputMapper", a93Var.l0);
            n11.c cVar = n11Var.b;
            qo2 qo2Var2 = dy6Var.c;
            qo2Var2.getClass();
            a93 a93Var2 = new a93();
            qo2Var2.g(cVar, n11.c.class, a93Var2);
            ArrayList arrayList2 = a93Var2.j0;
            if (arrayList2.isEmpty()) {
                g83Var.i("slot2AnalogMapping", a93Var2.l0);
                return g83Var;
            }
            f81.z(arrayList2, "Expected one JSON element but was ");
            return null;
        }
        f81.z(arrayList, "Expected one JSON element but was ");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r2 != null) goto L15;
     */
    @Override // defpackage.i73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.l73 r2, java.lang.reflect.Type r3, defpackage.dz4 r4) {
        /*
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            boolean r3 = r2 instanceof defpackage.g83
            r0 = 0
            if (r3 == 0) goto L13
            g83 r2 = r2.c()
            goto L14
        L13:
            r2 = r0
        L14:
            if (r2 == 0) goto L5c
            yo3 r2 = r2.A
            java.lang.String r3 = "inputMapper"
            java.lang.Object r3 = r2.get(r3)
            l73 r3 = (defpackage.l73) r3
            if (r3 == 0) goto L54
            java.lang.reflect.Type r1 = r1.a
            java.lang.Object r1 = r4.q(r3, r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r3 = "slot2AnalogMapping"
            java.lang.Object r2 = r2.get(r3)
            l73 r2 = (defpackage.l73) r2
            if (r2 == 0) goto L46
            boolean r3 = r2 instanceof defpackage.c83
            if (r3 != 0) goto L39
            r0 = r2
        L39:
            if (r0 == 0) goto L46
            java.lang.Class<n11$c> r2 = defpackage.n11.c.class
            java.lang.Object r2 = r4.q(r0, r2)
            n11$c r2 = (defpackage.n11.c) r2
            if (r2 == 0) goto L46
            goto L4b
        L46:
            n11$c r2 = new n11$c
            r2.<init>()
        L4b:
            n11 r3 = new n11
            r1.getClass()
            r3.<init>(r1, r2)
            return r3
        L54:
            hg r1 = new hg
            java.lang.String r2 = "Missing controller configuration field 'inputMapper'"
            r1.<init>(r2)
            throw r1
        L5c:
            hg r1 = new hg
            java.lang.String r2 = "Controller configuration must be an object"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p11.b(l73, java.lang.reflect.Type, dz4):java.lang.Object");
    }
}
