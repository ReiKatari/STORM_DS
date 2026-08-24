package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gv0 implements defpackage.c56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ gv0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.c56
    public final android.os.Bundle a() {
            r5 = this;
            int r0 = r5.a
            java.lang.Object r5 = r5.b
            switch(r0) {
                case 0: goto L11b;
                case 1: goto Lde;
                case 2: goto Lc2;
                case 3: goto Lbb;
                default: goto L7;
            }
        L7:
            s9 r5 = (defpackage.s9) r5
            java.lang.Object r0 = r5.d
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Map r0 = defpackage.c14.s0(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            tp6 r1 = (defpackage.tp6) r1
            java.lang.Object r1 = r1.getValue()
            r5.G(r1, r2)
            goto L19
        L39:
            java.lang.Object r0 = r5.b
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Map r0 = defpackage.c14.s0(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            c56 r1 = (defpackage.c56) r1
            android.os.Bundle r1 = r1.a()
            r5.G(r1, r2)
            goto L49
        L69:
            java.lang.Object r5 = r5.a
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L77
            vr4[] r5 = new defpackage.vr4[r1]
            goto Laf
        L77:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r5.size()
            r0.<init>(r2)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L88:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            vr4 r4 = new vr4
            r4.<init>(r3, r2)
            r0.add(r4)
            goto L88
        La7:
            vr4[] r5 = new defpackage.vr4[r1]
            java.lang.Object[] r5 = r0.toArray(r5)
            vr4[] r5 = (defpackage.vr4[]) r5
        Laf:
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            vr4[] r5 = (defpackage.vr4[]) r5
            android.os.Bundle r5 = defpackage.jw2.l(r5)
            return r5
        Lbb:
            androidx.fragment.app.u r5 = (androidx.fragment.app.u) r5
            android.os.Bundle r5 = r5.W()
            return r5
        Lc2:
            r0 = r5
            jq r0 = (defpackage.jq) r0
        Lc5:
            ll2 r5 = r0.t()
            tt3 r1 = defpackage.tt3.CREATED
            boolean r5 = androidx.fragment.app.p.u(r5, r1)
            if (r5 != 0) goto Lc5
            ku3 r5 = r0.s0
            st3 r0 = defpackage.st3.ON_STOP
            r5.f(r0)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            return r5
        Lde:
            r46 r5 = (defpackage.r46) r5
            java.util.Map r5 = r5.d()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Lf1:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L11a
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r1 instanceof java.util.ArrayList
            if (r3 == 0) goto L110
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            goto L116
        L110:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r1 = r3
        L116:
            r0.putParcelableArrayList(r2, r1)
            goto Lf1
        L11a:
            return r0
        L11b:
            mv0 r5 = (defpackage.mv0) r5
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            kv0 r5 = r5.e0
            r5.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.LinkedHashMap r2 = r5.b
            java.util.Collection r3 = r2.values()
            r1.<init>(r3)
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            r0.putIntegerArrayList(r3, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r2.keySet()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.<init>(r2)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            r0.putStringArrayList(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList r2 = r5.d
            r1.<init>(r2)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            r0.putStringArrayList(r2, r1)
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r5 = r5.g
            r1.<init>(r5)
            java.lang.String r5 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            r0.putBundle(r5, r1)
            return r0
    }
}
